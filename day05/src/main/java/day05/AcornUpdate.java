package day05;

import java.io.IOException;

import javax.print.DocFlavor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class AcornUpdate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");
		String name=req.getParameter("name");
		
		Acorn acorn = new Acorn(id, pw, name);
		AcornService servive=new AcornService();
		servive.modifyMember(acorn);
		
		req.getRequestDispatcher("WEB-INF/views/updateok.jsp").forward(req, resp);
		
	}
}
