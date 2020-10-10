package UniversityDatabaseSystem;

public class UndergraduateStudent {
    private String fullName;
    protected int studentNumber;
    private String dateOfBirth;
    private String gender;
    private String nationality;
    private String degreeType;
    private int yearOfEntry;
    private String degreeChosen;
    private int degreeCompletionTime;
    protected int tuitionFeeToBePaid; //not requested in user input

    // initializes new undergraduate student
    public UndergraduateStudent(String studentFullName, String studentDateOfBirth, String studentGender, String studentNationality, String studentDegreeType, int studentYearOfEntry, String studentDegreeChosen){
        this.fullName = studentFullName;
        this.studentNumber = (int) (Math.random() * 9999999 + 1);
        this.dateOfBirth = studentDateOfBirth;
        this.gender = studentGender;
        this.nationality = studentNationality;
        this.degreeType = studentDegreeType;
        this.yearOfEntry = studentYearOfEntry;
        this.degreeChosen = studentDegreeChosen;
        this.degreeCompletionTime = 4;
        this.tuitionFeeToBePaid = 1820;
    }

    // set of accessor methods
    public String getFullName(){
        return this.fullName;
    }

    public int getStudentNumber(){return this.studentNumber; }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getGender(){
        return this.gender;
    }

    public String getNationality(){
        return this.nationality;
    }

    public String getDegreeType(){ return this.degreeType; }

    public int getYearOfEntry(){
        return this.yearOfEntry;
    }

    public String getDegreeChosen(){
        return this.degreeChosen;
    }

    public int getDegreeCompletionTime(){ return this.degreeCompletionTime; }

    public int getTuitionFeeToBePaid(){
        return this.tuitionFeeToBePaid;
    }

    // set of mutator methods
    public void setFullName(String studentFullName){
        this.fullName = studentFullName;
    }

    public void setStudentNumber(int theStudentNumber){this.studentNumber = theStudentNumber; }

    public void setDateOfBirth(String studentDateOfBirth){
        this.dateOfBirth = studentDateOfBirth;
    }

    public void setGender(String studentGender){
        this.gender = studentGender;
    }

    public void setNationality(String studentNationality){
        this.nationality = studentNationality;
    }

    public void setDegreeType(String studentDegreeType){ this.degreeType = studentDegreeType;}

    public void setYearOfEntry(int studentYearOfEntry){
        this.yearOfEntry = studentYearOfEntry;
    }

    public void setDegreeChosen(String studentDegreeChosen){
        this.degreeChosen = studentDegreeChosen;
    }

    public void setDegreeCompletionTime(int studentDegreeCompletionTime) { this.degreeCompletionTime = studentDegreeCompletionTime; }

}
