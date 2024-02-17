package employeeManagement;

public class EmpQuery {
  static String empInsert="insert into employee(emp_name,job_title,emp_mob,emp_city) values (?,?,?,?)";
  static String empShow="select * from employee";
  static  String empUpdateName="update employee set emp_name=? where emp_id=? ";
  static  String empUpdateJob="update employee set job_title=? where emp_id=? ";
  static  String empUpdateMob="update employee set emp_mob=? where emp_id=? ";
  static  String empUpdateCity="update employee set emp_city=? where emp_id=? ";
  static String empDelete="delete from employee where emp_id=? ";
}
