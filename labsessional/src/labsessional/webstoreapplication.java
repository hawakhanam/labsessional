package labsessional;

public class webstoreapplication {
	
	   public static void main(String[] args) {
		   shipmentcost shipmentcost = new shipmentcost();

	      for(Iterator iter = shipmentcost.getIterator(); iter.hasNext();){
	        
	         int weight=0;
	         double cost=0;
	         weight=(int)iterator.next();
	         if (weight<=5){
	        	 cost= weight*0.75;
	         }
	         else if(weight>5){
	        	  System.out.println("cost : " +cost); 
	         }
	         
	      
	       
	   }
	}

}
