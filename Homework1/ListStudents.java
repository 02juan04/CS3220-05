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
 * Servlet implementation class ListStudents
 */
@WebServlet("/ListStudents")
public class ListStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
    	
    	List<Student> students = new ArrayList<>();
    	students.add(new Student("Juan", 21, "Jane", "email@gmail.com"));
    	students.add(new Student("John", 21, "Jane", "email@gmail.com"));
    	getServletContext().setAttribute("students", students);
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> students = (List<Student>) getServletContext().getAttribute("students");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML><body>"
				+ "<div><a href='HomePage'>homepage</a></div>");
		out.println("<a href='NewStudent'>New Student</a>");
		out.println("<form action='ListStudents' method='post'>");
		out.println("<table border=1>"
				+"<th>Student</th>"
				+"<th>Age</th>"
				+"<th>Parent</th>"
				+"<th>Email</th>");
		for(Student student:students) {
			out.println(""
					+ "<tr>"
					+ "<td>"
					+ 		student.getName()
					+ 	"</td>"
					+ 	"<td>"
					+ 		student.getAge()
					+ 	"<td>"
					+ 		student.getParent()
					+ 	"</td>"
					+ 	"<td>"
					+ 		student.getEmail()
					+ 	"</td>"
					+ 	"</tr>");
		}
		out.println("</table>");
		out.print("</form>");
		out.println("</body></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
