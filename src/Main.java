import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Nhap so hang: ");
        x = input.nextInt();
        System.out.println("Nhap so cot: ");
        y = input.nextInt();

        int z[][] = new int[x][y];
        System.out.print("Nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("A[" + i + "]" + "[" + j + "]");
                z[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }

        int max = z[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < z[i][j]) {
                    max = z[i][j];
                }
            }
            System.out.print("Phan tu Max la: " + max);
        }
    }
}