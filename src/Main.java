import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int A = -16687289;
        byte B = 97;
        short C = -32768;
        long D = 580728900;
        float E = -3.75f;
        double F = 2.4f;

        System.out.println("Значение переменной А с типом int = " + A);
        System.out.println("Значение переменной B с типом byte = " + B);
        System.out.println("Значение переменной C с типом short = " + C);
        System.out.println("Значение переменной D с типом long = " + D);
        System.out.println("Значение переменной E с типом float = " + E);
        System.out.println("Значение переменной F с типом double = " + F);

        float G = 27.12f;
        long H = 987678965549l;
        float I = 2.786f;
        short J = 569;
        short K = -159;
        int L = 27897;
        byte M = 67;

        System.out.println("Значение переменной G = " + G);
        System.out.println("Значение переменной H = " + H);
        System.out.println("Значение переменной I = " + I);
        System.out.println("Значение переменной J = " + J);
        System.out.println("Значение переменной K = " + K);
        System.out.println("Значение переменной L = " + L);
        System.out.println("Значение переменной M = " + M);

        float N = 480 / (23+30+27);

        System.out.println("На каждого ученика рассчитано " +  N + " листов бумаги");

        int T = 16*10;
        int T1 = 12*60*16;
        long T2 = T1*3;
        long T3 = T1*30;
        System.out.println("За 20 минут машина произвела " +  T + " штук бутылок");
        System.out.println("За сутки машина произвела " +  T1 + " штук бутылок");
        System.out.println("За 3 суток машина произвела " +  T2 + " штук бутылок");
        System.out.println("За месяц машина произвела " +  T3 + " штук бутылок");

        int Cl = 120/6;
        int whiteCl = Cl*2;
        int brownCl = Cl*4;
        System.out.println("В школе, где " + Cl + " классов, нужно " + whiteCl + " банок белой краски и " + brownCl + " банок белой краски");

        int banana = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int egg = 4*70;
        int[] array = {banana, milk, iceCream, egg};

        float sum = Arrays.stream(array).sum();
        System.out.println("Вес спортзавтрака в граммах = " + sum + " , а к киллограммах  =  " + sum/1000);

        int weight1 = 7000/250;
        int weight2 = 7000/500;
        int weight3 = 7000/ ((500+250)/2);
        System.out.println("Если спортсмен будет терять в день по 250 грамм, то ему потребуется " + weight1 + " дней, чтобы похудеть. Если будет терять в день по 500 грамм, то ему потребуется " + weight2 + " дней, чтобы похудеть. В среднем потребуется, чтобы похудеть " + weight3+ " дней.");

        int wageMasha = 67760;
        int wageDenis = 83690;
        int wageKrist = 76230;
        double newWageMasha = wageMasha*(1+0.1);
        double newWageDenis = wageDenis*(1+0.1);
        double newWageKrist = wageKrist*(1+0.1);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(newWageDenis);

        DecimalFormat decimalFormat1 = new DecimalFormat("#.##");
        String result1 = decimalFormat1.format(Math.abs(wageDenis*12 - newWageDenis*12));

        System.out.println("Маша теперь получает " + newWageMasha + " рублей в год. Годовой доход возрос на " + Math.abs(wageMasha*12 - newWageMasha*12) + " рублей");
        System.out.println("Кристина теперь получает " + newWageKrist + " рублей в год. Годовой доход возрос на " + Math.abs(wageKrist*12 - newWageKrist*12) + " рублей");
        System.out.println("Денис теперь получает " + result + " рублей в год. Годовой доход возрос на " +  result1 + " рублей");

    }
}
