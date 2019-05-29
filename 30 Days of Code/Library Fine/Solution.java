import java.io.*;
import java.util.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate returnedDate = getDate(scan);
        LocalDate expectedDate = getDate(scan);
        scan.close();

        Period period = Period.between(expectedDate, returnedDate);

        int fine = 0;
        if (returnedDate.isEqual(expectedDate) || returnedDate.isBefore(expectedDate)) {
            fine = 0;
        } else if (returnedDate.getMonth() == expectedDate.getMonth() && returnedDate.getYear() == expectedDate.getYear()) {
            fine = 15 * (period.getDays());
        } else if (returnedDate.getYear() == expectedDate.getYear()) {
            fine = 500 * period.getMonths();
        } else {
            fine = 10000;
        }
        System.out.println(fine);
        
    }

    private static LocalDate getDate(Scanner scanner) {
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        return LocalDate.of(year, month, day);
    }
}

