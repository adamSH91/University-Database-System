package UniversityDatabaseSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewUndergraduateStudentForm {
    private JPanel addNewUndergraduateStudentPanel;
    private JTextField fullNameField;
    private JTextField dateOfBirthField;
    private JTextField genderField;
    private JTextField nationalityField;
    private JTextField degreeField;
    private JTextField yearOfEntryField;
    private JTextField degreeCompletionTimeField;
    private JLabel addNewUndergraduateStudentLabel;
    private JLabel fullNameLabel;
    private JLabel dateOfBirthLabel;
    private JLabel genderLabel;
    private JLabel nationalityLabel;
    private JLabel degreeLabel;
    private JLabel yearOfEntryLabel;
    private JLabel degreeCompletionTimeLabel;
    private JButton addToDatabaseButton;
    private JFrame addNewUndergraduateStudentFrame;
    private static int undergraduateStudentCount = 0;
    private static UndergraduateStudent[] undergraduateStudentArray = new UndergraduateStudent[10];

    // adds a new undergraduate student to array
    public AddNewUndergraduateStudentForm() {
        addToDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(undergraduateStudentCount <= 10) {
                    undergraduateStudentCount++;
                    if (undergraduateStudentCount == 1) {
                        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudent1.setFullName(fullNameField.getText());
                        undergraduateStudent1.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent1.setGender(genderField.getText());
                        undergraduateStudent1.setNationality(nationalityField.getText());
                        undergraduateStudent1.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent1.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent1.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent1.setDegreeType("Undergraduate");
                        undergraduateStudentArray[0] = undergraduateStudent1;
                    } else if (undergraduateStudentCount == 2) {
                        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudentArray[1] = undergraduateStudent2;
                        undergraduateStudent2.setFullName(fullNameField.getText());
                        undergraduateStudent2.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent2.setGender(genderField.getText());
                        undergraduateStudent2.setNationality(nationalityField.getText());
                        undergraduateStudent2.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent2.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent2.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent2.setDegreeType("Undergraduate");
                    } else if (undergraduateStudentCount == 3) {
                        UndergraduateStudent undergraduateStudent3 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudentArray[2] = undergraduateStudent3;
                        undergraduateStudent3.setFullName(fullNameField.getText());
                        undergraduateStudent3.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent3.setGender(genderField.getText());
                        undergraduateStudent3.setNationality(nationalityField.getText());
                        undergraduateStudent3.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent3.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent3.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent3.setDegreeType("Undergraduate");
                    } else if (undergraduateStudentCount == 4) {
                        UndergraduateStudent undergraduateStudent4 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudentArray[3] = undergraduateStudent4;
                        undergraduateStudent4.setFullName(fullNameField.getText());
                        undergraduateStudent4.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent4.setGender(genderField.getText());
                        undergraduateStudent4.setNationality(nationalityField.getText());
                        undergraduateStudent4.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent4.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent4.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent4.setDegreeType("Undergraduate");
                    } else if (undergraduateStudentCount == 5) {
                        UndergraduateStudent undergraduateStudent5 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudentArray[4] = undergraduateStudent5;
                        undergraduateStudent5.setFullName(fullNameField.getText());
                        undergraduateStudent5.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent5.setGender(genderField.getText());
                        undergraduateStudent5.setNationality(nationalityField.getText());
                        undergraduateStudent5.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent5.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent5.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent5.setDegreeType("Undergraduate");
                    } else if (undergraduateStudentCount == 6) {
                        UndergraduateStudent undergraduateStudent6 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudentArray[5] = undergraduateStudent6;
                        undergraduateStudent6.setFullName(fullNameField.getText());
                        undergraduateStudent6.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent6.setGender(genderField.getText());
                        undergraduateStudent6.setNationality(nationalityField.getText());
                        undergraduateStudent6.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent6.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent6.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent6.setDegreeType("Undergraduate");
                    } else if (undergraduateStudentCount == 7) {
                        UndergraduateStudent undergraduateStudent7 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudentArray[6] = undergraduateStudent7;
                        undergraduateStudent7.setFullName(fullNameField.getText());
                        undergraduateStudent7.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent7.setGender(genderField.getText());
                        undergraduateStudent7.setNationality(nationalityField.getText());
                        undergraduateStudent7.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent7.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent7.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent7.setDegreeType("Undergraduate");
                    } else if (undergraduateStudentCount == 8) {
                        UndergraduateStudent undergraduateStudent8 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudentArray[7] = undergraduateStudent8;
                        undergraduateStudent8.setFullName(fullNameField.getText());
                        undergraduateStudent8.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent8.setGender(genderField.getText());
                        undergraduateStudent8.setNationality(nationalityField.getText());
                        undergraduateStudent8.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent8.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent8.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent8.setDegreeType("Undergraduate");
                    } else if (undergraduateStudentCount == 9) {
                        UndergraduateStudent undergraduateStudent9 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudentArray[8] = undergraduateStudent9;
                        undergraduateStudent9.setFullName(fullNameField.getText());
                        undergraduateStudent9.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent9.setGender(genderField.getText());
                        undergraduateStudent9.setNationality(nationalityField.getText());
                        undergraduateStudent9.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent9.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent9.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent9.setDegreeType("Undergraduate");
                    } else {
                        UndergraduateStudent undergraduateStudent10 = new UndergraduateStudent("new", "new", "new", "new", "Undergraduate", 1, "new");
                        undergraduateStudentArray[9] = undergraduateStudent10;
                        undergraduateStudent10.setFullName(fullNameField.getText());
                        undergraduateStudent10.setDateOfBirth(dateOfBirthField.getText());
                        undergraduateStudent10.setGender(genderField.getText());
                        undergraduateStudent10.setNationality(nationalityField.getText());
                        undergraduateStudent10.setDegreeChosen(degreeField.getText());
                        int yearOfEntry = Integer.parseInt(yearOfEntryField.getText());
                        undergraduateStudent10.setYearOfEntry(yearOfEntry);
                        int degreeCompletionTime = Integer.parseInt(degreeCompletionTimeField.getText());
                        undergraduateStudent10.setDegreeCompletionTime(degreeCompletionTime);
                        undergraduateStudent10.setDegreeType("Undergraduate");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "No more students can be admitted to the university!");
                }
                JOptionPane.showMessageDialog(null, "Undergraduate Student has been added to the database!");
                fullNameField.setText("");
                dateOfBirthField.setText("");
                genderField.setText("");
                nationalityField.setText("");
                degreeField.setText("");
                yearOfEntryField.setText("");
                degreeCompletionTimeField.setText("");
            }
        });
    }

    public static UndergraduateStudent[] getUndergraduateStudentArray(){
        return undergraduateStudentArray;
    }

    public static int getUndergraduateStudentCount(){
        return undergraduateStudentCount;
    }

    public static void newFrame() {
        // initializes frame to add new undergraduate student
        JFrame frame = new JFrame("Add New Undergraduate Student Form");
        frame.setContentPane(new AddNewUndergraduateStudentForm().addNewUndergraduateStudentPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(620, 500);
        frame.setLocation(310, 120);
        frame.setVisible(true);
    }
}


