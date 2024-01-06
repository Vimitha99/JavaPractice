public class Demo {

    public static void main(String[] args) {
        int[] array = {12, 23, 35, 67, 879};
        findPythagoreanTriplets(array);
    }

    public static void findPythagoreanTriplets(int[] array) {
        int n = array.length;

        // Check all combinations of triplets
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = array[i];
                    int b = array[j];
                    int c = array[k];

                    // Check if it satisfies the Pythagorean theorem
                    if (isPythagoreanTriplet(a, b, c)) {
                        System.out.println("Pythagorean triplet found: " + a + ", " + b + ", " + c);
                    }
                }
            }
        }
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}
