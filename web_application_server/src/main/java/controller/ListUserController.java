package controller;

import db.DataBase;
import http.HttpRequest;
import http.HttpResponse;
import http.HttpSession;
import model.User;

import java.util.Collection;

public class ListUserController extends AbstractController {

    private static boolean isLogin(HttpSession httpSession) {
        Object user = httpSession.findAttribute("user");

        if (user == null) {
            return false;
        }

        return true;
    }

    @Override
    protected void doGet(HttpRequest request, HttpResponse response) {
        if (!isLogin(request.getSession())) {
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
}
