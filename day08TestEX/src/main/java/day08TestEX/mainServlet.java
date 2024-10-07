package day08TestEX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class mainServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	goodsDAO dao = new goodsDAO();

        // 각 카테고리별 상품 목록 가져오기
        ArrayList<String> beautyList = dao.getBeautyList();
        ArrayList<String> shoesList = dao.getShoesList();
        ArrayList<String> tshirtList = dao.getTshirtList();
        ArrayList<String> outerList = dao.getOuterList();
        ArrayList<String> pantsList = dao.getPantsList();
        ArrayList<String> skirtList = dao.getSkirtList();
        ArrayList<String> bagList = dao.getBagList();
        ArrayList<String> propsList = dao.getPropsList();
        ArrayList<String> homewearList = dao.getHomewearList();
        ArrayList<String> sportsList = dao.getSportsList();
        ArrayList<String> digitalList = dao.getDigitalList();

        // 상품 목록을 request 객체에 저장
        request.setAttribute("beautyList", beautyList);
        request.setAttribute("shoesList", shoesList);
        request.setAttribute("tshirtList", tshirtList);
        request.setAttribute("outerList", outerList);
        request.setAttribute("pantsList", pantsList);
        request.setAttribute("skirtList", skirtList);
        request.setAttribute("bagList", bagList);
        request.setAttribute("propsList", propsList);
        request.setAttribute("homewearList", homewearList);
        request.setAttribute("sportsList", sportsList);
        request.setAttribute("digitalList", digitalList);
    	
        // Forward the request to the JSP
        request.getRequestDispatcher("WEB-INF/views/index.jsp").forward(request, response);
    }
}