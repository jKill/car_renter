package com.car.renter.service;

import com.car.renter.entiry.CarDetailVO;
import com.car.renter.entiry.QueryDTO;
import com.car.renter.entiry.RentDTO;
import com.car.renter.entiry.ReturnDTO;

import java.util.List;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 23:32
 * @Description
 */
public interface CarService {

    List<CarDetailVO> queryAll(QueryDTO queryDto);

    String rent(RentDTO rentDto);

    String returnCar(ReturnDTO returnDto);
}
