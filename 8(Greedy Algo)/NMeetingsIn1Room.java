// N meetings in One romm

// Rain water trapping problem

import java.io.*;
import java.lang.*;
import java.util.*;

class MyComparator implements Comparator<meeting>{
    
    @Override
    public int compare(meeting o1, meeting o2){
        if(o1.finish < o2.finish)
            return -1;
        else if(o1.finish > o2.finish)
            return 1;
        else
            return 0;
    }
    
}

class meeting{
    int start;
    int finish;
    int index;
    meeting(){}
    meeting(int start, int finish, int index){
        this.start = start;
        this.finish = finish;
        this.index = index;
    }
}

class Main {
    
    static void maxMeeting(ArrayList<meeting> meet, int n){
        
        ArrayList<Integer> res = new ArrayList<>();
        
        MyComparator mc = new MyComparator();
        
        Collections.sort(meet, mc);
        
        int endingTime = 0;
        
        res.add(meet.get(0).index);
        endingTime = meet.get(0).finish;
        
        for(int i=1; i<n; i++){
            if(meet.get(i).start > endingTime){
                res.add(meet.get(i).index);
                endingTime = meet.get(i).finish;
            }
        }
        
        for(int x: res){
            System.out.println(x+1+" ");
        }
    }
    
    public static void main (String[] args) {
        
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 }; 

        ArrayList<meeting> meet = new ArrayList<>();
        for(int i = 0; i < s.length; i++)
            meet.add(new meeting(s[i], f[i], i));
        maxMeeting(meet, meet.size());
    }    
}