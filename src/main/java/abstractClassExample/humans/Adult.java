package abstractClassExample.humans;

public class Adult extends Human {

    boolean doesHaveAJob;
    String jobPosition;
    public Adult(String name, int age, boolean doesHaveAJob, String jobPosition) {
        super(name, age);
        this.doesHaveAJob = doesHaveAJob;
        this.jobPosition = jobPosition;
    }


    @Override
    public String move() {
        return null;
    }

    @Override
    public String gotoLocation(String location) {
        if (location.equals("work"))
            if (doesHaveAJob) return "I am going to work, I work as a " + jobPosition;
            if (!doesHaveAJob) return "I am " + jobPosition;
            return "Going to " + location;
        }

    public boolean isDoesHaveAJob() {
        return doesHaveAJob;
    }

    public void setDoesHaveAJob(boolean doesHaveAJob) {
        this.doesHaveAJob = doesHaveAJob;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
}

