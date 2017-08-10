/**
 * 
 */
package br.com.controlhnd.model.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Tiago Ferezin
 *
 */
@Entity
public class ProdutoVendedor extends AEntity<ProdutoVendedor> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long idProdutoVendedor;

	@OneToOne
	@JoinColumn(name = "idVendedor", nullable = false)
	private Vendedor vendedor;

	@OneToOne
	@JoinColumn(name = "idProduto", nullable = false)
	private Produto produto;

	@Column(nullable = false)
	private Integer quantidade;

	@Column(nullable = false)
	private Double valor;

	@Column(nullable = false)
	private Calendar dataCriacao;

	private Calendar dataDesativacao;

	public ProdutoVendedor() {

	}

	/**
	 * @return the idProdutoVendedor
	 */
	public Long getIdProdutoVendedor() {
		return idProdutoVendedor;
	}

	/**
	 * @param idProdutoVendedor
	 *            the idProdutoVendedor to set
	 */
	public void setIdProdutoVendedor(Long idProdutoVendedor) {
		this.idProdutoVendedor = idProdutoVendedor;
	}

	/**
	 * @return the vendedor
	 */
	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 * @param vendedor
	 *            the vendedor to set
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param produto
	 *            the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * @return the quantidade
	 */
	public Integer getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade
	 *            the quantidade to set
	 */
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}

	/**
	 * @return the dataCriacao
	 */
	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * @param dataCriacao
	 *            the dataCriacao to set
	 */
	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return idProdutoVendedor;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.idProdutoVendedor = id;
	}

	@Override
	public boolean isDeleted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Calendar getDataDesativacao() {
		// TODO Auto-generated method stub
		return dataDesativacao;
	}

	@Override
	public void setDataDesativacao(Calendar dataDesativacao) {
		// TODO Auto-generated method stub
		this.dataDesativacao = dataDesativacao;
	}

}
