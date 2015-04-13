package br.com.iesb.produto.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.com.iesb.produto.ConnectionFactory;
import br.com.iesb.produto.modelo.Produto;

public class JdbcProdutosDao {
	private final Connection connection;

	public JdbcProdutosDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adiciona(br.com.iesb.produto.modelo.Produto produto) {
		String sql = "insert into produtos (nome_produto, marca_produto, genero_produto, valorDeCusto_produto, valorDeVenda_produto, categoria_produto, quantidade_produto, quantidaDeMililitros_produto, finalizado) values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome_produto());
			stmt.setString(2, produto.getMarca_produto());
			stmt.setString(3, produto.getGenero_produto());
			stmt.setDouble(4, produto.getValorDeCusto_produto());
			stmt.setDouble(5, produto.getValorDeVenda_produto());
			stmt.setString(6, produto.getCategoria_produto());
			stmt.setInt(7, produto.getQuantidade_produto());
			stmt.setDouble(8, produto.getQuantidaDeMililitros_produto());			
			stmt.setBoolean(9, produto.isFinalizado());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Produto produto) {
		if (produto == null) {			
			throw new IllegalStateException("Id do produto não deve ser nulo.");
		}

		String sql = "delete from produtos where id = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, produto.getId());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Produto produto) {
		String sql = "update produtos set nome = ?, marca = ?, genero = ? where id = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome_produto());
			stmt.setString(2, produto.getMarca_produto());
			stmt.setString(3, produto.getGenero_produto());
			stmt.setDouble(4, produto.getValorDeCusto_produto());
			stmt.setDouble(5, produto.getValorDeVenda_produto());
			stmt.setString(6, produto.getCategoria_produto());
			stmt.setInt(7, produto.getQuantidade_produto());
			stmt.setDouble(8, produto.getQuantidaDeMililitros_produto());
			stmt.setDate(9, produto.getDataInclusao_produto() != null ? new Date(
					produto.getDataInclusao_produto().getTimeInMillis()) : null);
			stmt.setLong(10, produto.getId());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> lista() {
		try {
			List<Produto> produto = new ArrayList<Produto>();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from produtos");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// adiciona o produto na lista
				produto.add(populaProduto(rs));
			}

			rs.close();
			stmt.close();

			return produto;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Produto buscaPorId(Long id) {

		if (id == null) {
			throw new IllegalStateException("Id da produto não deve ser nulo.");
		}

		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from produtos where id = ?");
			stmt.setLong(1, id);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return populaProduto(rs);
			}

			rs.close();
			stmt.close();

			return null;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void finaliza(Long id) {
		if (id == null) {
			throw new IllegalStateException("Id do produto não deve ser nulo.");
		}

		String sql = "update produtos set finalizado = ?, dataInclusao = ? where id = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setBoolean(1, true);
			stmt.setDate(2, new Date(Calendar.getInstance().getTimeInMillis()));
			stmt.setLong(3, id);
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Produto populaProduto(ResultSet rs) throws SQLException {
		Produto produto = new Produto();

		// popula o objeto produto
		produto.setId(rs.getLong("id"));
		produto.setNome_produto(rs.getString("nome_produto"));
		produto.setMarca_produto(rs.getString("marca_produto"));
		produto.setGenero_produto(rs.getString("genero_produto"));
		produto.setValorDeCusto_produto(rs.getDouble("valorDeCusto_produto"));
		produto.setValorDeVenda_produto(rs.getDouble("ValorDeVenda_produto"));
		produto.setCategoria_produto(rs.getString("categoria_produto"));
		produto.setQuantidade_produto(rs.getInt("Quantidade_produto"));
		produto.setQuantidaDeMililitros_produto(rs.getDouble("quantidadeMililitros_produto"));
		produto.setFinalizado(rs.getBoolean("finalizado"));

		// popula a data de inclusao do produto, fazendo a conversao
		Date data = rs.getDate("dataInclusao_produto");
		if (data != null) {
			Calendar dataInclusao_produto = Calendar.getInstance();
			dataInclusao_produto.setTime(data);
			produto.setDataInclusao_produto(dataInclusao_produto);
		}
		return produto;
	}
}
