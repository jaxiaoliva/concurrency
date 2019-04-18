package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotations.NotThreadSafe;

/**
 * 懒汉模式
 */
@NotThreadSafe
public class SingletonExampl1 {
    private SingletonExampl1() {

    }

    private static SingletonExampl1 instance = null;

    public SingletonExampl1 getInstance() {
        if (instance == null) {
            instance = new SingletonExampl1();
        }
        return instance;
    }
}
