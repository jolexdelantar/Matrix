package assignment;

import java.util.Scanner;
public class Main {

    static final int ROWS = 2;
    static final int COLUMNS = 2;
    static int[][] firstMatrix = new int[ROWS][COLUMNS];
    static int[][] secondMatrix = new int[ROWS][COLUMNS];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inputNumbers(firstMatrix, "Matrix A");
        inputNumbers(secondMatrix, "Matrix B");
        displayMatrix();
        displayAndCalculateMatrixAddition();
    }

    //Input/Stored/Check/Catch the Error
    public static void inputNumbers(int[][] arrayOfMatrix, String message) {
        System.out.println(message);
        for (int numberOfRows = 0; numberOfRows < ROWS; numberOfRows++) {
            for (int numberOfColumns = 0; numberOfColumns < COLUMNS; numberOfColumns++) {
                try {
                    while (true) {
                        System.out.print("[" + (numberOfRows + 1) + "]" + "[" + (numberOfColumns + 1) + "] = ");
                        int elementsValue = scanner.nextInt();
                        arrayOfMatrix[numberOfRows][numberOfColumns] = elementsValue;
                        if (elementsValue >= 0 && elementsValue <= 9)
                            break;
                        System.out.println("Can't be Input less than 0 or greater than 9");
                    }
                } catch (Exception error) {
                    System.out.println("Input Error");
                }
            }
        }
    }

    //Display Matrix A and Matrix B
    public static void displayMatrix() {
        System.out.println("\nMatrix A  " + " Matrix B");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(firstMatrix[i][j] + "  ");
                if ((j + 1) == COLUMNS) {
                    System.out.print("     ");
                    for (int x = 0; x < COLUMNS; x++)
                        System.out.print(secondMatrix[i][x] + "  ");
                }
            }
            System.out.print("\n");
        }
    }

    //The best function are those  with no parameters
    public static void displayAndCalculateMatrixAddition() {
        int sumOfTwoMatrix = 0;
        System.out.println("\nResult Matrix  < Output");
        for (int numberOfRow = 0; numberOfRow < ROWS; numberOfRow++) {
            for (int numberOfColumn = 0; numberOfColumn < COLUMNS; numberOfColumn++) {
                sumOfTwoMatrix = firstMatrix[numberOfRow][numberOfColumn] + secondMatrix[numberOfRow][numberOfColumn];
                if(sumOfTwoMatrix>=10)
                    System.out.print(" "+sumOfTwoMatrix);
                else
                    System.out.print("  "+ sumOfTwoMatrix);
            }
            System.out.println();
        }
    }
}








                /*
                //Display Matrix A

            */
                /*Second Input
                System.out.println("MATRIX B ");
                for (int i = 0; i < ROWS; i++) {
                    for (int j = 0; j < COLUMNS; j++) {
                        System.out.print("[" + i + "]" + "[" + j + "] = ");
                        secondMatrix[i][j] = scanner.nextInt();
                    }
                }
                /
                 */