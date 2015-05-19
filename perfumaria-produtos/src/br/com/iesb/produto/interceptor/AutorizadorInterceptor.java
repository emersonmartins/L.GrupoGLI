package br.com.iesb.produto.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object Controller) throws Exception {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();
	      if(uri.endsWith("loginForm") ||
	          uri.endsWith("efetuaLogin") || 
	                   uri.contains("resources")){
	        return true;
	      }

	      if(request.getSession()
	          .getAttribute("usuarioLogado") != null) {
	        return true;
	      }

	      response.sendRedirect("loginForm");
	      return false;
	  }
	

}
