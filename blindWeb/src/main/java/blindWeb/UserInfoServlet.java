package blindWeb;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userList")
public class UserInfoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // companyId 파라미터를 가져옴
        String companyId = request.getParameter("companyId");
        
        // companyId가 없을 경우 에러 처리
        if (companyId == null || companyId.trim().isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Company ID is required.");
            return;
        }

        // Create an instance of UserInfoDAO
        UserInfoDAO userInfoDAO = new UserInfoDAO();
        
        // Retrieve the list of users using the DAO
        List<UserInfo> userList = userInfoDAO.getUsersByCompanyId(companyId);
        
        // Set the userList as a request attribute
        request.setAttribute("userList", userList);
        
        // Forward the request to the JSP
        request.getRequestDispatcher("WEB-INF/views/userList.jsp").forward(request, response);
    }
}