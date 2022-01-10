package methods;

import java.util.Scanner;

public class Func {

    private static int myfunc(String s){
        int cont =0;
        for (int i=0;i<s.length();i++){
            cont+=1;
        }
        return cont;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.println(myfunc(s));


    }
}
