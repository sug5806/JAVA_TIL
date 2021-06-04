package http;

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

    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> parameter = new HashMap<>();
    private RequestLine requestLine;

    public HttpRequest(InputStream in) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
            String line = br.readLine();
            if (line == null) {
                return;
            }

            requestLine = new RequestLine(line);

            line = br.readLine();
            while (!line.equals("")) {
                log.debug("header : {}", line);
                String[] tokens = line.split(": ");
                headers.put(tokens[0].trim(), tokens[1].trim());
                line = br.readLine();
            }

            if (requestLine.getMethod().isPost()) {
                String body = IOUtils.readData(br, Integer.parseInt(headers.get("Content-Length")));
                parameter = HttpRequestUtils.parseQueryString(body);
            } else {
                parameter = requestLine.getParams();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> getCookie(String line) {
        String[] headerTokens = line.split(":");
        return HttpRequestUtils.parseCookies(headerTokens[1].trim());
    }

    public HttpMethod getMethod() {
        return this.requestLine.getMethod();
    }

    public String getPath() {
        return this.requestLine.getPath();
    }


    public String getHeader(String key) {
        return this.headers.get(key);
    }

    public String getParameter(String key) {
        return this.parameter.get(key);
    }

    public HttpCookie getCookies() {
        return new HttpCookie(getHeader("Cookie"));
    }

    public HttpSession getSession() {
        return HttpSessions.getSession(getCookies().getCookie("JESSIONID"));
    }
}
