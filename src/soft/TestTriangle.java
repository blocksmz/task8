package soft;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	 @Test
     public void testIsTriangle1(){
         Triangle t = new Triangle(-1,10,2);
         assertFalse(t.isTriangle(t));
     }
 
     @Test
     public void testIsTriangle2(){
         // according to the mutant, this test case should fail
         Triangle t = new Triangle(3,2,1);
         assertFalse(t.isTriangle(t));
     }
 
     @Test
     public void testIsTriangle3(){
         Triangle t = new Triangle(3,1,2);
         assertFalse(t.isTriangle(t));
     }
    // 下面是添加你设计的测试用例
    // *****
     
     @Test
     public void testRegular()
     {
    	 Triangle theRe=new Triangle(3,3,3);
    	 assertTrue(theRe.getType(theRe).equals("Regular"));
     }
 
     @Test
     public void testScalene()
     {
    	 Triangle theRe=new Triangle(4,2,3);
    	 assertTrue(theRe.getType(theRe).equals("Scalene"));
     }

     @Test
     public void testIsoceles()
     {
    	 Triangle theRe=new Triangle(3,3,2);
    	 assertTrue(theRe.getType(theRe).equals("Isoceles"));
     }
     
     @Test
     public void testrightTriangle()
     {
    	 Triangle theRe=new Triangle(6,8,10);
    	 assertTrue(theRe.getType(theRe).equals("rightTriangle"));
     }
     
}
