package java_with_DSA;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String input = "Java is fun";
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        System.out.println("Reversed: " + reversed.toString().trim());
    }
}
