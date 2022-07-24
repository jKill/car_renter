package com.car.renter.controller;

import com.car.renter.entiry.CarDetailVO;
import com.car.renter.entiry.QueryDTO;
import com.car.renter.entiry.RentDTO;
import com.car.renter.entiry.ReturnDTO;
import com.car.renter.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 17:08
 * @Description 租车控制器
 */
@RequestMapping("/car")
@RestController
public class CarController {


    @Autowired
    CarService carService;

    @PostMapping("/query/all")
    public CarDetailVO queryAll(@RequestBody QueryDTO queryDto) {
        return carService.queryAll(queryDto);
    }

    @PostMapping("/rent")
    public void rent(@RequestBody RentDTO rentDto) {
        carService.rent(rentDto);
    }

    @PostMapping("/return")
    public void returnCar(@RequestBody ReturnDTO returnDto) {
        carService.returnCar(returnDto);
    }



}
