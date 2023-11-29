package homework1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewStudent
 */
@WebServlet("/NewStudent")
public class NewStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Group> groups = (List<Group>) getServletContext().getAttribute("groups");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML><body>");
		out.println("<form action='NewStudent' method='post'>"
				+ 	"<div><a href='HomePage'>homepage</a></div>");
		out.println("<table border=1>"
				+ "<tr>"
				+ 	"<th>Name</th>"
				+ 	"<td><input type='text' name='name'</td>"
				+ "</tr>"
				+ "<tr>"
				+ 	"<th>Birth Year</th>"
				+ 	"<td><input type='text' name='birthYear'</td>"
				+ "</tr>"
				+ "<tr>"
				+ 	"<th>Parent Name</th>"
				+ 	"<td><input type='text' name='parentName'</td>"
				+ "</tr>"
				+ "<tr>"
				+ 	"<th>Parent Email</th>"
				+ 	"<td><input type='text' name='parentEmail'</td>"
				+ "</tr>"
				+ "<tr>"
				+ 	"<th>Group</th>"
				+ 	"<td>"
				+   "<select name='group' id='group'</select>");
						
		for(Group group:groups) {
			out.println("<option value=''>" + group.getGroupName() +"</option>");
		}
		
		out.println("<select name='group' id='group'</select>"
				+ 	"</td>"
				+ "</tr>"
				+ "<tr>"
				+	"<td colspan=4>"
				+		"<input type='submit' value='add'>"
				+ 	"</td>"
				+ "</tr>"
				+ "</table");
		out.print("</form>");
		out.println("</body></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int birthYear = Integer.parseInt(request.getParameter("birthYear"));
		String parentName = request.getParameter("parentName");
		String parentEmail = request.getParameter("parentEmail");
		String group = request.getParameter("group");
		int age = 2023-birthYear;
		
		Student newStudent = new Student(name, age, parentName, parentEmail);
		
		List<Student> students = (List<Student>) getServletContext().getAttribute("students");
		students.add(newStudent);
		
	    List<Group> groups = (List<Group>) getServletContext().getAttribute("groups");
	    for (Group memberGroup : groups) {
	        	memberGroup.addMember(newStudent);
	            break;
	        }
	    getServletContext().setAttribute("groups", groups);
		response.sendRedirect("ListStudents");
	}

}
