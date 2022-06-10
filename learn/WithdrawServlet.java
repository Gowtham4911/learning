

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawServlet() {
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
			
			pw.print("<h1>Withdraw</h1>");
			pw.print("<body><form method='post'><table>");
			pw.print("<tr><td>Amount:</td><td><input type='text' name='name' placeholder='Enter the Amount'/></td>");
			pw.print("<td><input type='submit' value='ok' /> </td></tr></table></form></body>");
			long Amount=11100;
				
			long Rc= Integer.parseInt(request.getParameter("name"));
			//pw.print();
			if(Rc<Amount)
			{
				Amount=Amount-Rc;
				pw.print(Amount);
			}
			else
			{
				pw.print("INSSUFFICIENT BALANCE");
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
