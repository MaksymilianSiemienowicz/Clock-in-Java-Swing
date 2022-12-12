import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Clock extends JFrame {

    JLabel time = new JLabel();
    Calendar calendar;
    String times;
    SimpleDateFormat timeFormat;

    Clock(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setResizable(false);
        this.setTitle("Clock");
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        this.add(time,BorderLayout.CENTER);

        time.setFont(new Font("Arial",Font.BOLD,70));
        time.setLayout(new BorderLayout());

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        settingTime();
    }

    public void settingTime() {
        while(true){
            times = timeFormat.format(Calendar.getInstance().getTime());
            time.setText(times);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();;
            }

        }
    }
}
