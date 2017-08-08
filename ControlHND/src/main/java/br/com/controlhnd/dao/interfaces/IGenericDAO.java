/**
 * 
 */
package br.com.controlhnd.dao.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tiago Ferezin
 *
 */
public interface IGenericDAO<T, ID extends Serializable> {

	public T buscaPorId(ID id);

	public void create(T entidade);

	public List<T> filtrar(T entidade, String... propriedade);

}
