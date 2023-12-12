package lab9;

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
    	request.getRequestDispatcher("/WEB-INF/ListGroups.jsp").forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
