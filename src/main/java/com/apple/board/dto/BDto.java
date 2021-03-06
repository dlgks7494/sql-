package com.apple.board.dto;

import java.sql.*;

public class BDto {

	
	private int bid;//게시판번호
	private String bname;//게시판 글쓴이
	private String btitle;//게시판 글제목
	private String bcontent;//게시판 글내용
	private int bhit;//게시판 조회수
	private Timestamp bdate;//게시판 글작성시간

	public BDto() {
		super();
		
	}


	public BDto(int bid, String bname, String btitle, String bcontent, int bhit, Timestamp bdate) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bhit = bhit;
		this.bdate = bdate;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getBtitle() {
		return btitle;
	}


	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}


	public String getBcontent() {
		return bcontent;
	}


	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}


	public int getBhit() {
		return bhit;
	}


	public void setBhit(int bhit) {
		this.bhit = bhit;
	}


	public Timestamp getBdate() {
		return bdate;
	}


	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	


}
	