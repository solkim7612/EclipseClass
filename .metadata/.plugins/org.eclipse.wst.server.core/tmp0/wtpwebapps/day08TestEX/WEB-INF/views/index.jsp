<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/day08TestEX/css/index.css">
<link rel="stylesheet" href="/day08TestEX/css/login.css">

<script>
    // JavaScript 함수로 카테고리를 클릭할 때마다 해당 상품 목록을 보여주기
    function showCategory(categoryId) {
        // 모든 카테고리의 상품 목록을 숨김
        var lists = document.getElementsByClassName('category-list');
        for (var i = 0; i < lists.length; i++) {
            lists[i].style.display = 'none';
        }

        // 클릭한 카테고리의 상품 목록을 보여줌
        document.getElementById(categoryId).style.display = 'block';
    }
    
    // 장바구니에 상품을 추가하는 함수
    function addToCart(itemName) {
        let cart = JSON.parse(localStorage.getItem('cart')) || [];
        cart.push(itemName);
        localStorage.setItem('cart', JSON.stringify(cart));
        alert(itemName + "이(가) 장바구니에 추가되었습니다.");
    }
    
    function searchItems() {
        const query = document.getElementById("searchInput").value.toLowerCase(); // 검색어 가져오기 및 소문자로 변환
        const items = document.querySelectorAll(".category-list li"); // 모든 상품 목록 가져오기

        items.forEach(item => {
            const itemName = item.textContent.toLowerCase(); // 상품 이름을 소문자로 변환

            // 검색어가 포함되어 있으면 해당 아이템을 표시하고, 아니면 숨기기
            if (itemName.includes(query)) {
                item.style.display = "flex"; // 검색 결과를 flex로 표시
            } else {
                item.style.display = "none";
            }
        });
    }

</script>

</head>

<body>

<header>
	<div class="logo">ACORN MALL</div>
	
    <div class="log"><a href="/day08TestEX/login">로그인</a></div>
    <div class="log"><a href="/day08TestEX/logout" onclick="return confirm('로그아웃이 완료되었습니다');">로그아웃</a></div>
    <div class="log">장바구니</div>
</header>

<main>
    <div class=search>
        <input type="text" id="searchInput" placeholder="상품을 검색하세요" onkeyup="searchItems()">
    </div>

    <div class="listbtn">
        <ul>
            <li><a href="#" onclick="showCategory('beauty')">뷰티</a></li>
            <li><a href="#" onclick="showCategory('shoes')">신발</a></li>
            <li><a href="#" onclick="showCategory('tshirt')">상의</a></li>
            <li><a href="#" onclick="showCategory('outer')">아우터</a></li>
            <li><a href="#" onclick="showCategory('pants')">바지</a></li>
            <li><a href="#" onclick="showCategory('skirt')">원피스/스커트</a></li>
            <li><a href="#" onclick="showCategory('bag')">패션소품</a></li>
            <li><a href="#" onclick="showCategory('homewear')">속옷/홈웨어</a></li>
            <li><a href="#" onclick="showCategory('sports')">스포츠/레저</a></li>
            <li><a href="#" onclick="showCategory('digital')">디지털/라이프</a></li>
        </ul>
    </div>

    <!-- 각 카테고리별 상품 목록을 표시하는 영역 -->
    <div id="beauty" class="category-list">
        <h3>뷰티</h3>
        <ul>
            <% 
                ArrayList<String> beautyList = (ArrayList<String>) request.getAttribute("beautyList");
                if (beautyList != null) {
                    for (String item : beautyList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li> 
            <% 
                    }
                }
            %>
        </ul>
    </div>

    <div id="shoes" class="category-list">
        <h3>신발</h3>
        <ul>
            <% 
                ArrayList<String> shoesList = (ArrayList<String>) request.getAttribute("shoesList");
                if (shoesList != null) {
                    for (String item : shoesList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li> 
            <% 
                    }
                }
            %>
        </ul>
    </div>

    <div id="tshirt" class="category-list">
        <h3>상의</h3>
        <ul>
            <% 
                ArrayList<String> tshirtList = (ArrayList<String>) request.getAttribute("tshirtList");
                if (tshirtList != null) {
                    for (String item : tshirtList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li> 
            <% 
                    }
                }
            %>
        </ul>
    </div>

    <div id="outer" class="category-list">
        <h3>아우터</h3>
        <ul>
            <% 
                ArrayList<String> outerList = (ArrayList<String>) request.getAttribute("outerList");
                if (outerList != null) {
                    for (String item : outerList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li>
            <% 
                    }
                }
            %>
        </ul>
    </div>
    
    <div id="pants" class="category-list">
        <h3>바지</h3>
        <ul>
            <% 
                ArrayList<String> pantsList = (ArrayList<String>) request.getAttribute("pantsList");
                if (pantsList != null) {
                    for (String item : pantsList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li>
            <% 
                    }
                }
            %>
        </ul>
    </div>
    
    <div id="skirt" class="category-list">
        <h3>원피스/스커트</h3>
        <ul>
            <% 
                ArrayList<String> skirtList = (ArrayList<String>) request.getAttribute("skirtList");
                if (skirtList != null) {
                    for (String item : skirtList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li>
            <% 
                    }
                }
            %>
        </ul>
    </div>
    
    <div id="bag" class="category-list">
        <h3>패션소품</h3>
        <ul>
            <% 
                ArrayList<String> bagList = (ArrayList<String>) request.getAttribute("bagList");
                if (bagList != null) {
                    for (String item : bagList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li>
            <% 
                    }
                }
            %>
        </ul>
    </div>

    <div id="homewear" class="category-list">
        <h3>속옷/홈웨어</h3>
        <ul>
            <% 
                ArrayList<String> homewearList = (ArrayList<String>) request.getAttribute("homewearList");
                if (homewearList != null) {
                    for (String item : homewearList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li>
            <% 
                    }
                }
            %>
        </ul>
    </div>
   
    <div id="sports" class="category-list">
        <h3>스포츠/레저</h3>
        <ul>
            <% 
                ArrayList<String> sportsList = (ArrayList<String>) request.getAttribute("sportsList");
                if (sportsList != null) {
                    for (String item : sportsList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li>
            <% 
                    }
                }
            %>
        </ul>
    </div>
	
	<div id="digital" class="category-list">
        <h3>디지털/라이프</h3>
        <ul>
            <% 
                ArrayList<String> digitalList = (ArrayList<String>) request.getAttribute("digitalList");
                if (digitalList != null) {
                    for (String item : digitalList) {
            %>
                        <li><%= item %> <button onclick="addToCart('<%= item %>')">장바구니</button></li>
            <% 
                    }
                }
            %>
        </ul>
    </div>

</main>

</body>
</html>