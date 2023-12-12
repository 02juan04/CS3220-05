package finalPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class dbService {

    private String url = "jdbc:mysql://cs3.calstatela.edu/cs3220stu57";

    private String username = "cs3220stu57";

    private String password = "CVizZsu2b7Ue";

    private Connection connection;

    public dbService()
    {
        try
        {
            connection = DriverManager.getConnection( url, username, password );
        }
        catch( SQLException e )
        {
            e.printStackTrace();
        }
    }

    public void close()
    {
        if( connection != null )
        {
            try
            {
                connection.close();
            }
            catch( SQLException e )
            {
                e.printStackTrace();
            }
        }
    }

    public List<person> getEntries()
    {
        List<person> people = new ArrayList<person>();

        try
        {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( "select * from Schedule" );
            while( rs.next() )
            {
            	person person = new person();
            	person.setName(rs.getString("name"));
            	person.setId(rs.getInt("id"));
            	person.setTimeSlot(rs.getInt("timeSlot"));
            	person.setDayOfWeek(rs.getString("dayOfWeek"));
            	
                people.add( person );
            }
            stmt.close();
        }
        catch( SQLException e )
        {
            e.printStackTrace();
        }

        return people;
    }

    public person getEntry( int id )
    {
        person person = new person();
        try
        {
            String sql = "select * from Schedule where id = ?";
            PreparedStatement pstmt = connection.prepareStatement( sql );
            pstmt.setInt( 1, id );
            ResultSet rs = pstmt.executeQuery();
            if( rs.next() )
            {
            	person.setTimeSlot(rs.getInt("TimeSlot"));
     
            	}
            pstmt.close();
        }
        catch( SQLException e )
        {
            e.printStackTrace();
        }
        return person;
    }

    public int addEntry(String name, int timeSlot, String dayOfWeek )
    {
        int id = 0;
        try
        {
            String sql = "insert into Schedule (name, TimeSlot, dayOfWeek) values (?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement( sql,
                Statement.RETURN_GENERATED_KEYS );
            pstmt.setString( 1, name );
            pstmt.setInt(2, timeSlot);
            pstmt.setString(3, dayOfWeek);
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if( rs.next() ) id = rs.getInt( 1 );
            pstmt.close();
        }
        catch( SQLException e )
        {
            e.printStackTrace();
        }
        return id;
    }

    public void updateEntry( int id, String name, int timeSlot, String dayOfWeek )
    {
        try
        {
            String sql = "update Schedule set name = ?, TimeSlot = ?, DayOfWeek = ? where id = ?";
            PreparedStatement pstmt = connection.prepareStatement( sql );
            pstmt.setString( 1, name );
            pstmt.setInt(2, timeSlot);
            pstmt.setString(3, dayOfWeek);
            pstmt.executeUpdate();
            pstmt.close();
        }
        catch( SQLException e )
        {
            e.printStackTrace();
        }
    }

    public void deleteEntry( int id )
    {
        try
        {
            String sql = "delete from Schedule where id = ?";
            PreparedStatement pstmt = connection.prepareStatement( sql );
            pstmt.setInt( 1, id );
            pstmt.executeUpdate();
            pstmt.close();
        }
        catch( SQLException e )
        {
            e.printStackTrace();
        }
    }
}
