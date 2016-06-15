package com.example;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Seb on 2016-01-29.
 */
public class RequestsCounter {
    private static AtomicInteger count = new AtomicInteger(0);

    public static void increase() {
        count.incrementAndGet();
    }

    public static void decrease() {
        count.decrementAndGet();
    }

    public static int getValueAndReset() {
        return count.getAndSet(0);
    }

    public static void resetValue(){
        count.getAndSet(0);
    }

    public static int getValue(){
        return count.get();
    }
}
