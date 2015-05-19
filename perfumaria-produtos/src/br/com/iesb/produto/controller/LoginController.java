package br.com.iesb.produto.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.iesb.produto.dao.JdbcUsuarioDao;
import br.com.iesb.produto.modelo.Usuario;

@Controller
public class LoginController {
	
	@RequestMapping("login")
	public String loginForm() {
		return "loginForm";
	}
	
	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if(new JdbcUsuarioDao().existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "index";
		}
		return "redirect:login";
	}
}
