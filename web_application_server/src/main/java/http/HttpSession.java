package http;

import java.util.HashMap;
import java.util.Map;

public class HttpSession {
    private Map<String, Object> values = new HashMap<>();

    private String sessionId;

    public HttpSession(String sessionId) {
        this.sessionId = sessionId;
    }

    private String getSessionId() {
        return this.sessionId;
    }

    public void addAttribute(String name, Object value) {
        values.put(name, value);
    }

    public Object findAttribute(String name) {
        return values.get(name);
    }

    public void removeAttribute(String name) {
        values.remove(name);
    }

    public void invalidate() {
        HttpSessions.removeSession(sessionId);
    }
}
