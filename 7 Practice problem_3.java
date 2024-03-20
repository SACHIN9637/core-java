
class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    // Constructor to initialize the number of rows and columns of the matrix
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    // Method to set the elements of the matrix
    public void setElements(int[][] elements) {
        if (elements.length != rows || elements[0].length != columns) {
            System.out.println("Invalid number of elements provided.");
            return;
        }
        this.elements = elements;
    }

    // Method to get the number of rows of the matrix
    public int getRows() {
        return rows;
    }

    // Method to get the number of columns of the matrix
    public int getColumns() {
        return columns;
    }

    // Method to get the elements of the matrix
    public int[][] getElements() {
        return elements;
    }

    // Method to display the matrix
    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }


}

public class Main {
    public static void main(String[] args) {
        // Create a 2x3 matrix
        Matrix matrix = new Matrix(2, 3);

        // Example elements for the matrix
        int[][] exampleElements = {
                {1,1,1},
                {3,4,5}
        };

        // Set the elements of the matrix
        matrix.setElements(exampleElements);

        // Display the matrix
        matrix.displayMatrix();
    }
}
