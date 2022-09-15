static void Print_Digits(int N){
//Enter your code here
    int rem, num = 0;
    while(N > 0) {
        rem = N % 10;
        N /= 10;
        num = num*10 + rem;
    }
    while(num > 0) {
        rem = num % 10;
        num /= 10;
        switch(rem) {
            case 0 : System.out.print("zero ");
            break;
            case 1 : System.out.print("one ");
            break;
            case 2 : System.out.print("two ");
            break;
            case 3 : System.out.print("three ");
            break;
            case 4 : System.out.print("four ");
            break;
            case 5 : System.out.print("five ");
            break;
            case 6 : System.out.print("six ");
            break;
            case 7 : System.out.print("seven ");
            break;
            case 8 : System.out.print("eight ");
            break;
            default : System.out.print("nine ");
        }
    }
}
