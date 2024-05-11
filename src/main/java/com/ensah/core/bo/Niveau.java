package com.ensah.core.bo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Niveau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long IdNiveau;
public String titre;
@OneToMany(mappedBy = "typeElement", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
List<ElementPedagogique> ListeElementsEpd;


}
