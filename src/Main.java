import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap gia tri phan tu : " + i);
            array[i] = scanner.nextInt();
        }
        int temp= array[1];
        array[1]=array[n-1];
        array[n-1]=temp;
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}