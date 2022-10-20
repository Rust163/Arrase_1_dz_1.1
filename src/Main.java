public class Main {
    public static void main(String[] args) {

        System.out.println();
        int[] array_1 = new int[3];
        array_1[0] = 1;
        array_1[1] = 2;
        array_1[2] = 3;

        double[] array_2 = {1.57, 7.654, 9.986};

        char[] array_3 = {'h', 'e', 'l', 'l', 'o', '!'};

        for (int i = 0; i < array_1.length; i++) {
            System.out.print(array_1[i]);
            if (i != array_1.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();

        for (int i = 0; i < array_2.length; i++) {
            System.out.print(array_2[i]);
            if (i != array_2.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();

        for (int i = 0; i < array_3.length; i++) {
            System.out.print(array_3[i]);
            if (i != array_3.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
//-----------------------------------------
        int[] array_4 = {1, 2, 3};
        for (int i = 0; i <= array_4.length -1; i++) {
            if (array_4[i] % 2 == 1) {
                array_4[i] += 1;
            }
            System.out.println(array_4[i]);


        }

    }

}
