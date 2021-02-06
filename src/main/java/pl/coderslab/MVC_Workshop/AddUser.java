package pl.coderslab.MVC_Workshop;

import pl.coderslab.MVC_Workshop.utils.User;
import pl.coderslab.MVC_Workshop.utils.UserDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "AddUser", value = "/user/add")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/user/add.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        //username validation
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_\\-\\.]+");
        Matcher usernameMatcher = pattern.matcher(username);
        boolean isUsernameValid = usernameMatcher.matches();

        //email validation
        pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher emailMatcher = pattern.matcher(email);
        boolean isEmailValid = emailMatcher.matches();

        // TODO: 06/02/2021 password validation

        if (isEmailValid && isUsernameValid) {
            User user = new User(username, email, password);
            User notNullUser = UserDAO.create(user);

            if (null != notNullUser) {
                response.sendRedirect("/user/list?info=successAdd");
            } else {
                response.sendRedirect("/user/list?info=userExists");
            }
        } else {
            response.sendRedirect("/user/list?info=failureAdd");

        }
    }
}
