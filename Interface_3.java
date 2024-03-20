// Interface for resizable objects
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle class implementing Resizable interface
class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public void display() {
        System.out.println("Rectangle: Width = " + width + ", Height = " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a rectangle
        Rectangle rectangle = new Rectangle(10, 5);

        // Display initial rectangle
        System.out.println("Initial Rectangle:");
        rectangle.display();

        // Resize the rectangle
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);

        // Display resized rectangle
        System.out.println("\nResized Rectangle:");
        rectangle.display();
    }
}
