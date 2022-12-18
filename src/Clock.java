import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class Clock extends JFrame {

    JLabel time = new JLabel();
    String times;
    SimpleDateFormat timeFormat;

    Clock(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setResizable(false);
        this.setTitle("Clock");
        this.setBackground(new Color(225,225,0));
        this.setVisible(true);
        this.add(time,BorderLayout.CENTER);

        time.setFont(new Font("Arial",Font.BOLD,70));
        time.setLayout(new BorderLayout());


        settingTime();
    }

    public void settingTime() {
        while(true){
            times = timeFormat.format(Calendar.getInstance().getTime());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
            time.setText(LocalTime.now().format(formatter));

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
