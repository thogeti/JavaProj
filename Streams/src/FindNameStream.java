import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindNameStream {
 public static void main(String[] args){
    List<String> namesArray = Arrays.asList("Praveen","Chaitanya","Samiksha");

     Map<Boolean, List<String>> nameMap =
             namesArray.stream().collect(Collectors.partitioningBy(i -> i == "Praveen"));

     Set<Entry<Boolean, List<String>>> entrySet = nameMap.entrySet();

    for( Entry<Boolean, List<String>> name :entrySet){
        System.out.println("Names in List:"+name);

        if (name.getKey())
        {
          //
            System.out.println("Name Found");

           List<String> FinalName  = name.getValue();
            for (String i : FinalName)
            {
                System.out.println(i);
            }
        }
        else{
            System.out.println("Name Not Found");
        }
    }


 }
}
