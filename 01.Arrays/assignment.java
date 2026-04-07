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

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            res.add(k % 10);
            k /= 10;
        }
        Collections.reverse(res);
        return res;
    }

    public int maximumPopulation(int[][] logs) {
        int[] year = new int[101];
        for (int[] log : logs) {
            year[log[0] - 1950]++;
            year[log[1] - 1950]--;
        }
        int max = 0, population = 0, res = 0;
        for (int i = 0; i < 101; i++) {
            population += year[i];
            if (max < population) {
                max = population;
                res = i;
            }
        }
        return res + 1950;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target))
                return true;
            rotate(mat);
        }
        return false;
    }

    public boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }

    public void rotate(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - 1 - j] = temp;
            }
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public int[] sumZero(int n) {
        int[] res = new int[n];
        int idx = 0;
        for (int i = 1; i <= n / 2; i++) {
            res[idx++] = i;
            res[idx++] = -i;
        }
        return res;
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> rowMin = new ArrayList<>();
        List<Integer> colMax = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            rowMin.add(min);
        }

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            colMax.add(max);
        }

        rowMin.retainAll(colMax);
        return rowMin;
    }

    public int maxSubArray(int[] nums) {
        int curr = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            if (curr > max)
                max = curr;
            if (curr < 0)
                curr = 0;
        }
        return max;
    }
}
