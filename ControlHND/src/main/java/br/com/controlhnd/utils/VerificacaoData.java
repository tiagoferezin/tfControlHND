/**
 * 
 */
package br.com.controlhnd.utils;

import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * @author Tiago Ferezin
 *
 */
public class VerificacaoData {

	public static Boolean isDataInseridaMaiorQueDataAtual(Calendar dataInserida, Calendar dataAtual) {
		Boolean retorno = false;

		try {
			DateTime data1 = new DateTime(dataInserida);
			DateTime data2 = new DateTime(dataAtual);

			Integer qtdDias = Days.daysBetween(data1, data2).getDays();
			if (qtdDias < 0) {
				retorno = true;
			} else {
				retorno = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}

	public static Integer qtdDiasEntreDatas(Calendar dataInicial, Calendar dataFinal) {
		Integer retorno = 0;

		try {
			DateTime data1 = new DateTime(dataInicial);
			DateTime data2 = new DateTime(dataFinal);
			retorno = Days.daysBetween(data1, data2).getDays();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return retorno;
	}

}
