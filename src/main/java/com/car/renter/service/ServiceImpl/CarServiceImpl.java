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

import java.util.List;

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
    public String rent(RentDTO rentDto) {
        int result = carMapper.rentCar(rentDto.getTypeId());

        if (result == 0) {
            return "此车型暂无可租车辆";
        } else {
            return "租车成功";
        }
    }

    @Override
    public String returnCar(ReturnDTO returnDto) {
        int result = carMapper.returnCar(returnDto.getTypeId());

        if (result == 0) {
            return "暂无出借记录，无需归还";
        } else {
            return "归还成功";
        }
    }

    @Override
    public List<CarDetailVO> queryAll(QueryDTO queryDto) {
        return carMapper.queryAll();
    }
}
