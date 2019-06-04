package test;

import static org.junit.Assert.*;				
import org.junit.Test;	

public class MyTests  {
	 calculator cal=new calculator();
	  
	 @Test
	   public void testSum() {
	   assertEquals(2,cal.add(1,1));
	  }
	   
	 @Test
	   public void testSub() {
		   assertEquals(0,cal.sub(1,1));
		  }
	   
	 @Test
	   public void testMul() {
		   assertEquals(1,cal.mul(1,1));
		  }
	   
	 @Test
	   public void testDiv() {
		   assertEquals(1,cal.div(1,1));
		  }
}
