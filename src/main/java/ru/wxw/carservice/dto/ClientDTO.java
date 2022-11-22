package ru.wxw.carservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.wxw.carservice.entity.CarService;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private Long id;

    private String name;

    private String car;

    private CarService carService;
}
