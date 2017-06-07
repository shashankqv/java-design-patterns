package com.iluwatar.singleton;

/**
 * Created by shashank on 2/6/17.
 */
public final class IvoryTowerCopy {
    private static final IvoryTowerCopy INSTANCE = new IvoryTowerCopy();

    private IvoryTowerCopy() {
    }

    public static IvoryTowerCopy getInstance() {
        return INSTANCE;
    }
}