package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotations.NotThreadSafe;
import com.mmall.concurrency.annotations.ThreadSafe;

/**
 * 懒汉模式
 * 双重同步锁单例模式
 */
@NotThreadSafe
public class SingletonExampl4 {
    private SingletonExampl4() {

    }

    /**
     * 1、分配对象内存空间
     * 2、初始化对象
     * 3、设置instance指向分配的内存
     */

    /**
     * jvm和cpu优化发生指令重排
     * 1、分配对象内存空间
     * 3、设置instance指向分配的内存
     * 2、初始化对象
     */


    private static SingletonExampl4 instance = null;

    public SingletonExampl4 getInstance() {
        if (instance == null) {//双重检测机制
            synchronized (SingletonExampl4.class) {//同步锁
                if (instance == null) {
                    instance = new SingletonExampl4();
                }
            }
        }
        return instance;
    }
}
