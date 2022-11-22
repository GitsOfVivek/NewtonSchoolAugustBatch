#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n,q;
    cin>>n>>q;
    map<int,int>m;
    int arr[n+1]={0};
     for(int i=0; i<n; i++)
     {
        int x;
        cin>>x;
          arr[x]++;
     }
     for(int i=1; i<=n; i++)
     {
         arr[i]=arr[i]+arr[i-1];
     }
    while(q--){
        int l,r;
        cin>>l>>r;
         cout<<arr[r]-arr[l-1]<<endl;
   }
}
