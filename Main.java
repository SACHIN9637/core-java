  /* 6. Write a Java program to copy an array by iterating the array.*/



class ArrayCopyExample {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5};

        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Original Array: ");
        printArray(originalArray);

        System.out.println("\nCopied Array: ");
        printArray(copiedArray);
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
