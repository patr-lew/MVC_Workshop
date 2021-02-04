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

        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            User user = new User(username, email, password);
            UserDAO.create(user);

            // TODO: 04/02/2021 add information about success of operation
            response.sendRedirect("/user/list?info=success");
        } else {
            // TODO: 04/02/2021 add error screen
            response.sendRedirect("/user/list?info=failure");

        }
    }
}
