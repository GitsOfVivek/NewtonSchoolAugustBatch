import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

//82 
// 82%10 -> 2
//8


//. 5678
// 8. -> 567
// 7.  -> 56
// 6 ->. 5
// 5 -> 0

// 5 6 7 8



// 20 -> 4 -> 16 -> 37 -> 58 -> 89 -> 145 ->  42 -> 20
// 20 ->4 ->16 -> 37 -> 58............




// x    --- y.    y-   y.   y y.  yy.   y--1000
    public static int changeNumber(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r*r;
            n=n/10;
        }
        return sum;
    }
//20 -> 4 -> 16 -> 37 -> 58 -> 89 -> 145 ->  42 -> 20

// 20->1 4
// 4->1


//4
    public static void findHappy(int n){
        HashMap<Integer,Integer> hm=new HashMap<>();

        while(n!=1 && !hm.containsKey(n)){
            hm.put(n,1);
            n=changeNumber(n);
            //System.out.println(n);
        }


// if(n==1) print true
// print false

// if(n==1)


        System.out.println(n==1);
    }

  //  n+1.  25 , 26
  //  n==1. true,   true
  // false , false

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        findHappy(n);
    }
}


//x -> happy


//19 -> 82-> 68 -> 100 -> 1 happy true
// not happy. false
