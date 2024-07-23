public class ArraySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int find =9;
        Boolean found = false;
        for (int element : array) {
            if (element == find) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element not found");
        }
    }
}


