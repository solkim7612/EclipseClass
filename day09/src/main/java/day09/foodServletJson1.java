package day09;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

@WebServlet("/foodjson1")
public class foodServletJson1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // foodDAO 객체 생성
        Food food = new Food("오므라이스", 4000);
        
        // JSON 객체 생성
        JSONObject o = new JSONObject();
        o.put("name", food.getName());   // 올바르게 name 값을 가져옴
        o.put("price", food.getPrice()); // 올바르게 price 값을 가져옴
        
        // 응답 설정 및 JSON 출력
        resp.setCharacterEncoding("utf-8"); // 오타 수정: uft-8 -> utf-8
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(o);
    }
}