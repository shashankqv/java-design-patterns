package com.iluwatar.singleton;

/**
 * Created by shashank on 7/6/17.
 */
public final class DoubleCheckedSingleton {

    private static volatile DoubleCheckedSingleton INSTANCE;

    private DoubleCheckedSingleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException("already initialized");
        }
    }

    public static DoubleCheckedSingleton getINSTANCE() {
        DoubleCheckedSingleton RESULT = INSTANCE;

        if (RESULT == null) {
            synchronized (DoubleCheckedSingleton.class) {

                RESULT = INSTANCE;
                if (RESULT == null) {
                    INSTANCE = RESULT = new DoubleCheckedSingleton();
                }
            }
        }
        return RESULT;
    }
}