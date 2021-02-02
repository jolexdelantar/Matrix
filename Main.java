package assignment;

import java.util.Scanner;
public class Main {

    static final int ROWS = 3;
    static final int COLUMNS = 3;
    static int[][] arrayOfElements = new int[ROWS][COLUMNS];
    static int[][] firstMatrix = new int[ROWS][COLUMNS];
    static int[][] temporary = new int[ROWS][COLUMNS];
    static int[][] secondMatrix = new int[ROWS][COLUMNS];

/*
Ex:
[Row][COLUMN]
[0][0] = 4;
[0][1] = 5;
[1][0] = 7;
[1][1] = 8;
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] firstMatrix = new int[ROWS][COLUMNS];
        int[][] secondMatrix = new int[ROWS][COLUMNS];


        //First Input
        System.out.println("MATRIX A ");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] = ");
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        //Second Input
        System.out.println("MATRIX B ");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] = ");
                secondMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        //Display Matrix A
        System.out.println("Matrix A  "  + "   Matrix B");

        for(int i = 0;i<ROWS;i++){
                for(int j = 0;j<COLUMNS;j++){
                    System.out.print(firstMatrix[i][j] + "  ");
                    if((j+1) == COLUMNS) {
                        System.out.print("     ");
                        for (int x = 0; x < COLUMNS; x++)
                            System.out.print(secondMatrix[i][x] + "  ");
                    }
                }
            System.out.print("\n");
        }
    }
}
        /*   inputCheckedStoredNumbers("Matrix A ") ;
        firstMatrix = temporary;
        System.out.println(firstMatrix);
        inputCheckedStoredNumbers("Matrix B ");
        secondMatrix = temporary;
        System.out.println(secondMatrix);


    }

    public static void inputCheckedStoredNumbers(String message) {
        System.out.println(message);
        int elementsValue = 0;
        for (int numberOfRows = 0; numberOfRows < ROWS; numberOfRows++) {
            for (int numberOfColumns = 0; numberOfColumns < COLUMNS; numberOfColumns++) {
                try {
                    while (true) {
                        System.out.print("[" + numberOfRows + "]" + "[" + numberOfColumns + "] = ");
                        elementsValue = scanner.nextInt();
                        arrayOfElements[numberOfRows][numberOfColumns] = elementsValue;
                        if (elementsValue >= 0 && elementsValue <= 9)
                            break;
                        System.out.println("Can't be Input less than 0 or greater than 9");
                    }
                } catch (Exception error) {
                    System.out.println("Input Error");
                }
            }
            System.out.println();
        }
        temporary = arrayOfElements;

    }

    public static void displayEachElement(String message) {
        System.out.println(message);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(arrayOfElements[i][j] + " ");
            }
            System.out.println();
        }
    }

}
        /*
        int elementsValue = 0;
        for (int numberOfRows = 0; numberOfRows < ROWS; numberOfRows++) {
            for (int numberOfColumns = 0; numberOfColumns < COLUMNS; numberOfColumns++) {
                try {
                    while (true) {
                        elementsValue = scanner.nextInt();
                        arrayOfElements[numberOfRows][numberOfColumns] = elementsValue;
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

*/
