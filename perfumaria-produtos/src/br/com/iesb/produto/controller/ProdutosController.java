package br.com.iesb.produto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.iesb.produto.dao.JdbcProdutosDao;
import br.com.iesb.produto.modelo.Produto;

@Controller
public class ProdutosController {
	
	@RequestMapping("novoProduto")
	public String form(){
		return "formulario";
	}
	
	@RequestMapping("adicionaProduto")
	public String adiciona(@Valid Produto produto, BindingResult result){
				
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
}
