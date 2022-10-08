static int firstTwo(int N){
//Enter your code here
    int sum = 0;
    while(N>0) {
        int rem = N % 10;
        sum = 10*sum + rem;
        N /= 10;
    }
    return sum % 100;
    
}
