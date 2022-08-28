//made by arielus05, huge credits go to RyiSnow on YT and the people at Stack Overflow for the majority of the code here. I just modified it to work how I wanted it to work :)

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

public class jailbreakProgram {

  JFrame window;
  JLabel counterLabel, counterLabel2;
  Font font1 = new Font("Arial", Font.PLAIN, 40);
  Font font2 = new Font("Arial", Font.PLAIN, 100);
  Timer timer;
  int second, minute, hour;
  String ddSecond, ddMinute, ddHour;
  String url = "https://web.roblox.com/games/606849621/Jailbreak?privateServerLinkCode=77567232553705604082582715178127";
  DecimalFormat dFormat = new DecimalFormat("00");

  public static void main(String args[]) {

      new jailbreakProgram();
  }

  public jailbreakProgram() {

    window = new JFrame();
    window.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(null);
    
    counterLabel = new JLabel("");
    counterLabel.setBounds(175, 300, 400, 200);
    counterLabel.setVerticalAlignment(JLabel.BOTTOM);
    counterLabel.setHorizontalAlignment(JLabel.CENTER);
    counterLabel.setFont(font1);
    
    counterLabel2 = new JLabel("");
    counterLabel2.setBounds(190, 150, 400, 200);
    counterLabel2.setVerticalAlignment(JLabel.CENTER);
    counterLabel2.setHorizontalAlignment(JLabel.CENTER);
    counterLabel2.setFont(font2);
    
    window.add(counterLabel);
    window.add(counterLabel2);
    window.setVisible(true);

    // Countdown Timer
    counterLabel.setText("00:00:00");
    counterLabel2.setText("00:00:00");
    second = 0;
    minute = 0;
    hour = 0;
    countdownTimer();
    timer.start();
    
    // Autoclicker (to not make PC go to sleep)
    try {
      while (true) {
          Robot r = new Robot();
          int button = InputEvent.BUTTON1_DOWN_MASK;
          r.mousePress(button);
          Thread.sleep(400);
          r.mouseRelease(button);
          Thread.sleep(30000);
       }
         
       } catch (Exception a) {
            a.printStackTrace();
         }
  }

  public void countdownTimer() {
    timer = new Timer(1000, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {

        second--;
        ddSecond = dFormat.format(second);
        ddMinute = dFormat.format(minute);
        ddHour = dFormat.format(hour);
        counterLabel.setText(ddHour + ":" + ddMinute + ":" + ddSecond);
        
        if (second == -1) {
          second = 59;
          minute--;
          ddSecond = dFormat.format(second);
          ddMinute = dFormat.format(minute);
          ddHour = dFormat.format(hour);
          counterLabel.setText(ddHour + ":" + ddMinute + ":" + ddSecond);
        }

        if (minute == -1) {
          minute = 59;
          hour--;
          ddSecond = dFormat.format(second);
          ddMinute = dFormat.format(minute);
          ddHour = dFormat.format(hour);
          counterLabel.setText(ddHour + ":" + ddMinute + ":" + ddSecond);
        }

        if (hour == 0 && minute == 0 && second == 0) {
          timer.stop();
          if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
              desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException f) {
              f.printStackTrace();
            }
          } else {
            Runtime runtime = Runtime.getRuntime();
            try {
              runtime.exec("xdg-open " + url);
            } catch (IOException g) {
              g.printStackTrace();
            }
          }
          System.exit(0);
        }
      }
    });
  }
}