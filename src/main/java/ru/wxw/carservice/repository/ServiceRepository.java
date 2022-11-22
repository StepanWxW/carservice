package ru.wxw.carservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.wxw.carservice.entity.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
