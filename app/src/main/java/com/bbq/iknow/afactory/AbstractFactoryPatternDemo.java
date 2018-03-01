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

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("car");

        Car baoma = abstractFactory.getCar("baoma");
        baoma.createCar();

        AbstractFactory abstractFactory1= FactoryProducer.getFactory("color");

        Color red = abstractFactory1.getColor("red");
        red.fill();
    }

}
