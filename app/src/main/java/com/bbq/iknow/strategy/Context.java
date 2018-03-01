package com.bbq.iknow.strategy;

/**
 * 版权所有 新媒传信科技有限公司。保留所有权利。<br>
 * 作者：chenbaoqiang on 2018/2/28
 * 项目名：RCSNative - Android客户端<br>
 * 描述：
 *
 * @version 1.0
 * @since JDK1.8.0_152
 */

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2){
        return this.strategy.doOperation(num1,num2);
    }
}