package day09;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/food3")
public class foodServlet3 extends HttpServlet{ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList <Food> list=new ArrayList<>();
		list.add(new Food("오므라이스",400));
		list.add(new Food("오므라이스",400));
		list.add(new Food("오므라이스",400));
	
		resp.setCharacterEncoding("uft-8");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out=resp.getWriter();
		out.println(list);
		
	}
}
