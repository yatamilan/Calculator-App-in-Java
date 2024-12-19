# Calculator App
This is a simple graphical user interface (GUI) calculator built using Java Swing. The app allows basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features
1. Basic Arithmetic Operations: Supports addition, subtraction, multiplication, and division.
2. User-Friendly Interface: A simple, clean design with easy-to-read buttons and text.
3. Error Handling: Displays an error message when dividing by zero.

## Installation
1. Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [here](https://www.oracle.com/java/technologies/downloads/#java11?er=221886).
2. Download or clone the repository.

## Usage
1. Compile the Java file using the following command:
### bash
javac CalculatorApp.java
Run the compiled Java program:

### bash
java CalculatorApp
The calculator window will appear, allowing you to perform basic arithmetic calculations.

## Code Explanation
1. Frame Setup: The app creates a window with a text field to display the input or result, and a grid of buttons for numbers and operators.
2. Button Clicks: Each button has an associated action listener that updates the display or performs a calculation.
3. Arithmetic Operations: The program supports four basic operations: addition (+), subtraction (-), multiplication (*), and division (/).
4. Error Handling: If a division by zero is attempted, the app will display "Error".

## Dependencies
1. javax.swing: For building the GUI interface.
2. java.awt: For layout and event handling.
