package com.example.kotlincodes

class BankAccount {
    var accountNumber: Int
    var balance: Double

    // Primary Constructor
    constructor(accountNumber: Int) {
        this.accountNumber = accountNumber
        this.balance = 0.0 // Default balance
        println("Account created with Account Number: $accountNumber and Balance: $balance")
    }

    // Secondary Constructor with Initial Balance
    constructor(accountNumber: Int, balance: Double) : this(accountNumber) {
        if (balance >= 0) {
            this.balance = balance
        } else {
            println("Balance can't be negative! Setting balance to 0.")
            this.balance = 0.0
        }
        println(" Balance Updated : $balance")
    }

    // Function to deposit money
    fun deposit(amount: Double) {
        balance += amount
        println("Deposited $$amount. New Balance: $balance")
    }

    // Function to withdraw money
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Withdrawn $$amount. Remaining Balance: $balance")
        } else {
            println("Insufficient balance!")
        }
    }
}

fun main() {
    // Account created with default balance
    val account1 = BankAccount(101)

    // Account created with initial balance
    val account2 = BankAccount(102, 500.0)

    // Account with negative balance (Handled with default 0)
    val account3 = BankAccount(103, -200.0)

    // Perform transactions
    account1.deposit(100.0)
    account2.withdraw(200.0)

    println(x) // printing internal variable from VisibilityModifiers.kt
    println(a) // printing public variable but setter is private
    //a = 6  setter is private
}
