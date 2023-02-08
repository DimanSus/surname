import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String surname;
        boolean flag = true;


        String [] sn = new String[5];
        for (int i = 0; i < sn.length; i++) {
            sn[i]= scanner.nextLine();
        }
        scanner.close();

        List<String> list2 = Stream.of(sn)
                .filter(s->s.charAt(0)=='J')
                .collect(Collectors.toList());

        System.out.println(list2);

    }
}
