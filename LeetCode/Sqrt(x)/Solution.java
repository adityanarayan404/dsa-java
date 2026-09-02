1class Solution {
2    public int mySqrt(int x) {
3        if(x<2) return x;
4
5        long left = 1;
6        long right = x/2;
7
8        while(left<=right){
9            long mid = left+ (right-left)/2;
10            long square = mid*mid;
11
12            if(square==x) return (int) mid;
13
14            if(square<x) left = mid +1;
15            else right = mid-1;
16
17        }
18        return (int) right;
19        
20    }
21}