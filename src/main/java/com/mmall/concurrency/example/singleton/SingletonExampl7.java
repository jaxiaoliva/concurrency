package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annotations.Recommend;
import com.mmall.concurrency.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

@ThreadSafe
@Slf4j
@Recommend
public class SingletonExampl7 {
    private SingletonExampl7() {

    }

    public static SingletonExampl7 getInstance() {
        return Singleton.INSTANCE.getInstace();
    }

    private enum Singleton {
        INSTANCE;

        private SingletonExampl7 instance;

        //JVM保证这个方法只执行一次
        Singleton() {
            instance = new SingletonExampl7();
        }

        public SingletonExampl7 getInstace() {
            return instance;
        }
    }

}
