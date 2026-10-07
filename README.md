# Java Learning Playground

## Purpose

This project is a personal practice space for learning **Java**, **data structures and algorithms**, and **design patterns**. The code here is written to understand concepts and try them out, not to build a production application.

## What's Covered

### Java Fundamentals
- Classes, interfaces, constructors, and access modifiers
- Collections (`HashMap`, arrays, 2D arrays)
- Reading input with `Scanner`

### Data Structures & Algorithms
- **Linked list** node (`Node.java`)
- **Sorting** (in `App.java`): bubble sort, selection sort, insertion sort, merge sort, quick sort
- **Searching** (in `App.java`): binary search (recursive and iterative)
- Counting characters with a `HashMap`

### Design Patterns
| Pattern | Files |
|---|---|
| Singleton | `Singleton.java` |
| Factory | `VehicleFactory.java`, `Vehicle.java`, `Car.java`, `Van.java` |
| Strategy | `PaymentStrategy.java`, `PaymentService.java`, `CardPayment.java`, `PaypalPayment.java` |
| Adapter | `PaypalAdapter.java`, `Paypal.java`, `Payment.java` |
| Observer | `Channel.java`, `YoutubeChannel.java`, `ObserverIn.java`, `UserOne.java` |
| Decorator | `Coffe.java`, `SimpleCoffe.java`, `MilkCoffe.java` |

## Folder Structure

- `src`: Java source files
- `bin`: compiled `.class` files (generated)

## Running

Open the folder in VS Code with the Java extension and run `App.java`, or from the terminal:

```bash
javac -d bin src/*.java
java -cp bin App
```

Uncomment the method calls in `App.main` to try out the different algorithms.
