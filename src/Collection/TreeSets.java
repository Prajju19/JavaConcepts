package Collection;
import  java.util.TreeSet;

public class TreeSets {
    public static void main(String args[])
    {
       TreeSet<String> set = new TreeSet<String>();
       TreeSet<Integer> set1 = new TreeSet();
       set.add("physics");
       set.add("Chemisrty");
       set.add("Biology");
       set.add("maths");
       set1.add(789);
       set1.add(256);
        System.out.println("set is "+ set1);
        System.out.println("set is "+ set);
    }
}
