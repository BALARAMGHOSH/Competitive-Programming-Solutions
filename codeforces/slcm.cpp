#include<bits/stdc++.h>
#define ll long long
using namespace std;
vector<int >arr;
vector<ll int> best;
 
set<ll int> final;
 
int gcd(int a, int b)
{
  if(a==0)
    return b;
  return(gcd(b%a,a));
 
 
}
int main()
{
  int t;
  cin>>t;
  while(t--)
  {
    string s1,s2;
    cin>>s1;
    cin>>s2;
    if(s1.length()<s2.length())
    {
      string temp = s2;
      s2 = s1;
      s1 = temp;
    }
    int flag =0;
    int len = s2.length();
    for(int i=0;i<s1.length();i+=len)
    {
      //cout<<"SUB "<<s1.substr(i,len)<<endl;
      if(s1.substr(i,len)!=s2)
      {
        flag =1;
        break;
      }
    }
    if(flag)
    {
      int temp =0;
      string ans = "";
      for(int i = 1;i<s2.length();i++)
      {
        temp =0;
        string sub = s2.substr(0,i);
        for(int j = 0;j<s2.length();j+=i)
        {
          if(s2.substr(j,i)!=sub)
          {
            temp =1;
            break;
          }
        }
        if(!temp)
        {
          ans = sub;
          break;
        }
      }
      if(ans !="")
      {
        int f =0;
        int l = ans.length();
        for(int i=0;i<s1.length();i+=l)
        {
          if(s1.substr(i,l)!= ans)
          {
            f=1;
            break;
          }
        }
        if(f)
        {
          cout<<-1<<endl;
        }
        else
        {
          //cout<<"INISED ELSE";
          int g = gcd(s2.length()/l,s1.length()/l);
          int lcm = ((s2.length()*s1.length())/(l*l))/g;
          //cout<<"LCM "<<g<<" "<<s2.length()<<" "<<s1.length()<<" "<<lcm<<endl;
          for(int i=0;i<lcm;i++)
          {
            cout<<ans;
          }
          cout<<endl;
        }
      }
      else
      {
        cout<<-1<<endl;
      }
 
    }
    else
    {
      cout<<s1<<endl;
    }
  }
}