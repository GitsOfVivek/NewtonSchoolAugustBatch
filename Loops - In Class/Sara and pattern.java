static void Pattern(int N){
//Enter your code here
    int num = 0;
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
            System.out.print(num + " ");
            num += 4;
        }
        System.out.println();
        num = 6*i + 6;
    }
}
