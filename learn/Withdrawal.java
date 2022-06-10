

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Withdrawal
 */
@WebServlet("/Withdrawal")
public class Withdrawal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HfalsettpServlet()
     */
    public Withdrawal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		String CardNo=request.getParameter("textcard");
		String pin=request.getParameter("textpin");
		String req=request.getParameter("request");
		//
		if(Pattern.matches("[0-9]{16}",CardNo))
		{
			pw.print("valid CardNumber and pin :");
			pw.print("\nCard Number "+CardNo);
			pw.print("\npin "+pin);
		}
		else
		{
			pw.print("valid CardNumber and pin :");
		}
			if(req.equals("withdrawal"));
			response.sendRedirect("WithdrawServlet");
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
