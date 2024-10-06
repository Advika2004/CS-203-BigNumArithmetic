import org.junit.jupiter.api.Test;

public class finalTestingTests {


    @Test
    public void testSampleFile1(){
        BigNumArithmetic bga = new BigNumArithmetic();
        bga.main(new String[] {"testingMath.txt"} );

    }
    @Test
    public void testSampleFile2(){
        BigNumArithmetic bga = new BigNumArithmetic();
        bga.main(new String[] {"SampleInput.txt"} );

    }
}
