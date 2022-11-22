static int Factorial(int N){
//Enter your code here	
    if(N < 3) {
        return N;
    }
    return N*Factorial(N-1);
}
