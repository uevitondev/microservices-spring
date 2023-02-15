package com.uevitondev.hrworker.resources;

import com.uevitondev.hrworker.entities.Worker;
import com.uevitondev.hrworker.repositories.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Value("${test.config}")
    private String textConfig;

    @Autowired
    private Environment environment;

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping("/configs")
    public ResponseEntity<Void> getConfigs() {
        logger.info("Config = " + textConfig);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        logger.info("Port = " + environment.getProperty("local.server.port"));

        Worker worker = workerRepository.findById(id).get();
        return ResponseEntity.ok(worker);
    }


}
