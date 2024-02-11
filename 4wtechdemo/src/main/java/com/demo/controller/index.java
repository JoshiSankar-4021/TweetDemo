package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.Tweetdaoimpl;
import com.demo.model.User;


/**
 * Servlet implementation class index
 */
@WebServlet("/Users")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Tweetdaoimpl tweetdaoimpl=new Tweetdaoimpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String gender= request.getParameter("gender");
		String phnnum = request.getParameter("phone");
		String address=request.getParameter("address");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String repetPwd = request.getParameter("pwd-repeat");

		 User user=new User();
		 user.setFname(fname);
		 user.setMname(mname);
		 user.setLname(lname);
		 user.setGender(gender);
		 user.setPnhnum(phnnum);
		 user.setAddress(address);
		 user.setEmail(email);
		 user.setPassword(pwd);
		 try {
			 tweetdaoimpl.TweetusrRedg(fname,mname,lname,email,phnnum,address,pwd,gender);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("login.jsp");
	}
}
