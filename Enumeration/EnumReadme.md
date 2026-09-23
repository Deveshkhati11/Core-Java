# Java Enums

Enums in Java are a special type used to define a fixed set of constants.

They are useful when a variable should contain only a predefined set of values, such as days, directions, states, roles, or statuses.

---

## 📌 What is an Enum?

An `enum` is a special class that represents a group of constants.

```java
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
```

Using the enum:

```java
Day today = Day.MONDAY;

System.out.println(today);
```

Output:

```text
MONDAY
```

---

## 🎯 Why Use Enums?

Enums provide:

* Type safety
* Readable and maintainable code
* A fixed set of allowed values
* Better alternative to using integer or string constants
* Support for fields, methods, constructors, and interfaces

### Without Enum

```java
String status = "ACTIVE";
```

The programmer could accidentally write:

```java
status = "ACTVE";
```

### With Enum

```java
enum Status {
    ACTIVE,
    INACTIVE,
    PENDING
}
```

Now only valid `Status` values can be assigned.

```java
Status status = Status.ACTIVE;
```

---

# 📚 Topics Covered

## 1. Basic Enum

Creating and using a simple enum.

```java
enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}
```

---

## 2. Enum with Variables

Enums can contain fields.

```java
enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int value;

    Level(int value) {
        this.value = value;
    }
}
```

---

## 3. Enum Constructors

Enum constructors are used to initialize enum constants.

```java
enum Size {
    SMALL(10),
    MEDIUM(20),
    LARGE(30);

    private int value;

    Size(int value) {
        this.value = value;
    }
}
```

Enum constructors are implicitly private.

---

## 4. Enum Methods

Enums can contain methods just like classes.

```java
enum Status {
    ACTIVE,
    INACTIVE;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
```

Usage:

```java
System.out.println(Status.ACTIVE.isActive());
```

Output:

```text
true
```

---

## 5. `values()` Method

`values()` returns all constants defined in an enum.

```java
for (Day day : Day.values()) {
    System.out.println(day);
}
```

Output:

```text
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
SUNDAY
```

---

## 6. `valueOf()` Method

`valueOf()` converts a string into the corresponding enum constant.

```java
Day day = Day.valueOf("MONDAY");

System.out.println(day);
```

Output:

```text
MONDAY
```

The string must exactly match the enum constant.

---

## 7. `ordinal()` Method

`ordinal()` returns the position of an enum constant.

```java
System.out.println(Day.MONDAY.ordinal());
```

Output:

```text
0
```

The index starts from `0`.

> Avoid using `ordinal()` as a persistent identifier because changing the enum order changes the ordinal values.

---

## 8. Enum with `switch`

Enums work naturally with `switch`.

```java
Day day = Day.MONDAY;

switch (day) {
    case MONDAY:
        System.out.println("Start of the week");
        break;

    case FRIDAY:
        System.out.println("Almost weekend");
        break;

    default:
        System.out.println("Another day");
}
```

---

## 9. Enum with Interfaces

Enums can implement interfaces.

```java
interface Printable {
    void print();
}

enum Color implements Printable {
    RED,
    BLUE,
    GREEN;

    @Override
    public void print() {
        System.out.println(this);
    }
}
```

---

## 10. Enum vs Constants

### Traditional Constants

```java
public static final int LOW = 1;
public static final int MEDIUM = 2;
public static final int HIGH = 3;
```

### Enum

```java
enum Priority {
    LOW,
    MEDIUM,
    HIGH
}
```

Enums are generally preferable when representing a fixed set of related values because they provide stronger type safety.

---

# 🧠 Important Interview Points

* An enum is a special class in Java.
* Enum constants are implicitly `public`, `static`, and `final`.
* Enum constructors cannot be `public` or `protected`.
* An enum can have:

  * Fields
  * Constructors
  * Methods
  * Interfaces
  * Abstract methods
* An enum cannot extend another class because all enums implicitly extend `java.lang.Enum`.
* An enum can implement interfaces.
* `values()` returns all enum constants.
* `valueOf()` returns an enum constant matching a given name.
* `ordinal()` returns the declaration position of a constant.
* Enum constants are created once and behave like singleton instances of that enum type.

---

# 🛠️ Recommended Practice

Create examples for:

1. Basic enum
2. Enum with fields
3. Enum with constructor
4. Enum with methods
5. Enum with `switch`
6. `values()`
7. `valueOf()`
8. `ordinal()`
9. Enum implementing an interface
10. Real-world example using `Status`, `Role`, or `PaymentMethod`

---

# 📁 Module Structure

```text
Enum/
│
├── BasicEnum.java
├── EnumWithFields.java
├── EnumConstructor.java
├── EnumMethods.java
├── EnumSwitch.java
├── EnumMethodsDemo.java
├── EnumInterface.java
└── README.md
```

---

# 🔑 Key Takeaway

Enums should be used when your application needs a **fixed and well-defined set of values**.

They provide type safety, improve readability, and allow constants to contain their own data and behavior.

```java
enum Status {
    PENDING,
    APPROVED,
    REJECTED
}
```

This is usually much cleaner than scattering string constants throughout an application.
