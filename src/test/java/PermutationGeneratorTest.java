import org.junit.Assert;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.Assert.*;


public class PermutationGeneratorTest {

    @Test
    public void generatePermutation() {

        try {
            PermutationGenerator.generatePermutation("abc");
        }catch (NotImplementedException e){
            return;
        }
        Assert.fail();
    }
}