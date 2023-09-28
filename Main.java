import java.util.ArrayList;

class Main{
    public static void main(String[] args) {

        Employee employee1 = new Employee("Tom", 20, "UX/UI", "0001");
        Project ProjectE1_1 = new Project("Web A", "Developing a web application");
        Project ProjectE1_2 = new Project("Mobile app A", "Developing a mobile app");
        
        Employee employee2 = new Employee("Tim", 30, "FrontEnd", "0002");
        Project ProjectE2_1 = new Project("Web A", "Developing a web application");
        
        employee1.AddProject(ProjectE1_1);
        employee1.AddProject(ProjectE1_2);
        employee1.ShowDetails();
        employee2.AddProject(ProjectE2_1);     
        employee2.ShowDetails();

    }
}

interface Person{
    public String getName();
    public void setName(String name);
    public int getAge();
    public void setAge(int age);
}

interface Job{
    public String getPosition();
    public void setPosition(String position);
    public String getEmpID();
    public void setEmpID(String empid);
}

class Project{
    private String projectName;
    private String Description;

    Project(String newprojectName , String newDescription){
        this.projectName = newprojectName;
        this.Description = newDescription;
    }

    public String getProject(){
        return (this.projectName + " : " + this.Description);
    }
}

class Employee implements Person , Job{
    private String Name;
    private double Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project> Myproject;

    Employee(String newName , double newAge , String newPosition , String newEmpID){
        this.Name = newName;
        this.Age = newAge;
        this.Position = newPosition;
        this.EmpID = newEmpID;
        this.Myproject = new ArrayList<Project>();
    }

    public String getName(){
        return this.Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public int getAge(){
        int age = (int)this.Age;
        return age;
    }

    public void setAge(int age){
        this.Age = age;
    }

    public String getPosition(){
        return this.Position;
    }

    public void setPosition(String position){
        this.Position = position;
    }

    public String getEmpID(){
        return this.EmpID;
    }

    public void setEmpID(String empid){
        this.EmpID = empid;
    }

    public void AddProject(Project newProject){
        this.Myproject.add(newProject);
    }

    public void ShowDetails(){
        System.out.println("****************************");
        System.out.println("Name : " + this.Name );
        System.out.println("Position : " + this.Position );
        System.out.println("EmpID : " + this.EmpID );
        System.out.println("Projects : ");
        for(int i = 0 ; i < this.Myproject.size() ; i++){
            System.out.println("    " + this.Myproject.get(i).getProject());
        }
    }

}