public class Main {
    public static void main(String[] args) {
        //Task 1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        //Task 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Task 3
        for (int i = 0; i < 18; i = (i + 2)) {
            System.out.println(i);
        }

        //Task 4
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        //Task 5
        for (int i = 1904; i < 2096; i = (i + 4)) {
            System.out.println(i + " - високосный год");
        }

        //Task 6
        for (int i = 7; i < 99; i = (i + 7)) {
            System.out.println(i);
        }

        //Task 7
        for (int i = 1; i < 513; i = (i * 2)) {
            System.out.println(i);
        }

        //Task 8
        int investment = 29_000;
        int accumulation = 0;
        for (int i = 0; i < 12; i++) {
            accumulation = accumulation + investment;
            System.out.println("Сумма накоплений в этом месяце равна " + accumulation);
        }

        //Task 9
        int investments = 29_000;
        int accumulations = 0;
        for (int i = 0; i < 12; i++) {
            accumulations = accumulations + accumulation/100;
            accumulations = accumulations + investment;
            System.out.println("Сумма накоплений в этом месяце равна " + accumulations);
        }


    }

}