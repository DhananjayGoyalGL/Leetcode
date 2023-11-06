class Solution {
    public boolean isPalindrome(int x) {
     int reverse = 0;
     int y = x;
     while(x > 0){
         int lastdigit = x % 10;
         reverse = reverse * 10 + lastdigit;
         x = x/10;
     }
     if(reverse == y) { return true;}
     else { return false;}
    }
}