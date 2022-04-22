package com.iudigital.rentacar.controller.dto;

import java.time.LocalDate;

public class AlquilerDTO {

	private int idAlq;
	private String factura;
	private String nombreSede;
	private int precio;
	private int diasMinimoPrestamo;
	private LocalDate startLocalDate;
	private LocalDate finalLocalDate;
	private int idCar;
	private int idUser;

	public int getIdAlq() {
		return idAlq;
	}

	public void setIdAlq(int idAlq) {
		this.idAlq = idAlq;
	}

	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public String getNombreSede() {
		return nombreSede;
	}

	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getDiasMinimoPrestamo() {
		return diasMinimoPrestamo;
	}

	public void setDiasMinimoPrestamo(int diasMinimoPrestamo) {
		this.diasMinimoPrestamo = diasMinimoPrestamo;
	}

	public LocalDate getStartDate() {
		return startLocalDate;
	}

	public void setStartDate(LocalDate startLocalDate) {
		this.startLocalDate = startLocalDate;
	}

	public LocalDate getFinalDate() {
		return finalLocalDate;
	}

	public void setFinalDate(LocalDate finalLocalDate) {
		this.finalLocalDate = finalLocalDate;
	}

	public int getIdCar() {
		return idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}
