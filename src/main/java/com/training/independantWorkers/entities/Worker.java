package com.training.independantWorkers.entities;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="worker")//annotation optionnelle en cas ou on veut changé le nom du table 
@Data
public class Worker implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_worker")//annotation optionnelle en cas ou on veut changé le nom de la colonne du table
	private Long idWorker;
	private String nom;
	private String prenom;
	private LocalDate datenaiss;
	private String adresse;

	private Long rang;
	
}
