
package controlexamples;

import org.junit.Test;
import static org.junit.Assert.*;


public class LottoTest {
    
    public LottoTest() {
    }

    @Test
    public void testGetWinnings() {
        // arrange
        Lotto firstTicket = new Lotto( new int[] { 1, 2, 3, 4, 5 });
        Lotto secondTicket = new Lotto( new int[] { 1, 2, 3, 4, 5 });
        int expectedWinnings = 50_000;
        
        // act
        int actualWinnings = firstTicket.getWinnings(secondTicket);
        
        // assert
        assertEquals(expectedWinnings, actualWinnings);
        
    }
    
}
