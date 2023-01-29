public class Dancer extends Person{
    private String groupName;
    public Dancer(String name, String disagnation,String groupName) {
        super(name, disagnation);
        this.groupName=groupName;
    }
    public String dancing(){
        return "dancer is dancing";
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +"name"+getName()+"  disignation"+getDisagnation()+
                "  groupName='" + groupName + '\'' +
                '}';
    }
}
