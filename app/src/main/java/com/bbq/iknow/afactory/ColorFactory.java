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

public class ColorFactory extends AbstractFactory {


    @Override
    Car getCar(String type) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color.equals("red")) {
            return new RedColor();
        } else if (color.equals("blue")) {
            return new BlueColor();
        }
        return null;
    }
}
