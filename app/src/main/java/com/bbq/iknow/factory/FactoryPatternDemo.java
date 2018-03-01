package com.bbq.iknow.factory;

/**
 * 版权所有 新媒传信科技有限公司。保留所有权利。<br>
 * 作者：chenbaoqiang on 2018/2/28
 * 项目名：RCSNative - Android客户端<br>
 * 描述：
 *
 * @version 1.0
 * @since JDK1.8.0_152
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car benchi = factory.getCar("benchi");
        benchi.create();

        Car baoma = factory.getCar("baoma");
        baoma.create();
    }
}
