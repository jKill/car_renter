package com.car.renter.service.ServiceImpl;

import com.car.renter.constant.Config;
import com.car.renter.dao.CarMapper;
import com.car.renter.entiry.CarDetailVO;
import com.car.renter.entiry.QueryDTO;
import com.car.renter.entiry.RentDTO;
import com.car.renter.entiry.ReturnDTO;
import com.car.renter.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 23:40
 * @Description
 */
@Service("carService")
public class CarServiceImpl implements CarService {


    @Autowired
    private CarMapper carMapper;

    @Override
    public void rent(RentDTO rentDto) {
        carMapper.deductByDays(rentDto.getTypeId(), rentDto.getNum(), rentDto.getFromDate(), rentDto.getDuration());
    }

    @Override
    public void returnCar(ReturnDTO returnDto) {
        Date returnDate = new Date();
        carMapper.addByDays(returnDto.getTypeId(), returnDto.getNum(), returnDate, Config.MAX_PRE);
    }

    @Override
    public CarDetailVO queryAll(QueryDTO queryDto) {
        return carMapper.queryAll(queryDto.getDate());
    }
}
