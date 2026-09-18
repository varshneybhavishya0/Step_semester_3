public class TrafficStreak {

    public static void findLongestStreak(String signalLog) {

        char current = signalLog.charAt(0);
        char longest = current;

        int count = 1;
        int max = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == current) {
                count++;
            } 
            else {
                current = signalLog.charAt(i);
                count = 1;
            }

            if (count > max) {
                max = count;
                longest = current;
            }
        }

        System.out.println("Longest Streak: '"
                + longest + "' repeated " + max + " times");
    }

    public static void main(String[] args) {

        findLongestStreak("RRGGGYRR");
    }
}