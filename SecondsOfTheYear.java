public class SecondsOfTheYear{
    public static void main(String args[]){
        int DaysInYear = 365; //set days in the year as 365
        int HoursInaDay = 24; //set hours in the day as 24 
        int MinutesInanHour = 60;//minutes in an hour is 60
        int SecondsInaMinute = 60;//seconds in a minute is 60
        
        int SecondsInaYear = (DaysInYear * HoursInaDay * MinutesInanHour * SecondsInaMinute); //calculates the seconds in the year
        System.out.println("There are " + SecondsInaYear + " seconds in a year");//prints out the seconds in a year
        
        
    }
}
