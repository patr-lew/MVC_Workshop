package pl.coderslab.MVC_Workshop;

import pl.coderslab.MVC_Workshop.utils.DbUtil;
import pl.coderslab.MVC_Workshop.utils.User;
import pl.coderslab.MVC_Workshop.utils.UserDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "test", value = "/test")
public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = UserDAO.read(1);
        response.getWriter().print(user.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
