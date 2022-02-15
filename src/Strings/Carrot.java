package Strings;

public class Carrot {
    String strng = "Carrot";
    public static void main(String args[])
    {
        StringBuffer strn = new StringBuffer("carrot");
        System.out.println("Hi I am "+ strn);
        System.out.println(strn.append("'s colour is orange"));
        StringBuffer str1 = new StringBuffer("welcome");

        System.out.println(str1.insert(0,"Hi "));

    }
}
