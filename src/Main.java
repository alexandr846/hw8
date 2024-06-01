public class Main {
    public static void main(String[] args) {
        System.out.println("Задача-1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {11, 22, 33};

        System.out.println("Задача-2");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }

        }
        System.out.println();
        System.out.println("Задача-3");
        for (int j = a.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.println(a[j]);
            } else {
                System.out.print(a[j] + ", ");
            }
        }
        for (int j = a.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.println(b[j]);
            } else {
                System.out.print(b[j] + ", ");
            }
        }
        for (int j = a.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.println(c[j]);
            } else {
                System.out.print(c[j] + ", ");
            }

        }
        System.out.println();
        System.out.println("Задача-4");
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 != 0) {
                a[j]++;
            }

            System.out.print(a[j] + " ");
        }

    }
}





