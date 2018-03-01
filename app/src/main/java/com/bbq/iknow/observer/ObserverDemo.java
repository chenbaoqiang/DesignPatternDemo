package com.bbq.iknow.observer;

/**
 * 版权所有 新媒传信科技有限公司。保留所有权利。<br>
 * 作者：chenbaoqiang on 2018/3/1
 * 项目名：RCSNative - Android客户端<br>
 * 描述：
 *
 * @version 1.0
 * @since JDK1.8.0_152
 */

public class ObserverDemo {
    public static void main(String[] args) {
        AObserver fObserver = new AObserver();
        BObserver sObserver = new BObserver();
        Subject subject = new Subject();
        subject.addAttach(fObserver);
        subject.addAttach(sObserver);
        subject.setMsg("msg change");
    }
}
