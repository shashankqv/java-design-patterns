package com.iluwatar.singleton;

/**
 * Created by shashank on 7/6/17.
 */
public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}