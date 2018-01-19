import java.util.Scanner;

    public class Number {
        public static void main(String[] args) {

            int Num, UserNum, TrysCount=0;

            Scanner input = new Scanner(System.in);

            Num = (int) Math.floor(Math.random() * 10 + 1);

            do {
                TrysCount++;
                System.out.print("Введите ваше число: ");

                UserNum = input.nextInt();

                if (UserNum > Num)
                    System.out.println("Число меньше.");

                else if (UserNum < Num)
                    System.out.println("Число больше.");

                else
                    System.out.println("Вы угадали!");
                if (TrysCount == 3) {
                    System.out.println("попытки закончились");
                }
            }
            while (Num!=UserNum);
            while (TrysCount != 3);

                System.out.println("Количество попыток:  " + TrysCount);

            }
        }
