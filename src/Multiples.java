class Multiples {
    public static void main(String[] args) {

        // Program that prints the number of multiples
        // of 3 or 5 there are, from 1 to 1000, inclusive-
        // ly.

        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) count++;
        }

        System.out.println(count);
    }
}
