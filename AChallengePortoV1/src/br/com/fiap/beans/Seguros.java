package br.com.fiap.beans;

public class Seguros {
	// variáveis
	private String pedalEssencial;
	private String pedalLeve;
	private String pedalElite;
	// vazio
	public Seguros() {
		super();
	}
	// cheio
	public Seguros(String pedalEssencial, String pedalLeve, String pedalElite) {
		super();
		this.pedalEssencial = pedalEssencial;
		this.pedalLeve = pedalLeve;
		this.pedalElite = pedalElite;
	}
	// setters and getters
	public String getPedalEssencial() {
		return pedalEssencial;
	}
	public void setPedalEssencial(String pedalEssencial) {
		this.pedalEssencial = pedalEssencial;
	}
	public String getPedalLeve() {
		return pedalLeve;
	}
	public void setPedalLeve(String pedalLeve) {
		this.pedalLeve = pedalLeve;
	}
	public String getPedalElite() {
		return pedalElite;
	}
	public void setPedalElite(String pedalElite) {
		this.pedalElite = pedalElite;
	}
}
