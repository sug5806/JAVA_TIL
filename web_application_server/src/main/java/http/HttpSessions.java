package http;

import java.util.HashMap;
import java.util.Map;

public class HttpSessions {
    private static Map<String, HttpSession> sessionsMap = new HashMap<>();

    public static HttpSession getSession(String id) {
        HttpSession session = sessionsMap.get("id");

        if (session == null) {
            HttpSession newSession = new HttpSession(id);
            sessionsMap.put(id, newSession);
            return newSession;
        }

        return session;
    }

    public static void removeSession(String id) {
        sessionsMap.remove(id);
    }


}
