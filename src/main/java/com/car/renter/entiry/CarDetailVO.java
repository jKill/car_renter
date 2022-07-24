package com.car.renter.entiry;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 23:44
 * @Description 汽车及库存展示
 */
public class CarDetailVO {

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
    private Integer stock;

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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

}
