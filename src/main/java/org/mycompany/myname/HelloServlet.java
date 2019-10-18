package org.mycompany.myname;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) throws IOException {
        String name = httpServletRequest.getParameter("name");
        String surname = httpServletRequest.getParameter("surname");

        PrintWriter pw = httpServletResponse.getWriter();

        pw.println("<html>");
        pw.println("<h1> Hello, " + name + " " +surname + "</h1");
        pw.println("</html");
    }
}
