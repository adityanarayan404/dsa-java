
class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        boolean negative = exp < 0;

        if (negative) {
            exp = -exp;
        }

        double ans = power(x, exp, 1.0);

        if (negative) {
            return 1.0 / ans;
        } else {
            return ans;
        }
    }

    double power(double x, long n, double ans) {
        if (n == 0) {
            return ans;
        }

        if (n % 2 != 0) {
            ans *= x;
        }

        return power(x * x, n / 2, ans);
    }
}



//         long exp = n;

//         if(exp < 0){
//             x = 1/x;
//             exp = -exp;
//         }
//         double ans = 1;

//         while(exp > 0){
//             if(exp%2 != 0) //if n is odd 
//             {
//                 ans *= x;

//             }
//             x *= x;
//             exp /=2;
            
//         }
//         return ans;
//     }
// }