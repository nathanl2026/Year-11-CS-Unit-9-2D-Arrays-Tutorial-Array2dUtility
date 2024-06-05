
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; i++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum += myArray[i][j];
            }
        }
        return sum;
    }


    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] myArray) { //double includes int, returning double because the result for test tab returns double
        int sum = sum(myArray);
        return (double) sum / (myArray.length * myArray.length); //need cast calculations to double because num/denom is an int due to
        //use of "/" function. for ex, 1/3 = 0; 5/2 = 2; java rounds down when performing integer division.
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] myArray) {
        int min = myArray[0][0];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] <= min) {
                    min = myArray[i][j];
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] myArray) {
        int max = myArray[0][0];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] >= max) {
                    max = myArray[i][j];
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] %2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] myArray) {
        int count = 0;
        for (int[] row : myArray) {
            for (int column : row) {
                if (column % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] myArray){
        for (int[] row : myArray) {
            for (int column : row) {
                if (column < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] myArray){
        int[] oneDArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            int sum = 0;
            for (int j = 0; j < myArray[i].length; j++){
                sum += myArray[i][j];
            }
            oneDArray[i] = sum;
        }
        return oneDArray;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] myArray){
        int rows = myArray.length;
        int columns = myArray[0].length;
        int[] oneDArray = new int[myArray[0].length];

        for (int i = 0; i < columns; i++){
            int sum = 0;
            for (int j = 0; j < rows; j++){
                sum += myArray[j][i];
            }
            oneDArray[i] = sum;
        }
        return oneDArray;
    }

}
