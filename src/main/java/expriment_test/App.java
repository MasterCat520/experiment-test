package expriment_test;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String InputUserName=sc.next();
        String InputPassWord=sc.next();
        InputPassWord=sha256hex(InputPassWord);
        String Username="MasterCat";
        String Password=sha256hex("123456");
        if(InputUserName.equals(Username)&&InputPassWord.equals(Password))
            System.out.println("OK");
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

