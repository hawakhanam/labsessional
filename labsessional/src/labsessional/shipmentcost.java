package labsessional;

public class shipmentcost implements Container {
	 public float weight[] = {2,3,1,3,2};
	 	 
	

	   public Iterator getIterator() {
	      return new costcalculator();
	   }
	   private class costcalculator implements Iterator {

		   int index;

		      public boolean hasNext(){ 
		    	  {
		      
		    		       if(index < weight.length){
		    		       return true;}
		    		       else{
		    		    	   return false;
		    		       }
		    		       
		    		      
		    		      
		    		  
		        
		      public Object next() {
		      
		         if(this.hasNext()){
		            return weight[index++];
		         }
		         return null;
		      }		
		   }
	}
