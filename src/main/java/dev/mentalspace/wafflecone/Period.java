public class Period {//period in java = class in db
    public long classId;
    public long teacherId;
    public long subjectId;
    public long termId;
    public int peirod;
    public String classCode;
    public boolean archived;

    public Period () {}

    
}

/*
        PreparedStatement getPeriodFromDB = dbconn.prepareStatement("select * from class where class_id = ?");
        getPeriodFromDB.setInt(1, id);
        ResultSet periodFromDB = getPeriodFromDB.executeQuery();
        periodFromDB.absolute(1);
        classId = periodFromDB.getLong(1);
        teacherId = periodFromDB.getLong(2);
        subjectId = periodFromDB.getLong(3);
        termId = periodFromDB.getLong(4);
        peirod = periodFromDB.getInt(5);
        classCode = periodFromDB.getString(6);
        archived = periodFromDB.getBoolean(7);
 */