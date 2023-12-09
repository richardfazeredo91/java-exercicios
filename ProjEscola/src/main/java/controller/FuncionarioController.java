package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Funcionario;
import model.FuncionarioDao;

/**
 * Servlet implementation class FuncionarioController
 */
@WebServlet({ "/FuncionarioController", "/login" })
public class FuncionarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FuncionarioController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    Funcionario func = new Funcionario();
    FuncionarioDao dao = new FuncionarioDao();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getServletPath();
		
		if(action.equals("/login")) {
			Logar(request,response);
		}	
	}
	
	protected void Logar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		func.setEmail(request.getParameter("email"));
		func.setSenha(request.getParameter("senha"));
		dao.Login(func);
		
		if (func.getUsuario() != "") {
			HttpSession session = request.getSession();
			session.setAttribute("usuario", func.getUsuario());						
			response.sendRedirect("indexadm.jsp");
		} else {
			response.sendRedirect("Login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
