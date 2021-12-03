import java.sql.*;

public class emp2demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
        try{ String query="select * from emp1 where salary>1000 and salary<2000";
        PreparedStatement p =con.prepareStatement(query);
        ResultSet res=p.executeQuery();
        while(res.next()){
        String name=res.getString("name");
        int salary=res.getInt("salary");
        String job=res.getString("job");
        String company=res.getString("company");
            System.out.println(name+"\t\t"+salary+"\t\t"+job+"\t\t"+company);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
