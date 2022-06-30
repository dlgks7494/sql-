package com.apple.board.dto;

import java.sql.*;

public class BDto {

	
	private int bid;//�Խ��ǹ�ȣ
	private String bname;//�Խ��� �۾���
	private String btitle;//�Խ��� ������
	private String bcontent;//�Խ��� �۳���
	private int bhit;//�Խ��� ��ȸ��
	private Timestamp bdate;//�Խ��� ���ۼ��ð�

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
	