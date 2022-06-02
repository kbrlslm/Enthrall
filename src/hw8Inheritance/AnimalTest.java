package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		//mammal class has single inheritance from Animal class
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo(); //Reptile is the parent of Snake class
		snake.animalInfo(); //Animal is the parent of Reptile class
		Robin robin= new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		// BullDog class is multilevel Inheritance Animal->Mammal->Dog->BullDog
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		// Mammal, Reptile and Birds are the Hierarchical Inheritance
	}
}
