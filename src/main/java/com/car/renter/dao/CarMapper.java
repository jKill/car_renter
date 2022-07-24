package com.car.renter.dao;

import com.car.renter.entiry.CarDetailVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 23:43
 * @Description
 */
@Mapper
public interface CarMapper {
    CarDetailVO queryAll(Date date);

    int deductByDays(Integer typeId, int num, Date fromDate, int duration);

    int addByDays(Integer typeId, int num, Date fromDate, int duration);
}
