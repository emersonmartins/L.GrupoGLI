package br.com.iesb.produto.modelo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Produto {
	
	private long id;
	private Calendar dataInclusao_produto;
	@Size(min=4)
	@NotNull (message="{produto.nome.vazio}")
	private String nome_produto;
	private String marca_produto;
	private String genero_produto;
	private double valorDeCusto_produto;
	private double valorDeVenda_produto;
	private Calendar dataDeFabricacao_produto;
	private Calendar validade_produto;
	private String categoria_produto;
	private int quantidade_produto;
	private double quantidaDeMililitros_produto;
	private boolean finalizado;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Calendar getDataInclusao_produto() {
		return dataInclusao_produto;
	}
	public void setDataInclusao_produto(Calendar dataInclusao_produto) {
		this.dataInclusao_produto = dataInclusao_produto;
	}
	public String getMarca_produto() {
		return marca_produto;
	}
	public void setMarca_produto(String marca_produto) {
		this.marca_produto = marca_produto;
	}
	public String getGenero_produto() {
		return genero_produto;
	}
	public void setGenero_produto(String genero_produto) {
		this.genero_produto = genero_produto;
	}
	public double getValorDeCusto_produto() {
		return valorDeCusto_produto;
	}
	public void setValorDeCusto_produto(double valorDeCusto_produto) {
		this.valorDeCusto_produto = valorDeCusto_produto;
	}
	public double getValorDeVenda_produto() {
		return valorDeVenda_produto;
	}
	public void setValorDeVenda_produto(double valorDeVenda_produto) {
		this.valorDeVenda_produto = valorDeVenda_produto;
	}
	public Calendar getDataDeFabricacao_produto() {
		return dataDeFabricacao_produto;
	}
	public void setDataDeFabricacao_produto(Calendar dataDeFabricacao_produto) {
		this.dataDeFabricacao_produto = dataDeFabricacao_produto;
	}
	public Calendar getValidade_produto() {
		return validade_produto;
	}
	public void setValidade_produto(Calendar validade_produto) {
		this.validade_produto = validade_produto;
	}
	public String getCategoria_produto() {
		return categoria_produto;
	}
	public void setCategoria_produto(String categoria_produto) {
		this.categoria_produto = categoria_produto;
	}
	public int getQuantidade_produto() {
		return quantidade_produto;
	}
	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}
	public double getQuantidaDeMililitros_produto() {
		return quantidaDeMililitros_produto;
	}
	public void setQuantidaDeMililitros_produto(double quantidaDeMililitros_produto) {
		this.quantidaDeMililitros_produto = quantidaDeMililitros_produto;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	
	

}
