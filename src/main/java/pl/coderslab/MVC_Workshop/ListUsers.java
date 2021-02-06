package pl.coderslab.MVC_Workshop;

import pl.coderslab.MVC_Workshop.utils.User;
import pl.coderslab.MVC_Workshop.utils.UserDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ListUsers", value = "/user/list")
public class ListUsers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = UserDAO.findAll();

        // TODO: 06/02/2021 QUESTION: czy jeśli inicjuję tutaj mapę infos, to czy jest ona tworzona na nowo przy każdym odświeżeniu strony?
        Map<String, String> infos = new HashMap<>();
        infos.put("successEdit", "Dane użytkownika zostały zaktualizowane");
        infos.put("failureEdit", "Użytkownik nie został zaktualizowany");
        infos.put("successAdd", "Nowy użytkownik został dodany");
        infos.put("failureAdd", "Nowy użytkownik nie został dodany");
        infos.put("successDelete", "Wybrany użytkownik został usunięty");
        infos.put("failureDelete", "Błąd przy próbie usunięcia użytkownika");
        infos.put("wrongPassword", "Podane hasło jest nieprawidłowe");
        
        request.setAttribute("infos", infos);
        request.setAttribute("users", users);
        request.getRequestDispatcher("/user/list.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
