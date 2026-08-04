import javax.swing.*;
import java.awt.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class index extends JFrame {
    index() {
        setTitle("Swing Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        setLayout(new GridLayout(10,10));
        
            
        for(int i=0; i<100; i++){
            JButton btn = new JButton("Button " + (i + 1));
            ArrayList<String> list = inputtext();
            String text = list.get(i);
            
            btn.setBackground(
                if() {
                    Color.RED
                } else {
                    Color.GREEN
                }
            );
            add(btn);
        }
        setVisible(true);
    }
    String inputtext() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("pm2.5_69.txt"));
            for (String line : lines) {
                return line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        index in = new index();
        new index();
        in.inputtext();
    }
}