/**
 * 
 */
package br.com.controlhnd.utils.factory;

import java.util.ArrayList;
import java.util.List;

import br.com.controlhnd.utils.NameValuePair;

/**
 * @author Tiago Ferezin
 *
 */
public class NameValuePairFactory {

	public static List<NameValuePair> getLista() {
		return new ArrayList<NameValuePair>();
	}

	public static NameValuePair getNameValuePair(String name, Object valor) {
		return new NameValuePair(name, valor);
	}

}
