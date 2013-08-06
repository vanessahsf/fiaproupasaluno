package br.com.fiap.loja;


// TODO: Auto-generated Javadoc
/**
 * MoedaEstrangeira. Classe respons�vel pela tratamento da moeda
 * americana
 * @author Alex Coqueiro
 */
public class MoedaEstrangeira {
	
	
	/**
	 * Converter valor monet�rio de dolar para real
	 *
	 * @param valor valor em dolar
	 * @return valor em real
	 */
	public int converterDolar (int valor) {
		if (valor < 0) return 0;
		
		return valor * 2;
	}

	

}
