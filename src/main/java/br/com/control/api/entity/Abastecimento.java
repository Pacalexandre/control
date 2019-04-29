package br.com.control.api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "abastecimento")
public class Abastecimento {

	private Integer id;
	private Date dataAbastecimetno;
	private EnumTipo tipoCombustivel;
	private Double litros;
	private Double valorLitro;
	private Integer odometro;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataAbastecimetno() {
		return dataAbastecimetno;
	}

	public void setDataAbastecimetno(Date dataAbastecimetno) {
		this.dataAbastecimetno = dataAbastecimetno;
	}

	public EnumTipo getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(EnumTipo tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

	public Double getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(Double valorLitro) {
		this.valorLitro = valorLitro;
	}

	public Integer getOdometro() {
		return odometro;
	}

	public void setOdometro(Integer odometro) {
		this.odometro = odometro;
	}

	public Abastecimento() {

	}

	public Abastecimento(Integer id, Date dataAbastecimetno, EnumTipo tipoCombustivel, Double litros, Double valorLitro,
			Integer odometro) {
		super();
		this.id = id;
		this.dataAbastecimetno = dataAbastecimetno;
		this.tipoCombustivel = tipoCombustivel;
		this.litros = litros;
		this.valorLitro = valorLitro;
		this.odometro = odometro;
	}

}
