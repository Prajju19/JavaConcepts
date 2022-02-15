package Strings;

public class Potato {
    String strng = "Potato";
    public static void main(String args[])
    {

        String str = "potato";

        System.out.println("Hi I am " + str +  " belongs to vegetables");
        String str1 = str.concat(" vegitable");
        System.out.println(str1);
        String str2 = str.replace(str,"tomato");

        System.out.println("now the new vegetable is " + str2);
        int len;
        len = str.length();
        System.out.println("length of potato is " +len);

    }
}
