public class Main {
    public static void main(String[] args) {

        System.out.println();
        int[] array_1 = new int[3];
        array_1[0] = 1;
        array_1[1] = 2;
        array_1[2] = 3;

        double[] array_2 = {1.57, 7.654, 9.986};

        char[] array_3 = {'h', 'e', 'l', 'l', 'o', '!'};

        for (int i = array_1.length -1; i >= 0 ; i--) {
            System.out.print(array_1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array_2.length -1; i >= 0 ; i--) {
            System.out.print(array_2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

            for (int i = array_3.length -1; i >= 0 ; i--) {
                System.out.print(array_3[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
    }

}
