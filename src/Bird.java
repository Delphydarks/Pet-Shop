public class Bird {
    // Attributes
    private String name;
    private int age;
    public String type;
    public String gender;
    public Float weight;
    public Float height;
    public String movement;
    // Add a constructor 
    Bird(String name, int age, String type){
        this.name= name;
        this.age= age;
        this.type= type;
    }
    // methods
    // Setters
    public  void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public void setType(String type){
        this.type = type;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    // Getters
    public String  getName(){
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
    // other methods

    public void hasAccident(){
        if (age==0){
        System.out.println("Passed on to Glory");}
    }
    public void hasAgeIncrease(){
        age = age + 1;
    }
    public void hasHeightIncrease(){
        height = height + 1;
    }
    public void hasWeightIncrease(){
        weight = weight + 1;
    }
    
}
