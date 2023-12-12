package finalPractice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class homePage
 */
@WebServlet("/homePage")
public class homePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dbService service = new dbService();
		List<person> reservations = service.getEntries();
        request.setAttribute("reservations", reservations);
		request.getRequestDispatcher("/WEB-INF/homePage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String dayOfWeek = request.getParameter("dayOfWeek");
		int timeSlot = Integer.parseInt(request.getParameter("timeSlot"));
		
		dbService reservations = new dbService();
		reservations.addEntry(name, timeSlot, dayOfWeek);
			
		doGet(request, response);
	}

}
