/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Servlet;

import PPN.Controller.StudentsController;
import PPN.Model.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

/**
 *
 * @author theeradonjaroonchon
 */
public class LoginServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String message = null;
        
        if (id.trim().isEmpty() || password.trim().isEmpty()) {
            message = "Please enter your Username or Password";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
        }
        
        long id1 = Long.valueOf(id);      
        
        StudentsController sc = new StudentsController();
        Student s = sc.getStudentById(id1);
        
        if (s != null) {
            if (password.equals(s.getPassword())) {
                request.getSession().setAttribute("user", s);
                request.getSession().setAttribute("who", "student"); //ถ้าเป็น นักเรียนจะโชว์คณะ
                getServletContext().getRequestDispatcher("/WEB-INF/Home.jsp").forward(request, response);
            } else {
                message = "Password is Incorrect!";
                request.setAttribute("message", message);
            }           
        }
        message = "Username or Password is Incorrect";
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
