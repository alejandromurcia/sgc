package com.uniandes.sgc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sismo {
	 private int id;
	 private String originTime;
	 private String state;
	 private double magnitud;
	 private int profundidadKms;
	 private double longitud;
	 private double latitud;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@JsonProperty("origin_time")
	public String getOriginTime() {
		return originTime;
	}

	public void setOriginTime(String originTIme) {
		this.originTime = originTIme;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("magnitud")
	public double getMagnitud() {
		return magnitud;
	}

	public void setMagnitud(double magnitud) {
		this.magnitud = magnitud;
	}

	@JsonProperty("profundidad_kms")
	public int getProfundidadKms() {
		return profundidadKms;
	}

	public void setProfundidadKms(int profundidadKms) {
		this.profundidadKms = profundidadKms;
	}

	@JsonProperty("longitud")
	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@JsonProperty("latitud")
	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
}
