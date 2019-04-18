package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * 饿汉模式
 */
@Slf4j
@ThreadSafe
public class SingletonExampl6 {
    private SingletonExampl6() {

    }



    static {
        instance = new SingletonExampl6();
    }

    private static SingletonExampl6 instance = null;

    public static SingletonExampl6 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        log.info("instance:{}", getInstance().hashCode());
        log.info("instance:{}", getInstance().hashCode());
    }
}
