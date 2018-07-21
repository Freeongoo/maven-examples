package simple.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OtherServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String jsp = "/WEB-INF/jsp/not-from-public-dir.jsp";
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher(jsp);
        dispatcher.forward(request, response);
    }
}
