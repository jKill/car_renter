package com.car.renter.constant;

import java.util.*;

/**
 * @Author huangjunqiao
 * @Date 2022/07/23 00:09
 * @Description
 */
public class Config {
    public static final int TOYOTA = 1;
    public static final int BMW = 2;

    /**
     * 总库存
     */
    public static Map<Integer, Integer> LIMITS = new HashMap<Integer, Integer>() {{
        put(TOYOTA , 2);
        put(BMW, 2);
    }};

    /**
     * 当前库存
     */
    public static Map<Integer, Integer> CARS = new HashMap<Integer, Integer>() {{
        put(TOYOTA , 2);
        put(BMW, 2);
    }};

    public static Map<Integer, String> ID_NAME = new HashMap<Integer, String>() {{
        put(TOYOTA, "Toyota Camry");
        put(BMW, "BMW 650");
    }};
}
