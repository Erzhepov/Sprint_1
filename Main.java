import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printMenu();

        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker();
        tracker.StepTracker();

        while (true) {

            int userInput = scanner.nextInt();
            if (userInput == 1) {
                tracker.StepTracker();

            }else if (userInput == 2) {



        }
        }




    }
        public static void printMenu () {
            System.out.println("Что вы хотите сделать? ");
            System.out.println("0 -  Выйти из приложения");
            System.out.println("1 - Ввести количество шагов за определённый день");
            System.out.println("2 - Напечатать статистику за определённый месяц");
            System.out.println("3 - Изменить цель по количеству шагов в день");

        }




    }
