
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import org.junit.Test;

public class calculateTest {

  @Test
  public void test() {
    ArrayList <Integer> array = new ArrayList<Integer>();
    array.add(500);
    array.add(30);
    array.add(23);

    
    //The above numbers are added to array and equal 553
    assertEquals(553, calculate.addArray(array));
   
    //Supposed to be 553, but passed in 600 so it should be false.
    assertFalse(600 == calculate.addArray(array));

  }

}
