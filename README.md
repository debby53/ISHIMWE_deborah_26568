# Java Exception Handling Assignment

## Overview
This assignment demonstrates the use of exception handling in Java through practical examples. Each example simulates a specific exception in a real-world scenario and provides appropriate handling mechanisms using try-catch blocks. The goal is to enhance understanding of how exceptions work in Java and how to manage them effectively.

## Table of Contents
1. [Checked Exceptions](#checked-exceptions)
   - [IOException](#ioexception)
   - [FileNotFoundException](#filenotfoundexception)
   - [EOFException](#eofexception)
   - [SQLException](#sqlexception)
   - [ClassNotFoundException](#classnotfoundexception)
2. [Unchecked Exceptions](#unchecked-exceptions)
   - [ArithmeticException](#arithmeticexception)
   - [NullPointerException](#nullpointerexception)
   - [ArrayIndexOutOfBoundsException](#arrayindexoutofboundsexception)
   - [ClassCastException](#classcastexception)
   - [IllegalArgumentException](#illegalargumentexception)
   - [NumberFormatException](#numberformatexception)

## Checked Exceptions

### IOException
**Scenario**: Attempting to read from a non-existent file.
```java
import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the file name to read: ");
                String fileName = reader.readLine();
                FileReader file = new FileReader(fileName);
                BufferedReader fileInput = new BufferedReader(file);
                System.out.println("File content: " + fileInput.readLine());
                break;
            } catch (IOException e) {
                System.out.println("An IOException occurred: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
}
## Checked Exceptions

### IOException
**Scenario**: Attempting to read from a non-existent file.
```java
import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the file name to read: ");
                String fileName = reader.readLine();
                FileReader file = new FileReader(fileName);
                BufferedReader fileInput = new BufferedReader(file);
                System.out.println("File content: " + fileInput.readLine());
                break;
            } catch (IOException e) {
                System.out.println("An IOException occurred: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
}
FileNotFoundException
Scenario: Trying to open a file that doesn’t exist.

java
import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the file name to open: ");
                String fileName = reader.readLine();
                File file = new File(fileName);
                FileInputStream fis = new FileInputStream(file);
                System.out.println("File opened successfully.");
                break;
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
                System.out.println("Please try again.");
            } catch (IOException e) {
                System.out.println("An IOException occurred: " + e.getMessage());
            }
        }
    }
}
EOFException
Scenario: Attempting to read beyond the end of a file.

java
import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try (DataInputStream dis = new DataInputStream(new FileInputStream("test.txt"))) {
                while (true) {
                    System.out.println(dis.readUTF());
                }
            } catch (EOFException e) {
                System.out.println("End of file reached: " + e.getMessage());
                break;
            } catch (IOException e) {
                System.out.println("An IOException occurred: " + e.getMessage());
            }
        }
    }
}
SQLException
Scenario: Attempting to connect to a non-existent database or execute invalid SQL.

java
import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:invalid:url");
                System.out.println("Database connection successful.");
                break;
            } catch (SQLException e) {
                System.out.println("A SQLException occurred: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
}
ClassNotFoundException
Scenario: Demonstrating a scenario where a class file is missing at runtime.

java
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the class name to load: ");
                String className = reader.readLine();
                Class.forName(className);
                System.out.println("Class loaded successfully.");
                break;
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found: " + e.getMessage());
                System.out.println("Please try again.");
            } catch (IOException e) {
                System.out.println("An IOException occurred: " + e.getMessage());
            }
        }
    }
}
Unchecked Exceptions
ArithmeticException
Scenario: Simulating an arithmetic operation that fails (e.g., division by zero).

java
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter two integers to divide: ");
                int a = Integer.parseInt(reader.readLine());
                int b = Integer.parseInt(reader.readLine());
                int result = a / b;
                System.out.println("Result: " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
                System.out.println("Please try again.");
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
}
NullPointerException
Scenario: Accessing a null reference.

java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a string (or leave empty for null): ");
                String str = reader.readLine();
                if (str.isEmpty()) {
                    str = null;
                }
                System.out.println("String length: " + str.length());
                break;
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
                System.out.println("Please try again.");
            } catch (IOException e) {
                System.out.println("An IOException occurred: " + e.getMessage());
            }
        }
    }
}
ArrayIndexOutOfBoundsException
Scenario: Accessing an invalid array index.

java
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int[] array = new int[5];
                System.out.print("Enter an index to access (0-4): ");
                int index = Integer.parseInt(reader.readLine());
                System.out.println("Value at index " + index + ": " + array[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
                System.out.println("Please try again.");
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
}
ClassCastException
Scenario: Demonstrating an invalid type cast.

java
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                Object x = new Integer(0);
                System.out.println((String) x); // Attempting an invalid type cast
                break;
            } catch (ClassCastException e) {
                System.out.println("ClassCastException: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
}
IllegalArgumentException
Scenario: Passing an invalid argument to a method.

java
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a duration in milliseconds: ");
                long duration = Long.parseLong(reader.readLine());
                Thread.sleep(duration);
                System.out.println("Slept for " + duration + " milliseconds.");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage());
                System.out.println("Please try again.");
            } catch (InterruptedException | IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
NumberFormatException
Scenario: Attempting to convert a string to a number when the format is invalid.

java
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a number: ");
                String input = reader.readLine();
                int number = Integer.parseInt(input);
                System.out.println("You entered: " + number);
                break;
            } catch (NumberFormatException e
