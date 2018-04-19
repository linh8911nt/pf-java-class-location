public class LocationTest {
    public static void main(String[] args) {
        double[][] listNumber = {{1, 2, 3}, {2, 4, 5}, {1, 2, 4}};
        Location location = new Location();
        System.out.println(location.locateLargest(listNumber));
        for (int i = 0; i < listNumber.length; i++) {
            for (int j = 0; j < listNumber[i].length; j++) {
                System.out.print(listNumber[i][j] + " ");
            }
            System.out.println();
        }
    }
}
