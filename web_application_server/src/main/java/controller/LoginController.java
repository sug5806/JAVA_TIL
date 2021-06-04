package controller;

import db.DataBase;
import http.HttpRequest;
import http.HttpResponse;
import http.HttpSession;
import model.User;

public class LoginController extends AbstractController {

    @Override
    protected void doPost(HttpRequest request, HttpResponse response) {
        User user = DataBase.findUserById(request.getParameter("userId"));
        if (user != null) {
            if (user.getPassword().equals(request.getParameter("password"))) {
                HttpSession session = request.getSession();
                session.addAttribute("user", user);
            } else {
                response.sendRedirect("/index.html");
            }
        } else {
            response.sendRedirect("/user/login_failed.html");
        }
    }
}
