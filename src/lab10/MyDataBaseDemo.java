package lab10;

import java.sql.*;

public class MyDataBaseDemo {
    private Connection connect (){
        String path = "jdbc:sqlite:D:\\360411760005\\src\\lab10\\MyDataBase.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(path);
            System.out.println("Database is Connected.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Can't connect to Database.");

        }
        return  conn;

    }//connect

    private void readData(){
        String sql = "select * from Student";
        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //loop
            while (rs.next()) {
                System.out.println(rs.getInt("ID")+"\t"+
                rs.getString("FirstName")+"\t"+
                rs.getString("LastName")+"\t"+
                rs.getInt("age"));

            }//while

    } catch (SQLException e) {
            e.printStackTrace();
        }

    }//readData

    public static void main(String[] args) {
            MyDataBaseDemo mydb = new MyDataBaseDemo();
            mydb.readData();



    }//main


}//class
