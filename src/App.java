public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, wELCOME to Pocky Petshop!");

        Dog Azul = new Dog();
        Azul.setName("Azul");
        Azul.setAge(2);
        // Azul.no_of_limbs = 3;
        System.out.println("Name: "+ Azul.getName()+ " Age: " + Azul.getAge() + " No. of Limbs: " + Azul.no_of_limbs); 


        Dog Chip =new Dog();
        Chip.setName("Chip");
        Chip.setAge(3);
        Chip.hasAccident();
        Chip.hasAgeIncrease();
        System.out.println("Name: "+ Chip.getName()+ " Age: " + Chip.getAge() + " No. of Limbs: " + Chip.no_of_limbs);

        Cat Ravi = new Cat();
        Ravi.setName("Ravi");
        Ravi.setAge(2);
        // Ravi.no_of_whiskers=7;
        Ravi.hasAccident();
        System.out.println("Name: "+ Ravi.getName()+ " Age: " + Ravi.getAge() + " No. of Limbs: " + Ravi.no_of_limbs + " No. of Whiskers: " + Ravi.no_of_whiskers); 


        Cat Solstrale =new Cat();
        Solstrale.setName("Solstrale");
        Solstrale.setAge(3);
        Solstrale.hasAccident();
        Solstrale.hasAgeIncrease();
        System.out.println("Name: "+ Solstrale.getName()+ " Age: " + Solstrale.getAge() + " No. of Limbs: " + Solstrale.no_of_limbs);

        Fish Nimo = new Fish("Kimo", 6 ,"Baby SharkFish","male");
        Nimo.setName("Nimo");
        Nimo.setAge(2);
        // Nimo.setType("Baby SharkFish");
        // Nimo.setGender("male");
        System.out.println("Name: "+ Nimo.getName()+ " Age: " + Nimo.getAge() + " Type: " + Nimo.getType() + " Gender: "+ Nimo.getGender()); 


        Fish Cray =new Fish("Cimon", 12 ,"CrayFish","female");
        Cray.setName("Cray");
        Cray.setAge(3);
        // Cray.setType("CrayFish");
        // Cray.setGender("female");
        Cray.hasAgeIncrease();
        System.out.println("Name: "+ Cray.getName()+ " Age: " + Cray.getAge() + " Type: " + Cray.getType() + " Gender: "+ Cray.getGender());


        Rabbit Mimi = new Rabbit ("Alex", 4, 18.2, 3.5);
        Mimi.setName("Mimi");
        Mimi.setAge(2);
        // Mimi.setType("Baby SharkRabit");
        Mimi.setGender("female");
        Mimi.setWeight(26.20);
        System.out.println("Name: "+ Mimi.getName()+ " Age: " + Mimi.getAge() + " Type: " + Mimi.getWeight() + " Gender: "+ Mimi.getGender()); 


        Rabbit Petes = new Rabbit("Cimon", 12 ,19.20,3.20);
        Petes.setName("Petes");
        Petes.setAge(3);
        // Petes.setType("PetesFish");
        Petes.setGender("male");
        Petes.setWeight(26.20);
        Petes.hasAgeIncrease();
        System.out.println("Name: "+ Petes.getName()+ " Age: " + Petes.getAge() + " Weight: " + Petes.getWeight() + " Gender: "+ Petes.getGender());


        Bird Sparkle = new Bird("Sparkle", 6 ,"Parrrot");
        Sparkle.setName("Sparkle");
        Sparkle.setAge(2);
        // Sparkle.setType("Baby SharkBird");
        Sparkle.setGender("male");
        System.out.println("Name: "+ Sparkle.getName()+ " Age: " + Sparkle.getAge() + " Type: " + Sparkle.getType() + " Gender: "+ Sparkle.getGender()); 


        Bird Birdie =new Bird("Cimon", 12 ,"Parrot");
        Birdie.setName("Birdie");
        Birdie.setAge(3);
        // Birdie.setType("BirdieBird");
        Birdie.setGender("female");
        Birdie.hasAgeIncrease();
        System.out.println("Name: "+ Birdie.getName()+ " Age: " + Birdie.getAge() + " Type: " + Birdie.getType() + " Gender: "+ Birdie.getGender());


    }
}
