package com.kh.lambda.standard;

import java.util.function.BooleanSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class B_Supplier {

	public static void main(String[] args) {

		B_Supplier b = new B_Supplier();
		b.method3();
	}

	public void method1() {
		Supplier<String> supplier = () -> "Supplier는 제네릭으로 지정된 타입의 객체를 리턴한다.";
		System.out.println(supplier.get());
	}

	public void method2() {
		BooleanSupplier boolsupplier = () -> true;
		System.out.println(boolsupplier.getAsBoolean());
		
	}
	
	public void method3() {
		LongSupplier longsupplier = () -> 2323214214214412L;
		System.out.println(longsupplier.getAsLong());
	}
	
	
	
	
}
