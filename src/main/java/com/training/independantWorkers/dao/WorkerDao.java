package com.training.independantWorkers.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.independantWorkers.entities.Worker;
@Repository
public interface WorkerDao extends JpaRepository<Worker, Long> {
	List<Worker> findByNom(String name);

}
