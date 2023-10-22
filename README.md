# RestaurantManagementUsingPriorityQCircularQ


This is a simple Restaurant Management System implemented in Java. It allows users to place orders for various ingredients from a menu, calculates the waiting time for each order, and manages different types of orders in separate queues. The system is designed to handle orders for non-veg, veg, and beverages separately.

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Contributing](#contributing)


## Features

- User-friendly command-line interface.
- Menu-based ordering system with a variety of ingredients.
- Separation of orders into queues based on ingredient type (non-veg, veg, beverages).
- Calculation of waiting time for each order based on the priority of ingredients.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/restaurant-management-system.git
   cd restaurant-management-system
`
2. Compile and Run

To compile and run the Restaurant Management System, follow these steps:

```bash
javac Restaurant.java
java Restaurant

```
# Usage

Upon running the program, you will be prompted to order ingredients from the menu.

- You can enter the name of the ingredients you want to order. If the entered ingredient is on the menu, it will be added to your order.

- You can continue adding more ingredients or choose to finalize your order.

- Once your order is finalized, the system calculates the waiting time for your order based on the priority of ingredients.

- The system manages separate queues for non-veg, veg, and beverage orders.

- You can place multiple orders, and the total waiting time for all your orders will be displayed.

# Code Structure

The code is organized into several classes:

- **Restaurant class**: The main class where the user interacts with the system. It handles user input and order placement.

- **CircularQueue class**: A custom circular queue data structure used to manage orders for different ingredient categories.

- **Order class**: Represents an order with a list of ingredients and calculates waiting time.

- **Ingredient class**: Represents an ingredient with a name, category, and priority.

- **RestaurantManager class**: Manages the menu, finds ingredients, and processes orders. It also initializes the menu with default ingredients.

# Contributing

If you'd like to contribute to this project, please open an issue or create a pull request. Your contributions are welcome!


