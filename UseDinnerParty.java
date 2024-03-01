import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// creates frame
public class UseDinnerParty extends JFrame {
    final int FRAME_WIDTH = 400;
    final int FRAME_HEIGHT = 400;

    public UseDinnerParty() {
        setTitle("Party");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Creates title
        JPanel titleBar = new JPanel();
        titleBar.setPreferredSize(new Dimension(FRAME_WIDTH, 30));
        titleBar.setBackground(new Color(158, 143, 82));
        //Creates components
        JLabel heading = new JLabel("Party");
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        JTextField guestsNum2 = new JTextField();
        JTextField DinnerMen = new JTextField();
        JTextField creatpow = new JTextField();
        JTextField dinnerChoiceTextField = new JTextField();
        //Creates labels
        JLabel labelguestsNum = new JLabel("How many guests are coming: ");
        JLabel labelDinnerMen = new JLabel("How many guests are coming to dinner: ");
        JLabel labelcreatpow = new JLabel("What would you like to send a message to the guest: ");
        JLabel labelDinnerCho = new JLabel("What would you like for dinner order 1 chicken or order 2 salad: ");

        JButton button = new JButton("Confirm");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//when button clicked
                Party party = new Party();
                DinnerParty dinnerParty = new DinnerParty();
                DinnerParty DinnerCho = new DinnerParty();
                // Retrieve values from the user input
                int guestsNum = Integer.parseInt(guestsNum2.getText());
                party.setGuestsNum(guestsNum);
                int dinnerGuests = Integer.parseInt(DinnerMen.getText());
                dinnerParty.setDinnerNum(dinnerGuests);
                int dinnerChoT = Integer.parseInt(dinnerChoiceTextField.getText());
                DinnerCho.setDinnerCho(dinnerChoT);
                String creatpowText = creatpow.getText();
                String thing;
                // Determines what dinner choice
                if (dinnerParty.getDinnerCho() == 1){
                    thing = "chicken";
                }
                else{
                    thing = "salad";
                }
                // makes the text
                StringBuilder message = new StringBuilder("\n" +
                        party.getGuestsNum() + " people are coming to the party\n" + dinnerParty.getDinnerNum() +
                        " people are coming to the dinner party\nyou ordered "+ thing +"\nyour message to the guest: " + creatpowText);
                JOptionPane.showMessageDialog(UseDinnerParty.this, message.toString(), "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(0, 1));
        // Add components to pane
        contentPane.add(titleBar);
        contentPane.add(heading);
        contentPane.add(labelguestsNum);
        contentPane.add(guestsNum2);
        contentPane.add(labelDinnerMen);
        contentPane.add(DinnerMen);
        contentPane.add(labelDinnerCho);
        contentPane.add(dinnerChoiceTextField);
        contentPane.add(labelcreatpow);
        contentPane.add(creatpow);
        contentPane.add(button);
        getContentPane().add(contentPane);
    }

    public static void main(String[] args) {
        UseDinnerParty example = new UseDinnerParty();
        example.setVisible(true);
    }
}
