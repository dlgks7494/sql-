package com.apple.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.apple.board.dto.BDto;

public class BDao {
	
	DataSource datasource;//server context.xml Ȯ??


	public BDao() {
		try {
			Context context=new InitialContext();
			datasource = (DataSource)context.lookup("java:comp/env/jdbc/odbo");
			
			}catch(Exception e){
			e.printStackTrace();
			
						   	   }
				  }
	
	public void write(String bname,String btitle,String bcontent){
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			String sql="INSERT INTO mvc_board(bname,btitle,bcontent,bhit) values ('?','?','?',0)";
			conn=datasource.getConnection();
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			
			pstmt.executeUpdate();//sql????
				
			}
			catch(Exception e){
				e.printStackTrace();
							}
		finally {
	try {
			if(pstmt !=null) {
				pstmt.close();
							 }
			if(conn !=null) {
				conn.close();
							}
		}
			catch(Exception e){
				e.printStackTrace();
							  }
			
				}
		
					  }
	public ArrayList<BDto> list() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<BDto> bdtos=new ArrayList<BDto>();
		
		String sql="SELECT * FROM mvc_board ORDER BY bid DESC";
	
			
	try {
		
		conn=datasource.getConnection();
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		
		while(rs.next()) {
			int bid=rs.getInt("bid");
			String bname=rs.getString("bname");
			String btitle=rs.getString("btitle");
			String bcontent=rs.getString("bcontent");
			Timestamp bdate=rs.getTimestamp("bdate");
			int bhit=rs.getInt("bhit");
			
			BDto bdto=new BDto(bid, bname, btitle, bcontent, bhit, bdate);
			bdtos.add(bdto);
						}
		
			
		}
		catch(Exception e){
			e.printStackTrace();
						}
	finally {
try {
		if(pstmt !=null) {
			pstmt.close();
						 }
		if(conn !=null) {
			conn.close();
						}
		if(rs !=null) {
			rs.close();
						}
	}
		catch(Exception e){
			e.printStackTrace();
						  }		
			}
	return bdtos ;
	}	   	   
					
		
}
				 
		
