package com.ensah.core.bo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class TypeElement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long IdType;
	public String titre ;
	 @OneToMany(mappedBy = "typeElement", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	    List<ElementPedagogique> ListeElementsEpd;
	

}
