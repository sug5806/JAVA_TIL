package webserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.HttpRequestUtils;
import util.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private static final Logger log = LoggerFactory.getLogger(HttpRequest.class);

    private String method;
    private String path;

    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> parameter = new HashMap<>();

    public HttpRequest(InputStream in) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));

            String line = br.readLine();
            if (line == null) {
                return;
            }

            processRequestLine(line);

            line = br.readLine();
            while (!line.equals("")) {
                log.debug("header : {}", line);
                String[] tokens = line.split(": ");
                headers.put(tokens[0].trim(), tokens[1].trim());
                line = br.readLine();
            }

            if ("POST".equals(method)) {
                String body = IOUtils.readData(br, Integer.parseInt(headers.get("Content-Length")));
                parameter = HttpRequestUtils.parseQueryString(body);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processRequestLine(String requestLine) {
        log.debug("request line : {}", requestLine);
        String[] tokens = requestLine.split(" ");
        this.method = tokens[0];

        if ("POST".equals(this.method)) {
            this.path = tokens[1];
            return;
        }

        int index = tokens[1].indexOf("?");
        if (index == -1) {
            path = tokens[1];
        } else {
            this.path = tokens[1].substring(0, index);
            this.parameter = HttpRequestUtils.parseQueryString(
                    tokens[1].substring(index + 1));
        }
    }

    public String getMethod() {
        return this.method;
    }

    public String getPath() {
        return this.path;
    }


    public String getHeader(String key) {
        return this.headers.get(key);
    }

    public String getParameter(String key) {
        return this.parameter.get(key);
    }
}
