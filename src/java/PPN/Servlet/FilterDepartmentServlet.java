/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Servlet;

import PPN.Model.Student;
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
public class FilterDepartmentServlet extends HttpServlet {

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
       if(request.getSession().getAttribute("who").equals("student")){
            
          Student st = (Student) request.getSession().getAttribute("user") ;
          if(st!=null){
          if(st.getDepartment().equals("Information Technology")){
              getServletContext().getRequestDispatcher("/WEB-INF/ITStudent.jsp").forward(request, response);
        }
      
          if(st.getDepartment().equals("Computer Science")){
              getServletContext().getRequestDispatcher("/WEB-INF/CSStudent.jsp").forward(request, response);
        }
      
         if(st.getDepartment().equals("Digital Service Innovation")){
              getServletContext().getRequestDispatcher("/WEB-INF/DSIStudent.jsp").forward(request, response);
        }
        }
          
      } else if(request.getSession().getAttribute("who").equals("teacher")) {
          Teacher tc = (Teacher) request.getSession().getAttribute("user") ;
          if(tc.getDepartment().equals("Information Technology")){
              getServletContext().getRequestDispatcher("/WEB-INF/ITStudent.jsp").forward(request, response);
          }
           if(tc.getDepartment().equals("Computer Science")){
              getServletContext().getRequestDispatcher("/WEB-INF/CSStudent.jsp").forward(request, response);
        }
           if(tc.getDepartment().equals("Digital Service Innovation")){
              getServletContext().getRequestDispatcher("/WEB-INF/DSIStudent.jsp").forward(request, response);
        }
           
           getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
       }
      else{
           getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);           
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
