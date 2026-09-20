import java.util.Scanner;

public class BankTransactionReference {

    public static String normalizeReference(String raw) {

        raw = raw.trim();

        if (raw.length() < 3) {
            return raw.toUpperCase();
        }

        return raw.substring(0, 3).toUpperCase()
                + raw.substring(3);
    }

    public static String validateAndFormat(String reference) {

        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        for (int i = 3; i < reference.length(); i++) {

            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9);

        String day = date.substring(0, 2);
        String month = date.substring(2, 4);
        String year = date.substring(4, 6);

        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(bankCode);
        result.append("] DATE: ");
        result.append(day);
        result.append("/");
        result.append(month);
        result.append("/");
        result.append(year);
        result.append(" | SEQ: ");
        result.append(sequence);

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction reference: ");
        String raw = sc.nextLine();

        String reference = normalizeReference(raw);

        System.out.println(validateAndFormat(reference));
    }
}
