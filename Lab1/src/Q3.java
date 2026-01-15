public class Q3{
    public static void main(String[] args) {

        { // a)
            int x = 10;
            double y = x;
            System.out.println("Case A: " + y);
        }

        { // b)
            double x = 10.5;
            // int y = x; // error
            System.out.println("Case B: Compilation Error (double -> int)");
        }

        { // c)
            double x = 10.5;
            int y = (int) x;
            System.out.println("Case C: " + y);
        }

    }
}

