package employeeManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpMain {
    public static void main(String[] args) throws IOException {
        System.out.print("Welcome to Employee Management System ");
        try {
            int n=0;
            while (n<5) {
                Thread.sleep(1000);
                System.out.print("*"+" ");
                n++;
            }
        }catch (InterruptedException i){
            i.printStackTrace();
        }
        System.out.println();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("press 1 for add employee.");
            System.out.println("press 2 for show all employees.");
            System.out.println("press 3 for update employee.");
            System.out.println("press 4 for delete employee");
            System.out.println("press 5 for exit from App.");
            System.out.print("enter your choice:");
            int choice = Integer.parseInt(br.readLine());
            System.out.println();
            switch (choice) {
                case 1:
                    //add employee
                    System.out.println("enter name:");
                    String name=br.readLine();
                    System.out.println("enter jobTitle:");
                    String jobTitle=br.readLine();
                    System.out.println("enter mobNo:");
                   String mobNo= br.readLine();
                    System.out.println("enter city:");
                    String city=br.readLine();
                    //create EmpModel object
                    EmpModel emp=new EmpModel(name,jobTitle,mobNo,city);
                    //System.out.println(emp);
                    boolean b=EmpDao.insertEmpToDB(emp);
                    if(b){
                        System.out.println("Emp added successfully into data base.");
                    }else {
                        System.out.println("some thing went to wrong !");
                    }
                    System.out.println();
                    break;
                case 2:
                    //show employee
                EmpDao.showAllEmpData();
                    System.out.println();
                    break;
                case 3:
                    //update employee
                    while(true) {
                        System.out.println("### Update Employee ###");
                        System.out.println("1.update emp_name\n2.update job_title\n3.update emp_mob\n4.update emp_city");
                        System.out.println("enter your choice:");
                        int ch = Integer.parseInt(br.readLine());
                        System.out.println("enter id for update :");
                        int empId = Integer.parseInt(br.readLine());
                        switch (ch) {
                            case 1:
                                //update name
                                System.out.println("enter new name:");
                                String newName = br.readLine();
                                boolean u = EmpDao.empUpdateName(newName, empId);
                                if (u) {
                                    System.out.println("Emp_name updated successfully.");
                                } else {
                                    System.out.println("name not updated!");
                                }
                                break;
                            case 2:
                                //update job_title
                                System.out.println("enter new job_title:");
                                String newJobTitle = br.readLine();
                                boolean j = EmpDao.empUpdateJob(newJobTitle, empId);
                                if (j) {
                                    System.out.println("job_title updated successfully.");
                                } else {
                                    System.out.println("job_title not updated!");
                                }
                                break;
                            case 3:
                                //update mob
                                System.out.println("enter new mobNo:");
                                String newMobNo = br.readLine();
                                boolean m = EmpDao.empUpdateMob(newMobNo, empId);
                                if (m) {
                                    System.out.println("mobNo. updated successfully.");
                                } else {
                                    System.out.println("mobNo. not updated!");
                                }
                                break;
                            case 4:
                                //update city
                                System.out.println("enter new city:");
                                String newCity = br.readLine();
                                boolean c = EmpDao.empUpdateCity(newCity, empId);
                                if (c) {
                                    System.out.println("city updated successfully.");
                                } else {
                                    System.out.println("city not updated!");
                                }
                                break;
                            default:
                                System.out.println("enter valid choice!!");
                        }
                        System.out.println("are you continue in update or exit from update(Y/N)");
                        String dec= br.readLine();
                        if(dec.equalsIgnoreCase("N")){
                            break;
                        }
                    }

                    break;
                case 4:
                    //delete employee
                    System.out.println("enter empId for delete the record:");
                    int id=Integer.parseInt(br.readLine());
                    boolean d=EmpDao.empDelete(id);
                    if(d){
                        System.out.println("data deleted successfully.");
                    }else {
                        System.out.println("data not deleted!");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("enter valid choice.");
            }
        }
    }
}
