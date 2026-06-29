import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalAlarmClock extends JFrame {

    private JLabel timeLabel;

    public DigitalAlarmClock() {
        setTitle("Digital Alarm Clock");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));

        add(timeLabel);

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        updateTime();
    }

    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        timeLabel.setText(sdf.format(new Date()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DigitalAlarmClock clock = new DigitalAlarmClock();
            clock.setVisible(true);
        });
    }
}