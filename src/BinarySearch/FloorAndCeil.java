package BinarySearch;

public class FloorAndCeil {
    public static int[] floorAndCeil(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;
        int ceil = -1;

        // Find floor (greatest element <= target)
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Reset for ceil (smallest element >= target)
        left = 0;
        right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                ceil = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 11, 12};
        int target = 7;
        int[] res = floorAndCeil(arr, target);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
