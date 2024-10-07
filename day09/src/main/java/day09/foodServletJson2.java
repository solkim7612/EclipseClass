package day09;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet("/foodjson2")
public class foodServletJson2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Food> list = new ArrayList<>();
        list.add(new Food("오므라이스", 400));
        list.add(new Food("김밥", 3000));
        list.add(new Food("라면", 3500));
        
        JSONArray arr = new JSONArray();
        for (Food food : list) {
            JSONObject o = new JSONObject();
            o.put("name", food.getName());
            o.put("price", food.getPrice());  // 가격 정보도 추가
            arr.put(o);
        }
        
        System.out.println(arr);
        
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(arr);
    }
}
