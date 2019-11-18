/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Servlet;

import PPN.Controller.QuizsController;
import PPN.Controller.SubjectsController;
import PPN.Model.Quiz;
import PPN.Model.Subject;
import PPN.Model.Teacher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author theeradonjaroonchon
 */
public class CreateQuizServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String qname = request.getParameter("quizname");
        String qdetails = request.getParameter("quizdetails");
        String message = null;

        if (qname.trim().isEmpty() || qdetails.trim().isEmpty()) {
            message = "Please Fill more Informations";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/CreateQuiz.jsp").forward(request, response);
        }
        if(qname!=null){
            message="Sorry, This quiz has already Created!";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/CreateQuiz.jsp").forward(request, response);
        }
        SubjectsController sc = new SubjectsController();
        if(!request.getSession().getAttribute("who").equals("teacher")){
            getServletContext().getRequestDispatcher("/WEB-INF/Home.jsp").forward(request, response);
        }
        
        QuizsController qc = new QuizsController();
        Teacher t = (Teacher) request.getSession().getAttribute("user");
        Subject s = sc.getSubjectByT_ID(t.getId());
        Quiz q = new Quiz(qname, qdetails, s.getId());
        qc.addQuiz(q);
        message = "Congratulations,Create Success!";
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/SearchQuiz.jsp").forward(request, response);
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
        getServletContext().getRequestDispatcher("/WEB-INF/CreateQuiz.jsp").forward(request, response);
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
