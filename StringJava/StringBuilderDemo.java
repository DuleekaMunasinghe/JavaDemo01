package StringJava;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder str =new StringBuilder("Welcome to Java");
        System.out.println(str);
        System.out.println(str.length());
        str.setLength(10);
        System.out.println(str);
    }
}