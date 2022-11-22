package ru.wxw.carservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "car_service")
public class CarService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "carService", fetch = FetchType.LAZY)
    private List<Client> clients;

    @OneToMany(mappedBy = "carService", fetch = FetchType.LAZY)
    private List<Service> services;

    @OneToMany(mappedBy = "carService", fetch = FetchType.LAZY)
    private List<Worker> workers;
}
