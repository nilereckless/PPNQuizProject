/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Servlet;

import PPN.Controller.StudentsController;
import PPN.Controller.TeachersController;
import PPN.Model.MailSet;
import PPN.Model.Student;
import PPN.Model.Teacher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author theeradonjaroonchon
 */
public class ForgotPasswordServlet extends HttpServlet {

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
        String who = request.getParameter("who");
        String msg = null;

        if (who.trim().isEmpty()) {
            request.setAttribute("msg", "Input your E-Mail or ID.");
            getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response);
        }

        String mailAddress = null;
        MailSet ms = new MailSet();

        for (char c : who.toCharArray()) {
            if (!Character.isDigit(c)) {
                mailAddress = who;
                break;
            }
        }

        if (mailAddress != null) {
            StudentsController sc = new StudentsController();
            Student s = sc.getStudentByEmail(mailAddress);
            if (s != null) {
                ms.mail("Your password is " + s.getPassword(), s.getEmail());

                request.setAttribute("msg", "Check you mail, we send your password to you mail.");
                getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response);
            } else {
                TeachersController tc = new TeachersController();
                Teacher t = tc.getTeacherByEmail(mailAddress);
                if (t != null) {
                    ms.mail("Your password is " + s.getPassword(), s.getEmail());

                    request.setAttribute("msg", "Check you mail, we send your password to you mail.");
                    getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response);
                } else {

                    request.setAttribute("msg", "Wrong Email!");
                    getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response);
                }
            }
        }

        Long id = Long.valueOf(who);
        StudentsController sc = new StudentsController();
        Student s = sc.getStudentById(id);
        if (s != null) {
            ms.mail("Your password is " + s.getPassword(), s.getEmail());
            request.setAttribute("msg", "Check you mail, we send your password to your mail.");
            getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response);
        } else {
            TeachersController tc = new TeachersController();
            Teacher t = tc.getTeacherById(id);
            if (t != null) {
                ms.mail("Your password is " + t.getPassword(), t.getEmail());
                request.setAttribute("msg", "Check you mail, we send your password to you mail.");
                getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response);
            } else {
                request.setAttribute("msg", "Maybe you still have not register.");
                getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response);
            }
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
        getServletContext().getRequestDispatcher("/ForgotPassword.jsp").forward(request, response);
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
