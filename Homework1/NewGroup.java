package homework1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewGroup
 */
@WebServlet("/NewGroup")
public class NewGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewGroup() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(""
				+ "<form action='NewGroup' method='post'>"
				+ "<div><a href='HomePage'>homepage</a></div>"
				+ "<table border=1>"
				+ "<tr>"
				+	"<th>Group</th>"
				+	"<td><input type='text' name='group'</td>"
				+ "</tr>"
				+ "<tr>"
				+ 	"<td colspan=4>"
				+ 		"<input type='submit' value='add'>"
				+ 	"</td>"
				+ "</tr>"
				+ "</table>"
				+ "</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String groupName = request.getParameter("group");
		List<Group> groups = (List<Group>) getServletContext().getAttribute("groups");
		
		Group newGroup = new Group(groupName);
		groups.add(newGroup);
		response.sendRedirect("ListGroups");
	}

}
