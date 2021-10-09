
# Description
- auth : 77kkyu
- development environment : Java Application
- technology : Generic

---

# Generic Introduction

### 제네릭 
- 제네릭은 일반적인 유형은 유형을 통해 매개 변수화 된 제네릭 클래스 또는 인터페이스입니다 즉 여러개의 데이터 형식의 타입을 가질 수 있습니다.

> #### 오라클 공식 문서 https://docs.oracle.com/javase/tutorial/java/generics/types.html
> 
>형식 매개 변수가 제한되지 않은 경우 제네릭 형식의 모든 형식 매개 변수를 해당 경계 또는 개체로 바꿉니다. 따라서 생성된 바이트 코드에는 일반 클래스, 인터페이스 및 메서드만 포함됩니다

- 자주 사용하는 ArrayList로 예를들면 <> 괄호안에 들어가는 타입을 지정해줍니다.
- 제네릭을 사용하면 <> 괄호안에 들어가는 타입을 여러개 지정해줄 수 있습니다.

``` java
ArrayList<Integer> integerList = new ArrayList<Integer>();
ArrayList<String> stringList = new ArrayList<String>();
```

### 제네릭의 장점

- 제네릭을 사용하면 지정하지 않는 타입이 들어왔을 경우 컴파일 단에서 방지할 수 있습니다.
- 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없습니다.

### 제네릭 사용법
|타입|설명|
|------|-----|
|&#60;T>|Type|
|&#60;E>|Element|
|&#60;K>|Key|
|&#60;V>|Value|
|&#60;N>|Number|

### 상한 경계 extends, 하한 경계 super, 와일드 카드 ?
- &#60;K extends T>   T와 T의 자손 타입만 가능 (K는 들어오는 타입으로 지정 됨)
- &#60;K super T>	    T와 T의 부모(조상) 타입만 가능 (K는 들어오는 타입으로 지정 됨)
- &#60;? extends T>	T와 T의 자손 타입만 가능
- &#60;? super T>	    T와 T의 부모(조상) 타입만 가능
- &#60;?>		        모든 타입 가능. <? extends Object>랑 같은 의미