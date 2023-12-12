package lab9;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NewStudent")
public class NewStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public NewStudent() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/NewStudent.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int birthYear = Integer.parseInt(request.getParameter("birthYear"));
		String parentName = request.getParameter("parentName");
		String parentEmail = request.getParameter("parentEmail");
		String groupName = request.getParameter("groupSelect");
		int age = 2023-birthYear;
		
		Student newStudent = new Student(name, age, parentName, parentEmail);	
		List<Student> students = (List<Student>) getServletContext().getAttribute("studentList");
		students.add(newStudent);
		
		List<Group> groups = (List<Group>) getServletContext().getAttribute("groups");
	    for (Group group : groups) {
	        if (group.getGroupName().equals(groupName)) {
	        	newStudent.setGroup(groupName);
	            group.addMember(newStudent); // Add the student to the group
	            break;
	        }
	    }
		response.sendRedirect("ListStudents");
	}

}
