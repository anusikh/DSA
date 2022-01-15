// Nth Root of a number binary soirt

// Combination Sum 1

import java.util.*;

class Main{
    
    double multiply(double x, double n){
        double ans = 1.0;
        for(int i=0; i<n;i++){
            ans = ans * x;
        }
        return ans;
    }
    
    void getRoot(double n, double m){
        
        double l = 1.0;
        double h = m;
        double eps = 1e-6;
        
        while((h-l)>eps){
            double mid = (l+h)/2;
            if(multiply(mid, n) < m)
                l=mid;
            else
                h=mid;
        }
        
        System.out.println(l);
        System.out.println(h);
        
    }
    
    
    public static void main (String[] args) {
        Main m = new Main();
        m.getRoot(3.0,27.0);
    }
} 