public class OperatorsDemo {
    public static void main(String[] args) {

        // 1. Unary Operators
        int a = 5;
        System.out.println("Unary Prefix: " + (++a));  // a = 6
        System.out.println("Unary Postfix: " + (a++)); // prints 6, then a = 7

        // 2. Arithmetic Operators
        int x = 10, y = 3;
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));

        // 3. Shift Operators
        int num = 8; // binary: 1000
        System.out.println("Left Shift: " + (num << 1));  // 16
        System.out.println("Right Shift: " + (num >> 1)); // 4

        // 4. Relational Operators
        System.out.println("x > y: " + (x > y));  // true
        System.out.println("x == y: " + (x == y));  // false

        // 5. Bitwise Operators
        int p = 5;  // 0101
        int q = 3;  // 0011
        System.out.println("Bitwise AND: " + (p & q));  // 1
        System.out.println("Bitwise OR: " + (p | q));   // 7
        System.out.println("Bitwise XOR: " + (p ^ q));  // 6
        System.out.println("Bitwise NOT (~p): " + (~p)); // -6

        // 6. Logical Operators
        boolean cond1 = true, cond2 = false;
        System.out.println("Logical AND: " + (cond1 && cond2)); // false
        System.out.println("Logical OR: " + (cond1 || cond2));  // true
        System.out.println("Logical NOT: " + (!cond1));         // false

        // 7. Ternary Operator
        int max = (x > y) ? x : y;
        System.out.println("Maximum is: " + max);

        // 8. Assignment Operators
        int z = 10;
        z += 5;  // z = z + 5
        System.out.println("After += : " + z);
        z *= 2;  // z = z * 2
        System.out.println("After *= : " + z);
    }
}

