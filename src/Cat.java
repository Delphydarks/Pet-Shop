public class Cat {
    // attributes
    private String name;
    private int age;
    private String breed;
    public String gender;
    public String fur="yes";
    public int no_of_whiskers=24;

    public int no_of_limbs = 4;

    // Add a constructor
    Cat(String name, int age, int no_of_limbs, String gender){
        this.name= name;
        this.age = age;
        this.no_of_limbs= no_of_limbs;
        this.gender= gender;
    }

   // // methods

    //  Set desired cat name   
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setGender(String gender){
        this.gender = gender;
    }


    
    // Get the value of the Cat
   public String getName(){
    return name;
   }
   public int getAge(){
    return age;
   }

   public String getBreed(){
    return breed;
   }

   public String getGender(){
    return gender;
   }

    public void hasAccident(){
        no_of_limbs = no_of_limbs-1;
        whiskersStatus();
    }
    public void hasAgeIncrease(){
        age = age + 1;
    }
    public void hasNoFur(){
        fur = "None";
    }
    private void whiskersStatus(){
        if (no_of_whiskers >= 2){
         no_of_whiskers= no_of_whiskers -2;
        }
    }
    
}

 
