import java.util.Scanner;

public class StepTracker {
    MonthToData[] Daydata;

    MonthToData[] months = new MonthToData[12];

    void StepTracker () {
        for (int i = 0; i < months.length; i++) {
            months[i] = new MonthToData();
        }
        System.out.println("Выберите месяц?");
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        if (month >= months.length) {
            System.out.println("Неправильный выбор!");
            return;
        }

        if (month < 0) {
            System.out.println("Неправильный выбор!");

            return;
        }
        MonthToData currentMonth = months[month];

        System.out.println("Выберите день?");
        int day = scanner.nextInt();
        if (day >= currentMonth.days.length) {
            System.out.println("Неправильный выбор, попробуйте еще раз!");
            return;
        }
        if (day < 0) {
            System.out.println("Дни не бывают отрицательными, попробуйте еще раз");
            return;
        }
        DayData currentDay = currentMonth.days[day];

        System.out.println("Сколько вы сегодня сделали шагов?");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Видимо вы ошиблись, попробуйте еще раз");
            return;
        }
        currentDay.current = steps + currentDay.current;
        System.out.println("Ваш прогресс " + currentDay.current);

    }



}


