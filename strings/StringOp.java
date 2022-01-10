package strings;

import java.util.Arrays;

public class StringOp {
    public static void main(String[] args) {
        String str ="Light";
        String str2="Lighy";

        System.out.println(str.equals(str2));
        String sc = new String("hi");   // Strings are not primitive type like int, char , its a Class
        System.out.println(sc);

        // Regular expressions :

        String exp ="Hello? How are you? My name is Mursalin!";
        String []sentence= exp.split("[?!]");      // escapes ? and !
        System.out.println(Arrays.toString(sentence));


    }
}
