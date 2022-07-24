package com.car.renter.entiry;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 17:13
 * @Description 车型
 */
@EntityScan
public class CarType {
    /**
     * 车型id
     */
    private Integer id;

    /**
     * 车型名称
     */
    private String name;

    /**
     * 总库存
     */
    private Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }


}
