package com.simpkins.query;

public class Triple<T1, T2, T3> {
    private T1 item1;
    private T2 item2;
    private T3 item3;

    public Triple(T1 item1, T2 item2, T3 item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public static <T1, T2, T3> Triple<T1, T2, T3> create(T1 item1, T2 item2, T3 item3) {
        return new Triple<>(item1, item2, item3);
    }

    public T1 getItem1() {
        return item1;
    }

    public T2 getItem2() {
        return item2;
    }

    public T3 getItem3() {
        return item3;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                '}';
    }
}