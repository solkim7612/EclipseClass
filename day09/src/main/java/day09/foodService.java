package day09;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class foodService {
	
	FoodDAO dao  = new FoodDAO();
	
	public JSONArray getMenuListJSON() {
		ArrayList<Food> list = new ArrayList<>();
        list.add(new Food("오므라이스", 400));
        list.add(new Food("김밥", 3000));
              
        JSONArray arr = new JSONArray();
        for (Food food : list) {
            JSONObject o = new JSONObject();
            o.put("name", food.getName());
            o.put("price", food.getPrice());  // 가격 정보도 추가
            arr.put(o);
        }
        return arr;
	}
	
	
	public JSONArray getMenuListJSON2() {
		 
		ArrayList <Food> list = dao.getFoodList();
		
		
		
        JSONArray arr = new JSONArray();
        for (Food food : list) {
            JSONObject o = new JSONObject();
            o.put("name", food.getName());
            o.put("price", food.getPrice());  // 가격 정보도 추가
            arr.put(o);
        }
        return arr;
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
