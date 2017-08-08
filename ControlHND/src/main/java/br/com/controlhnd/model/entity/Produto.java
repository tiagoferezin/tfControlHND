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

/**
 * @author Tiago Ferezin
 *
 */
@Entity
public class Produto extends AEntity<Produto> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long idProduto;

	@Column(nullable = false)
	private Long codigoProduto;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private Double valorUnitario;

	@Column(nullable = false)
	private Double pontos;

	private Calendar dataDesativacao;

	public Produto() {

	}

	/**
	 * @return the idProduto
	 */
	public Long getIdProduto() {
		return idProduto;
	}

	/**
	 * @param idProduto
	 *            the idProduto to set
	 */
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	/**
	 * @return the codigoProduto
	 */
	public Long getCodigoProduto() {
		return codigoProduto;
	}

	/**
	 * @param codigoProduto
	 *            the codigoProduto to set
	 */
	public void setCodigoProduto(Long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the valorUnitario
	 */
	public Double getValorUnitario() {
		return valorUnitario;
	}

	/**
	 * @param valorUnitario
	 *            the valorUnitario to set
	 */
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	/**
	 * @return the pontos
	 */
	public Double getPontos() {
		return pontos;
	}

	/**
	 * @param pontos
	 *            the pontos to set
	 */
	public void setPontos(Double pontos) {
		this.pontos = pontos;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return idProduto;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.idProduto = id;
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
