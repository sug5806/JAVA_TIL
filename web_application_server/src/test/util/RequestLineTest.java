package util;

import org.junit.jupiter.api.Test;
import webserver.RequestLine;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class RequestLineTest {

    @Test
    public void create_method() {
        RequestLine requestLine = new RequestLine("GET /index.html HTTP/1.1");
        assertThat(HttpMethod.GET).isEqualTo(requestLine.getMethod());
        assertThat("/index.html").isEqualTo(requestLine.getPath());

        requestLine = new RequestLine("POST /index.html HTTP/1.1");
        assertThat(HttpMethod.POST).isEqualTo(requestLine.getMethod());
        assertThat("/index.html").isEqualTo(requestLine.getPath());
    }

    @Test
    public void create_path_and_params() {
        RequestLine requestLine = new RequestLine("GET /user/create?userId=gildong&password=1234 HTTP/1.1");
        assertThat(HttpMethod.GET).isEqualTo(requestLine.getMethod());
        assertThat("/user/create").isEqualTo(requestLine.getPath());

        Map<String, String> params = requestLine.getParams();
        assertThat(2).isEqualTo(params.size());
    }

}