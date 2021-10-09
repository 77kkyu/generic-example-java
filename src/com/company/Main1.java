package com.company;

/*
 * <K extends T>	// T와 T의 자손 타입만 가능 (K는 들어오는 타입으로 지정 됨)
 * <K super T>	    // T와 T의 부모(조상) 타입만 가능 (K는 들어오는 타입으로 지정 됨)
 * <? extends T>	// T와 T의 자손 타입만 가능
 * <? super T>	    // T와 T의 부모(조상) 타입만 가능
 * <?>		        // 모든 타입 가능. <? extends Object>랑 같은 의미
 */
public class Main1 {

	public static void main(String[] args) {

		NumberClass<Double> numberClass = new NumberClass<Double>();
		//NumberClass<String> numberClass1 = new NumberClass<String>(); // 에러
		SoltClass<Student> a = new SoltClass<Student>();

	}

}

class NumberClass <K extends Number> {}

class SuperClass <E extends Comparable<? super E>>{}

// class SoltClass1 <E extends Comparable<E>> {  }	// Error가능성 있음
class SoltClass <E extends Comparable<? super E>> {  }	// 안전성이 높음

class Person {}

class Student extends Person implements Comparable<Person> {
	@Override
	public int compareTo(Person o) {
		return 0;
	}
}