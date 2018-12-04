#include <iostream>

using namespace std;

// int a[5]={1,6,7,2,5};
// int n=5;
int a[5]={3,2,2,1,1};
int n=5;
int num=111;
int itr=0;
int mdn(int ,int );

int main()
{
    cout<<mdn(0,0);
   return 0;
}

int mdn(int b,int i)
{
    itr = itr*10+b;
    cout<<itr<<endl;
    if(i==n){
    if(itr == num)
    {
        return itr;
    }
    else
    {
        i=0;
    }
    }
    if(i==n+1)
    {
     if(itr == num)
    {
        return itr;
    }
    else
    {
        i=0;
    }
    }
    //mdn(a[i]+a[i+1],i+2);
    mdn(a[i]-a[i+1],i+2);
  mdn(a[i],i+1);
}
