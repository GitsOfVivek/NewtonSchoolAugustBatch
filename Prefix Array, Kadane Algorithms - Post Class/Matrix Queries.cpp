#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
    int n,m,q;
    cin>>n>>m;
    int arr[n][m];
    for(int i=0;i<n;i++){

        for(int j=0;j<m;j++){
            cin>>arr[i][j];
        }
    }
    cin>>q;
    while(q-->0){
        int x1,x2,y1,y2,sum=0;
        cin>>x1>>y1>>x2>>y2;
        for(int i=x1-1;i<x2;i++){
            for(int j=y1-1;j<y2;j++){
                sum=sum+arr[i][j];
            }
        }
        cout<<sum<<endl;
    }
    return 0;
}
