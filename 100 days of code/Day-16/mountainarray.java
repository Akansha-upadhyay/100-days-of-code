/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        // Step 1: Find Peak Index
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1))
                low = mid + 1;
            else
                high = mid;
        }

        int peak = low;

        // Step 2: Search in Increasing Part
        int ans = binarySearch(mountainArr, target, 0, peak, true);
        if (ans != -1) return ans;

        // Step 3: Search in Decreasing Part
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int binarySearch(MountainArray arr, int target,
                             int low, int high, boolean ascending) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = arr.get(mid);

            if (value == target)
                return mid;

            if (ascending) {
                if (value < target)
                    low = mid + 1;
                else
                    high = mid - 1;
            } else {
                if (value < target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }

        return -1;
    }
}
