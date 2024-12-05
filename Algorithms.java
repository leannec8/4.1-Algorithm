import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    private static Scanner e;
    private static Scanner l;
    private static Scanner m;
    private static Scanner o;
    private static Scanner w;
    private static Scanner y;
    private static Scanner a;
    private static Scanner b;
    private static int[] nums = new int [1000];
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int two_digits = two_digits();
        int greater_than_500 = greater_than_500();
        int greatest_value = greatest_value();
        int smallest_value = smallest_value();
        int sum = sum();
        double avg = avg();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(two_digits);
        System.out.println(greater_than_500);
        System.out.println(greatest_value);
        System.out.println(smallest_value);
        System.out.println(sum);
        System.out.println(avg);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        e = new Scanner(f);
        int evens = 0;
        while (e.hasNext()) {
            if (e.nextInt() % 2 == 0)
                evens ++;
        }
        return evens;
    }

    public static int two_digits() throws FileNotFoundException{
        l = new Scanner(f);
        int two_digits = 0;
        while (l.hasNext()) {
            int next = l.nextInt();
            if (next >= 10 && next < 100)
                two_digits++;
        }
        return two_digits;
    }

    public static int greater_than_500() throws FileNotFoundException{
        m = new Scanner(f);
        int greater_than_500 = 0;
        while (m.hasNext()) {
            if (m.nextInt() > 500)
                greater_than_500 ++;
        }
        return greater_than_500;
    }

    public static int greatest_value() throws FileNotFoundException{
        o = new Scanner(f);
        int greatest_value = 0;
        while (o.hasNext()) {
            int next = o.nextInt();
            if (next > greatest_value)
                greatest_value = next;
        }
        return greatest_value;
    }

    public static int smallest_value() throws FileNotFoundException{
        w = new Scanner(f);
        int smallest_value = 0;
        while (w.hasNext()) {
            int next = w.nextInt();
            if (next < smallest_value)
                smallest_value = next;
        }
        return smallest_value;
    }

    public static int sum() throws FileNotFoundException{
        y = new Scanner(f);
        int sum = 0;
        while (y.hasNext()) {
            int i = y.nextInt();
            if (i != 0)
                sum = sum + i;
        }
        return sum;
    }

    public static double avg() throws FileNotFoundException{
        a = new Scanner(f);
        double avg = sum();
        double total = 0;
        while (a.hasNext()) {
            a.next();
            total ++;
        }
        avg = avg / total;
        return avg;
    }

    // public static int mode() throws FileNotFoundException{
    //     b = new Scanner(f);
    //     int count = 0;
    //     int num = 0;
    //     // while (b.hasNext()) {
    //     //     int next = b.nextInt();
    //     //     if (next == )
    //     // }
    //     while (b.hasNext() && num != 1000) {
    //         if ((int) nums [s.nextInt()] == num) count ++;
    //             num++;
    //     }
    // }




//150 298