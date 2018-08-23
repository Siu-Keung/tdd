import org.junit.Assert;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class PermutationGeneratorTest {

    @Test
    public void should_get_a_given_a() {
        //given
        final String input = "a";

        //when
        List<String> result = PermutationGenerator.generatePermutation(input);

        //then
        assertThat(result, is(Arrays.asList("a")));
    }
    @Test
    public void should_get_ab_ba_given_ab(){
        //given
        String input = "ab";
        //when
        List<String> result = PermutationGenerator.generatePermutation(input);
        //then
        assertThat(result,is(Arrays.asList("ab","ba")));
    }
}