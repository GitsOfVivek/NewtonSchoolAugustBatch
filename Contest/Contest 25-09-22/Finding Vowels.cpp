#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
    int n;
cin>>n;
string s;
cin>>s;

map<char,int> m;
m['a']=0;
m['e']=0;
m['i']=0;
m['o']=0;
m['u']=0;
int cnt=0, ans=INT_MAX,j=0;
for(int i=0;i<n;i++){
        if(m.find(s[i])!=m.end()){
                if(m[s[i]]==0){cnt++;}
            m[s[i]]++;
        }
        if(cnt==5){
            ans=min(ans,i-j+1);
            while(1){
                if(m.find(s[j])!=m.end()){m[s[j]]--;
                if(m[s[j]]==0){j++;

            break;}

                }
                j++;

            ans=min(ans,i-j+1);
            }
            cnt--;
        }
}
if(ans==INT_MAX)
{cout<<-1;return 0;}
cout<<ans<<endl;
    return 0;
}
