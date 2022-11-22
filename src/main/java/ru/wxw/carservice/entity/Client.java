package ru.wxw.carservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "car")
    private String car;

    @ManyToOne
    @JoinColumn(name = "car_service_id", referencedColumnName ="id")
    private CarService carService;
}

