package trabalhoJava.iesb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;


public class Produtos {
	private int id;
	private String nome;
	private String marca;
	private String genero;
	private double valorDeCusto;
	private double margemDeLucro;
	private Date dataDeFabricacao;
	private Date validade;
	private String categoria;
	private int quantidade;
	private double quantidadeMilitros;
	List<Produtos> adicionaProduto = new ArrayList<Produtos>(); 
	
	public void addproduto(){
		Produtos novoProduto = new Produtos();
		adicionaProduto.add(novoProduto);
		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso."," Loja Rinode", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getValorDeCusto() {
		return valorDeCusto;
	}
	public void setValorDeCusto(double valorDeCusto) {
		this.valorDeCusto = valorDeCusto;
	}
	public double getMargemDeLucro() {
		return margemDeLucro;
	}
	public void setMargemDeLucro(double margemDeLucro) {
		this.margemDeLucro = margemDeLucro;
	}
	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}
	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
		
}
