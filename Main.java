package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b)
            System.out.println("<");
        else if (a > b)
            System.out.println(">");
        else
            System.out.println("=");
    }
}
