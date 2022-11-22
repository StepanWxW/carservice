package ru.wxw.carservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private float cost;

    @Column(name = "client_id")
    private int clientId;

    @Column(name = "worker_id")
    private int workerId;

    @ManyToOne
    @JoinColumn(name = "car_service_id", referencedColumnName ="id")
    private CarService carService;
}
