import java.util.Iterator;
import java.util.Vector;

public class InsInfContainer {

	private Vector <InsuranceInfo> container;
    
    
	public InsInfContainer(){
        container = new Vector<>(5,1);
    }
	


	public void addInfo(InsuranceInfo info) {
		container.addElement( info );
		
	}
	
    public void printAll(){
        
        Iterator<InsuranceInfo> iter = container.iterator();
        
        while( iter.hasNext()){
            System.out.println(iter.next());
        }        
    }
      
    public void printLess(double max) {
        
    	Iterator<InsuranceInfo> iter = container.iterator();
        while( iter.hasNext()){
        	
        	InsuranceInfo temp = iter.next();
        	
        	if (  temp.getVakuutusarvo()  <  max  ) {
     			System.out.println(iter.next());
        	}       	
        }
    }
    
    public void printMore(double min) {
        
    	Iterator<InsuranceInfo> iter = container.iterator();
        while( iter.hasNext()){
        	
        	InsuranceInfo temp = iter.next();
        	
        	if (  temp.getVakuutusarvo()  >  min  ) { 			
        		System.out.println(iter.next());
        	
        	}       	
        }
    }
    
    
    
}
