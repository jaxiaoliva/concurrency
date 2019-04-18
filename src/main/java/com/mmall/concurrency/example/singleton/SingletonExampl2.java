package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotations.ThreadSafe;

/**
 * 饿汉模式
 */
@ThreadSafe
public class SingletonExampl2 {
    private SingletonExampl2() {

    }

    private static SingletonExampl2 instance = new SingletonExampl2();

    public static SingletonExampl2 getInstance() {
        return instance;
    }
}
