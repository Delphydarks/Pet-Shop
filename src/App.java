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

    }
}
