import java.util.*;

public class TwoPointersCustomInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Taking array elements
        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking target value
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Finding the pair
        int left = 0, right = n - 1;
        boolean found = false;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                System.out.println("Pair found: " + nums[left] + " + " + nums[right] + " = " + target);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found with the given target.");
        }

        sc.close();
    }
}
