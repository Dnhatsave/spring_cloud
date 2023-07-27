package mz.rucatrack.hrworker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mz.rucatrack.hrworker.Entity.Worker;

public interface IWorkerRepository extends JpaRepository<Worker, Long>  {

}
