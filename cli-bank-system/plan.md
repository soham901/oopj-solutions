# CLI Bank Management System

**Goal:**
students will have a fully functional basic bank system using:

1. Arrays
2. Control structures
3. Methods
4. Classes & objects
5. Inheritance and interfaces
6. Exception handling
7. File I/O

---

## LABS 10–14: FOUNDATIONS WITH ARRAYS & CONTROL STRUCTURES

**Students Know:**

- Variables
- Control flow (if, switch, loops)
- Arrays
- Methods

---

### LAB 10 – 11

**Tasks:**

- [ ] Design **menu-driven CLI skeleton** using `switch`:

```
1. Register User (store names in array)
2. Login User (search array)
3. Exit
```

- [ ] Store user names and passwords in **parallel arrays** (e.g., `String[] usernames`, `String[] passwords`).
- [ ] Create basic methods:

* `registerUser()`
* `loginUser()`

**Example Concepts:**

* Arrays
* Switch-case
* For/while loop
* Basic input validation

---

### LAB 12 – 13

**Tasks:**

- [ ] Create **array to hold balances**:

* `double[] balances`
  - [ ] Extend CLI menu:

```
4. Deposit Money
5. Withdraw Money
6. Show Balance
```

- [ ] Implement deposit and withdraw functions
- [ ] Cannot withdraw more than balance
- [ ] Minimum initial deposit

**Concepts:**

* Arrays manipulation
* Simple validation
* Methods with parameters

---

### LAB 14

**Tasks:**

- [ ] Introduce **multi-dimensional arrays**:

* 2D array for user data:
  `String[][] userDetails = new String[maxUsers][3];`
  * 0: username
  * 1: password
  * 2: email

- [ ] Replace parallel arrays with 2D array
- [ ] Refactor registration/login logic

---

## LABS 15–21: INTRODUCTION TO CLASSES & OBJECTS

> **Lab 15:** String handling
> **Lab 18–21:** Objects and Classes

---

### LAB 15–16

**Tasks:**

- [ ] Use **String methods** to:

* Validate password length

* Trim user input

  - [ ] Implement email validation (Must contain `@`)

  - [ ] Refactor code to improve string handling

---

### LAB 18–19

**Tasks:**

- [ ] Create a `User` class:

```java
class User {
   String username;
   String password;
   double balance;
}
```

- [ ] Use **array of `User` objects** to replace the 2D array

- [ ] Update registration and login logic to use `User[]`

- [ ] Refactor deposit/withdraw to be methods inside `User` class

---

### LAB 20–21

**Tasks:**

- [ ] Add `BankAccount` class:

```java
class BankAccount {
   String accountNumber;
   double balance;
   User owner;
}
```

- [ ] For now, each `User` will have one `BankAccount`
- [ ] Introduce encapsulation:

* Use `private` fields.
* Provide `getters/setters`.

- [ ] CLI options now use `User` and `BankAccount` classes

---

## LABS 22–26: INHERITANCE & INTERFACES

**Focus:**
- `this`, `super`, inheritance, abstract classes, interfaces

---

### LAB 22–23

**Tasks:**

- [ ] Create a **base class `Person`**:

```java
class Person {
   String name;
   String email;
}
```

- [ ] `User` **extends** `Person`
- [ ] Demonstrate `super` to initialize name/email

---

### LAB 24

**Tasks:**

- [ ] Create `Account` abstract class:

```java
abstract class Account {
   String accountNumber;
   double balance;

   abstract void deposit(double amount);
   abstract void withdraw(double amount);

   void displayBalance() {
       System.out.println("Balance: " + balance);
   }
}
```

- [ ] `SavingAccount` and `CurrentAccount` overrides the `withdraw()` method

---

### LAB 25–26

**Tasks:**

- [ ] Create `ILogin` interface:

```java
interface ILogin {
   boolean login(String username, String password);
}
```

- [ ] Create `ITransaction` interface:

```java
interface ITransaction {
   void deposit(double amount);
   void withdraw(double amount);
}
```

- [ ] `Account` implements `ITransaction`

- [ ] CLI options now call methods via interfaces

---

## LABS 27–28: EXCEPTION HANDLING

**Focus:**
- [ ] Built-in and custom exceptions

---

### LAB 27

**Tasks:**

- [ ] Handle:

* Invalid menu choices (`InputMismatchException`)
* Invalid numeric inputs (`NumberFormatException`)

---

### LAB 28

**Tasks:**

- [ ] Create `InsufficientFundsException`:

```java
class InsufficientFundsException extends Exception {
   public InsufficientFundsException(String message) {
       super(message);
   }
}
```

- [ ] Throw this exception if withdrawal exceeds balance.

---

## LABS 29–30: FILE I/O

**Tasks:**

- [ ] Implement a program which tells the number of time we executed it by using FileReader and FileWriter to store and read count

---

### LAB 29–30

**Tasks:**

- [ ] Implement **file saving/loading**:

* Save all users and accounts to a file when the CLI exits
* Load them at startup
  - [ ] For simplicity, use CSV format

---

## Final Project Recap

At the end of Lab 30:

- **Fully working bank system:**

* CLI menu
* Array-based storage
* Classes with inheritance
* Exception handling
* File persistence
