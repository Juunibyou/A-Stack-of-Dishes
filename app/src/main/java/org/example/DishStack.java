package org.example;

public class DishStack {
    private Dish[] dishlist = new Dish[10];
    int top = -1;

    public void push (Dish dish){
        if(top == dishlist.length - 1){
            System.out.println("The Stack is full. Cannot add any more: " +dish.getDescription());
        }
        else{
            top++;
            dishlist[top] = dish;
        }
    }

    public Dish pop(){
        if(top == -1){
            System.out.println("Stack is empty... Can't pop.");
            return null;
        }
        else{
            Dish removed = dishlist[top];
            top--;
            return removed;
        }
    }

    public Dish peek(){
        if(top == -1){
            System.out.println("Stack is empty... Can't peek.");
            return null;
        }
        else{
            return dishlist[top];
        }

    }

    public int size(){
        return top+1;
    }
}
