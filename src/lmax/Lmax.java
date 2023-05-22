package lmax;

import java.util.Scanner;

public class Lmax {

    public static void main(String[] args) {
        int x = 0;
        tabuada(x);

    }

    public static void tabuada(int x) {
        Scanner insert = new Scanner(System.in);
        int y = 1, r = 0, ac = 0;
        System.out.println("Digite o valor que deseja obter a tabuada");
        x = insert.nextInt();

        while (y <= 10) {
            if (x == 0) {
                y = 11;
                System.out.println("O valor de todos é 0.");
            } else {
                r = x * y;
                y++;
                ac++;
                System.out.println("a tabuada de " + ac + " do valor " + x + " é: " + r);

            }
        }
    }
}
