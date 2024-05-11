package com.ensah.core.bo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Entity
public class Surveillance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long IdSurveillance;
	@ManyToOne
	private Enseignant enseignantCoordonneSurveillance;
	@ManyToMany(mappedBy = "listeSurveillanceSurveille")
	private List<Enseignant> enseignantSurveillanceList=new ArrayList<>();
	@ManyToOne
	private CadreAdministrateur cadreAdministrateur;
	@ManyToOne
	private Salle salle; 
	public Long getIdSurveillance() {
		return IdSurveillance;
	}
	public void setIdSurveillance(Long idSurveillance) {
		IdSurveillance = idSurveillance;
	}
	public Enseignant getEnseignantCoordonneSurveillance() {
		return enseignantCoordonneSurveillance;
	}
	public void setEnseignantCoordonneSurveillance(Enseignant enseignantCoordonneSurveillance) {
		this.enseignantCoordonneSurveillance = enseignantCoordonneSurveillance;
	}
	public List<Enseignant> getEnseignantSurveillanceList() {
		return enseignantSurveillanceList;
	}
	public void setEnseignantSurveillanceList(List<Enseignant> enseignantSurveillanceList) {
		this.enseignantSurveillanceList = enseignantSurveillanceList;
	}
	public CadreAdministrateur getCadreAdministrateur() {
		return cadreAdministrateur;
	}
	public void setCadreAdministrateur(CadreAdministrateur cadreAdministrateur) {
		this.cadreAdministrateur = cadreAdministrateur;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	@ManyToOne
	private Examen examen ;
} 
