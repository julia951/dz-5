public class Main {
    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 3;
        int num3 = 17;
        int num4 = 1;

        int sum1 = num1 + num2;
        int sum2 = num1 + num2;

        boolean isSum1Greater1 = sum1 > sum2;
        System.out.println("Перша сума більша за другу: " + isSum1Greater1);

         sum1 +=  1;
         sum2 +=  2;

        boolean isSum1Greater2 = sum1 > sum2;
        System.out.println("Перша сума більша за другу: " + isSum1Greater2);

        boolean isSumEven = (sum1 % 2 == 0) || (sum2 % 2 == 0);
        System.out.println("Хоча б одна сума кратна 2: " + isSumEven);
    }
}