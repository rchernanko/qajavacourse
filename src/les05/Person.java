public class Person {
    
    public int ageYears = 1;
    public int ageDays;
    public long ageMinutes;
    public long ageSeconds;
    public long ageMilliseconds;

public void calculateAge() {
    
    ageDays = ageYears * 365;
    ageSeconds = ageDays * 24 * 60 * 60;
    ageMinutes = ageSeconds / 60;
    ageMilliseconds = ageSeconds * 1000;
    
    System.out.println ("You are " + ageDays + " days old.");
    System.out.println ("You are " + ageSeconds + " seconds old.");
    System.out.println ("You are " + ageMinutes + " minutes old.");
    System.out.println ("You are " + ageMilliseconds + " milliseconds old.");
}
}
