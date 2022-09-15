static void Pattern(int N){
//Enter your code here
    System.out.println("*");
    for(int i = 1; i <= N-2; i++) {
        for(int j = 1; j <= i+2; j++) {
            if(j == 1 || j == i+2) {
                System.out.print("*");
            }else {
                System.out.print("^");
            }
        }
        System.out.println();
    }

    for(int i = 0; i <= N; i++) {
        System.out.print("*");
    }
}
