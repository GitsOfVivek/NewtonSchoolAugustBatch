static int Icecreams (int N, int D){
//Enter your code here
    for(int i = 1; i <= D; i++) {
        N = N - N/2;
        N *= 3;
    }
    return N;
}
