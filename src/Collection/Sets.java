package Collection;
import  java.util.HashSet;
import java.util.Iterator;

public class Sets {
    public  static  void  main(String args[])
    {
        HashSet<String> set = new HashSet<String>();
        HashSet set1 = new HashSet();
        set.add("book");
        set.add("pencil");
        set.add("pen");
        set.add("pen");
        set.add("scale");
        set1.add("me");
        set1.add(987);
        set1.add(875);
        set1.add("mine");
        System.out.println("set is "+set);
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }
            set.remove("pencil");
            if(set.contains("pen"))
            {
                System.out.println("pen is in list");
            }

        System.out.println("set size is "+set.size());
        System.out.println("set 2 is"+set1);

    }
}
