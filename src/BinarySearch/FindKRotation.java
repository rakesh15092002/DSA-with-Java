package BinarySearch;
import java.util.ArrayList;

public class FindKRotation {
    public static int findKRotation(ArrayList<Integer> nums) {
        int left = 0;
        int right = nums.size() - 1;
        int minVal = Integer.MAX_VALUE;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // if subarray is already sorted
            if (nums.get(left) <= nums.get(right)) {
                if (nums.get(left) < minVal) {
                    index = left;
                    minVal = nums.get(left);
                }
                break;
            }

            // left half is sorted
            if (nums.get(left) <= nums.get(mid)) {
                if (nums.get(left) < minVal) {
                    index = left;
                    minVal = nums.get(left);
                }
                left = mid + 1;
            }

            // right half is sorted
            else {
                if (nums.get(mid) < minVal) {
                    index = mid;
                    minVal = nums.get(mid);
                }
                right = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(findKRotation(arr));
    }

}
