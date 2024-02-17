package employeeManagement;

public class EmpModel {
    private int id;
    private String name;
    private String jobTitle;
    private String mobNo;
    private String city;

    public EmpModel(int id, String name, String jobTitle,String mobNo, String city) {
        super();
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.mobNo = mobNo;
        this.city = city;
    }
    public EmpModel(String name, String jobTitle, String mobNo, String city) {
        super();
        this.name = name;
        this.jobTitle = jobTitle;
        this.mobNo = mobNo;
        this.city = city;
    }

    public EmpModel() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "EmpModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", mobNo=" + mobNo +
                ", city='" + city + '\'' +
                '}';
    }
}
