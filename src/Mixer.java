import java.util.*;

class Mixer {
    int arr[];

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    Mixer mix(Mixer A) {
        Mixer result = new Mixer();
        result.arr = new int[this.arr.length + A.arr.length];

        int i = 0, j = 0, k = 0;

        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j])
                result.arr[k++] = this.arr[i++];
            else
                result.arr[k++] = A.arr[j++];
        }

        while (i < this.arr.length)
            result.arr[k++] = this.arr[i++];

        while (j < A.arr.length)
            result.arr[k++] = A.arr[j++];

        return result;
    }

    void display() {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();

        m1.accept();
        m2.accept();

        Mixer m3 = m1.mix(m2);
        System.out.println("Merged Array:");
        m3.display();
    }
}
