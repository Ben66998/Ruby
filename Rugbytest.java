public class Rugbytest {

   //instance variable
  private String FullName;
    private  String Village;
    private  String Position;
    private  double salary;

    //getters
    public String getFullName() {
        return FullNameName;
    }
    public String getVillage() {
        return Village;
    }
    public String getPosition() {
        return Position;
    }
    public double getSalary() {
        return salary;
    }

    public double raise(double raise){
        salary = salary + (salary*.1);
        return salary;
    }

    //constructor
    public Rugby(String FullName, String Village, String Position, double salary){

        this.FullName = FullName;
        this.Village = Village;
        this.Position = Position;
        this.salary = salary;

    }

}
























