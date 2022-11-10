// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {

//         // Calculator cal = new Calculator();
//         // cal.add(1, 1);

//     }
// }
// interface ICalculator {
//     public int add();
//     public int add(int a,int b);
//     public int sub();
//     public int sub(int a,int b);
// }
class Calculator implements CalculatorInterface {

    int num1;
    int num2;

    Calculator() {}
    
    Calculator(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int add() {
        return num1+num2;
    }
    public int add(int a,int b) {
        return a+b;
    }
    public int sub() {
        return num1-num2;
    }
    public int sub(int a,int b) {
        return a-b;
    }
}
