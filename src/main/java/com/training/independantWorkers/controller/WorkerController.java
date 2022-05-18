package com.training.independantWorkers.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.independantWorkers.entities.Worker;
import com.training.independantWorkers.service.WorkerService;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/workers")
public class WorkerController {
	private final WorkerService workerService;

	public WorkerController(WorkerService workerService) {
		super();
		this.workerService = workerService;
	}

	@GetMapping("/allworkers")
	public ResponseEntity<List<Worker>> getAllWorker() {

		List<Worker> lstWorker = this.workerService.getAllWorker();
		if (lstWorker != null && !lstWorker.isEmpty()) {
			return new ResponseEntity<>(lstWorker, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
