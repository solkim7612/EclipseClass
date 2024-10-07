/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.94
 * Generated at: 2024-09-27 09:06:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/day08TestEX/css/index.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/day08TestEX/css/login.css\">\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    // JavaScript 함수로 카테고리를 클릭할 때마다 해당 상품 목록을 보여주기\r\n");
      out.write("    function showCategory(categoryId) {\r\n");
      out.write("        // 모든 카테고리의 상품 목록을 숨김\r\n");
      out.write("        var lists = document.getElementsByClassName('category-list');\r\n");
      out.write("        for (var i = 0; i < lists.length; i++) {\r\n");
      out.write("            lists[i].style.display = 'none';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // 클릭한 카테고리의 상품 목록을 보여줌\r\n");
      out.write("        document.getElementById(categoryId).style.display = 'block';\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    // 장바구니에 상품을 추가하는 함수\r\n");
      out.write("    function addToCart(itemName) {\r\n");
      out.write("        let cart = JSON.parse(localStorage.getItem('cart')) || [];\r\n");
      out.write("        cart.push(itemName);\r\n");
      out.write("        localStorage.setItem('cart', JSON.stringify(cart));\r\n");
      out.write("        alert(itemName + \"이(가) 장바구니에 추가되었습니다.\");\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function searchItems() {\r\n");
      out.write("        const query = document.getElementById(\"searchInput\").value.toLowerCase(); // 검색어 가져오기 및 소문자로 변환\r\n");
      out.write("        const items = document.querySelectorAll(\".category-list li\"); // 모든 상품 목록 가져오기\r\n");
      out.write("\r\n");
      out.write("        items.forEach(item => {\r\n");
      out.write("            const itemName = item.textContent.toLowerCase(); // 상품 이름을 소문자로 변환\r\n");
      out.write("\r\n");
      out.write("            // 검색어가 포함되어 있으면 해당 아이템을 표시하고, 아니면 숨기기\r\n");
      out.write("            if (itemName.includes(query)) {\r\n");
      out.write("                item.style.display = \"flex\"; // 검색 결과를 flex로 표시\r\n");
      out.write("            } else {\r\n");
      out.write("                item.style.display = \"none\";\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("	<div class=\"logo\">ACORN MALL</div>\r\n");
      out.write("	\r\n");
      out.write("    <div class=\"log\"><a href=\"/day08TestEX/login\">로그인</a></div>\r\n");
      out.write("    <div class=\"log\"><a href=\"/day08TestEX/logout\" onclick=\"return confirm('로그아웃이 완료되었습니다');\">로그아웃</a></div>\r\n");
      out.write("    <div class=\"log\">장바구니</div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<main>\r\n");
      out.write("    <div class=search>\r\n");
      out.write("        <input type=\"text\" id=\"searchInput\" placeholder=\"상품을 검색하세요\" onkeyup=\"searchItems()\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"listbtn\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('beauty')\">뷰티</a></li>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('shoes')\">신발</a></li>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('tshirt')\">상의</a></li>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('outer')\">아우터</a></li>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('pants')\">바지</a></li>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('skirt')\">원피스/스커트</a></li>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('bag')\">패션소품</a></li>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('homewear')\">속옷/홈웨어</a></li>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('sports')\">스포츠/레저</a></li>\r\n");
      out.write("            <li><a href=\"#\" onclick=\"showCategory('digital')\">디지털/라이프</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 각 카테고리별 상품 목록을 표시하는 영역 -->\r\n");
      out.write("    <div id=\"beauty\" class=\"category-list\">\r\n");
      out.write("        <h3>뷰티</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> beautyList = (ArrayList<String>) request.getAttribute("beautyList");
                if (beautyList != null) {
                    for (String item : beautyList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li> \r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"shoes\" class=\"category-list\">\r\n");
      out.write("        <h3>신발</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> shoesList = (ArrayList<String>) request.getAttribute("shoesList");
                if (shoesList != null) {
                    for (String item : shoesList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li> \r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"tshirt\" class=\"category-list\">\r\n");
      out.write("        <h3>상의</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> tshirtList = (ArrayList<String>) request.getAttribute("tshirtList");
                if (tshirtList != null) {
                    for (String item : tshirtList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li> \r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"outer\" class=\"category-list\">\r\n");
      out.write("        <h3>아우터</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> outerList = (ArrayList<String>) request.getAttribute("outerList");
                if (outerList != null) {
                    for (String item : outerList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li>\r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"pants\" class=\"category-list\">\r\n");
      out.write("        <h3>바지</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> pantsList = (ArrayList<String>) request.getAttribute("pantsList");
                if (pantsList != null) {
                    for (String item : pantsList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li>\r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"skirt\" class=\"category-list\">\r\n");
      out.write("        <h3>원피스/스커트</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> skirtList = (ArrayList<String>) request.getAttribute("skirtList");
                if (skirtList != null) {
                    for (String item : skirtList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li>\r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"bag\" class=\"category-list\">\r\n");
      out.write("        <h3>패션소품</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> bagList = (ArrayList<String>) request.getAttribute("bagList");
                if (bagList != null) {
                    for (String item : bagList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li>\r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"homewear\" class=\"category-list\">\r\n");
      out.write("        <h3>속옷/홈웨어</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> homewearList = (ArrayList<String>) request.getAttribute("homewearList");
                if (homewearList != null) {
                    for (String item : homewearList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li>\r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("    <div id=\"sports\" class=\"category-list\">\r\n");
      out.write("        <h3>스포츠/레저</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> sportsList = (ArrayList<String>) request.getAttribute("sportsList");
                if (sportsList != null) {
                    for (String item : sportsList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li>\r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"digital\" class=\"category-list\">\r\n");
      out.write("        <h3>디지털/라이프</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
 
                ArrayList<String> digitalList = (ArrayList<String>) request.getAttribute("digitalList");
                if (digitalList != null) {
                    for (String item : digitalList) {
            
      out.write("\r\n");
      out.write("                        <li>");
      out.print( item );
      out.write(" <button onclick=\"addToCart('");
      out.print( item );
      out.write("')\">장바구니</button></li>\r\n");
      out.write("            ");
 
                    }
                }
            
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
