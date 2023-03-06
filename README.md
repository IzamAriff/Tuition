# Tuition
This Java code is for managing a tuition center, specifically by adding, editing, and deleting information about headmasters, tutors, and students. It creates a new center with a name, registration number, and year of service. The user can then add multiple headmasters, each with a specified number of tutors, and each tutor with a specified number of students.

The program uses an ArrayList to store information about the tuition center and its various components. The information about each headmaster, tutor, and student is stored in objects of their respective classes. The user is prompted to enter details for each headmaster, tutor, and student.

Once all the data has been entered, the program prints the details of the center, including the name, registration number, and year of service, as well as the details of all the headmasters, tutors, and students.

The program also includes functionality to delete or add data. If the user chooses to delete data, they are prompted to select whether to delete a headmaster, tutor, or student. They are then asked to enter the index of the item they want to delete. If the user chooses to add data, they are prompted to select whether to add a headmaster, tutor, or student. Depending on the choice, the user may be asked to enter additional information such as the index of the headmaster where they want to add a tutor.

Note that in this program, it assumes that each center has only one headmaster.
