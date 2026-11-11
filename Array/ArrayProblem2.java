import java.util.Arrays;

public class ArrayProblem2 {
    public static void main(String[] args) {                // Ang pangunahing paraan (method) kung saan nagsisimula ang pagtakbo ng Java

        // Task 1: Nagdedeklara at nag-i-initialize ng 2D String array na may pangalang seats gamit ang ibinigay na data
        String[][] seats = {
                {"Alice", "Bob", "Charlie"},                     // Row 0 : mga upuan para kina Alice, Bob, at Charlie
                {"David", "Emma", "Frank"}                       // Row 1 : mga upuan para kina David, Emma, at Frank
        };

        // Task 2: Ina-access at ini-print ang nakaupo sa ikalawang row at ikatlong column (Frank)
        // Note: Ang index ng row 2 ay [1] at ang column 3 ay [2] dahil nagsisimula sa 0 ang indexing.
        System.out.println("Person in 2nd row, 3rd column: " + seats[1][2]);

        // Task 3: Pinapalitan ang "Bob" ng "Vacant" sa array. Si Bob ay nasa row 0, column 1.
        seats[0][1] = "Vacant";

        // Task 4: Ginagamit ang Arrays.deepToString() para i-print ang buong 2D array sa isang linya
        System.out.println("Updated Seating Arrangement: " + Arrays.deepToString(seats));

    }
}
