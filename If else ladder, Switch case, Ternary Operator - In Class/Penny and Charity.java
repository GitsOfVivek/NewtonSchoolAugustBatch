static int Charity(int N, int M){
//Enter your code here
    int ans = 0;
    if(M > N) {
        int x = M/N;
        if(x > 1) {
            ans = x;
        }else {
            ans = -1;
        }
    }else {
        ans = -1;
    }
    return ans;
}
