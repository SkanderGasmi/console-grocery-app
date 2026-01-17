# Grocery Shop Console Application

![Java](https://img.shields.io/badge/Java-JDK%2021-orange)
![Console App](https://img.shields.io/badge/Application-Console-blue)

---

## Table of Contents

- [Overview](#overview)  
- [Features](#features)  
- [Functionality](#functionality)  
- [Tech Stack](#tech-stack)  
- [Setup Instructions](#setup-instructions)  
- [Why I Built This](#why-i-built-this)  
- [Future Improvements](#future-improvements)  
- [License](#license)  

---

## Overview

This is a **Java-based console application** that simulates a simple grocery shop system.  
Users can select items, specify quantities, manage inventory, and receive a final bill with optional discounts.

The project focuses on building a **clean, structured command-line application** using core Java concepts such as arrays, loops, conditional logic, exception handling, and method design.

---

## Features

- Add grocery items by name (case-insensitive)  
- Quantity-based billing  
- Real-time total bill calculation  
- Inventory tracking with stock validation  
- Custom exception handling for invalid items  
- Optional discount applied for large purchases  
- Search and filtering utilities for items and prices  

---

## Functionality

- **Item Search**  
  Search for an item by name and retrieve its index in the inventory.

- **Billing System**  
  Calculate item-wise cost and accumulate the total bill.

- **Discount Logic**  
  Automatically apply a 10% discount when the total exceeds a defined threshold.

- **Inventory Management**  
  Track available stock and prevent purchases when stock is insufficient.

- **Utility Operations**  
  - Calculate average price of items  
  - Filter items below a given price  

---

## Tech Stack

- **Java (JDK 21)**  
- Console-based input/output  
- No external libraries or frameworks  

---

## Setup Instructions

1. Clone the repository:

```bash
git clone https://github.com/SkanderGasmi/console-grocery-app.git
cd console-grocery-app
````

2. Compile the application:

```bash
cd /src/
javac GroceryShopApp.java
```

3. Run the program:

```bash
java GroceryShopApp
```

---

## Why I Built This

I built this project to practice writing **structured, maintainable Java code** for a standalone application.
The goal was to focus on **logic, control flow, and data handling** without relying on external frameworks or databases.

It also served as a foundation for thinking about **inventory systems, billing logic, and user interaction** in a simple environment.

---

## Future Improvements

* Add persistent storage (file or database)
* Introduce a menu-based interface
* Support dynamic inventory updates
* Add unit tests
* Convert to a GUI or web-based application

---
