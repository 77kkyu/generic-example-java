package com.company;

public class Main {

    public static void main(String[] args) {

        ElementGeneric<String> StringElement = new ElementGeneric<String>();
        ElementGeneric<Integer> IntegerElement = new ElementGeneric<Integer>();
        StringElement.set("10");
        IntegerElement.set(10);;
        System.out.println("StringElement = " + StringElement.get());
        System.out.println("StringElement Name = " + StringElement.get().getClass().getName()); // 타입
        System.out.println("IntegerElement = " + IntegerElement.get());
        System.out.println("IntegerElement Name = " + IntegerElement.get().getClass().getName());

        System.out.println();
        System.out.println("====================================================================");
        System.out.println();

        KeyValueGeneric<String, Integer> keyValueGeneric = new KeyValueGeneric<String, Integer>();
        keyValueGeneric.set("20",20);
        System.out.println("first = " + keyValueGeneric.getFirst());
        System.out.println("first Name = " + keyValueGeneric.getFirst().getClass().getName());
        System.out.println("second = " + keyValueGeneric.getSecond());
        System.out.println("second Name = " + keyValueGeneric.getSecond().getClass().getName());

        System.out.println();
        System.out.println("====================================================================");
        System.out.println();

        GenericMethod<String> str = new GenericMethod<String>();
        GenericMethod<Integer> inte = new GenericMethod<Integer>();
        System.out.println("GenericMethod = " + str.genericMethod(30).getClass().getName());
        System.out.println("GenericMethod = " + inte.genericMethod(30).getClass().getName());
        System.out.println("GenericMethod = " + inte.genericMethod(keyValueGeneric).getClass().getName());
        System.out.println("GenericMethod = " + inte.genericMethod(keyValueGeneric).getSecond());
        System.out.println("GenericMethod = " + inte.genericMethod("30"));
        System.out.println("Static GenericMethod = " + GenericMethod.genericMethod1(33).getClass().getName());
        System.out.println("Static GenericMethod = " + GenericMethod.genericMethod1("33").getClass().getName());



    }

}

class ElementGeneric<E> { // 제네릭 클래스 E = element

    private E element; // 제네릭 타입 변수

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }

}

class KeyValueGeneric<K, V> { // Key Value
    private K first;
    private V second;

    void set(K first, V second) {
        this.first = first;
        this.second = second;
    }

    K getFirst() {
        return  first;
    }

    V getSecond() {
        return second;
    }

}

class GenericMethod<E> { // 제네릭 메소드
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }

    <T> T genericMethod(T o) { // 제네릭 메소드
        return o;
    }

    static <E> E genericMethod1(E o) { // 정적 제네릭 메소드
        return o;
    }

    // static 메소드는 객체가 생성되기전에 메모리에 올라가기 때문에 E유형을 클래스로부터 얻어올 수 없다.
//    static E genericMethod1(E o) {	// error!
//        return o;
//    }

}

interface GenericInterface <K, V> {
   public K getKey();
   public V getValue();
}

