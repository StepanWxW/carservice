package ru.wxw.carservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.wxw.carservice.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
