package ru.wxw.carservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.wxw.carservice.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
