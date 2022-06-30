package com.apple.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apple.board.command.BWriteCommand;
import com.apple.board.command.Blistcommand;
import com.apple.board.dao.BDao;

/**
 * Servlet implementation class BfrontController
 */
@WebServlet("*.do")
public class BfrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BfrontController() {
        super();
        // TODO Auto-generated constructor stub
    							}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
																														}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
																														 }
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String uri=request.getRequestURI();//��û�ּ�����(/mvc_board_project_20220630/write.do)
			String conPath=request.getContextPath();//���ؽ�Ʈ�н�(/mvc_board_project_20220630)����
			String command=uri.substring(conPath.length());//���� ��û �ּ� �б�(command �б�)
			String view=null;
			if(command.equals("/write_view.do")) {
				view="write_view.jsp";
				
										 }
			else if(command.equals("/write.do")) {
				//�۾��� ����� ����
				request.setCharacterEncoding("utf-8");
				BWriteCommand comm=new BWriteCommand();
				comm.writeExcute(request, response);
				
				view="list.do";
				
			}
			else if(command.equals("/list.do")) {
				//�� ����Ʈ �ҷ����� ����� ����
				Blistcommand comm=new Blistcommand();
				comm.listExcute(request,response);
				view="list.jsp";
				
			}
			RequestDispatcher dispatcher=request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
			
																														 }

													}
