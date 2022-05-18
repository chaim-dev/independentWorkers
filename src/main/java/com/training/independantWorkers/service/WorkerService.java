package com.training.independantWorkers.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.independantWorkers.dao.WorkerDao;
import com.training.independantWorkers.entities.Worker;

@Service // optionnel
@Transactional
public class WorkerService {
	private final WorkerDao workerDao;

	public WorkerService(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}

	public List<Worker> getAllWorker() {
		return this.workerDao.findAll();

	}

	public Worker getWorkerById(Long Id) {
		Optional<Worker> workerData = this.workerDao.findById(Id);
		if (workerData.isPresent()) {
			return workerData.get();
		} else {
			return null;
		}
	}
	public Worker createWorker(Worker worker) {
		return this.workerDao.save(worker);
		
	}
}

/*
 * 1/ @Autowired WorkerDao workerDao; 2/private final WorkerDao workerDao; 3/@Autowired set WoçrkerDao;
 */
