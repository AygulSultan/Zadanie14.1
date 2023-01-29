public class Person {
    private String name;
    private String disagnation;

    public Person(String name, String disagnation) {
        this.name = name;
        this.disagnation = disagnation;
    }

    public String lern() {
        return "person is lerning";
    }
        public String eat () {
            return "person is eating";
    }
            public String walk () {
                return "person is walking";
            }


            public String getName () {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public String getDisagnation () {
                return disagnation;
            }

            public void setDisagnation (String disagnation){
                this.disagnation = disagnation;
            }
            @Override
            public String toString () {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", disagnation='" + disagnation + '\''+
                        '}';


            }


        }


