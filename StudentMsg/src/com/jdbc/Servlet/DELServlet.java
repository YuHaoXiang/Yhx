package com.jdbc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.DBConnecton;

@WebServlet("/DELServlet")
public class DELServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DELServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String Sno = request.getParameter("sno");
		Connection conn = null;
		Statement stmt = null;
		try{
			conn = DBConnecton.getConnection();
			System.out.println("连接成功");
			stmt = conn.createStatement();
			int rs = stmt.executeUpdate("delete from Student where Sno = '" + Sno + "'");
			response.sendRedirect("/StudentMsg/main.jsp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
