package br.com.iesb.produto.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.iesb.produto.dao.JdbcProdutosDao;
import br.com.iesb.produto.dao.JdbcUsuarioDao;
import br.com.iesb.produto.modelo.Produto;
import br.com.iesb.produto.modelo.Usuario;

@Controller
public class ProdutosController {
	
	@RequestMapping("florenceSystem")
	public String efetuaLogin(Usuario usuario, HttpSession session){
		
	
		if(new JdbcUsuarioDao().existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "home";
		} 
			return "redirect: login";
		}
		
	@RequestMapping("adicionaProduto")
	public String adiciona(@Valid Produto produto, BindingResult result){
		
		if(result.hasFieldErrors("nome_produto")) {
		    return "formulario";		
		}
		
		JdbcProdutosDao dao = new JdbcProdutosDao();
		dao.adiciona(produto);
		return "adicionado";		
	}
	
	@RequestMapping("listaProdutos")
	public String lista(Model model) {
		JdbcProdutosDao dao = new JdbcProdutosDao();
	  	model.addAttribute("produtos", dao.lista());
	  	return "lista";
	}
	
	@RequestMapping("removeProduto")
	public String remove(Produto produto) {
		JdbcProdutosDao dao = new JdbcProdutosDao();
	  	dao.remove(produto);
	  	return "redirect:listaProdutos";
	}
	
	@RequestMapping("mostraProduto")
	public String mostra(Long id, Model model) {
		JdbcProdutosDao dao = new JdbcProdutosDao();
		model.addAttribute("produto", dao.buscaPorId(id));
		return "mostra";
	}
	
	@RequestMapping("alteraProduto")
	public String altera(Produto produto) {
		JdbcProdutosDao dao = new JdbcProdutosDao();
		dao.altera(produto);
		return "redirect:listaProdutos";
	}
	
	@RequestMapping ("home")
	public String paginaInicial() {
		return "index";
	}
	
	@RequestMapping ("login")
	public String altenticar(){
		return "login";
	}
	
}
