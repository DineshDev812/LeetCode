class Solution {
    public long countGoodIntegers(int n, int k) {
        // When first n/2 digits are chosen, last n/2 digits are automatically fixed
        // to make the number palindrome.
        // Since n <= 10, we cannot have more than 9*10*10*10*10 = 90000 palindromes
        // So we generate all palindromes first, then for each palindrome 
        // find their permutation.

        // And how to avoid duplicates?
        // Whenever first n/2 digits are fixed, sort them in descending order
        // and add in set. Why in descending? because in ascending, 0 will come first
        // and cause issue

        Set<Long> set = new HashSet<>();
        
        // Step 1: Iterate over all numbers of length n/2
        // Step 2: Iterate over numbers and check divisibility by k
        // Step 3: If divisible by k, check in set if it has already been processed
        // Step 4: Add count of arrangements in ans

        int len = n/2;
        int start = 1;
        int end = 10;
        for(int i=0; i<len-1; i++){
            start *= 10;
            end *= 10;
        }
        end--;

        long ans=0;

        // This is all numbers from start to end
        for(int num = start; num <= end; num++){
            List<Long> palindromes = convertIntToPalindromic(num, n);
            
            for(long palindrome: palindromes){
                if(palindrome%k != 0) continue;

                long largest = getLargestNumber(palindrome);
                if(set.contains(largest)) continue;
                set.add(largest);

                int[] freq = new int[10];
                char[] p = String.valueOf(palindrome).toCharArray();

                for(char c: p) {
                    freq[c-'0']++;
                }

                int denominator = 1;
                for(int f: freq){
                    if(f <= 1) continue;
                    denominator *= factorial(f);
                }

                if(freq[0] > 0){
                    int nume = factorial(n-1);
                    int dino = 1;

                    for(int i=0; i<freq.length; i++){
                        int f = freq[i];

                        if(i == 0){
                            f -= 1; // FIX: always remove one zero (used as leading digit)
                        }

                        if(f > 1){ // FIX: check AFTER decrement, not before
                            dino *= factorial(f);
                        }
                    }

                    ans -= (long) nume/dino;
                }

                ans += (long) factorial(n)/denominator;
            }
        }

        return ans;
    }

    private int factorial(int n){
        int prod = 1;
        for(int i=1; i<=n; i++){
            prod *= i;
        }
        return prod;
    }

    private List<Long> convertIntToPalindromic(long num, int n){
        boolean odd = n%2 != 0;
        List<Long> ans = new ArrayList<>();

        if(n==1){
            ans.add(num);
            return ans;
        }

        List<Integer> digits = new ArrayList<>();
        for (char c : String.valueOf(num).toCharArray()) {
            digits.add(c - '0');
        }

        if(odd){
            for(int j=0; j<=9; j++){
                long number = 0;
                for(int i=0; i<digits.size(); i++) {
                    number = number*10 + digits.get(i);
                }
                number = number*10 + j;
                for(int i=digits.size()-1; i>=0; i--){
                    number = number*10 + digits.get(i);
                }

                ans.add(number);
            }
            return ans;
        }

        long number = 0;
        for(int i=0; i<digits.size(); i++) {
            number = number*10 + digits.get(i);
        }

        for(int i=digits.size()-1; i>=0; i--){
            number = number*10 + digits.get(i);
        }

        ans.add(number);
        return ans;
    }

    private Long getLargestNumber(long number){
        String str = String.valueOf(number);
        char[] digits = str.toCharArray();
        Arrays.sort(digits);

        String result = new StringBuilder(new String(digits))
                            .reverse()
                            .toString();

        return Long.parseLong(result);
    }

}