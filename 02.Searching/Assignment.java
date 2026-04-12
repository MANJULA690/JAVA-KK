public class Assignment {
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

    public int guessNumber(int n) {
        int start=1, end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == 1) start=mid+1;
            else end=mid-1;
        }
        return -1;
    } 

    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start < end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid;
            } else{
                start=mid+1;
            }
        }
        return start;
    }

    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1) return true;
        int start=2;
        int end=num/2;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(mid*mid == num) return true;
            else if((long) mid*mid < (long)num) start=mid+1;
            else end=mid-1;
        }
        return false;
    }

    public int arrangeCoins(int n) {
        if(n<=2) return 1;
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            long sum= (long)mid * (mid+1)/2;
            if(sum == n) return mid;
            else if(sum < n) start=mid+1;
            else end=mid-1;
        }
        return end;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start=0, end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid] > target) end=mid-1;
            else start=mid+1;
        }
        return letters[start % letters.length];
    }
}
