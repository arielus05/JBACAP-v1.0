JBACAP v1.0: Jailbreak-Activate-Contracts-Automatically-Program (Roblox)

To activate contracts in Jailbreak after the time of the current set of contracts is up, you have to be in-game and then a 16h countdown timer starts from the moment you enter in-game.
I know that my friends and I cannot perfectly go in-game every 16h every single time, and so I devised a program that can do it for us!

Made by arielus05 in Java (me), huge credits go to RyiSnow on YT and the people at Stack Overflow for the majority of the code here. 
I just modified it to work how I wanted it to work :)

**If you will not be AFK while having your PC on, use jailbreakProgramWithoutAutoClicker.java instead of jailbreakProgram.java**

-- Overview --
What this does is that the main program (jailbreakProgram.java) counts down the hours, minutes, and seconds that are left until the new set of contracts arrives.
When it does, it opens up a link to a private server and that activates the 16h countdown timer without having to keep track of the time or even being there to do it yourself!

-- Instructions --
*Before downloading the files, you need an IDE that supports Java, and I recommend using either Visual Studio Code or jGRASP to open up and use these files.*
*Also, steps 1 & 2 deal with jailbreakProgram.java only, so if you're using jailbreakProgramWithoutAutoClicker.java, then you can skip those steps*

1. (Windows 10) Go on the search button on the bottom left, type "Change when the PC sleeps", and go on the first result.
2. Then, set to when it is going to go sleep automatically to both Screen & Sleep to 1, 2, 3, or 5 minutes.
-This is so when the program ends and it activates the contracts, it goes to sleep shortly afterwards and you don't have to worry about your PC being on all day.
3. Download the two .java files in the files.
4. Open the two .java files in an IDE.
5. Go on hoursCalculator.java and Jailbreak at the same time to look at how much time you have until the next set of contracts come in.
6. Run hoursCalculator.java by doing Crtl+R and follow what the comments/compile messages tell you to do.
7. After knowing the hours and minutes of the next contracts and the exact time, go on jailbreakProgram.java.
8. Scroll through until you see a comment that says "Countdown Timer" and the two lines of code below it.
9. Change the placeholder values of counterLabel & counterLabel2 (00:00:00) to the hours, minutes, and seconds of the next contracts and the time you have to get on respectively, formatted XX:XX:XX.
10. Directly under counterLabel1 & counterLabel 2, there are placeholder values for seconds, minutes, and hours. Change them to be the hours, minutes, and seconds of the next contracts respectively.
11. Run the program with Ctrl + R and you're set!

-- In The Future -- 
I anticipate that when I have more experience and knowledge in how to code, I will make the process in activating contracts more automatic, but for now, this is the best I can do.

-- Conclusion --
I really hope this program will be helpful for tryhards like me! Maybe I will make more coding projects in the future. :)
