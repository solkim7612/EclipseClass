<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index</title>
    <link rel="stylesheet" href="/blindWeb/css/index.css">
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;700&display=swap" rel="stylesheet">
</head>
<body>

<header>

    <div class="header_top">
        <b>블라인드</b> 기업서비스 <b> > </b>
    </div>
    
    <div class="header_bottom">
    	<span class="header_bottom_logo"> 
    		<a href="<%= request.getContextPath() %>/index" style="text-decoration: none;">blind</a> 
    		<sup>TOPIC</sup> 
    	</span>
    	<ul class="header_bottom_menu">
    		<li>
    			<a href="<%= request.getContextPath() %>/index" style="text-decoration: none;" class="home">홈</a>
    		</li>
		    <li>기업 리뷰</li>
		    <li>채용공고<sup class="menu_sup">blind Hire</sup></li>
    	</ul>
	    <div class="header_bottom_button">
	    	<button type="button" class="wrt_btn">글쓰기</button>
	        <button type="button" class="log_btn">로그인</button>
	    </div>
    </div>
    
</header>

<main>

    <img class="main_banner" alt="광고사진" src="/blindWeb/img/15940192125655449145.jpg" >
    
    <div class="main_content">
    	<div class="main_content_left">
    	
	        <div class="main_content_search">
	            <span>
	            	<img alt="돋보기사진" src="/blindWeb/img/free-icon-magnifier-2319177.png" width=24px height=24px>
	            </span>
	            <input name="keyword" type="search" placeholder="관심있는 내용을 검색해보세요!" autocomplete="off">
	        </div>
	        
        	<%@ page import="java.util.List" %>
			<%@ page import="blindWeb.Post" %>
			<%List<Post> topTopics = (List<Post>) request.getAttribute("topTopics");%>

	        <div class="main_content_post">
	   
                <div class="main_content_post_top">
               		<img class="main_content_post_top1" alt="crown" src="/blindWeb/img/ico-best.png" width=32px>	
                	<span class="main_content_post_top2">토픽 베스트 10</span>
                	<span class="main_content_post_top3"> 더보기 > </span>
                </div>
                
                <div class="main_content_post_bottom">
                    <ul class="post_title">
                        <% 
                            if (topTopics != null) {
                                int rank = 1;
                                for (Post post : topTopics) { 
                        %>
                       	<li> 
                       		<a href="<%= request.getContextPath() %>/post?postId=<%= post.getPostId() %>" style="text-decoration: none;">
                       		<%=post.getPostTitle() %>
                       		</a>
                       	</li>
                        <% 
                                } 
                            } else { 
                        %>
                            <li>데이터가 없습니다.</li>
                        <% 
                            } 
                        %>
                    </ul>
                    
                    <ul class="post_comments">
                        <% 
                            if (topTopics != null) {
                                for (Post post : topTopics) { 
                        %>
                            <li><img alt="댓글사진" src="/blindWeb/img/free-icon-chat-bubble-6209512.png" width=16px> <%= post.getCommentCount() %></li>
                        <% 
                                } 
                            } else { 
                        %>
                            <li>댓글 데이터가 없습니다.</li>
                        <% 
                            } 
                        %>
                    </ul>
                    
                </div>
            </div>
        
	        <div class="main_content_logo">
	            <img alt="광고 로고" src="/blindWeb/img/bg-placeholder-728x90.png" >
	        </div>
	        
       </div>
    
    	<div class="main_content_right">
    	
	        <img alt="광고사진2" src="/blindWeb/img/hire-june1.png" width=300px height=75px>
        
	        <div class="main_content_right_content">
	            <h1>실시간 인기 회사</h1>
	            <div class="main_content_right_ranking">
	            	<ul class="main_content_right_ranking1"> 
	               	 <% 
                        if (topTopics != null) {
                        int rank = 1;
                        for (Post post : topTopics) { 
                      %>
                         <li><%= rank++ + ". " + post.getPostUserCompany() %></li>
                      <% 
                                } 
                            } else { 
                      %>
                            <li>데이터가 없습니다.</li>
                      <% 
                            } 
                      %>
	            	</ul>
	            
		            <ul class="main_content_right_ranking2">
		            	<li> 1</li>
	                </ul>
	            </div>
	            <h2>ⓘ 블라인드에서 실시간으로 많이 검색된 회사 순위</h2>
	            
	        </div>
        
	        <img alt="광고 로고" src="/blindWeb/img/bg-placeholder-300x250.png" width=300px height=250px>
	        
	        
    	</div>
    </div>
</main>

<footer>
    <div class="footer_top">
    
        <ul class="footer_top_menu">
            <li>서비스 소개</li>
            <li>이용약관</li>
            <li>디렉토리</li>
            <li>개인정보 처리방침</li>
            <li>인재채용</li>
            <li>블라인드 기업서비스</li>
            <li>신고가이드</li>
        </ul>
        
        <div class="footer_top_botton">
            <button type="button"><img alt="apple" src="/blindWeb/img/free-icon-apple-logo-747.png" width=24px> APP STORE</button>
            <button type="button"><img alt="google" src="/blindWeb/img/free-icon-google-play-1216729.png" width=24px>GOOGLE PLAY</button>
        </div>
        
    </div>
    
</footer>

</body>
</html>