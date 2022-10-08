class Solution{
    //public static final long m=1000000007;
    static long power(int x, int y){
        if(y==0)
            return 1;
        if(y==1)
            return x;
        if (y%2 == 1) // if 'y' is odd
        {
            return (long)(x*power(x,y-1)%1000000007);
        }
        else // if 'y' is even
        {
            long m = power(x,y/2);
            return (long)((m*m)%1000000007);
        }
    }
}
