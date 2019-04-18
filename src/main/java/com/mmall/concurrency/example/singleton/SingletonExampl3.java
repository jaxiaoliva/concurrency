package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotations.NotThreadSafe;
import com.mmall.concurrency.annotations.ThreadSafe;

/**
 * 懒汉模式
 */
@ThreadSafe
public class SingletonExampl3 {
    private SingletonExampl3() {

    }

    private static SingletonExampl3 instance = null;

    public synchronized SingletonExampl3 getInstance() {
        if (instance == null) {
            instance = new SingletonExampl3();
        }
        return instance;
    }
}
