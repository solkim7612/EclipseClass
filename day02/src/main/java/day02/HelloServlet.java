package day02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello2")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 응답의 콘텐츠 타입을 HTML로 설정
        response.setContentType("text/html");
        
        // 응답 스트림에 데이터를 작성하여 클라이언트에게 보냄
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}