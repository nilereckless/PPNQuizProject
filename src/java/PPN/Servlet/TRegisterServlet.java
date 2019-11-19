/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Servlet;

import PPN.Controller.TeachersController;
import PPN.Model.Teacher;
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
public class TRegisterServlet extends HttpServlet {

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
        String tid = request.getParameter("id");
        String fullname = request.getParameter("firstname")+" "+ request.getParameter("lastname");
        String password = request.getParameter("password");
        String confirmpass = request.getParameter("confirmpass");
        String subject  = request.getParameter("ownerSubject");
        String department = request.getParameter("department");
        //String email = request.getParameter("email");
        
        String message  = null;
        
        if(tid.trim().isEmpty()||fullname.trim().isEmpty()||password.trim().isEmpty()||confirmpass.trim().isEmpty()
                ||subject.trim().isEmpty()||department.trim().isEmpty()){
            message="Please enter your Information All!";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/TRegister.jsp").forward(request, response);
        }
        
        long idt = Long.valueOf(tid);
        TeachersController tc = new TeachersController();
        Teacher t = tc.getTeacherById(idt);
        
        if(t!=null){
            message="Sorry,This ID has already Registed";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/TRegister.jsp").forward(request, response);
        }else{
            Teacher newt = new Teacher(idt, fullname, password, subject, department);
             tc.addTeacher(newt);
            message="Congratulation, Your Register success!";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/TLogin.jsp").forward(request, response);

        
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
    }
}


