package inputdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int x = Integer.parseInt(br.readLine());

        String str = br.readLine();
        System.out.println("string value is: " + str);

    }
}
