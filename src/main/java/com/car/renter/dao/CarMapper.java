package com.car.renter.dao;

import com.car.renter.entiry.CarDetailVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 23:43
 * @Description
 */
@Mapper
public interface CarMapper {
    List<CarDetailVO> queryAll();

    int rentCar(@Param("typeId") int typeId);

    int returnCar(@Param("typeId") int typeId);
}
