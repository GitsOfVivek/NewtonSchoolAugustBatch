#include<bits/stdc++.h>
using namespace std;


int sieve[1000006];
int dp[11][1000006];

int main()
{
	int in =2;
	sieve[1] = 0;
while(in<=1000000)
{
	if(!sieve[in])
	{
		
		int j = 1,num;
		while((num=in*j)<=1000000)
		{
			sieve[num]++;
			j++;
		}	
	}	
	in++;
}	

for(int i =1;i<=10;i++)
{
	for(int j =1;j<=1000000;j++)
	{
		dp[i][j] = dp[i][j-1];
		if(sieve[j]==i)
		dp[i][j] ++;	
	}	
}
int t,x,y,k,ans;
cin>>t;
while(t--)
{
	scanf("%d%d%d",&x,&y,&k);
ans = dp[k][y]-dp[k][x];
	if(ans==0)
	printf("-1\n");
	else
	printf("%d\n",ans);
}

	return  0;
}
