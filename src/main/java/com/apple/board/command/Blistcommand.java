package com.apple.board.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apple.board.dao.BDao;
import com.apple.board.dto.BDto;

public class Blistcommand {

	public void listExcute(HttpServletRequest request, HttpServletResponse response) {
		BDao bdao=new BDao();
		ArrayList<BDto> bdtos=bdao.list();
		
		request.setAttribute("list", bdtos);//request 객체에 list란이름으로 arraylist 자료구조인 bdtos를 셋팅
		//자료가 셋팅된
	}

}
