package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


class DishTest{

    private DishStack stack;

    @BeforeEach
    void set(){
        stack = new DishStack();
    }

        //REGULAR TEST
        @Test
        void testPush(){
            Dish oneDish = new Dish("A dish with one fish pattern on it");
            Dish twoDish = new Dish("A dish with two fish patterns on it");

            stack.push(oneDish);
            stack.push(twoDish);

            assertEquals(2, stack.size());
        }

        @Test
        void testPop(){
            Dish oneDish = new Dish("A dish with one fish pattern on it");
            Dish twoDish = new Dish("A dish with two fish patterns on it");
            stack.push(oneDish);
            stack.push(twoDish);

            stack.pop();
            assertEquals(1, stack.size());
        }

        @Test
        void testPeek(){
            Dish oneDish = new Dish("A dish with one fish pattern on it");
            Dish twoDish = new Dish("A dish with two fish patterns on it");

            stack.push(oneDish);
            stack.push(twoDish);

            Dish peekdish = stack.peek();

            assertEquals("A dish with two fish pattern on it", peekdish.getDescription());
        }

        //EMPTY OR FULL TEST
        @Test
        void emptyPop(){
            assertEquals("Stack is empty... Can't pop.", stack.pop());
        }

}