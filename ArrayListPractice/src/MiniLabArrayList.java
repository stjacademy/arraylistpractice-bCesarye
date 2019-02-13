
import java.util.ArrayList;
import java.util.List; 

public class MiniLabArrayList {
	
	
public static void main(String[] args) {
	System.out.println(getListOfFactors(12));
	ArrayList <Integer> n = getListOfFactors(12);
	keepOnlyCompositeNumbers(n);
	System.out.print(n);
}
	 

public static ArrayList<Integer> getListOfFactors(int number)
	  {                                                                        	
	  		ArrayList<Integer> factor = new ArrayList<Integer>();
	  		for(int i=2;i<number;i++) {
	  			if(number%i==0) {
	  				factor.add(i);
	  			}
	  			
	  		}
	  		return factor; 
	  		
	  }
	 



	  public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
	  {
		 int list=0;
		 for (int i=0; i<nums.size(); i++) {
			 if(getListOfFactors(nums.get(i)).size()<=0) {
				 nums.remove(i);
				 i--;
			 }
		 }
			 //for(int j=0;j<nums.get(i); j++) {
				// if(nums.get(i)%j==0) {
				//	 list=i;
				// }
				 
		//	 }
		//	 if(list<i) {
		//		 nums.remove(1);
		//		 i--;
		//	 }
		// }
		//  
		 //System.out.print(nums); 
	  	
	  
	  }
}

