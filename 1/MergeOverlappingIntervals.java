// Merge Overlapping Sub intervals

import java.util.Arrays;

class Interval{
    int begin;
    int end;
    Interval(int begin, int end){
        this.begin = begin;
        this.end = end;
    }
}

class Solution{
    
    
    static void merge(Interval[] intervals){
        
        Arrays.sort(intervals, (a,b)->Integer.compare(a.begin,b.begin));
        
        
        
        int index = 0;
        
        for(int i=1; i< intervals.length; i++){
            if(intervals[index].end >= intervals[i].begin){
                intervals[index].begin= Math.min(intervals[index].begin, intervals[i].begin);
                intervals[index].end= Math.max(intervals[index].end, intervals[i].end);
            }else{
                index++;
                intervals[index] = intervals[i];
            }
        }
        
        for(int k = 0; k<=index; k++){
            System.out.println(intervals[k].begin + " " + intervals[k].end + " ,");
        }
		
		//  2,3 4,7 6,8 index=1 i=2
    }
    
    public static void main (String[] args) {
        Interval[] intervals = new Interval[4];
        intervals[0]=new Interval(6,8);
        intervals[1]=new Interval(1,9);
        intervals[2]=new Interval(2,4);
        intervals[3]=new Interval(4,7);
        
        try{
            merge(intervals);
        }catch(Exception e){
            System.out.println(e);
        };
    }
}