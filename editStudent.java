package lab9;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/editStudent")
public class editStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public editStudent() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		@SuppressWarnings("unchecked")
		List<Student> students = (List<Student>) getServletContext().getAttribute("studentList");
		String id = request.getParameter("studentID");
		System.out.println(id);
		Student currentStudent = null;
		for(Student student: students) {
			if(student.getId() == Integer.parseInt(id)) {
				currentStudent = student;
			}
		}
		request.setAttribute("student", currentStudent);
		request.getRequestDispatcher("/WEB-INF/editStudent.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   int studentID = Integer.parseInt(request.getParameter("studentID"));
		    String name = request.getParameter("name");
			int birthYear = Integer.parseInt(request.getParameter("birthYear"));
		    int age = 2023-birthYear;
		    String parentName = request.getParameter("parentName");
		    String parentEmail = request.getParameter("parentEmail");
		    String newGroup = request.getParameter("groupSelect");
		    Student currentStudent = null;

		    // Update the corresponding student in the list
		    List<Student> students = (List<Student>) getServletContext().getAttribute("studentList");
		    for (Student student : students) {
		        if (student.getId() == studentID) {
		            currentStudent = student;
		        	student.setName(name);
		            student.setAge(age);
		            student.setParent(parentName);
		            student.setEmail(parentEmail);
					student.setBirthYear(birthYear);
					student.setGroup(newGroup);
		            break;
		        }
		    }
		    List<Group> groups = (List<Group>) getServletContext().getAttribute("groups");
		    for (Group group : groups) {
		    	if (group.getMembers().contains(currentStudent)) {
		    		group.getMembers().remove(currentStudent);
		    		break;
		    	}
		    }
		    for (Group group : groups) {
		        if (group.getGroupName().equals(newGroup)) {
		            group.addMember(currentStudent);
		            break;
		        }
		    }
		    
		    
		    response.sendRedirect("ListStudents");
	}

}
