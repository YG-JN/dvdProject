<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DVD정보입력</title>
</head>
<%-- dvd_add.jsp --%>
<body>
   <h3>DVD정보입력</h3>
   <form action="/DVDShop/product?action=insert" method="post"
   		enctype="multipart/form-data">
    <fieldset>
      <legend>영화정보</legend>
     DVD제목: <input type="text" name="title"><br>   
     DVD감독: <input type="text" name="director"><br>   
         배우: <input type="text" name="actor"><br>   
         제작년도(연도 월 날짜): <input type="date" name="year"><br>   
         제작년도: <input type="text" name="year2"><br>   
         제작년도(연도 월): <input type="month" name="year3"><br>   
         제작년도(연도 주): <input type="week" name="year4"><br>   
         제작년도(시간): <input type="time" name="year5"><br>   
         제작년도(날짜시간): <input type="datetime-local" name="year6"><br>
     <%--
         각 웹브라우저에서 html태그 지원여부 확인
         ==>  http://www.html5test.com
         
      --%>   
         제작국가: <input type="text" name="country"><br>   
         등급: <input type="text" name="grade"><br>   
         줄거리: <input type="text" name="story"><br>   
         장르: <input type="text" name="genre"><br>   
         포스터: <input type="file" name="poster"><br>
    </fieldset>   
    <input type="submit" value="등록">
    <input type="reset" value="취소">
   </form>
</body>
</html>


