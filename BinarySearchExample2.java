package java_with_DSA;

public class BinarySearchExample2 {

    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 11, 13, 15, 17};
        int low = 0, high = arr.length - 1;
        int target = 13;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
            {
                System.out.println(target + " position at " + mid);
                found = true;
                break;
            } 
            else if (arr[mid] < target)
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }

        if (!found) 
        {
            System.out.println("Not found in array:");
        }
    }
}
