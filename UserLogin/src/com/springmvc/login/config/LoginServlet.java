package com.springmvc.login.config;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.springframework.web.servlet.DispatcherServlet;


/**
 * Servlet implementation class LoginServlet
 */
/*@WebServlet(name="loginServlet", urlPatterns = {"/"}, asyncSupported = true, 
initParams= {
@WebInitParam(name="contextConfigLocation", value="/WEB-INF/spring-mvc-servlet.xml")
},loadOnStartup=1
)*/

@WebServlet(name="spring-mvc", urlPatterns = {"/"}, asyncSupported = true, loadOnStartup=1)
public class LoginServlet extends DispatcherServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }
/*
	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
*/
}
