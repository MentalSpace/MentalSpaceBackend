public class Student {
    public long studentId;
    public long cannonicalId;
    public String firstName;
    public String lastName;
    public int phone;
    public int grade;

    public Student () {}

    
}

/*
        PreparedStatement getStudentFromDB = dbconn.prepareStatement("select * from student where student_id = ?");
        getStudentFromDB.setInt(1, id);
        ResultSet studentFromDB = getStudentFromDB.executeQuery();
        studentFromDB.absolute(1);
        student_id = studentFromDB.getLong(1);
        cannonicalId = studentFromDB.getLong(2);
        firstName = studentFromDB.getString(3);
        lastName = studentFromDB.getString(4);
        phone = studentFromDB.getInt(5);
        grade = studentFromDB.getInt(6);
 */