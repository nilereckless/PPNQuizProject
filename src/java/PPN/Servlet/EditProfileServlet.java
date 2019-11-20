/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Servlet;

import PPN.Controller.StudentsController;
import PPN.Controller.TeachersController;
import PPN.Model.Student;
import PPN.Model.Teacher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author theeradonjaroonchon
 */
public class EditProfileServlet extends HttpServlet {

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
        String Opassword = request.getParameter("opassword");
        String Npassword = request.getParameter("npassword");
        String Cpassword = request.getParameter("cpassword");

        String message = null;

        if (Opassword.trim().isEmpty() || Npassword.trim().isEmpty() || Cpassword.trim().isEmpty()) {
            message = "Please, Enter All Password";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
        }

        if (request.getSession().getAttribute("user") instanceof Student) {
            Student s = (Student) request.getSession().getAttribute("user");
            if (s.getPassword().equals(Opassword)) {
                if (Npassword.equals(Opassword)) {
                    message = "Your New Password is already exist with Old Password";
                    request.setAttribute("message", message);
                    getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                } else {
                    if (!Npassword.equals(Cpassword)) {
                        message = "Incorrect Confirm Password";
                        request.setAttribute("message", message);
                        getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                    } else {
                        StudentsController sc = new StudentsController();
                        Student sDB = sc.getStudentById(s.getId());
                        if (sDB.getId() == s.getId()) {
                            s.setPassword(Npassword);
                            sc.UpdateStudentInformation(s);
                            message = "Update Password Success!";
                            request.setAttribute("message", message);
                            getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                            return;
                        } else {
                            message = "Can't Update !";
                            request.setAttribute("message", message);
                            getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                        }
                    }
                }
            } else {
                message = "Incorrect Your Old Password";
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
            }
       
        } else if(request.getSession().getAttribute("user") instanceof Teacher){
           Teacher t = (Teacher) request.getSession().getAttribute("user");
           if(t.getPassword().equals(Opassword)){
               if(Npassword.equals(Opassword)){
                   message = "New Password is same Old Password";
                   request.setAttribute("message", message);
                   getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
               }else{
                   if(!Npassword.equals(Cpassword)){
                       message = "Your new Password doesn't match with Confirm password";
                       request.setAttribute("message", message);
                       getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                   }else{
                       TeachersController tc = new TeachersController();
                       Teacher tDB = tc.getTeacherById(t.getId());
                       if(tDB.getId() == t.getId()){
                           t.setPassword(Npassword);
                           tc.UpdateTeacherInformation(t);
                           message = "Update Password Successfull";
                           request.setAttribute("message", message);
                           getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                           return;
                       }else{
                           message = "Can't Update";
                           request.setAttribute("message", message);
                           getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                       }
                   }
               }
           }else{
               message = "Incorrect Your Old Password ";
               request.setAttribute("message", message);
               getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
           }
           
        }else{
            message = "Oops!,Something happend!";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
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
        getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
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
