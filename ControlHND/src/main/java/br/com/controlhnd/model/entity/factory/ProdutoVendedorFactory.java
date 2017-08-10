/**
 * 
 */
package br.com.controlhnd.model.entity.factory;

import br.com.controlhnd.model.entity.Produto;
import br.com.controlhnd.model.entity.ProdutoVendedor;

/**
 * @author Tiago Ferezin
 *
 */
public class ProdutoVendedorFactory {

	public Double getValorTotal(ProdutoVendedor produtoVendedor) {
		Double result = 0D;

		if (produtoVendedor.getIdProdutoVendedor() > 0L) {
			Integer qtd = produtoVendedor.getQuantidade();
			Produto produto = new Produto();
			produto = produtoVendedor.getProduto();
			Double valorDoProduto = produto.getValorUnitario();

			result = valorDoProduto * qtd;
		}

		return result;
	}

}
