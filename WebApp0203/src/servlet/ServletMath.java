package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletMath
 */
@WebServlet("/math")
public class ServletMath extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletMath() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a=0;
		int b=0;
		int c =0;
		boolean signal = true;
		String parametarA = request.getParameter("a");
		try {
			if(parametarA.isEmpty()) throw new Exception("Insert number...");
			a=Integer.parseInt(parametarA);
		}catch(Exception e) {
			signal=false;
			e.printStackTrace();
			request.setAttribute("errorA", "A is not a number!");
		}
		String parametarB = request.getParameter("b");
		try {
			if(parametarB.isEmpty()) throw new Exception("Insert number...");
			b=Integer.parseInt(parametarB);
		}catch(Exception e) {
			signal=false;
			e.printStackTrace();
			request.setAttribute("errorB", "B is not a number!");
		}
		
		request.setAttribute("a", parametarA);
		request.setAttribute("b", parametarB);
		

		if(signal) {
			
			String operation = request.getParameter("operation");
			if("plus".equals(operation)) {
				c=a+b;
			}
			else if("minus".equals(operation)) {
				c=a-b;
			}
			request.setAttribute("c", c);
		}else {
			request.setAttribute("errorC", "A and B aren't numbers!");
		}
		
    	
    	RequestDispatcher rd = request.getRequestDispatcher("input.jsp");
    	rd.forward(request, response);
    	
	}

}
