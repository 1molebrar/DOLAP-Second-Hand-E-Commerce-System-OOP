# DOLAP | Second-Hand E-Commerce System

A console-based second-hand marketplace simulation developed in **Java** for the **CEN203 Object-Oriented Programming** course. Inspired by platforms such as Dolap, the project models buyer and seller workflows while emphasizing clean architecture, modularity, and core OOP principles.

## Features

### User accounts
- Buyer and seller roles with role-specific menus
- Registration with unique username validation
- Login and authentication through `AuthService`

### Seller experience
- List products across electronics, clothing, and home-item categories
- Select brands filtered by product category
- Manage product inventory and track earnings

### Buyer experience
- Browse marketplace products
- Add different product types to a shopping cart
- Calculate cart totals and simulate checkout

### Payment simulation
- Cash payments
- Debit card payments
- Credit card payments with bank-dependent interest and installment calculations

> **Note:** Payments are simulations; the application does not process real transactions.

## Technologies and Concepts

- **Language:** Java
- **Interface:** Console-based menus
- **Core OOP:** Encapsulation, Inheritance, Polymorphism, Abstraction
- **Design patterns:** Factory and Strategy
- **Architecture:** Separation of Concerns, package-based modular design
- **Additional concepts:** Abstract classes, interfaces, enums, Java Streams, input validation and exception handling

## Project Structure

```text
app/             Application entry and coordination
factory/         ProductFactory for product creation
model/           Users, products, categories, brands, and enums
payment/         Payment interface, cart, and payment implementations
repository/      BrandRepository and category-based filtering
service/         AuthService for registration and login
ui/              Console menus and input-handling utilities
```

The `model` package includes `model.users` (abstract `User`, `Buyer`, `Seller`) and `model.products` (concrete product classes such as `Laptop`, `Phone`, `Chair`, `Shirt`, and `Sofa`). Abstract product categories include `Electronics`, `HomeItem`, and `Clothing`.

## OOP and Design Patterns

| Concept | How it is used |
| --- | --- |
| Encapsulation | Private fields and controlled access to object state |
| Inheritance | Buyer/Seller extend User; product classes share category hierarchies |
| Polymorphism | Different products share a cart; payment types share a common interface |
| Abstraction | Abstract `User` and `Product` classes and the `Payment` interface |
| Factory | `ProductFactory` centralizes creation of concrete products |
| Strategy | Interchangeable cash, debit card, and credit card payment implementations |

## Typical Workflow

1. A user registers or logs in.
2. The application routes the user to a buyer or seller menu.
3. Sellers choose a category, select a compatible brand, and list an item through `ProductFactory`.
4. Buyers add products to their cart and proceed to checkout.
5. The selected payment strategy runs the corresponding payment simulation.

Input-handling utilities help prevent invalid console input from interrupting the application.

## Running the Project

This is a Java console application. Open the source code in a Java IDE, configure the project with a compatible JDK, and run the application's entry-point class in the `app` package.

> The course report does not specify a Java version, build tool, or exact main-class name. Check the uploaded source files for the precise run configuration.

## Project Context

Developed as a **group project** for **CEN203 – Object-Oriented Programming**, with an emphasis on collaborative software development and maintainable code organization.

## Scope

This is an educational marketplace and payment **simulation**, not a deployed e-commerce platform.
