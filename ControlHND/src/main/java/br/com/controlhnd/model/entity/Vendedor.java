/**
 * 
 */
package br.com.controlhnd.model.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.controlhnd.model.enumerador.EEstado;
import br.com.controlhnd.model.enumerador.EEstadoCivil;
import br.com.controlhnd.model.enumerador.ETipoDocumento;
import br.com.controlhnd.model.enumerador.ETipoSexo;

/**
 * @author Tiago Ferezin
 *
 */
@Entity
public class Vendedor extends AEntity<Vendedor> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long idVendedor;

	@Column(nullable = true)
	private Long codigoConsultor;

	private Calendar dataDesativacao;

	@Column(nullable = false)
	private Calendar dataCadastro;

	@Column(nullable = false)
	private String nomeCompleto;
	@Column(nullable = false)
	private Calendar dataNascimento;

	@Enumerated(EnumType.STRING)
	private ETipoDocumento tipoDocumento;

	@Column(nullable = false)
	private String rg;

	@Column(nullable = false)
	private String cpf;

	@Enumerated(EnumType.STRING)
	private ETipoSexo sexo;

	@Enumerated(EnumType.STRING)
	private EEstadoCivil estadoCivil;

	private Integer dependentes;

	@Column(nullable = false)
	private String cep;

	@Column(nullable = false)
	private String endereco;

	@Column(nullable = false)
	private String bairro;

	@Column(nullable = false)
	private String municipio;

	@Enumerated(EnumType.STRING)
	private EEstado estado;

	private String complemento;

	private String pontoReferencia;

	@Column(nullable = false)
	private String telefone;

	@Column(nullable = false)
	private String celular;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private Double aPagar;

	@Column(nullable = false)
	private Double aReceber;

	public Vendedor() {

	}

	/**
	 * @return the idVendedor
	 */
	public Long getIdVendedor() {
		return idVendedor;
	}

	/**
	 * @param idVendedor
	 *            the idVendedor to set
	 */
	public void setIdVendedor(Long idVendedor) {
		this.idVendedor = idVendedor;
	}

	/**
	 * @return the codigoConsultor
	 */
	public Long getCodigoConsultor() {
		return codigoConsultor;
	}

	/**
	 * @param codigoConsultor
	 *            the codigoConsultor to set
	 */
	public void setCodigoConsultor(Long codigoConsultor) {
		this.codigoConsultor = codigoConsultor;
	}

	/**
	 * @return the dataCadastro
	 */
	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro
	 *            the dataCadastro to set
	 */
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	/**
	 * @return the nomeCompleto
	 */
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	/**
	 * @param nomeCompleto
	 *            the nomeCompleto to set
	 */
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	/**
	 * @return the dataNascimento
	 */
	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the tipoDocumento
	 */
	public ETipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento
	 *            the tipoDocumento to set
	 */
	public void setTipoDocumento(ETipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg
	 *            the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the sexo
	 */
	public ETipoSexo getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(ETipoSexo sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the estadoCivil
	 */
	public EEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * @param estadoCivil
	 *            the estadoCivil to set
	 */
	public void setEstadoCivil(EEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	/**
	 * @return the dependentes
	 */
	public Integer getDependentes() {
		return dependentes;
	}

	/**
	 * @param dependentes
	 *            the dependentes to set
	 */
	public void setDependentes(Integer dependentes) {
		this.dependentes = dependentes;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep
	 *            the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro
	 *            the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio
	 *            the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the estado
	 */
	public EEstado getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(EEstado estado) {
		this.estado = estado;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento
	 *            the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the pontoReferencia
	 */
	public String getPontoReferencia() {
		return pontoReferencia;
	}

	/**
	 * @param pontoReferencia
	 *            the pontoReferencia to set
	 */
	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular
	 *            the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the aPagar
	 */
	public Double getaPagar() {
		return aPagar;
	}

	/**
	 * @param aPagar
	 *            the aPagar to set
	 */
	public void setaPagar(Double aPagar) {
		this.aPagar = aPagar;
	}

	/**
	 * @return the aReceber
	 */
	public Double getaReceber() {
		return aReceber;
	}

	/**
	 * @param aReceber
	 *            the aReceber to set
	 */
	public void setaReceber(Double aReceber) {
		this.aReceber = aReceber;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return idVendedor;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.idVendedor = id;
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
