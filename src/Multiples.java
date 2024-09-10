public class Multiples {
    public static void main(String[] args) {
        int i=1;

        while (i < 1000) {

            // Find out which numbers divide i.
            boolean multipleof3 = i % 3 == 0;
            boolean multipleof5 = i % 5 == 0;

            // Print our appropriate result.
            if (multipleof3 && multipleof5 ) {

                System.out.println(i);

            } else if (multipleof3) {

                System.out.println(i);

            } else if (multipleof5) {

                System.out.println(i);

            }
            i++;
        }
    }
    }
