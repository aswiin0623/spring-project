package com.example.demo.RAILWAYS;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Railways")
public class Railways {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String arailways;
	private String atrainno;
	private String atraintime;
	private String ajunctions;
	private String astarting;
	private String aending;
	private String akm;
	private String aduration;
	private String azone;
	private String apnr;

	public String getArailways() {
		return arailways;
	}

	public void setArailways(String arailways) {
		this.arailways = arailways;
	}

	public String getAtrainno() {
		return atrainno;
	}

	public void setAtrainno(String atrainno) {
		this.atrainno = atrainno;
	}

	public String getAtraintime() {
		return atraintime;
	}

	public void setAtraintime(String atraintime) {
		this.atraintime = atraintime;
	}

	public String getAjunctions() {
		return ajunctions;
	}

	public void setAjunctions(String ajunctions) {
		this.ajunctions = ajunctions;
	}

	public String getAstarting() {
		return astarting;
	}

	public void setAstarting(String astarting) {
		this.astarting = astarting;
	}

	public String getAending() {
		return aending;
	}

	public void setAending(String aending) {
		this.aending = aending;
	}

	public String getAkm() {
		return akm;
	}

	public void setAkm(String akm) {
		this.akm = akm;
	}

	public String getAduration() {
		return aduration;
	}

	public void setAduration(String aduration) {
		this.aduration = aduration;
	}

	public String getAzone() {
		return azone;
	}

	public void setAzone(String azone) {
		this.azone = azone;
	}

	public String getApnr() {
		return apnr;
	}

	public void setApnr(String apnr) {
		this.apnr = apnr;
	}

}
