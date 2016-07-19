package assignment4;

public class FirstComeFirstServe {
	
	//This method is used to calculate the waiting time start time and finish time for each job
	public int[][] fcfs(int[] arivaltime,int[] jobsize){
		int no_jobs = arivaltime.length;
		int[] waittime = new int[no_jobs];
		int[] jobfinish = new int[no_jobs];
		int[] startjob = new int[no_jobs];
		int[] job = new int[no_jobs];// no of jobs
		int[][] output = new int[no_jobs+1][no_jobs+1];
		waittime[0] = 0;
		startjob[0] = arivaltime[0];
		jobfinish[0] = waittime[0]+arivaltime[0]+jobsize[0]-1;
		job[0]=1;
		for(int i=1;i<no_jobs;i++){
			if(arivaltime[i]<jobfinish[i-1]){
				waittime[i] = jobfinish[i-1] - arivaltime[i] +1;//plus one for execution will be done in next milli
				startjob[i] = arivaltime[i]+waittime[i];
				jobfinish[i] =  waittime[i]+arivaltime[i]+jobsize[i]-1;
			}
			else{
				waittime[i] = 0;
				startjob[i] = arivaltime[i];
				jobfinish[i] = waittime[i]+arivaltime[i]+jobsize[i]-1;
			}
			job[i]=i+1;
		}
		for(int i=0;i<no_jobs;i++){
			for(int j=0;j<=no_jobs;j++){
				if(j==0)
					output[i][j] = job[i];
				else if(j==1)
					output[i][j] = arivaltime[i];
				else if(j==2)
					output[i][j] = waittime[i];
				else if(j==3)
					output[i][j] = startjob[i];
				else if(j==4)
					output[i][j] = jobfinish[i];
			}
		}
		
		return output;
	}
	
}
