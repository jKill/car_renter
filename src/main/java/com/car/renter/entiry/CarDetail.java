package com.car.renter.entiry;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 17:14
 * @Description 当天库存详情
 */
@EntityScan
public class CarDetail {

    /**
     * 车型id
     */
    private Integer typeId;

    /**
     * 车型名称
     */
    private String typeName;

    /**
     * 当前库存
     */
    private Integer currentStock;

    /**
     * 日期
     */
    private Date date;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Integer currentStock) {
        this.currentStock = currentStock;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
