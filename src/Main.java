import java.text.DateFormatSymbols;
import java.util.Scanner;
class ShortDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();
        scanner.close();
        String[] dateComponents = shortDate.split("-");
        int year = Integer.parseInt(dateComponents[0]);
        int month = Integer.parseInt(dateComponents[1]);
        int day = Integer.parseInt(dateComponents[2]);
        String monthName = getMonthName(month);
        System.out.printf("%s %d, %d%n", monthName, day, year);
    }
    private static String getMonthName(int month) {
        String[] monthNames = new DateFormatSymbols().getMonths();
        return monthNames[month - 1];
    }
}
