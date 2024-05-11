package com.ensah.core.bo;


import java.util.List;

import jakarta.persistence.*;


@Entity
@PrimaryKeyJoinColumn(name = "idEnseighant")
public class Enseignant extends Personne {

	private String specialite;

	 @OneToMany(mappedBy = "typeElement", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	    List<ElementPedagogique> ListeElementsEpd;
	
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}



}