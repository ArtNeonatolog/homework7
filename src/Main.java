public class Main {
    public static void main(String[] args) {
        part1Task1();
        part1Task2();
        part1Task3();
        part2Task1();
        part2Task2();
        part2Task3();
        part2Task4();
        part3Task1();
        part3Task2();
    }

    private static void part3Task2() {
        System.out.println("Часть 3. Задание 2");
        int a = 2;
        for(int i = 1; i <= 10; i ++){
            int b = a * i;
            System.out.print(" " + b);
        }
    }
    private static void part3Task1() {
        System.out.println("Часть 3. Задание 1");
        int yearUntil200YearsBeforeThisYear = 1822; // 200 лет назад от текущего года
        int yearFuture100YearsAfterThisYear = 2122; // 100 лет вперед от текущего года
        for (int yearComet = 0; yearComet >= 0; yearComet += 79){
            if(yearComet >= yearUntil200YearsBeforeThisYear && yearComet <= yearFuture100YearsAfterThisYear){
                System.out.println(yearComet);
            }
        }
        System.out.println();
    }

    private static void part2Task4() {
        System.out.println("Часть 2. Задание 4");
        int daysInMonth = 31;

        for(int firstFriday = 3; firstFriday <= daysInMonth; firstFriday += 7){
            System.out.println("Сегодня пятница " + firstFriday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
    }

    private static void part2Task3() {
        System.out.println("Часть 2. Задание 3");
        int cash = 15_000;
        int cashPercentInMes = 15000 / 100 * 7;
        int cashPercentInHalfYear = cashPercentInMes * 6;  //за полгода проценты
        int totalCash = 15_000;
        for (int halfYear = 1; halfYear <= 18; halfYear ++){
           totalCash = totalCash +  cashPercentInHalfYear;
            System.out.println("За " + halfYear + " полугодие сумма накопления равна " + totalCash);  //период накопления 9 лет
        }
        System.out.println();
    }

    private static void part2Task2() {
        System.out.println("Часть 2. Задание 2");
        int cash = 15_000;
        int totalCash = 15_000;
        for (int mes = 1; totalCash <= 12_000_000; mes ++) {  //каждый 6 месяц
            if (mes % 6 == 0) {
                cash = cash + cash / 100 * 7;
                totalCash = totalCash + cash;
                System.out.println(mes + " месяц - сумма накоплении равна " + totalCash);
            }
        }
        System.out.println();
    }

    private static void part2Task1() {
            System.out.println("Часть 2. Задание 1");
            int cash = 15_000;
            int totalCash = 15_000;
            for (int mes = 1; totalCash <= 12_000_000; mes++) {
                cash = cash + cash / 100 * 7;
                totalCash = totalCash + cash;
                System.out.println(mes + " месяц - сумма накоплении равна " + totalCash);
        }
        System.out.println();
    }

    private static void part1Task3() {
        System.out.println("Задание 3");
        int paisY = 12_000_000;
        int fertilityInYear = 12_000_000 / 1000 * 17;  //Рождаемость пересчет на 12 млн
        int mortalityInYear = 12_000_000 / 1000 * 8;   //Смертность пересчет на 12 млн
         for (int year = 1; year <= 10; year ++){
             paisY = paisY + fertilityInYear - mortalityInYear;
             System.out.println("Год " + year + ", численность населения составляет " + paisY);
         }
        System.out.println();
    }
    private static void part1Task2() {
        System.out.println("Задание 2");
        int number = 0;
         while (number < 10){
            number ++;
            System.out.print(" " + number);}

        System.out.println();

         for (int number2 = 10; number2 <= 10 && number2 >=1; number2 --){
                System.out.print(" " + number2);
            }
        System.out.println();
        }


    private static void part1Task1() {
        System.out.println("Задание 1");
        int salary = 29000;
        int totalSalary = 0;
        int mes = 1;
        while (totalSalary <= 2_459_000) {
                salary = salary + salary / 100;
                totalSalary = salary + totalSalary;
                mes ++;
            }
            System.out.println("Месяц " + mes + ",сумма накоплений равна " + totalSalary + " рублей");
        }
    }



