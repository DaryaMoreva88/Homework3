public class Main {
    public static void main(String[] args) {


        int a = 50;
        System.out.println("Значение переменной " + a + " с типом int" + " равно 50" );
        byte b = 100;
        System.out.println("Значение переменной " + b + " с типом byte" + " равно 100" );
        short c = 200;
        System.out.println("Значение переменной " + c + " с типом short" + " равно 200" );
        long d = 1000;
        System.out.println("Значение переменной " + d + " с типом long" + " равно 1000" );
        float e = 4.5f;
        System.out.println("Значение переменной " + e + " с типом float" + " равно 4.5" );
        double f = 10.5;
        System.out.println("Значение переменной " + f + " с типом double" + " равно 10.5" );

        float chislo = 27.12f;
        long chislo1 = 987678965549L;
        double chislo2 = 2.786;
        boolean chislo3 = false;
        char chislo4 = 569;
        short chislo5 = -159;
        int chislo6 = 27897;
        byte chislo7 = 67;


        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int vsegoBumagi = 480;
        int vsegoUchenikov = class1 + class2 + class3;
        int listovNaUchenika = vsegoBumagi / vsegoUchenikov;
        System. out.println("На каждого ученика рассчитано " + listovNaUchenika + " листов бумаги");


        int bottleHour = 16/2;
        int time = 20;
        int bottle20 = bottleHour * 20;
        System.out.println("За " + time +  " минут машина произвела бутылок " + bottle20 +  " штук ");
        int day = 24 * 60;
        int dayBottle = day * bottleHour;
        System.out.println("За " + day +  " минут машина произвела бутылок " + dayBottle +  " штук ");
        int threeDay = day * 3;
        int time1 = threeDay * bottleHour;
        System.out.println("За " + threeDay +  " минут машина произвела бутылок " + time1 +  " штук ");
        int month = day * 30;
        int bottleMonth = month * bottleHour;
        System.out.println("За " + month +  " минут машина произвела бутылок " + bottleMonth +  " штук ");


        int dye = 120;
        int class12 = 6;
        int dyeClass = dye / class12;
        int whiteDye = dyeClass * 2;
        int brownDye = dyeClass *4;
        System.out.println("В школе, где " + dyeClass + " классов, нужно " + whiteDye + " банок белой краски и " + brownDye + " банок коричневой краски");

        int bananas = 5 * 80;
        int milk =  2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int recipe = bananas + milk + iceCream + eggs;
        float recipeKg = recipe / 1000f ;
        System.out.println("Спортсмен перед тренировкой съедает " + recipe + " грамм или " + recipeKg + "кг еды");

        int weight = 7 * 1000;
        int day1 = 250;
        int day2 = 500;
        int day1Time = weight / day1;
        System.out.println("Спортсмен похудеет на 7 кг за " + day1Time + " дней ");
        int day2Time = weight /  day2;
        System.out.println("Спортсмен похудеет на 7 кг за " + day2Time + " дней " );
        int dayAll = day1Time + day2Time;
        int daysrednee = dayAll / 2;
        System.out.println("В среднем для похудения необходим " + daysrednee + " день " );

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int year = 12;
        float masha1 = masha * 1.1f;
        float denis1 = denis * 1.1f;
        float kristina1 = kristina * 1.1f;
        double beforeMasha = masha * year;
        double afterMasha =  masha1 * year;
        double differenceMasha = afterMasha - beforeMasha;
        double beforeDenis = denis * year;
        double afterDenis =  denis1 * year;
        double differenceDenis = afterDenis - beforeDenis;
        double beforeKristina = kristina * year;
        double afterKristina =  kristina1 * year;
        double differenceKristina = afterKristina - beforeKristina;
        System.out.println("Маша теперь получает " + masha1 + "рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + denis1 + "рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristina1 + "рублей. Годовой доход вырос на " + differenceKristina + " рублей");

    }
}