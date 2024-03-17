public class Dog {
    private String name;
    private int age;
    public int no_of_limbs=4;

    // Add a constructor
    Dog(String name, int age, int no_of_limbs){
        this.name=name;
        this.age= age;
        this.no_of_limbs=no_of_limbs;
    }
    
    public void setName(String name){
        this.name= name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public void hasAccident(){
        if(no_of_limbs<= 0){
            System.out.println("Has no limbs");
        } else {
        no_of_limbs = no_of_limbs - 1;
        };
    }

    public void hasAgeIncrease(){
        age= age + 1;
    }
    

}
