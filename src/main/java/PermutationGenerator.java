import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationGenerator {

    public static List<String> generatePermutation(String input){
        List<String> result = new ArrayList<>();
        if(input.length()==1)
        result =  Arrays.asList(input);
        else if(input.length()==2){
            result =  Arrays.asList(input,input.substring(1,2)+input.substring(0,1));
        }
        return result;
    }

}
