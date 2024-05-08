import odd.OddTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddTaskTest {

    @Test
    public void testOddTaskEvenNumbers(){
        int[] evenNumbers = new int[] {-9000, -2, 0, 2, 10, 9998};
        for(int num: evenNumbers) {
            Assertions.assertFalse(OddTask.isOdd(num));
        }
    }


    @Test
    public void testOddTaskOddNumber(){
        int[] oddNumbers = new int[] {-9999,-1, 1, 13, 9999};
        for(int num: oddNumbers) {
            Assertions.assertTrue(OddTask.isOdd(num));
        }
    }
}

