package day02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.IOException;

@WebServlet("/hello")
public class HtmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 비즈니스 로직 처리 (예: 사용자 이름 생성)
        String message = "Hello, World!";

        
        
        // JSP로 데이터를 전달
        request.setAttribute("message", message);

        // JSP 페이지로 포워딩
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/hello.jsp");
        dispatcher.forward(request, response);
    }
}