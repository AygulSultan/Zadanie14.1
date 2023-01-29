public class Programmer extends Person{
    private String companyName;
    public Programmer(String name, String disagnation,String companyName) {
        super(name, disagnation);
        this.companyName=companyName;

    }
    public String coding (){
        return "programmer is coding";
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                ", name='" + getName() + '\'' +"dusughation"+getDisagnation()+'\''+
                '}';
    }
}

