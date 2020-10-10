package UniversityDatabaseSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retrieveStudentInformationForm {

    private JTextField nameToBeEnteredField;
    private JTextField fullNameField;
    private JTextField studentNumberField;
    private JTextField dateOfBirthField;
    private JTextField genderField;
    private JTextField nationalityField;
    private JTextField degreeTypeField;
    private JTextField degreeField;
    private JTextField yearOfEntryField;
    private JButton displayButton;
    private JTextField degreeCompletionTimeField;
    private JLabel retrieveStudentInformationLabel;
    private JTextField tuitionFeeField;
    private JLabel enterNameLabel;
    private JPanel retrieveStudentInformationPanel;
    private JLabel fullNameLabel;
    private JLabel studentNumberLabel;
    private JLabel dateOfBirthLabel;
    private JLabel genderLabel;
    private JLabel nationalityLabel;
    private JLabel degreeType;
    private JLabel degreeLabel;
    private JLabel yearOfEntryLabel;
    private JLabel degreeCompletionTimeLabel;
    private JLabel tuitionFeeLabel;
    UndergraduateStudent[] undergraduateStudentArray = new UndergraduateStudent[10];

    public retrieveStudentInformationForm() {
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fullName = nameToBeEnteredField.getText();
                undergraduateStudentArray = AddNewUndergraduateStudentForm.getUndergraduateStudentArray();
                int studentCount = AddNewUndergraduateStudentForm.getUndergraduateStudentCount();
                for(int i = 0; i < studentCount; i++){
                    // check if student is present within database to display his/her info
                    if(fullName.equals(undergraduateStudentArray[i].getFullName())){
                        fullNameField.setText(undergraduateStudentArray[i].getFullName());
                        String studentNumber = Integer.toString(undergraduateStudentArray[i].getStudentNumber());
                        studentNumberField.setText(studentNumber);
                        dateOfBirthField.setText(undergraduateStudentArray[i].getDateOfBirth());
                        genderField.setText(undergraduateStudentArray[i].getGender());
                        nationalityField.setText(undergraduateStudentArray[i].getNationality());
                        degreeTypeField.setText(undergraduateStudentArray[i].getDegreeType());
                        degreeField.setText(undergraduateStudentArray[i].getDegreeChosen());
                        String yearOfEntry = Integer.toString(undergraduateStudentArray[i].getYearOfEntry());
                        yearOfEntryField.setText(yearOfEntry);
                        String degreeCompletionTime = Integer.toString(undergraduateStudentArray[i].getDegreeCompletionTime());
                        degreeCompletionTimeField.setText(degreeCompletionTime);
                        String tuitionFeeToBePaid = Integer.toString(undergraduateStudentArray[i].getTuitionFeeToBePaid());
                        tuitionFeeField.setText(tuitionFeeToBePaid);
                    }
                }

            }
        });
    }

    public static void retrieveStudentInfoFrame() {
        // intialize frame for student retrieval
        JFrame frame = new JFrame("Retrieve Student Information");
        frame.setContentPane(new retrieveStudentInformationForm().retrieveStudentInformationPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(620, 500);
        frame.setLocation(310, 120);
        frame.setVisible(true);
    }
}
