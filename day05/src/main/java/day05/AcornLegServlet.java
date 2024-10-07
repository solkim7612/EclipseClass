package day05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornRegServlet") 
public class AcornLegServlet extends HttpServlet{
	//service: get, post
	
	//get(등록화면)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/reg.jsp").forward(req, resp);
	
	}
	
	
	//post(등록작업-데이터베이스)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	req.setCharacterEncoding("utf-8");
	String id=req.getParameter("id");
	String pw=req.getParameter("pw");
	String name=req.getParameter("name");
	
	Acorn acorn=new Acorn(id,pw,name);
	
	System.out.println(id);
	System.out.println(pw);
	System.out.println(name);
	
	AcornService service=new AcornService();
	int rtn=service.registerMember(acorn);
	
	req.getRequestDispatcher("WEB-INF/views/ok.jsp").forward(req, resp);
	}
}
