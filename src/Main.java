public class Main {
    public static void main(String[] args) {
        cheekLeapYears(4);
        definition(1,2016);
        int days = calculatorDays(60);
        System.out.println("Дней потребуется: " +days);
    }

    public static void cheekLeapYears (int years) {
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println("good");
        } else {
            System.out.println("not good");
        }
    }

    public static void definition(int osType, int manufacturingYear) {
        String osString = osType == 0 ? "IOS" : "Android";
        String versionString = manufacturingYear > 2015 ? "Обычную" : "Облегченая";
        System.out.println("Установите " + versionString + " версию для " + osString);
    }

    public static int calculatorDays(int deliveryDays) {
        if (deliveryDays <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDays / 40) + 1;
        }
    }
}