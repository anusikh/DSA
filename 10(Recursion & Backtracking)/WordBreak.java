// Word Break

//Method1
public boolean solve(String s, List<String> wordDict, String res){
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        for(int i=0; i<s.length();i++){
            String left = s.substring(0,i+1);
            if(wordDict.contains(left)){
                String right = s.substring(i+1);
                solve(right, wordDict, res+left+"");
            }
        }
    }
	
// Method 2 (LeetCode)
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean dp[] = new boolean[n+1];
        dp[0] = true;
        for(int i=0;i<=n; i++){
            for(int j=0;j<i; j++){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}