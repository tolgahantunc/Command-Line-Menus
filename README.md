# Command-Line-Menus (Homework)

We want to write set of Java class that implement a command line menu system.  

Write a public interface MenuCommand that has a single method run().  

Write a class MenuItem that has a private string ﬁeld mTitle and a MenuCommand mCommand. Write a constructor that initializes both ﬁelds. Write a getter for the title. Write an execute() method that runs the command if the command ﬁeld is not null.  

Write a class Menu that keeps a list of MenuItem objects in a private ﬁeld. It should have an addItem method that adds a MenuItem to the private list. Write a method named display that displays all menu items in the list with corresponding numbers starting at 1. It should ask the user which item it wants to execute and then execute the corresponding menu item. If the user picks an invalid menu item id (such as -1) then it should ask the user again.  

Write a class MenuTest that creates a menu with the following three menu items:  
• title: Add numbers, command: Ask the user two numbers and display their sum.  
• title: Multiply numbers, command: Ask the user two numbers and display their product.  
• title: Quit, command: Call System.exit(0).  

After the menu is created, its display method should be called in an inﬁnite loop.
