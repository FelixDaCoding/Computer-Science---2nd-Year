
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CharacterRemover extends JFrame{


    private JLabel textLabel;
    private JCheckBox vowelCheckbox;
    private JCheckBox numberCheckbox;
    private JCheckBox consonantCheckbox;
    private JButton removeButton;
    private JButton restoreButton;
    private JPanel mainPanel;

    private final String originalText;

    public CharacterRemover() {
        setContentPane(mainPanel);
        setTitle("Character Remover");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();




        originalText = textLabel.getText();

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textLabel.getText();
                if(vowelCheckbox.isSelected()){
                    text = text.replaceAll("[aeiouAEIOU]", "");
                }
                if(numberCheckbox.isSelected()){
                    text = text.replaceAll("[0-9]", "");

                }
                if(consonantCheckbox.isSelected()){
                    text = text.replaceAll("[BCDFGHJKLMNPQRSTVWXYZ]", "");

                }
                textLabel.setText(text);
            }
        });

        restoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setText(originalText);
            }
        });
    }



}
