package com.car.renter.entiry;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 23:54
 * @Description
 */
public class ReturnDTO {
    /**
     * 车型 id
     */
    private Integer typeId;

    /**
     * 数量
     */
    private Integer num;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
