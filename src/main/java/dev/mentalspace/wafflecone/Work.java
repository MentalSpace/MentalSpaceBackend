public class Work {
    public long workId;
    public long studentId;
    public long assignmentId;
    public int timeRemaining;
    public int priority;

    public Work () {}


}

/*
        PreparedStatement getWorkFromDB = dbconn.prepareStatement("select * from WORK where WORK_Id = ?");
        getWorkFromDB.setInt(1, id);
        ResultSet workFromDB = getWorkFromDB.executeQuery();
        workFromDB.absolute(1);
        workId = workFromDB.getLong(1);
        studentId = workFromDB.getLong(2);
        assignmentId = workFromDB.getLong(3);
        timeRemaining  = workFromDB.getInt(4);
        priority = workFromDB.getInt(5);
 */