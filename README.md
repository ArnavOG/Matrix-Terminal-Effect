# Matrix-Terminal-Effect
A Java console experiment that recreates a Matrix-inspired animated terminal effect.

# Matrix Terminal Effect

A simple Java console experiment that creates a continuously changing, Matrix-inspired terminal animation using random letters, numbers, and symbols.

## Preview

The program repeatedly generates a new frame of random characters, clears the terminal screen, and prints the updated frame to create an animated effect.

## Features

* Generates random letters, numbers, and symbols
* Continuously refreshes the terminal output
* Uses ANSI escape codes to clear the screen
* Adjustable terminal width and height
* Adjustable animation speed
* Runs directly in the Java console

## Technologies Used

* Java
* `Random`
* Nested loops
* `StringBuilder`
* Console output
* `Thread.sleep()`
* ANSI escape codes

## How It Works

1. A collection of characters is defined.
2. The program generates a grid using nested loops.
3. Each position receives a randomly selected character.
4. The terminal screen is cleared.
5. The generated frame is printed.
6. The program waits briefly before generating the next frame.

This process repeats continuously to create the animation.

## Getting Started

### Prerequisites

Make sure Java is installed on your system.

Check your Java installation:

```bash
java -version
javac -version
```

### Run the Program

Clone or download this repository, then open the project directory in your terminal.

Compile the program:

```bash
javac MatrixEffect.java
```

Run it:

```bash
java MatrixEffect
```

To stop the animation, press:

```text
Ctrl + C
```

## Customization

You can change the following values inside `MatrixEffect.java`:

```java
int width = 80;
int height = 20;
```

* `width` controls the number of characters in each row.
* `height` controls the number of rows in each frame.

You can also adjust the animation speed:

```java
Thread.sleep(100);
```

A smaller value makes the animation faster, while a larger value makes it slower.

## Learning Objectives

This experiment was created to explore:

* Random character generation
* Nested loops
* String construction using `StringBuilder`
* Repeated execution with `while (true)`
* Console screen refreshing
* Basic timing and animation concepts in Java

## AI Assistance

This project was created with assistance from ChatGPT. The purpose was to explore Java console programming and understand how randomization, loops, screen clearing, and timed delays can be combined to create a simple terminal animation.

## Future Improvements

* Add falling character streams similar to the original Matrix effect
* Use different speeds for different character columns
* Add terminal color support
* Improve compatibility across different terminals
* Add user-controlled settings for width, height, and speed

## Project Status

**Status:** Completed basic experiment

## License

This project is available for learning and experimentation. You may modify and improve it for personal or educational use.
