package com.car.renter.service;

import com.car.renter.entiry.CarDetailVO;
import com.car.renter.entiry.QueryDTO;
import com.car.renter.entiry.RentDTO;
import com.car.renter.entiry.ReturnDTO;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 23:32
 * @Description
 */
public interface CarService {

    CarDetailVO queryAll(QueryDTO queryDto);

    void rent(RentDTO rentDto);

    void returnCar(ReturnDTO returnDto);
}
