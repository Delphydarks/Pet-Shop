public class Rabbit {
    // Attributes
    private String name;
    private int age;
    public Double weight;
    public Double height;
    public int no_of_limbs;
    public String fur_color;
    public String gender;

    // Add a constructor
    Rabbit(String name, int age, Double weight, Double height){
        this.name =name;
        this.age= age;
        this.weight= weight;
        this.height= height;
    }

    // Method
    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(Double weight){
        this.weight=weight;
    }

    // Getters

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Double getWeight(){
        return weight;
    }
    public String getGender(){
        return gender;
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
