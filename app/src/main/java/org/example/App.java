
package org.example;

public class App {
    public static void main(String[] args){
        DishStack stack = new DishStack();
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");
        
        // The variable stack_size should equal zero.
        int stackSize = stack.size();
        System.out.println("Initial size: " + stackSize);
        
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);
        
        // The variable sizeAfterPushes should equal four.
        int sizeAfterPushes = stack.size();
        System.out.println("Size after push: " + sizeAfterPushes);
        
        // The variable peekedDish should have a description of "A dish with a blue fish pattern on it"
        Dish peekedDish = stack.peek();
        System.out.println("Peeked Dish: " + peekedDish.getDescription());
        
        // The variable poppedDish should have a description of "A dish with a blue fish pattern on it"
        Dish poppedDish = stack.pop();
        System.out.println("Dish after pop: " + poppedDish.getDescription());
        
        // The variable anotherPoppedDish should have a description of "A dish with a red fish pattern on it"
        Dish anotherPoppedDish = stack.pop();
        System.out.println("Another dish after pop: " + anotherPoppedDish.getDescription());
        
        // The variable finalSize should equal two.
        int finalSize = stack.size();
        System.out.println("Final size: " + finalSize);
    }
}
