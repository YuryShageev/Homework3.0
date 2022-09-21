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
    }
}