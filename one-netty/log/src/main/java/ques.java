import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class ques {

    public static void main(String[] args) throws IOException {

        String c ;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("提示：");

        do {

                c =  bufferedReader.readLine();
                System.out.println(c);

        }while ( !c.equals("end")) ;

    }
}
