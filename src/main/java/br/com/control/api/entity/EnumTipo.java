package br.com.control.api.entity;

public enum EnumTipo {

	GCOMUM("Gasolina Comum"), GADTIVADA("Gasolina Adtivada"), ETHANOL("Alcool");

	public final String descricaoTipo;

	EnumTipo(String descricao) {
		descricaoTipo = descricao;
	}

}
