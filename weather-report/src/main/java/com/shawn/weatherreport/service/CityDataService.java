package com.shawn.weatherreport.service;


import com.shawn.weatherreport.vo.City;

import java.util.List;

/**
 * @Description: TODO
 * @Author: shawn
 * @Date: 2019/1/13 0013 13:50
 */
public interface CityDataService {
    /**
     * 获取City列表
     * @return
     * @throws Exception
     */
    List<City> listCity() throws Exception;
}
