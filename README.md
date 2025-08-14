# ATM_INTERFACE_JAVA
This is a console-based Java project that simulates the core functions of an Automated Teller Machine (ATM). It was developed as part of the Oasis Infobyte internship to demonstrate object-oriented programming concepts in Java. The application consists of multiple classes, each handling different parts of the ATM’s functionality, such as transaction history, withdrawals, deposits, and fund transfers. The project is designed to be simple yet functional, allowing users to interact with the system in a way that mirrors real-world ATM operations.

When the application starts, the user is prompted to enter their User ID and PIN. Once the credentials are validated, the user gains access to the ATM menu. From the menu, the user can view their transaction history, withdraw funds, deposit money, transfer funds to another user, or quit the session. The system maintains a basic transaction history for the current session so users can track their activities.

The project uses Java’s object-oriented features such as classes, objects, encapsulation, and method overriding to separate functionalities into different modules. For example, one class might handle authentication, another for transactions, and another for the user interface menu. This modular design makes the code easier to maintain and extend.

To run the program, navigate to the project directory in your terminal, compile all .java files using javac *.java, and then execute the main program using java Main. Once running, you can log in with the default credentials (e.g., User ID: atharva123 and PIN: 1234) to start performing ATM operations.

This project can be enhanced by adding features such as persistent storage for account balances and transactions using file handling or a database, multi-user support, improved security for PIN storage, and a more user-friendly graphical interface.

The ATM Interface project serves as a practical demonstration of Java programming and is an excellent starting point for learning how to simulate real-world systems in code. It reinforces concepts such as control flow, user input handling, and class-based design while giving a taste of banking software logic.
