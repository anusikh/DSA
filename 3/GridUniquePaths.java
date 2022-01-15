// Grid Unique paths
// Recursive and Dynamic Sol

class Main{
    
    
    // recursive sol
    static int sol(int i, int j, int n, int m ){
        
        if(i==(n-1)&&j==(m-1)) return 1;
        if(i>=n || j>=m) return 0;
        else return sol(i+1,j, n, m)+sol(i,j+1, n, m);
       
    }
    
    // dynamic sol
    static int sol(int i, int j, int n, int m, int[][] dp){
        
        if(i==(n-1)&&j==(m-1)) return 1;
        if(i>=n || j>=m) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        else return dp[i][j] = sol(i+1,j, n, m)+sol(i,j+1, n, m);
       
    }
    
    
    
    public static void main (String[] args) {
        int n = 2, m=3;
        int[][] dp={{-1,-1,-1},{-1,-1,-1}};
        System.out.println(sol(0,0,n,m,dp));
    }
}