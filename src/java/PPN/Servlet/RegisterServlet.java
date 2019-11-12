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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author theeradonjaroonchon
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String lastname = request.getParameter("lastname");
        String department = request.getParameter("department");
        String message = null;
        
        if(id.trim().isEmpty()||username.trim().isEmpty()||password.trim().isEmpty()||lastname.trim().isEmpty()
          ||department.trim().isEmpty()){
            message="Please Enter All your Information!";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/Register.jsp").forward(request, response);
        }
        
        long sid = Long.valueOf(id);
        
        StudentsController sc = new StudentsController();
        Student s = sc.getStudentById(sid);
        
        if(s!=null){
            message="Sorry, This ID has registed";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/Register.jsp").forward(request, response);
        }else{
            Student news = new Student(sid, username, lastname, password, department);
           sc.addStudent(news);
           message="Congratulation, You register Success!";
           request.setAttribute("message", message);
           getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);          
        }
        
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
