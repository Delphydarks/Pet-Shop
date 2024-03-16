public class Fish {

    // attributes
    private String name;
    private int age;
    private String type;
    public String gender;

    // Create constructor
    Fish(String name, int age, String type, String gender){
        // set important names n attributes here
        this.name= name;
        this.age= age;
        this.type=type;
        this.gender=gender;
    }

    // // methods

    //  Set desired Fish name   
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    


    
    // Get the value of the Cat
    public String getName(){
    return name;
    }
    public int getAge(){
    return age;
    }

    public String getType(){
    return type;
    }

    public String getGender(){
        return gender;
        }

   
    public void hasAgeIncrease(){
        age = age + 1;
    }
    
}
