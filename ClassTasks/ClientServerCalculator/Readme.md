# Client-Server Based Calculator (Java)

A simple **Client-Server Calculator** built using **Java Socket Programming**.  
This project demonstrates how two Java programs — a **Client** and a **Server** — communicate over a TCP connection to perform basic arithmetic operations.

---

## ✨ Features
✅ Addition, Subtraction, Multiplication, and Division  
✅ Handles division by zero gracefully  
✅ Uses TCP Sockets for communication  
✅ Built using only **core Java** (no external libraries)

---

## 🛠️ Technologies Used
- **Language:** Java  
- **Networking:** java.net.Socket, java.net.ServerSocket  
- **I/O Streams:** DataInputStream, DataOutputStream  

---

## ⚙️ How to Compile and Run

Make sure both files are in the same folder:
CalculatorServer.java
CalculatorClient.java

### Step 1: Compile both programs
javac CalculatorServer.java CalculatorClient.java
### Step 2: Run the Server (first terminal)
java CalculatorServer
### Step 3: Run the Client (second terminal)
java CalculatorClient

