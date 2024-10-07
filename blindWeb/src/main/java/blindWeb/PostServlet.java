package blindWeb;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class PostServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create an instance of PostDAO
        PostDAO postDAO = new PostDAO();
        
        // Retrieve the top 10 topics
        List<Post> topTopics = postDAO.getTop10();
        
        // Set the topTopics as a request attribute
        request.setAttribute("topTopics", topTopics);
        
        // Forward the request to the JSP
        request.getRequestDispatcher("WEB-INF/views/index.jsp").forward(request, response);
    }
}