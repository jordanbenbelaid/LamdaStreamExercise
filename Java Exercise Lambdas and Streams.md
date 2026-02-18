# Java Exercise: Lambdas and Streams

---

# Step 1: Create a New Java Project

Create a new Java project and a class called:

StreamExercise.java


---

# Step 2: Create the Product Class

Inside your file, create a `Product` class with the following:

### Task 2.1

Add the following fields:

- name (String)
- price (double)
- category (String)

### Task 2.2

Create a constructor to initialise all fields.

### Task 2.3

Create getter methods for:

- getName()
- getPrice()
- getCategory()

---

Example structure:

```java

class Product {

    private String name;
    private double price;
    private String category;

    // constructor

    // getters

}
```
Step 3: Create the Main Method
Create a main method inside your class.

public static void main(String[] args) {

}

Step 4: Create a List of Products

Task 4.1
Inside the main method, create a list of products using:

```java
List<Product> products = Arrays.asList(
    new Product("Laptop", 1200, "Electronics"),
    new Product("Phone", 800, "Electronics"),
    new Product("Desk", 300, "Furniture"),
    new Product("Chair", 150, "Furniture"),
    new Product("Headphones", 200, "Electronics"),
    new Product("Book", 40, "Education")
);
```

Step 5: Display All Product Names Using Streams

Task 5.1
Use a stream and lambda expression to print all product names.

Expected Output:

Laptop

Phone

Desk

Chair

Headphones

Book

Hint:
Use .stream()
Use .forEach()

# Step 6: Filter Expensive Products
Task 6.1
Use a stream to display only products with a price greater than 500.

Expected Output:

Laptop

Phone

Hint:
Use .filter()

# Step 7: Convert Product Names to Uppercase
Task 7.1
Use .map() to convert product names to uppercase.

Expected Output:

LAPTOP

PHONE

DESK

CHAIR

HEADPHONES

BOOK

Hint:
Use .map()
Use .toUpperCase()

# Step 8: Filter Products by Category
Task 8.1
Display only products in the "Electronics" category.

Expected Output:

Laptop

Phone

Headphones


Hint:
Use .filter()
Check product category


# Step 9: Sort Products by Price
Task 9.1
Sort products by price from lowest to highest.

Expected Output:

Book

Chair

Headphones

Desk

Phone

Laptop

Hint:
Use .sorted()
Use a lambda comparator

# Step 10: Combine Multiple Stream Operations
Task 10.1
Display products that:

Are in the Electronics category

Cost more than 500

Are displayed in uppercase

Expected Output:

LAPTOP

PHONE

Hint:
Use multiple stream operations:

stream()

filter()

map()

forEach()


# Step 11: Count Products
Task 11.1
Count how many products cost less than 300.

Expected Output:

3

Hint:
Use .count()

# Step 12: Challenge Task (Optional)
Display the most expensive product.

Expected Output:

Laptop

Hint:
Use .sorted() or .max()