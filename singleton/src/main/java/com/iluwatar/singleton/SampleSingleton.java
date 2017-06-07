package com.iluwatar.singleton;

/**
 * Created by shashank on 7/6/17.
 */
public final class SampleSingleton {
    private SampleSingleton() {}

    private static final SampleSingleton INSTANCE = new SampleSingleton();


    public static SampleSingleton getINSTANCE(){
        return INSTANCE;
    }
}