# Programming-Exercise-1-COP-2805-Personalized-Letter-Generator
This Java program uses method overloading in the FormLetterWriter class to generate personalized greetings. Based on input, it displays "Dear Mr. or Ms. [LastName]" or "Dear [FirstName] [LastName]" followed by "Thank you for your recent order."
The program starts with the main method, which acts as the control center. It first calls a method to display a salutation based on a customer's last name, then prints a thank-you message. Next, it calls another version of the salutation method that takes both a first and last name, followed by the same thank-you message. This setup allows for flexibility in how the greetings are formatted.
The displaySalutation method is overloaded, meaning there are two versions of it:
One that takes just a last name and formats the greeting as "Dear Mr. or Ms. [LastName]." Another that takes both a first and last name, formatting the greeting as "Dear [FirstName] [LastName]." The displayLetter method is straightforward. It prints out the rest of the message: "Thank you for your recent order." A blank line is added afterward for better formatting.
When the program runs, it generates this output:
Dear Mr. or Ms. Kelly, Thank you for your recent order.
Dear Christy Johnson, Thank you for your recent order.
This program demonstrates how to reuse code effectively with method overloading. By creating flexible methods, you can handle different types of input without duplicating code. It’s also a great example of how small, focused methods can make a program clear and easy to manage. Plus, it shows how Java lets you dynamically build messages by combining text with variables.
Overall, this program is a simple, practical way to learn about writing clean, reusable code in Java.
