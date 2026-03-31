package Day12;

import java.util.*;
public class Problem1 {
     public static void main(String[] args) {
        // 1. Creating an Integer object from a primitive int
        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // explicit wrapping
        System.out.println("Wrapper object created: " + wrapperInt);

        // 2. Autoboxing (automatic conversion from primitive to wrapper)
        Integer autoBoxedInt = primitiveInt; // compiler does Integer.valueOf(primitiveInt)
        System.out.println("Autoboxed Integer: " + autoBoxedInt);

        // 3. Unboxing (conversion from wrapper back to primitive)
        int unboxedInt = wrapperInt; // compiler does wrapperInt.intValue()
        System.out.println("Unboxed int: " + unboxedInt);

        // Bonus: Using wrapper in collections (only objects allowed)
        ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(primitiveInt); // autoboxing happens here
        System.out.println("ArrayList with autoboxed int: " + list);
}
}