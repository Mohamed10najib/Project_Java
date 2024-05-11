package com.ensah.core.bo;


import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;


@Entity
@PrimaryKeyJoinColumn(name = "idEnseighant")
public class Enseignant extends Personne {

	private String specialite;

	 @OneToMany(mappedBy = "enseignantEnsiger", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	    List<ElementPedagogique> ListeElementsEpdEnsiger=new ArrayList<>();
	 @OneToMany(mappedBy = "enseignantcoordonne", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	    List<ElementPedagogique> ListeElementsEpdCoordonne=new ArrayList<>();
	
	 
	 @OneToMany(mappedBy = "enseignantCoordonneSurveillance", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	 List<Surveillance> listeSurveillanceCoordonne=new ArrayList<>();
	 
	 @ManyToMany
		private List<Surveillance> listeSurveillanceSurveille=new ArrayList<>();
	 
	 @ManyToOne 
	 private Filiere filiere;
	 @ManyToOne 
	 private Departement departement;
	 
	 @ManyToOne 
	 private Groupe groupe;
	 
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public List<ElementPedagogique> getListeElementsEpdEnsiger() {
		return ListeElementsEpdEnsiger;
	}

	public void setListeElementsEpdEnsiger(List<ElementPedagogique> listeElementsEpdEnsiger) {
		ListeElementsEpdEnsiger = listeElementsEpdEnsiger;
	}

	public List<ElementPedagogique> getListeElementsEpdCoordonne() {
		return ListeElementsEpdCoordonne;
	}

	public void setListeElementsEpdCoordonne(List<ElementPedagogique> listeElementsEpdCoordonne) {
		ListeElementsEpdCoordonne = listeElementsEpdCoordonne;
	}

	public List<Surveillance> getListeSurveillanceCoordonne() {
		return listeSurveillanceCoordonne;
	}

	public void setListeSurveillanceCoordonne(List<Surveillance> listeSurveillanceCoordonne) {
		this.listeSurveillanceCoordonne = listeSurveillanceCoordonne;
	}

	public List<Surveillance> getListeSurveillanceSurveille() {
		return listeSurveillanceSurveille;
	}

	public void setListeSurveillanceSurveille(List<Surveillance> listeSurveillanceSurveille) {
		this.listeSurveillanceSurveille = listeSurveillanceSurveille;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}



}