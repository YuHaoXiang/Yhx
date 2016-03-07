package com.jdbc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.bean.DBConnecton;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBConnectionServlet")
public class DBConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DBConnectionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			conn = DBConnecton.getConnection();
			System.out.println("连接成功");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from Users where username='" + username + "'and userpwd = '" + userpwd + "'");
			String usp = null;
			String usn = null;
			while(rs.next()){
				 usn = rs.getString(2);
				 usp = rs.getString(3);
			}
			
			if(usn!=null && usp!=null && usn.equals(username) && usp.equals(userpwd)) {
				response.sendRedirect("/StudentMsg/index.jsp");
			}
			else {
				response.sendRedirect("/StudentMsg/login.jsp");
			}
			
			rs.close();
			conn.close();
		} catch (SQLException e ) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
