package TypeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenderHandler extends BaseTypeHandler<GenderType> {

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, GenderType genderType, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i,genderType.getValue());
    }

    public GenderType getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String result=resultSet.getString(s);
        return GenderType.getEnumType(result);
    }

    public GenderType getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String result=resultSet.getString(i);
        return GenderType.getEnumType(result);
    }

    public GenderType getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String result=callableStatement.getString(i);
        return GenderType.getEnumType(result);
    }
}
