package mz.rucatrack.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mz.rucatrack.hrworker.Entity.Worker;
import mz.rucatrack.hrworker.Repositories.IWorkerRepository;

@RestController
@RequestMapping(value = "workers")
public class WorkerResource {

	@Autowired
	private IWorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll (){
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById (@PathVariable Long id){
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
