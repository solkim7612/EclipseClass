package day02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/submitForm")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 폼에서 전송된 파라미터 가져오기
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        
        // 응답의 콘텐츠 타입을 설정
        response.setContentType("text/html");
        
        // 응답 스트림에 데이터를 작성하여 클라이언트에게 보냄
        response.getWriter().println("<h1>Form Submitted</h1>");
        response.getWriter().println("<p>Username: " + username + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
    }
}
