import java.sql.*;

public class emp2demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
        try{String query="select * from emp";
        PreparedStatement p= con.prepareStatement(query);
        ResultSet res=p.executeQuery();
        while(res.next()){
            String emplane=res.getString("emplane");
            String empno=res.getString("empno");
            System.out.println(emplane+"\t\t"+empno);
        }}
        catch(Exception e){
            System.out.println(e);
        }

    }
}
