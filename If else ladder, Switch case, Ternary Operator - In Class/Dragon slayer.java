static int DragonSlayer(int A, int B, int C,int D){
//Enter your code here
int Do = A - D;
    int No = C;
    while(Do > 0 && No > 0){
        No -= B;
        if(No <= 0) return 0;
        Do -= D;
    }
    if(Do >= No) return 0;
    else return 1;
}
