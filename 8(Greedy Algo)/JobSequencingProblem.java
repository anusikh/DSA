// Job Sequencing problem

import java.util.*;

class Job{
    int id;
    int deadline;
    int profit;
    Job(){}
    Job(int id, int deadline, int profit){
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}

class JobSequencingProblem{
    
    void jsprob(List<Job> list){
        
        Collections.sort(list, (a,b)-> b.profit-a.profit);
        
        int max = 0;
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i).deadline > max){
                max = list.get(i).deadline;
            }
        }
        
        // System.out.println(max);
        
        int x[] = new int[max];
        for(int i=0; i<max;i++){
            x[i] = -1;
        }
        
        int totalprofit = 0;
        int cntjobs = 0;
        
        for(int i=0; i<list.size(); i++){
            for(int j=list.get(i).deadline-1; j>=0; j--){
                if(x[j]==-1){
                    x[j] = i;
                    cntjobs++;
                    totalprofit+= list.get(i).profit;
                    break;
                }
            }
        }
        
        System.out.println(cntjobs);
        System.out.println(totalprofit);
    }
    
    public static void main (String[] args) {
        JobSequencingProblem j = new JobSequencingProblem();
        
        List<Job> jobs = new ArrayList<Job>();
        
        jobs.add(new Job(1, 2, 100));
        jobs.add(new Job(2, 1, 19));
        jobs.add(new Job(3, 2, 27));
        jobs.add(new Job(4, 1, 25));
        jobs.add(new Job(5, 3, 15));
        
        j.jsprob(jobs);
    }
}