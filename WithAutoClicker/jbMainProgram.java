//made by arielus05

import java.time.LocalDateTime;
import java.io.*;
import java.util.*;

public class jbMainProgram
{
   
   static int hours, minutes, seconds, hoursNeeded, minutesNeeded, finalHours, finalMinutes;
   static String finalTime;
   
   public static void main(String args[]) 
   {
      
   LocalDateTime now = LocalDateTime.now();
   
   String tomorrow = "";
      
   hours = now.getHour();
   minutes = now.getMinute();
   seconds = now.getSecond();
   
   System.out.println("NOTE: THE TIME IS SHOWN IN 24-HOUR TIME!");
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
   
   if ((finalMinutes < 10) && (seconds < 10)) {
      finalTime = finalHours + ":0" + finalMinutes + ":0" + seconds;
   }
   else if (finalMinutes < 10) {
      finalTime = finalHours + ":0" + finalMinutes + ":" + seconds;
   }
   else if (seconds < 10) { 
      finalTime = finalHours + ":" + finalMinutes + ":0" + seconds;
   }
   else {
      finalTime = finalHours + ":" + finalMinutes + ":" + seconds;
   }
   
   System.out.println("The time you have to get on is at --> " + finalTime + tomorrow);
    
   helperProgram helperProgramObject = new helperProgram();
   helperProgramObject.functionJB();
   
   }  
}