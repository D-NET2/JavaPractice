public class SecondsOfTheYear{
    public static void main(String args[]){
        int DaysInYear = 365;
        int HoursInaDay = 24;
        int MinutesInanHour = 60;
        int SecondsInaMinute = 60;
        
        int SecondsInaYear = (DaysInYear * HoursInaDay * MinutesInanHour * SecondsInaMinute);
        System.out.println("There are " + SecondsInaYear + " seconds in a year");
        
        
    }
}