package com.car.renter.entiry;

import java.util.Date;

/**
 * @Author huangjunqiao
 * @Date 2022/07/22 23:53
 * @Description
 */
public class RentDTO {
    private Date fromDate;

    private Integer duration;

    /**
     * 车型 id
     */
    private Integer typeId;

    /**
     * 数量
     */
    private Integer num;


    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

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
