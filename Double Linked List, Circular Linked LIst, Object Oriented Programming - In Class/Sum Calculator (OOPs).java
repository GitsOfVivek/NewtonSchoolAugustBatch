// create class here and its methods as well
 class SumCalculator{
     public int num1;
     public int num2;
 
     SumCalculator(int a,int b){
         this.num1=a;
         this.num2=b;
     }
 
     public int sum(){
         return num1+num2;
     }
 
     public int sum2(int a,int b){
         return a+b;
     }
 
     public int fromObject(SumCalculator obj1,SumCalculator obj2){
         return obj1.sum() + obj2.sum();
     }
 
     // obj1 [2,4].  =6
     // obj2 [6,3].  =9
     // 15
 }
