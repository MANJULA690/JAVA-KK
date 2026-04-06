import java.util.*;;

public class assignment {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] row : accounts) {
            int curr = 0;
            for (int i : row)
                curr += i;
            if (curr > max)
                max = curr;
        }
        return max;
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i : candies) {
            max = Math.max(max, i);
        }
        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >= max);
        }
        return list;
    }

    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26)
            return false;
        boolean[] letters = new boolean[26];
        for (char ch : sentence.toCharArray()) {
            letters[ch - 'a'] = true;
        }

        for (boolean letter : letters) {
            if (!letter)
                return false;
        }
        return true;
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = 0;
        if (ruleKey.equals("type"))
            i = 0;
        else if (ruleKey.equals("color"))
            i = 1;
        else
            i = 2;

        int count = 0;
        for (List<String> item : items) {
            if (item.get(i).equals(ruleValue))
                count++;
        }
        return count;
    }

    public int largestAltitude(int[] gain) {
        int res = 0;
        int alt = 0;
        for (int i = 0; i < gain.length; i++) {
            alt += gain[i];
            res = Math.max(res, alt);
        }
        return res;
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            for (int i = 0; 2 * i < n; i++) {
                if (row[i] == row[n - i - 1]) {
                    row[i] = row[n - i - 1] ^= 1;
                }
            }
        }
        return image;
    }

    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 == 1)
                    count++;
            }
        }
        return count;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (((int) (Math.log10(num)) + 1) % 2 == 0)
                count++;
        }
        return count;
    }

    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
