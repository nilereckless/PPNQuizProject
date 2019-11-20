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

/**
 *
 * @author theeradonjaroonchon
 */
public class EditNameServlet extends HttpServlet {

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
        String Oname = request.getParameter("ofirstname") + " " + request.getParameter("olastname");
        String Nname = request.getParameter("nfirstname") + " " + request.getParameter("nlastname");
        String Cname = request.getParameter("cfirstname") + " " + request.getParameter("clastname");
        
        String message = null;
        
        if (Oname.trim().isEmpty() || Nname.trim().isEmpty() || Cname.trim().isEmpty()) {
            message = "Please Enter All!";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
        }
        
        if (request.getSession().getAttribute("user") instanceof Student) {
            Student s = (Student) request.getSession().getAttribute("user");
            if (s.getFullname().equals(Oname)) {
                if (Nname.equals(Oname)) {
                    message = "New Fullname is already exist with Old name";
                    request.setAttribute("message", message);
                    getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                } else {
                    if (!Nname.equals(Cname)) {
                        message = "Incorrect Confirm Fullname";
                        request.setAttribute("message", message);
                        getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                    } else {
                        StudentsController sc = new StudentsController();
                        Student sDTB = sc.getStudentById(s.getId());
                        if (sDTB.getId() == s.getId()) {
                            s.setFullname(Nname);
                            sc.UpdateStudentInformation(s);
                            message = "Update Name Success!";
                            request.setAttribute("message", message);
                            getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                            return;
                        } else {
                            message = "Can't Updates";
                            request.setAttribute("message", message);
                            getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                        }
                    }
                }
            } else {
                message = "Incorrect Old Name";
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
            }
        
        } else if (request.getSession().getAttribute("user") instanceof Teacher) {
            Teacher t = (Teacher) request.getSession().getAttribute("user");
            if (t.getFullname().equals(Oname)) {
                if (Nname.equals(Oname)) {
                    message = "New Name is same Old Name";
                    request.setAttribute("message", message);
                    getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                } else {
                    if (!Nname.equals(Cname)) {
                        message = "Your new Password is doesn't match with Confrim Name";
                        request.setAttribute("message", message);
                        getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                    } else {
                        TeachersController tc = new TeachersController();
                        Teacher tDTB = tc.getTeacherById(t.getId());
                        if (tDTB.getId() == t.getId()) {
                            t.setFullname(Nname);
                            tc.UpdateTeacherInformation(t);
                            message = "Congratulation, Update Name Success";
                            request.setAttribute("message", message);
                            getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                            return;
                            
                        } else {
                            message = "Sorry, Can't Updates!";
                            request.setAttribute("message", message);
                            getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
                        }
                    }
                }
            } else {
                message = "Wrong Old Name";
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/EditProfile.jsp").forward(request, response);
            }
            
        } else {
            message = "Oops, What happend";
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
