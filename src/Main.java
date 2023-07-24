public class Main {
    public static void main(String[] args) {

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TRUE);

        System.out.println(Character.MAX_RADIX);
        System.out.println(Character.MAX_RADIX);

        System.out.println(String.CASE_INSENSITIVE_ORDER);


        int [] namArray = new int [10];
        int a, b;

        for (int i = 0; i < namArray.length; i++) {
            namArray[i] = (int) (Math.random() * 100);
            System.out.println(namArray[i]);
        }
        a = namArray[0];
        b = namArray[0];
        for (int i = 1; i<namArray.length; i++){
            if (a > namArray[i])
                a = namArray[i];
            else if (b < namArray[i])
                b = namArray[i];

        }
        System.out.println("Мінімальне значення числа: " + a);
        System.out.println("Максимальне значення числа: " + b);

    }
}