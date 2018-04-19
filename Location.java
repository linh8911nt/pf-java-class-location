public class Location {
    public static int row;
    public static int column;
    public static double maxValue;

    public Location() {
    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] listNumber){
        maxValue = listNumber[0][0];
        Location locationMaxNumber = new Location();

        for (int i = 0; i < listNumber.length; i++) {
            for (int j = 0; j < listNumber[i].length; j++) {
                if (maxValue < listNumber[i][j]){
                    maxValue = listNumber[i][j];
                    locationMaxNumber.setRow(i);
                    locationMaxNumber.setColumn(j);
                    locationMaxNumber.setMaxValue(maxValue);
                }
            }
        }
        return locationMaxNumber;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public String toString() {
        return "Location max value " + maxValue +
                " is {" + row +
                ", " + column + "}";
    }
}
