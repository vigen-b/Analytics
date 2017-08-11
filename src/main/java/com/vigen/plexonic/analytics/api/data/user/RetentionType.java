package com.vigen.plexonic.analytics.api.data.user;

public enum RetentionType {
    DAY1(1), DAY7(7), DAY40(40);

    private final int value;

    private RetentionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
