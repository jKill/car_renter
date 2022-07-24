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

import java.util.List;

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
    public List<CarDetailVO> queryAll(@RequestBody QueryDTO queryDto) {
        return carService.queryAll(queryDto);
    }

    @PostMapping("/rent")
    public String rent(@RequestBody RentDTO rentDto) {
        return carService.rent(rentDto);
    }

    @PostMapping("/return")
    public String returnCar(@RequestBody ReturnDTO returnDto) {
        return carService.returnCar(returnDto);
    }



}
