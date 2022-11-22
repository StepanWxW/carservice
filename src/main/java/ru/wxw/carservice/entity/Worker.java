package ru.wxw.carservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "worker")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "profession")
    private String profession;

    @Column(name = "salary")
    private float salary;

    @ManyToOne
    @JoinColumn(name = "car_service_id", referencedColumnName ="id")
    private CarService carService;
}
