public class Rabbit {
    // Attributes
    private String name;
    private int age;
    public Float weight;
    public Float height;
    public int no_of_limbs;
    public String fur_color;
    public String gender;

    // Add a constructor
    // Rabit(){
    //     private String name;
    // }

    // Method
    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Getters

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // other methods
    public void hasAgeIncrease(){
        age = age + 1;
    }
    public void hasWeightIncrease(){
        weight = weight + 1;
    }
    public void hasHeightIncrease(){
        height = height + 1;
    }
    public void hasAccident(){
        if (no_of_limbs<=0){
            System.out.println("Has no limbs");
        }
        else{
            no_of_limbs= no_of_limbs-1;
        }
    }

}
