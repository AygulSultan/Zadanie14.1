public class Singer extends Person{
    private String bandName;
    public Singer(String name, String disagnation,String bandName) {
        super(name, disagnation);
        this.bandName=bandName;
    }
    public String sing (){
        return "singer is seing";
    }
    public String playGitar (){
        return "singer is plaing gitar";
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +"name"+getName()+"  disagnation"+ getDisagnation()+
                "  bandName='" + bandName + '\'' +
                '}';
    }
}
