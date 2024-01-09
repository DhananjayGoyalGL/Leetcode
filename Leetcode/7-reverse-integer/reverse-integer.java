class Solution {
    public int reverse(int x) {
        long revnum = 0;
     while (x !=0)
     {   int lastdig = x % 10;
        revnum = revnum * 10 + lastdig;
        x = x/10;
    }
    if (revnum > Integer.MAX_VALUE || revnum < Integer.MIN_VALUE){
        return 0;
    }
return (int) revnum;
}
}