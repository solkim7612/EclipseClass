package blind;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/blindTopic")
public class bestTopicServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		req.setCharacterEncoding("utf-8");
		
		DBDAO_blind dao = new DBDAO_blind();
		ArrayList<bestTopic> list = dao.selectAllBestTopic();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/topicView.jsp").forward(req, resp);
		
	}
	
}
