/**
 * 
 */
package br.com.controlhnd.model.interfaces;

import java.io.Serializable;
import java.util.Calendar;

/**
 * @author Tiago Ferezin
 *
 */
public interface IEntity extends Serializable {
	
	public Long getId();

	public void setId(Long id);

	public boolean isEmptyId();

	public boolean isDeleted();

	public Calendar getDataDesativacao();

	public void setDataDesativacao(Calendar dataDesativacao);

}
