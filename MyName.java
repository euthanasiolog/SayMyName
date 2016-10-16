import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Piatrok on 16.10.16.
 */
public class MyName
{
    public static void main (String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String myName = in.readLine();
        System.out.println("My name is " + myName);
    }
}
