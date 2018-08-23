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

    @Test
    public void should_get_abc_acb_bac_bca_cba_cab_given_abc(){
        //given
        String input = "abc";
        //when
        List<String> result = PermutationGenerator.generatePermutation(input);
        //then
        assertThat(result, is(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }

    @Test
    public void should_get_result_length_24_given_abcd(){
        //given
        String input = "abcd";
        //when
        List<String> result = PermutationGenerator.generatePermutation(input);
        //then
        assertThat(result.size(), is(24));
    }



}