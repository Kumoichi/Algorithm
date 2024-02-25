import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Job
{
    int id;
    int startTime;
    int finishTime;

    public Job(int id, int startTime, int finishTime){
        this.id = id;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

}
class IntervalScheduling
{

    public static List<Integer> intervalScheduling(List<Job> jobs)
    {
        List<Integer> schedule = new ArrayList<>();

        Collections.sort(jobs, Comparator.comparingInt(j -> j.finishTime));
        schedule.add(jobs.get(0).id);

        int LastFinishTime = jobs.get(0).finishTime;
        for(int i = 1; i < jobs.size(); i++)
        {
            if(jobs.get(i).startTime >= LastFinishTime)
            {
                schedule.add(jobs.get(i).id);
                LastFinishTime = jobs.get(i).finishTime;
            }
        }

        return schedule;
    }

    public static void main(String[] args)
    {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job(1, 1, 3));
        jobs.add(new Job(2, 3, 9));
        jobs.add(new Job(3, 5, 6));
        jobs.add(new Job(4, 7, 8));
        jobs.add(new Job(5, 10, 15));


        List<Integer> result = intervalScheduling(jobs);
        System.out.println("Schedule: " + result);
    }
}