package p2;

/*
 * if there are two class in different package 
 * p1.A and p2.A 
 * we can't load both package in p3 class loader will not allow to load same class A
 * so we need to provide full qualified name
 */
//Using packagename.classname

import p1.A;

public class C {

public static void main(String[] args){
		
		A a1= new A();
		a1.f3();
		p.A a= new p.A();
		a.f3();
	}
}
