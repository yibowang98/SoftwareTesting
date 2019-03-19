package lab1;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Collection;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)

public class test {
   private int input;
   private Money money = null;
   public test(int input) {
	   this.input = input;
   }
   
   @Before
   public void setup() {
	   money = new Money();
   }
   
   @Parameters
   public static Collection<Object[]> getData(){
	   return Arrays.asList(new Object[][]{
		   {54},
		   {32},
		   {73},
		   {52},
		   {1},
		   {98}
	   });
   }
   
   @org.junit.Test
   public void testCal() {
	   assertTrue(money.calculate(input));
   }
}