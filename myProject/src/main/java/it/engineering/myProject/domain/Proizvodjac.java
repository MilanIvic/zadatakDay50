package it.engineering.myProject.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Proizvodjac.findAll", query="SELECT p FROM Proizvodjac p")
public class Proizvodjac {
	@Id
	private Long pib;
	
	@Column(name="maticni_broj")
	private String maticniBroj;
	
	private String adresa;
	
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="mesto_ptt")
	private Mesto mesto;
	
	public Proizvodjac() {
		super();
	}
	
	public Proizvodjac(Long pib, String maticniBroj, String adresa, Mesto mesto) {
		super();
		this.pib = pib;
		this.maticniBroj = maticniBroj;
		this.adresa = adresa;
		this.mesto = mesto;
	}



	public Long getPib() {
		return pib;
	}

	public void setPib(Long pib) {
		this.pib = pib;
	}

	public String getMaticniBroj() {
		return maticniBroj;
	}

	public void setMaticniBroj(String maticniBroj) {
		this.maticniBroj = maticniBroj;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	@Override
	public String toString() {
		return "Proizvodjac [pib=" + pib + ", maticniBroj=" + maticniBroj + ", adresa=" + adresa + ", mesto=" + mesto
				+ "]";
	}

	

}
