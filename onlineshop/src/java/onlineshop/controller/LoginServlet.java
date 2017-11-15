
package onlineshop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

   private static final long serialVersionUID = 1L;
  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("usuario");
        String pass = request.getParameter("contrasenha");
        
        HttpSession session = request.getSession(false);
        if(session != null){
            session.setAttribute("usuario_logeo", user); 
        }
        
        RequestDispatcher rd = null;
        if(LoginEstado.validate(user, pass)){
            rd = request.getRequestDispatcher("carritoCompra.jsp");
            rd.forward(request, response);
        }else{
             rd = request.getRequestDispatcher("login.html");
             rd.include(request, response);
        }
        out.close();
        
       
    }

   

}
