/*
 * Q: find the sum of even element and sum of odd element from array(nos)?
 * Q.find duplicate elements from 2 arrays(nos and nos2)?
 * 
 */
public class ArrayProgram {

	static int nos[]={10,20,30,40,50,60};
	static int esum,osum;
	static int nos2[]={40,50,60,80};
	static int nos3[]={10,30,50,70,80,100};
	
	public static void main(String[] args) {

		//sum of even and sum odd elements of array1(nos)
		
		for(int i=0;i<nos.length;i++){
			 if(i%2==0){
				 esum=esum+nos[i];
			 }else{
				 osum=osum+nos[i];
			 }
		}
		System.out.println(" Sum of even number : "+esum);
		System.out.println(" Sum of even number : "+osum);
	
		System.out.println("-------------------");
		
		//Finding duplicate elements in 2 arrays
		
		if(nos.length!=nos2.length){
			for(int i=0;i<nos2.length;i++){
				for(int j=0;j<nos.length;j++){
					if(nos2[i]==nos[j]){
						System.out.println("Duplicate element of  diff size array- : array1 "+nos[j]+" array2 "+ nos2[i]);
					}
				}
			}
		}
		System.out.println("-------------------");
		
		if(nos.length==nos3.length){
			for(int i=0;i<nos3.length;i++){
				for(int j=0;j<nos.length;j++){
					if(nos[i]==nos3[j]){
						System.out.println("Duplicate element of same size array- : array1 "+nos[i]+" array3 "+ nos3[j]);
					}	
				}
			}
		}

	}

}
