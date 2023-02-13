package com.uevitondev.hrworker.repositories;

import com.uevitondev.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {}
