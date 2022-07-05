package dev.mentalspace.wafflecone.databaseobject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ShcoolRowMapper implements RowMapper<Shcool> {
    @Override
    public Shcool mapRow(ResultSet row, int rowNum) throws SQLException {
        Shcool shcool = new Shcool();
        shcool.shcoolId = row.getLong("school_id");
        shcool.shortName = row.getString("short_name");
        shcool.name = row.getString("name");
        shcool.address = row.getString("address");
        return shcool;
    }
}
