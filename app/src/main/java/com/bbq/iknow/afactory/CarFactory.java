package com.bbq.iknow.afactory;

/**
 * 版权所有 新媒传信科技有限公司。保留所有权利。<br>
 * 作者：chenbaoqiang on 2018/3/1
 * 项目名：RCSNative - Android客户端<br>
 * 描述：
 *
 * @version 1.0
 * @since JDK1.8.0_152
 */

public class CarFactory extends AbstractFactory {

    @Override
    Car getCar(String type) {
        if (type.equals("baoma")) {
            return new BMCar();
        } else if (type.equals("benchi")) {
            return new BCCar();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
