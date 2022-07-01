public class Todo {
    public long todoId;
    public long workId;
    public long date;
    public int plannedTime;
    public long projectedStart;
    public long projectedEnd;
    public int priority;

    public Todo () {}


}

/*
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        PreparedStatement getTodoFromDB = dbconn.prepareStatement("select TODO_Id, WORK_Id, to_char(DATE, 'mm/dd/yyyy hh24:mi:ss'), PLANNED_TIME, to_char(PROJECTED_START_TIME, 'mm/dd/yyyy hh24:mi:ss'), to_char(PROJECTED_END_TIME, 'mm/dd/yyyy hh24:mi:ss'), PRIORITY from TODO where TODO_Id = ?");
        getTodoFromDB.setInt(1, id);
        ResultSet todoFromDB = getTodoFromDB.executeQuery();
        todoFromDB.absolute(1);
        todoId = todoFromDB.getLong(1);
        workId = todoFromDB.getLong(2);
        date = new Date(sdf.parse(todoFromDB.getString(3)));
        plannedTimetodoFromDB.getInt(4);
        projectedStart = new Date(sdf.parse(todoFromDB.getString(5)));
        projectedEnd = new Date(sdf.parse(todoFromDB.getString(6)));
        priority = todoFromDB.getInt(7);
 */