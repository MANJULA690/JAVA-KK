import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SearchingAssignment {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 0;
        int end = x / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x)
                return mid;
            else if ((long) mid * mid < (long) x)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }

    public int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (guess(mid) == 0)
                return mid;
            else if (guess(mid) == 1)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public boolean isBadVersion(int num) {
        return true;
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1)
            return true;
        int start = 2;
        int end = num / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num)
                return true;
            else if ((long) mid * mid < (long) num)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    public int arrangeCoins(int n) {
        if (n <= 2)
            return 1;
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sum = (long) mid * (mid + 1) / 2;
            if (sum == n)
                return mid;
            else if (sum < n)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start % letters.length];
    }

    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start + k;
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (grid[i][j] < 0) {
                count += (m - i);
                j--;
            } else {
                i++;
            }
        }
        return count;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (int num : nums1) {
            if (search(nums2, num)) {
                set.add(num);
            }
        }
        int[] res = new int[set.size()];
        int i = 0;
        for (int num : set) {
            res[i++] = num;
        }
        return res;
    }

    public boolean search(int[] nums, int num) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == num)
                return true;
            else if (nums[mid] < num)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    // alternate
    public int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[set.size()];
        int k = 0;
        for (int num : set) {
            res[k++] = num;
        }
        return res;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }
        return res;
    }

    public int Search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int a : aliceSizes)
            sumA += a;
        for (int b : bobSizes)
            sumB += b;
        int diff = (sumB - sumA) / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int i : bobSizes)
            set.add(i);
        for (int a : aliceSizes) {
            if (set.contains(a + diff)) {
                return new int[] { a, a + diff };
            }
        }
        return new int[] {};
    }

    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j])
                    return true;
            }
        }
        return false;
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int x = 1; x <= n; x++) {
            if (nums[n - x] >= x && (n - x == 0 || nums[n - x - 1] < x)) {
                return x;
            }
        }
        return -1;
    }

    // medium
    public int[] searchRange(int[] nums, int target) {
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        return new int[] { first, last };
    }

    public int search(int[] nums, int target, boolean first) {
        int ans = -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (first) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }

    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];
        int start = 1, end = n - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
