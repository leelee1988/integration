package welcome;
/*
 * Inheritance is where once class acquires the property of another. Some benefits to inheritance is reusability, extensibilty, data hiding, and overriding.
 */
public class Polymorphism {

	 
    public static void main(String[] args) {
         
       // Tree is a kind of Plant (it extends Plant)
        Tree tree = new Tree();
         
        // Polymorphism guarantees that we can use a child class
        // wherever a parent class is expected.
        Plant plant2 = tree;
        
        plant2.grow();
      
        tree.shedLeaves();
    }
     
    public static void doGrow(Plant plant) {
        plant.grow();
    }
 
}

