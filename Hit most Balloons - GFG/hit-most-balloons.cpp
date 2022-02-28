// { Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int mostBalloons(int n, pair<int, int> arr[]) {
        // Code here
       if(n<3)
       return n;
       
       int ans=0;
       
       for(int i=0;i<n-1;i++)
       {   
           int vertical=0,overlap=0,local_ans=0;
           map<pair<int,int>,int>m;
           for(int j=i+1;j<n;j++)
           {
               if(arr[i].first==arr[j].first and arr[i].second==arr[j].second)
               {
                   overlap++;
               }
               else if(arr[i].first==arr[j].first)
               {
                   vertical++;
                   local_ans=max(local_ans,vertical);
               }
               else
               {
                   int a=arr[i].first-arr[j].first;
                   int b=arr[i].second-arr[j].second;
                   
                   int gcd=GCD(a,b);
                   a=a/gcd;
                   b=b/gcd;
                   
                   m[{a,b}]++;
                   local_ans=max(local_ans,m[{a,b}]);
               } 
           }
           
           ans=max(ans,local_ans+overlap+1);
       }
       
       return ans;
    }
    int GCD(int a,int b)
    {
        if(b==0)
        return a;
       
        else
        return GCD(b,a%b);
    }
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        pair<int, int> arr[N];
        for (int i = 0; i < N; i++) {
            cin >> arr[i].first;
        }
        for (int i = 0; i < N; i++) {
            cin >> arr[i].second;
        }
        Solution ob;
        cout << ob.mostBalloons(N, arr) << endl;
    }
}  // } Driver Code Ends