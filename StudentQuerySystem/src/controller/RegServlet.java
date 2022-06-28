//RegSubmit---->RegServlet

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegModel;
/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		doGet(request, response);
		PrintWriter out=response.getWriter();
		try {
		
		RegModel x=new RegModel();
		x.setName(request.getParameter("t1"));
		x.setEmail(request.getParameter("t2"));
		x.setPassword(request.getParameter("pass"));
		x.setMobile(request.getParameter("t3"));
		x.setBranch(request.getParameter("t4"));
		x.setUserType(request.getParameter("t5"));
		
		x.InsertReg();
		HttpSession session=request.getSession();
		session.setAttribute("name",x.getName());
		session.setAttribute("email",x.getEmail());
		session.setAttribute("Branch",x.getBranch());
		session.setAttribute("usertype",x.getUserType());
		
		if(x.getUserType().equals("Student"))
		{
			response.sendRedirect("StudentHome.jsp");
		}
		if(x.getUserType().equals("Teacher"))
		{
			response.sendRedirect("TeacherHome.jsp");
		}
				
		}
		catch(Exception ex)
		{out.println(ex);}
	}

}
