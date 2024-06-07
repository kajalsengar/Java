package basics.StringProblems;

public class ConvertString {
    public static void main(String[] args) {
        char c='K';
        String str= "kajal";

       // String st= String.valueOf(c);

        String st= Character.toString(c);
        System.out.println("string is: "+c);

        char ch = str.charAt(0);
        System.out.println("char is: "+ch);
    }
}
