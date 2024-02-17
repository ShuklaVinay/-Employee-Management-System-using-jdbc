package employeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDao {
    public static boolean insertEmpToDB(EmpModel emp){
        //Connection con=ConnectionProvider.createConnection();
        boolean f=false;
        try{
            Connection con=ConnectionProvider.createConnection();
            PreparedStatement preparedStatement=con.prepareStatement(EmpQuery.empInsert);
            preparedStatement.setString(1,emp.getName());
            preparedStatement.setString(2,emp.getJobTitle());
            preparedStatement.setString(3,emp.getMobNo());
            preparedStatement.setString(4,emp.getCity());
            preparedStatement.executeUpdate();
            f=true;
        }catch (SQLException s){
            s.printStackTrace();
        }
        return f;
    }
    public static void showAllEmpData(){
        try {
            Connection con = ConnectionProvider.createConnection();
            PreparedStatement preparedStatement = con.prepareStatement(EmpQuery.empShow);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println("id:"+rs.getInt("emp_id"));
                System.out.println("emp_name:"+rs.getString("emp_name"));
                System.out.println("job_title:"+rs.getString("job_title"));
                System.out.println("emp_mob:"+rs.getString("emp_mob"));
                System.out.println("emp_city:"+rs.getString("emp_city"));
                System.out.println("======================================" );
            }

        }catch (SQLException s){
            s.printStackTrace();
        }
    }
    public static boolean empDelete(int emp_id){
        boolean f=false;
        try {
            Connection con=ConnectionProvider.createConnection();
            PreparedStatement ps=con.prepareStatement(EmpQuery.empDelete);
            ps.setInt(1,emp_id);
            ps.executeUpdate();
            f=true;
        }catch (SQLException s){
            s.printStackTrace();
        }
        return f;
    }

    //update employee name
    public static boolean empUpdateName(String name,int id){
        boolean f=false;
        try {
            Connection con=ConnectionProvider.createConnection();
            PreparedStatement ps=con.prepareStatement(EmpQuery.empUpdateName);
            ps.setString(1,name);
            ps.setInt(2,id);
            ps.executeUpdate();
            f=true;
        }catch (SQLException s){
            s.printStackTrace();
        }
        return f;
    }

    //update employee job_title
    public static boolean empUpdateJob(String job_title,int id){
        boolean f=false;
        try {
            Connection con=ConnectionProvider.createConnection();
            PreparedStatement ps=con.prepareStatement(EmpQuery.empUpdateJob);
            ps.setString(1,job_title);
            ps.setInt(2,id);
            ps.executeUpdate();
            f=true;
        }catch (SQLException s){
            s.printStackTrace();
        }
        return f;
    }

    //update employee mob
    public static boolean empUpdateMob(String mobNo,int id){
        boolean f=false;
        try {
            Connection con=ConnectionProvider.createConnection();
            PreparedStatement ps=con.prepareStatement(EmpQuery.empUpdateMob);
            ps.setString(1,mobNo);
            ps.setInt(2,id);
            ps.executeUpdate();
            f=true;
        }catch (SQLException s){
            s.printStackTrace();
        }
        return f;
    }

    public static boolean empUpdateCity(String newCity, int empId) {
        boolean f=false;
        try {
            Connection con=ConnectionProvider.createConnection();
            PreparedStatement ps=con.prepareStatement(EmpQuery.empUpdateCity);
            ps.setString(1,newCity);
            ps.setInt(2,empId);
            ps.executeUpdate();
            f=true;
        }catch (SQLException s){
            s.printStackTrace();
        }
        return f;
    }
}
