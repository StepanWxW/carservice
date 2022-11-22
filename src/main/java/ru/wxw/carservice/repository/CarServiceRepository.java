package ru.wxw.carservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.wxw.carservice.entity.CarService;

@Repository
public interface CarServiceRepository extends JpaRepository<CarService, Long> {
}
