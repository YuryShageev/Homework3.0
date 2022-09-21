public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1!");
        System.out.println("Целочисленные переменные:");
        byte biteYourLeg = 5;
        short shortPapa = 350;
        int internalAffairs = 45000;
        long longMama = 960000L;
        System.out.println("Значение переменной biteYourLeg с типом byte равно: "+ biteYourLeg);
        System.out.println("Значение переменной shortPapa с типом short равно: " + shortPapa);
        System.out.println("Значение переменной internalAffairs с типом int равно: " + internalAffairs);
        System.out.println("Значение переменной longMama с типом long равно: " + longMama);
        System.out.println("Переменные с плавающей точкой:");
        float floatingRaft = 5.01f;
        double doubleDecker = 8.0000001;
        System.out.println("Значение переменной floatingRaft с типом float равно: " + floatingRaft);
        System.out.println("Значение переменной doubleDecker с типом double равно: " + doubleDecker);

        System.out.println("Task 2!");
        byte b1 = 67;
        short s1 = 549;
        short s2 = -159;
        int i1 = 27897;
        long l1 = 987678965549L;
        float f1 = 27.12f;
        double d1 = 2.786;
        boolean boo1 = b1 >= s1;
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(boo1);

        System.out.println("Task 3!");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short totalPaper = 480;
        int totalStudents = lp + as + ea;
        int papersPerStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги");

        System.out.println("Task 4!");
        byte bottles = 16;
        int bottlesPerMinute = bottles / 2;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesPer20Minutes + " штук.");
        byte day = 1;
        int hoursPerDay = day * 24;
        int minutesPerDay = hoursPerDay * 60;
        int bottlesPerDay = bottlesPerMinute * minutesPerDay;
        System.out.println("За сутки машина произвела бутылок " + bottlesPerDay + " штук.");
        int threeDays = day * 3;
        int hoursPer3Days = hoursPerDay * threeDays;
        int minutesPer3Days = hoursPer3Days * minutesPerDay;
        int bottlesPer3Days = bottlesPerMinute * minutesPer3Days;
        System.out.println("За трое суток машина произвела бутылок " + bottlesPer3Days + " штук.");
        int daysInMonth = day * 30;
        int minutesInMonth = daysInMonth * hoursPerDay * minutesPerDay;
        int bottlesPerMonth = bottlesPerMinute * minutesInMonth;
        System.out.println("За месяц машина произвела бутылок " + bottlesPerMonth + " штук.");

        System.out.println("Task 5!");
        byte totalPaintCans = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int paintCansPerClass = whitePerClass + brownPerClass;
        int totalClasses = totalPaintCans / paintCansPerClass;
        int totalWhiteCans = totalClasses * whitePerClass;
        int totalBrownCans = totalClasses * brownPerClass;
        System.out.println("В школе, где "+ totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        System.out.println("Task 6!");
        byte bananaQuantity = 5;
        byte eachBananaWeight = 80;
        byte milk100Weight = 105;
        int milkQuantity = milk100Weight + milk100Weight;
        byte iceCreamQuantity = 2;
        byte eachIceCreamWeight = 100;
        byte eggQuantity = 4;
        byte eachEggWeight = 70;
        float totalDishWeight = (bananaQuantity * eachBananaWeight) + milkQuantity + (iceCreamQuantity * eachIceCreamWeight) + (eggQuantity * eachEggWeight);
        float totalDishWeightKg = totalDishWeight / 1000;
        System.out.println("Общий вес этого спорт-завтрака " + totalDishWeight + " грамм, или " + totalDishWeightKg + " килограмм");
    }
}