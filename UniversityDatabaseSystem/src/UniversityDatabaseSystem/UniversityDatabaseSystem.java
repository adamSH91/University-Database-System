package UniversityDatabaseSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UniversityDatabaseSystem {
    private JButton addNewUndergraduateStudentButton;
    private JButton retrieveStudentInformationButton;
    private JLabel welcomeLabel;
    private JLabel actionLabel;
    private JPanel universityDatabaseSystemPanel;


    public UniversityDatabaseSystem() {
        addNewUndergraduateStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // initializes a frame to add an undergraduate student
                AddNewUndergraduateStudentForm addNewUndergraduateStudentFormFrame = new AddNewUndergraduateStudentForm();
                addNewUndergraduateStudentFormFrame.newFrame();
            }
        });
        retrieveStudentInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // initializes a frame to retrieve a student's information
                retrieveStudentInformationForm retrieveStudentInformationFormFrame = new retrieveStudentInformationForm();
                retrieveStudentInformationFormFrame.retrieveStudentInfoFrame();
            }
        });
    }

    public static void main(String[] args) {
        // start application
        JFrame frame = new JFrame("University Database System");
        frame.setContentPane(new UniversityDatabaseSystem().universityDatabaseSystemPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(2000, 2000);
        frame.setVisible(true);

    }

}
