package expriment_test;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {
        if(args.length<1)
        {
            System.out.println("Please Input Username and Password");
        }
        if(args.length<2)
        {
            System.out.println("Please Input Password");
        }
        System.out.println(sha256hex(args[0]));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

