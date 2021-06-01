package controller;

import java.util.HashMap;
import java.util.Map;

public class RequestMapping {
    private static Map<String, Controller> controllerMap =
            new HashMap<>();

    static {
        controllerMap.put("/user/create", new CreateUserController());
        controllerMap.put("/user/login", new LoginController());
        controllerMap.put("/user/list", new ListUserController());
    }

    public static Controller getController(String requestUrl) {
        return controllerMap.get(requestUrl);
    }
}
