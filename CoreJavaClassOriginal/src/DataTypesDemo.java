class Car{
int milage;
int cc;
}
class DataTypesDemo{
Car car; 				// Abstract Data Type
byte b=127;
char c='A'; 			// char is 2 byte and should be in single quote
float f=1.0004f; 		// for float value add suffix with 'f' otherwise it will be double
boolean flag=true; 		// boolean is 1 byte

// Member Function
void TestString(){

//Literal Notation
String s1="Sankar";
String s2="pavan";

//object Notation
String s3=new String("Virat");
String s4= new String("Anushka");

//Literal Notation
String s5="Sankar";
String s6="Sankar";

//object Notation
String s7=new String("Virat");
String s8= new String("Virat");

System.out.println("To Test Comparison 'equals' and '==' operator");

//equals - it compares by value and returns true or false
//== - It compares by reference/address and always returns false

System.out.println(s1.equals(s2)); 		// o/p- false 
System.out.println(s1==s2); 			// o/p- false
System.out.println(s3.equals(s4)); 		// o/p- false
System.out.println(s3==s4); 			// o/p- false

System.out.println("To Test Comparison 'equals' and '==' operator");

System.out.println(s5.equals(s6)); 		//o/p-true
System.out.println(s5==s6); 			// o/p- true ,in literal notation same value saved on same address 
System.out.println(s7.equals(s8)); 		// o/p- true
System.out.println(s7==s8); 			// o/p- false

}

public static void main(String[] arg){

DataTypesDemo dd = new DataTypesDemo();
dd.TestString();
Car c1= new Car(); // Abstract Data Type- It's defined by user such that all arithmetic,relational and logical operator applied 
c1.cc=1000;

Car c2= new Car();
c2.cc=2000;

System.out.println("Total Car CC :"+(c1.cc+c2.cc));

/* Output
To Test Comparison 'equals' and '==' operator
false
false
false
false
To Test Comparison 'equals' and '==' operator
true
true
true
false
Total Car CC :3000
*/
}
}