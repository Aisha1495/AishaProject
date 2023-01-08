/**
 * 
 */
package Project;


public class Project22 {

	public static void main(String[] args) {
		
		int counts =0;
		
		//print list of names in array 
		String[] names = {"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "Atyab", "Abdullah", "Abdullah"};
		  for(int i=0;i<names.length;i++) {
	    		int count=0;
	    		if(counts<names.length) {
	            for(int j =i;j<names.length;j++) {
	                if(names[i].toLowerCase().equals(names[j].toLowerCase())) {
	                    count++;
	                    
		
	}
	                    
	            }
	         
	            counts+=count;
	            System.out.println( names[i] +" is repeated "+(count-0)+" times ");   
	    		}
		  }
	}
}