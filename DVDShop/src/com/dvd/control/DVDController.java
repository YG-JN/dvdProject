package com.dvd.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dvd.dao.DVDDAO;
import com.dvd.vo.DVDInfoVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/product")//==> /product 현재서블릿을 표현하는 (가상)경로
//service()메소드 내에서 CRUD 기능을 각각 구현하기 위해 식별 파라미터 필요
/*
   예)    
      DVDShop/product?action=form
      DVDShop/product?action=insert   ===> Create  1
      
      DVDShop/product?action=upform   ===> Read    3-1
      DVDShop/product?action=update   ===> Update  3-2
      
      DVDShop/product?action=delete   ===> Delete  4
      
      DVDShop/product?action=list     ===> Read   2
      
 */
public class DVDController extends HttpServlet{
//DVD 제품에 대한 CRUD를 제어.
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  try {
	  
	  String action = req.getParameter("action");
		
	  if(action.equals("form")) {//DVD제품 등록 폼 보여주기(forward)
	    req.getRequestDispatcher("/WEB-INF/view/manager/dvd_add.jsp")
	       .forward(req, resp);
	  }else if(action.equals("insert")) {
	    //DVD제품 등록하기  : 위의 제품등록폼과 구분하기 위한 파라미터 필요
		 /* 
		  <form enctype="application/x-www-form-urlencoded">
		  ==> 기본값!! 폼안의 데이터를 text(String)으로 전달
		  
		  <form enctype="multipart/form-data">
		  ==> 파일업로드시 명시하여 사용!! 폼안의 데이터들을 Stream으로 전달!!
		  
		  */
		  
		  String savePath= getServletContext().getRealPath("/")
				           +"poster";
		  //savePath = "e:/jaelee/workspace2/DVDShop/poster"
		     
		 MultipartRequest mReq = 
		  new MultipartRequest(req, 
				              savePath, 
				              10*1024*1024, 
				      "UTF-8",new DefaultFileRenamePolicy()); 
		  
		 String title =mReq.getParameter("title"); 
		 String director =mReq.getParameter("director"); 
		 String actor =mReq.getParameter("actor"); 
		 String year =mReq.getParameter("year"); 
		 String country =mReq.getParameter("country"); 
		 String grade =mReq.getParameter("grade"); 
		 String story =mReq.getParameter("story"); 
		 String genre =mReq.getParameter("genre"); 
		 //String poster =mReq.getParameter("poster"); 
		 //type=file  ==> poster=null
		 
		 mReq.getOriginalFileName("poster");//업로드 원본파일명
		 String saveFileName = mReq.getFilesystemName("poster");//업로드된 변경된 파일명
		 //예상? saveFileName = "엑시트.jpg"
		 //DB에 입력하고자 하는 텍스트?   "/poster/엑시트.jpg"
		 String poster = "/poster/"+saveFileName;
		 
		 DVDInfoVO vo = new DVDInfoVO(0, title, director, 
				   actor, year, country, grade, story, 
				   genre, poster);
		 
		 System.out.println("입력DVD정보>>>\n"+ vo);
		 
		 DVDDAO dao = new DVDDAO();
		   dao.create(vo);
	  }
	  
	  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	}//service메소드
	
}
