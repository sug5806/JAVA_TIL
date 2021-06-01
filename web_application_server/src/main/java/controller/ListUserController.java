package controller;

import db.DataBase;
import http.HttpRequest;
import http.HttpResponse;
import model.User;

import java.util.Collection;
import java.util.Map;

public class ListUserController extends AbstractController {

    @Override
    protected void doGet(HttpRequest request, HttpResponse response) {
        if (!isLogin(request.getHeader("Cookie"))) {
            response.sendRedirect("/user/login.html");
            return;
        }

        Collection<User> users = DataBase.findAll();
        StringBuilder sb = new StringBuilder();
        sb.append("<table border='1'>");
        for (User user : users) {
            sb.append("<tr>");
            sb.append("<td>").append(user.getUserId()).append("</td>");
            sb.append("<td>").append(user.getName()).append("</td>");
            sb.append("<td>").append(user.getEmail()).append("</td>");
            sb.append("</tr>");
        }
        sb.append("</table>");
        response.forward(sb.toString());
    }


    private boolean isLogin(String line) {
        Map<String, String> cookies = HttpRequest.getCookie(line);
        String value = cookies.get("logined");
        if (value == null) {
            return false;
        }
        return Boolean.parseBoolean(value);
    }
}
