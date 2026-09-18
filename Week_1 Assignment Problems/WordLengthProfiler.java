public class WordLengthProfiler {

    public static void classifyWordLengths(String review) {

        String[] words = review.split(" ");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length <= 4) {
                shortWords++;
            } 
            else if (length <= 8) {
                mediumWords++;
            } 
            else {
                longWords++;
            }
        }

        System.out.println("Short: " + shortWords);
        System.out.println("Medium: " + mediumWords);
        System.out.println("Long: " + longWords);
    }

    public static void main(String[] args) {

        classifyWordLengths(
            "This movie was absolutely fantastic and thrilling"
        );
    }
}