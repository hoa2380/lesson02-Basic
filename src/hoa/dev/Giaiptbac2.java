package hoa.dev;

public class Giaiptbac2 {
	public static void main(String[] args) {
		float a,b,c,delta,x1,x2;

	      a=1 ; 
	      b=2 ;
	      c=0 ;
	      delta=b*b-4*a*c;
	      if (delta>0) {
	    	  x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
	    	  x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
	    	  System.out.println("pt co  nghiem x1= "+x1 );
	    	  System.out.println("pt co nghiem x2= "+x2);
	      }
	      else {
	  	if (delta==0) {
	  		x1 = -b/a;
	  		System.out.println("pt co nghiem kep"+x1);
	  	}
	  	else {
	  		if (delta<0) {
	  			System.out.println("pt vo nghiem");
	  		}
	    		
	    	}
	    }
		
	      }
	      
	
		


	}


