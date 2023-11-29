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

@WebServlet("/ListGroups")
public class ListGroups extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListGroups() {
        super();
    }

    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
    	
    	List<Group> groups = new ArrayList<>();
    	getServletContext().setAttribute("groups", groups);
    	
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<Group> groups = (List<Group>) getServletContext().getAttribute("groups");
		List<Student> students = (List<Student>) getServletContext().getAttribute("students");
    	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<div><a href='HomePage'>homepage</a></div>"
				+ "<a href='NewGroup'>New Group</a>"
				+ "<table border=1>"
				+"<th>Group</th>"
				+"<th>Members</th>");
		for(Group group:groups) {
			out.println("<tr>"
					+ 		"<td>"
					+ 			group.getGroupName()
					+ 		"</td>"
					+ 		"<td>"
					+ "");
		   out.println("</td>"
					+ 	"</tr>");
		}
				out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
