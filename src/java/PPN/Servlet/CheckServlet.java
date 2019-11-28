/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Servlet;

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
public class CheckServlet extends HttpServlet {

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
        HttpSession session = request.getSession(false);
        if(session!=null||session.getAttribute("user")!=null){
            session.invalidate();
        }
      int understand = 0 ;
      int remember = 0 ;
      String f = request.getParameter("f") ;
      String g = request.getParameter("g") ;
      String a = request.getParameter("a") ;
      String b = request.getParameter("b") ;
      String c = request.getParameter("c") ;
      String d = request.getParameter("d") ;
      String e = request.getParameter("e") ;
      String h = request.getParameter("h") ;
      String i = request.getParameter("i") ;
      String j = request.getParameter("j") ;
      String k = request.getParameter("k") ;
      String l = request.getParameter("l") ;
      String m = request.getParameter("m") ;
      String n = request.getParameter("n") ;
      String o = request.getParameter("o") ;
      String p = request.getParameter("p") ;
      String q = request.getParameter("q") ;
      String r = request.getParameter("r") ;
      String s = request.getParameter("s") ;
      String t = request.getParameter("t") ;
      String u = request.getParameter("u") ;
      String v = request.getParameter("v") ;
      String w = request.getParameter("w") ;
      String x = request.getParameter("x") ;
      String y = request.getParameter("y") ;
      String correct = "correct" ;
      int count = 0 ;
      
  if(f!=null){
    if(f.equals(correct)){
        understand+=20 ;
        count+=20 ;
    }
  }
  
   if(g!=null){
    if(g.equals(correct)){
        remember+=20 ;
        count+=20 ;
      }
    }
   if(a!=null){
    if(a.equals(correct)){
        remember+=20 ;
        count+=20 ;
    }
   }
    
   if(b!=null){
    if(b.equals(correct)){
        remember+=20;
        count+=20 ;
    }
   }
    
   if(c!=null){
    if(c.equals(correct)){
        remember+=20 ;
        count+=20 ;
    }
   }
    
   if(d!=null){
    if(d.equals(correct)){
        understand+=20 ;
        count+=20 ;
    }
   }
    
   if(e!=null){
    if(e.equals(correct)){
        remember+=20 ;
        count+=20 ;
    }
   }
    
   if(h!=null){
    if(h.equals(correct)){
        remember+=20 ;
        count+=20 ;
    }
   }
   
   if(i!=null){
    if(i.equals(correct)){
        understand+=20 ;
        count+=20 ;
    }
   }
    
   if(j!=null){
    if(j.equals(correct)){
        understand+=20 ;
        count+=20 ;
    }
   }
   
   if(k!=null){
       if(k.equals(correct)){
           understand+=20 ;
           count+=20 ;
       }
   }
   
   if(l!=null){
       if(l.equals(correct)){
           remember+=20 ;
           count+=20 ;
       }
   }
   
   if(m!=null){
       if(m.equals(correct)){
           remember+=20 ;
           count+=20 ;
       }
   }
   
   if(n!=null){
       if(n.equals(correct)){
           remember+=20;
           count+=20 ;
       }
   }
   
   if(o!=null){
       if(o.equals(correct)){
           understand+=20 ;
           count+=20 ;
       }
   }
   
   if(p!=null){
       if(p.equals(correct)){
           understand+=20 ;
           count+=20 ;
       }
   }
   
   if(q!=null){
       if(q.equals(correct)){
           remember+=20 ;
           count+=20 ;
       }
   }
   
   if(r!=null){
       if(r.equals(correct)){
           understand+=20 ;
           count+=20 ;
       }
   }
   
   if(s!=null){
       if(s.equals(correct)){
           remember+=20 ;
           count+=20 ;
       }
   }
   
   if(t!=null){
       if(t.equals(correct)){
           understand+=20 ;
           count+=20 ;
       }
   }
   
   if(u!=null){
       if(u.equals(correct)){
           remember+=20 ;
           count+=20 ;
       }
   }

   if(v!=null){
       if(v.equals(correct)){
           remember+=20 ;
           count+=20 ;
       }
   }
   
   if(w!=null){
       if(w.equals(correct)){
           remember+=20 ;
           count+=20 ;
       }
   }
   
   if(x!=null){
       if(x.equals(correct)){
           remember+=20 ;
           count+=20 ;
       }
   }
   
   if(y!=null){
       if(y.equals(correct)){
           remember+=20;
           count+=20 ;
       }
   }
      
      request.setAttribute("remember", remember);
      request.setAttribute("understand", understand);
      request.setAttribute("count", count);
      getServletContext().getRequestDispatcher("/WEB-INF/ShowPoint.jsp").forward(request, response);
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
        getServletContext().getRequestDispatcher("/WEB-INF/ShowPoint.jsp").forward(request, response);
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
