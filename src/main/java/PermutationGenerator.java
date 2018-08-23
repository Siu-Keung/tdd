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
            for(int index=0;index<input.length();index++){
                String subString = input.substring(0,index)+input.substring(index+1);
                List<String> subList = generatePermutation(subString);
                for (int i = 0;i<subList.size(); i++)
                    result.add(String.valueOf(input.charAt(index))+generatePermutation(subString).get(i));

            }
        }
        return result;
    }


}
