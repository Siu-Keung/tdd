import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationGenerator {

    public static List<String> generatePermutation(String input) {
        List<String> result = new ArrayList<>();
        if (input.length() == 1) result = Arrays.asList(input);
        else if (input.length() == 2) {
            result = Arrays.asList(input, input.substring(1, 2) + input.substring(0, 1));
        } else  {
            result = generateThree(input);

//            result.add(String.valueOf(new char[]{input.charAt(0), input.charAt(1), input.charAt(2)}));
//            result.add(String.valueOf(new char[]{input.charAt(0), input.charAt(2), input.charAt(1)}));
//            result.add(String.valueOf(new char[]{input.charAt(1), input.charAt(0), input.charAt(2)}));
//            result.add(String.valueOf(new char[]{input.charAt(1), input.charAt(2), input.charAt(0)}));
//            result.add(String.valueOf(new char[]{input.charAt(2), input.charAt(0), input.charAt(1)}));
//            result.add(String.valueOf(new char[]{input.charAt(2), input.charAt(1), input.charAt(0)}));
        }
        return result;
    }

    public static List<String> generateThree(String input){
        List<String> result = new ArrayList<>();
        for(int index=0;index<input.length();index++){
            String subResult = input.substring(0,index)+input.substring(index+1);
            result.add(String.valueOf(input.charAt(index))+generatePermutation(subResult).get(0));
            result.add(String.valueOf(input.charAt(index))+generatePermutation(subResult).get(1));
        }
        return result;
    }

}
