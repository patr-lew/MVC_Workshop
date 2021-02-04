package pl.coderslab.MVC_Workshop;

import pl.coderslab.MVC_Workshop.utils.User;
import pl.coderslab.MVC_Workshop.utils.UserDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "EditUser", value = "/user/edit")
public class EditUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = UserDAO.read(id);
        request.setAttribute("user", user);
        request.getRequestDispatcher("/user/edit.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        int id = Integer.parseInt(request.getParameter("id"));

        User oldUser = UserDAO.read(id);

        // TODO: 04/02/2021 should I change hashPassword to public? any risk with that??

        User updatedUser = new User(username, email, password);
        updatedUser.setId(id);
        UserDAO.update(updatedUser);

        // TODO: 05/02/2021 fix password validation 
        if (updatedUser.getPassword().equals(oldUser.getPassword()) || UserDAO.hashPassword(updatedUser.getPassword()).equals(oldUser.getPassword())) {
            response.sendRedirect("/user/list?info=success");
        } else {
            // TODO: 04/02/2021 add error info and forward failure
            response.sendRedirect("/user/list?info=wrong_password");

        }
    }
}


