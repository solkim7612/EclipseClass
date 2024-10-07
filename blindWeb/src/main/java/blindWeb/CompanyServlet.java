package blindWeb;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/companyList")
public class CompanyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create an instance of CompanyDAO
        CompanyDAO companyDAO = new CompanyDAO();
        
        // Retrieve the list of all companies using the DAO
        List<Company> companyList = companyDAO.getAllCompanies();
        
        // Set the company list as a request attribute
        request.setAttribute("companyList", companyList);
        
        // Forward the request to the JSP
        request.getRequestDispatcher("WEB-INF/views/companyList.jsp").forward(request, response);
    }
}