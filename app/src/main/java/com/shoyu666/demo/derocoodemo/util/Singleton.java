package com.shoyu666.demo.derocoodemo.util;

public abstract class Singleton<T> {
    /* The volatile keyword ensures that multiple threads
    * handle the uniqueInstance variable correctly when it
    * is being initialized to the Singleton instance.
    * */
    private volatile static Object uniqueInstance;

    public Singleton() {
    }

    public abstract T create();

    public T get() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = create();
                }
            }
        }
        return (T) uniqueInstance;
    }
} 