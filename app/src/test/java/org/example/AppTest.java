package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


public class AppTest{

    DishStack stack;

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

            assertEquals("A dish with two fish patterns on it", peekdish.getDescription());
        }

        //EMPTY TEST
        @Test
        void emptyPop(){
            assertNull(stack.pop());
        }

        @Test
        void testPushFullStack() {

            for (int i = 0; i < 10; i++) {
                stack.push(new Dish("Dish #" + (i + 1)));
            }
    
            assertEquals(10, stack.size());
        }

}