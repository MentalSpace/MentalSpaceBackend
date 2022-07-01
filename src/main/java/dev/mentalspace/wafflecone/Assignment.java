public class Assignment {
    public long assignmentId;
    public long classId;
    public long dateAssigned;
    public long dateDue;
    public String type;
    public int estimatedBurden;
    public String name;
    public String description;

    public Assignment () {}

    
}

/*        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        PreparedStatement getAssignmentFromDB = dbconn.prepareStatement("select assignment_id, class_id, to_char(date_assigned, 'mm/dd/yyyy hh24:mi:ss'), to_char(date_due, 'mm/dd/yyyy hh24:mi:ss'), type, estimated_burden, name, description from assignment where assignment_id = ?");
        getAssignmentFromDB.setInt(1, id);
        ResultSet assignmentFromDB = getAssignmentFromDB.executeQuery();
        assignmentFromDB.absolute(1);
        assignmentId = assignmentFromDB.getLong(1);
        classId = assignmentFromDB.getLong(2);
        dateAssigned = new Date(sdf.parse(todoFromDB.getString(3)));
        dateDue = new Date(sdf.parse(todoFromDB.getString(4)));
        type = assignmentFromDB.getString(5);
        estimatedBurden = assignmentFromDB.getInt(6);
        name = assignmentFromDB.getString(7);
        description = assignmentFromDB.getString(8); */