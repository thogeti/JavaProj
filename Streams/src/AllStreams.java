import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllStreams {

    public static void main(String[] args)
    {
       List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        List<String> stationeryList2 = stationeryList.stream().distinct().toList();
        System.out.println("distinct:"+stationeryList2);
        //stationeryList = stationeryList.stream().sorted().distinct().toList();
        //System.out.println("distinct:"+stationeryList);♦
        List<String> stationeryList3 = stationeryList.stream().sorted().distinct().toList();
        System.out.println("Sorted:"+stationeryList3);

        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        //Normal Execution
        names.stream().filter((String name) -> name.length() >5 ).skip(1).forEach(System.out::println);
       // System.out.println("Normal Execution:"+names);
        //Parallel Execution

        names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

    }
}
