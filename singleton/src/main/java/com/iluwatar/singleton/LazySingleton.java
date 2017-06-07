package com.iluwatar.singleton;

/**
 * Created by shashank on 7/6/17.
 */
public final class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton INSTANCE;

    public static synchronized LazySingleton getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return  INSTANCE;
    }
}