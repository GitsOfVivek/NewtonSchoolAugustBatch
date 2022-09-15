static int MagicNumber(int N){
//Enter your code here
if(N<=88) return 79;
int number1=N,number2=N;
int ans1=0,ans2=0;
while(number1>0)
{
    int n=number1; int seven=0,nine=0,ex=0;
    while(n>0)
    {
        if(n%10==7) seven=1;
        if(n%10==9) nine=1;
        if(nine==1 && seven==1)
        {
            ans1=number1; ex=1; break;
        }
        n/=10;
    }
    if(ex==1) break;
    number1--;
}
while(number2>0)
{
    int n=number2; int seven=0,nine=0,ex=0;
    while(n>0)
    {
        if(n%10==7) seven=1;
        if(n%10==9) nine=1;
        if(nine==1 && seven==1)
        {
            ans2=number2; ex=1; break;
        }
        n/=10;
    }
    if(ex==1) break;
    number2++;
}
int l,r;
l=N-ans1; r=ans2-N;
if(l<=r) return ans1;
return ans2;
}
