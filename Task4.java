import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите набор чисел");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Set<String> set1 = new HashSet<>();
        for(int i = 0; i<str.length(); i ++){
            set1.add(String.valueOf(str.charAt(i)));
        }
        set1.remove(",");

        System.out.println(set1);
    }

}
