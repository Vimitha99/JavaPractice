public class HelloTriangle {
    public static void main(String[] args) {
        String word = "hello";

        // Iterate over each character in the word
        for (int i = 0; i < word.length(); i++) {
            // Print the substring from the beginning of the word up to the current index
            System.out.println(word.substring(0, i + 1));
        }
    }
}

