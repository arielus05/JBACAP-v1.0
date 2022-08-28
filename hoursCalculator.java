//made by arielus05

import java.time.LocalDateTime;
import java.io.*;
import java.util.*;

public class hoursCalculator
{
   public static void main(String args[])
   {
   
   LocalDateTime now = LocalDateTime.now();
   int hours, minutes, seconds, hoursNeeded, minutesNeeded, finalHours, finalMinutes;
   String tomorrow = "";
   
   hours = now.getHour();
   minutes = now.getMinute();
   seconds = now.getSecond();
   
   System.out.println("NOTE: THE TIME IS SHOWN IN MILITARY TIME!");
   System.out.println("");

   System.out.println("The current time is... " + hours + "h:" + minutes + "m:" + seconds + "s");
   
   Scanner timeInput = new Scanner(System.in);
   System.out.println("How many hours & minutes are the next set of contracts?"); //format it by saying the number of hours first then minutes. example: "10 59" meaning 10 hours & 59 minutes
   
   hoursNeeded = timeInput.nextInt();
   minutesNeeded = timeInput.nextInt();
   
   finalHours = hours + hoursNeeded;
   finalMinutes = minutes + minutesNeeded;
   
   if (finalMinutes >= 60) {
      finalMinutes = finalMinutes - 60;
      finalHours++;
   }
   
   if ((hours >= 12) && (finalHours >= 24)) {
      finalHours = finalHours - 24;
      tomorrow = " (tomorrow)";
   }
   
   System.out.println("");
   System.out.println("The time you have to get on is at --> " + finalHours + "h:" + finalMinutes + "m:" + seconds + "s" + tomorrow);
   
   }
}