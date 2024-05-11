package com.ensah.core.bo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ElementPedagogique {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long IdEpd;
	private String nomEpd;
@ManyToOne 
private Enseignant enseignant;
@ManyToOne 
private Niveau niveau;
@ManyToOne
private TypeElement typeElement;
public Long getIdEpd() {
	return IdEpd;
}
public void setIdEpd(Long idEpd) {
	IdEpd = idEpd;
}
public String getNomEpd() {
	return nomEpd;
}
public void setNomEpd(String nomEpd) {
	this.nomEpd = nomEpd;
}
public Enseignant getEnseignant() {
	return enseignant;
}
public void setEnseignant(Enseignant enseignant) {
	this.enseignant = enseignant;
}
public Niveau getNiveau() {
	return niveau;
}
public void setNiveau(Niveau niveau) {
	this.niveau = niveau;
}
public TypeElement getTypeElement() {
	return typeElement;
}
public void setTypeElement(TypeElement typeElement) {
	this.typeElement = typeElement;
}
public ElementPedagogique(Long idEpd, String nomEpd, Enseignant enseignant, Niveau niveau, TypeElement typeElement) {
	super();
	IdEpd = idEpd;
	this.nomEpd = nomEpd;
	this.enseignant = enseignant;
	this.niveau = niveau;
	this.typeElement = typeElement;
}



	
}
