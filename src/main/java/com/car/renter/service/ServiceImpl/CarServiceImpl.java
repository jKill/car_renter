package com.car.renter.service.ServiceImpl;

import com.car.renter.constant.Config;
import com.car.renter.dao.CarMapper;
import com.car.renter.entiry.CarDetailVO;
import com.car.renter.entiry.QueryDTO;
import com.car.renter.entiry.RentDTO;
import com.car.renter.entiry.ReturnDTO;
import com.car.renter.service.CarService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 23:40
 * @Description
 */
@Service("carService")
public class CarServiceImpl implements CarService {

    @Override
    public String rent(RentDTO rentDto) {
        int typeId = rentDto.getTypeId();
        int stock = Config.CARS.get(typeId);
        if (stock == 0) {
            return "此车型暂无可租车辆";
        }
        Config.CARS.put(typeId, stock - 1);
        return "租车成功";
    }

    @Override
    public String returnCar(ReturnDTO returnDto) {
        int typeId = returnDto.getTypeId();
        if (Config.CARS.get(typeId) == Config.LIMITS.get(typeId)) {
            return "暂无出借记录，无需归还";
        }
        Config.CARS.put(typeId, Config.CARS.get(typeId) + 1);
        return "归还成功";
    }

    @Override
    public List<CarDetailVO> queryAll(QueryDTO queryDto) {
        List<CarDetailVO> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : Config.CARS.entrySet()) {
            CarDetailVO vo = new CarDetailVO();
            int typeId = entry.getKey(), cnt = entry.getValue();

            vo.setTypeId(typeId);
            vo.setStock(cnt);
            vo.setTypeName(Config.ID_NAME.get(typeId));
            res.add(vo);
        }
        return res;
    }
}
