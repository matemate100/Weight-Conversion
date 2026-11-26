# Weight Conversion: Pounds and Kilograms

A Java console program that converts weight between kilograms (kg) and pounds (lbs).

## Features

- Convert kilograms to pounds
- Convert pounds to kilograms

## How it converts

| Conversion | Formula |
|------------|---------|
| kg to lbs  | kg × 2.2 |
| lbs to kg  | lbs ÷ 2.2 |

The factor 2.2 is an approximation. Results are rounded down to a whole number.

## Project structure

| File | Purpose |
|------|---------|
| `src/Main.java` | Starting point of the program |
| `src/Runner.java` | Controls how the program runs |
| `src/menu.java` | Menu options |
| `src/Calculation.java` | Reads the weight and does the conversion |

## Requirements

- Java Development Kit (JDK)

## How to run

In IntelliJ IDEA, open the project, open `Main.java` and click **Run**.

Or from a terminal in the project folder:

```bash
javac -d out src/*.java
java -cp out Main
```

## Example

For an input of 70 kg, the converted weight shown is `154.0` lbs.

## Author

[Alfred Mate](https://github.com/matemate100)
