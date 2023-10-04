# Practice Exam 01: 


## Part A: Managing Bike Inventory

Let's imagine you own a bike shop, and you want to keep track of the types of bikes you have in stock - either Mountain bikes or Road bikes. We will write a program that simulates filling up your stock and then displays the type and number of bikes you have.


### Step-by-Step Instructions:

1. **Setting up the Basic Structure:**  
   We'll start by creating a new class to manage our bike list.
    - Create a class named `BikeList`.
    - Inside the `BikeList` class, create a `main` method. This is the entry point of our program.

2. **Using ArrayList to Store Bikes:**  
   Since we have two types of bikes, we'll use an `ArrayList` to store them. `ArrayList` is a dynamic array that can grow in size.
    - Create an ArrayList named `bikes` that will store bike objects. Since both Mountain and Road bikes will inherit from a common `Superclass` (presumably named `Bike` or similar), the list type should be based on this superclass.

3. **Track Sales of Bikes:**  
   We'll track how many of each type of bike we sell.
    - Add two integer variables inside the `main` method: `mountainBikeSales` and `roadBikeSales`. Initialize both of them to zero.

4. **Filling up our Inventory:**  
   We'll simulate filling up our stock with random types of bikes.
    - Create a method named `fillArray` which accepts the `bikes` ArrayList as a parameter.
    - Inside this method:
        - Loop 10 times because we want to add 10 bikes.
        - Generate a random number between 0 and 1. You can use `Math.random()` for this.
        - If the number is less than 1, add a new `MountainBike` object to the `bikes` list. Otherwise, add a new `RoadBike` object.
    - Back in the `main` method, call the `fillArray` method to add bikes to our inventory.

5. **Displaying our Inventory:**  
   Let's see what bikes we've got!
    - Create a method named `displayStock` that accepts the `bikes` ArrayList as a parameter.
    - Inside this method, use an enhanced for loop (also known as a "for-each" loop) to loop over each bike in the list and print its type to the console.
    - After calling `fillArray` in the `main` method, call the `displayStock` method.

6. **Counting Specific Bikes:**  
   We'll count how many Mountain bikes we have.
    - Create a method named `calculateStock` that:
        - Accepts the `bikes` ArrayList as a parameter.
        - Initializes a local integer variable `bikesSold` to zero. This will count the number of Mountain bikes.
        - Loops over each bike in the list using an enhanced for loop. If the current bike is an instance of a `MountainBike`, increment `bikesSold`.
        - Returns the `bikesSold` value.

7. **Display Total Bikes by Type:**  
   We'll show a summary of our bike stock.
    - Create a method named `displayBikeNumbers`:
        - Accepts the `bikes` ArrayList as a parameter.
        - Declare two local int variables, `mb` (mountain bikes) and `rb` (road bikes).
        - Call the `calculateStock` method to get the number of mountain bikes and store it in the `mb` variable.
        - Determine the number of road bikes (`rb`) by subtracting `mb` from the total number of bikes in the ArrayList.
        - Print out the stock levels in the given format:

```
Stock Levels
We have [mb value] Mountain Bikes in stock
We have [rb value] Road Bikes in stock
```

That's it! When you run your program, it should randomly fill the stock, display the bikes added, and then show the total number of each type of bike in the inventory. Happy coding!

## Part B

### Problem 01: Difference from 100

**Objective:**  
Your goal is to check if a number's absolute difference from 100 is 10 or less.

**Instructions:**
1. You are given a number `n`.
2. Find the absolute difference between `n` and 100.
3. If the difference is less than or equal to 10, return `true`.
4. Otherwise, return `false`.

**Examples:**
- For the number `50`, the difference from `100` is `50`, which is greater than `10`, so the answer is `false`.
- For the number `90`, the difference from `100` is `10`, so the answer is `true`.

```java
public Boolean diff100(int n) {
    // Your code here.
    return null;
}
```

---

### Problem 02: Multiples of Three and Five 

**Objective:**  
Check if a non-negative number is a multiple of 3, 5, both, or neither.

**Instructions:**
1. If the number is divisible by both 3 and 5, return the string `'both'`.
2. If the number is only divisible by 3, return the string `'three'`.
3. If the number is only divisible by 5, return the string `'five'`.
4. If the number is not divisible by either 3 or 5, return the string `'neither'`.

**Hint:**  
You can use the modulo operator `%` to check for divisibility.

```java
public String threeOr5or3and5(Integer n) {
    // Your code here.
    return null;
}
```

---

### Problem 03: Making 10 or 20 

**Objective:**  
Given two numbers, check if one of them is 10 or 20 or if their sum is 10 or 20.

**Instructions:**
1. If either `a` or `b` is 10 or 20, return `true`.
2. If the sum of `a` and `b` is 10 or 20, return `true`.
3. Otherwise, return `false`.

```java
public boolean makes10or20(int a, int b) {
    // Your code here.
    return false;
}
```

---

### Problem 04: Positive and Negative Numbers

**Objective:**  
Given two numbers, determine if one is positive and the other is negative. However, there's a twist with a third parameter!

**Instructions:**
1. If the third parameter, named `negative`, is `false`:
   - Return `true` if one number is positive and the other is negative.
2. If the `negative` parameter is `true`:
   - Return `true` only if both numbers are negative.
3. In all other cases, return `false`.

**Examples:**
- For the numbers `1` and `-1` with `negative = false`, the answer is `true` because one number is positive and the other is negative.

```java
public boolean posNeg(int a, int b, boolean negative) {
    // Your code here.
    return false;
}
```

---

Remember, it's okay to make mistakes. Take it step by step, and try to understand the problem before jumping into the code. Happy coding!