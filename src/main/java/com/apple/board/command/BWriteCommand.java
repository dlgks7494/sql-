
package com.apple.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apple.board.dao.BDao;

public class BWriteCommand {
	public void writeExcute(HttpServletRequest request,HttpServletResponse response) {
		String bname=request.getParameter("bname");
		String btitle=request.getParameter("btitle");
		String bcontent=request.getParameter("bcontent");
		BDao bdao=new BDao();
		bdao.write(bname, btitle,bcontent );
		
		
		
	}

}
