package Lab5;

import java.util.Scanner;

public class TestMyLinkedList {

    public static void main(String[] args) {

        // MyLinkedList<Character> myLinkedList = new MyLinkedList<>();

        // // append the following: a, b,c, d, e
        // myLinkedList.addLast('a');
        // myLinkedList.addLast('b');
        // myLinkedList.addLast('c');
        // myLinkedList.addLast('d');
        // myLinkedList.addLast('e');

        // // print all the elements in the list
        // System.out.print("All the elements in the list: ");
        // myLinkedList.print();

        // // reverse all the elements in the list
        // System.out.print("All the elements in the list in reverse order: ");
        // myLinkedList.reverse();

        // // retrieve the number of elements in the list
        // System.out.println( "Size: " + myLinkedList.getSize());

        // // retrieve the first and last value
        // System.out.println("First element: " + myLinkedList.getFirst());
        // System.out.println("Last element : " + myLinkedList.getLast());

        // // delete middle value
        // int first = myLinkedList.indexOf(myLinkedList.getFirst());
        // int last = myLinkedList.indexOf(myLinkedList.getLast());
        // int middle = (first + last) / 2;
        // System.out.println("Middle value: " + myLinkedList.remove(middle));

        // // Retrieve the index location for the second and third value.
        // System.out.println("Index of 2nd value: " + myLinkedList.indexOf('b'));
        // System.out.println("Index of 3rd value: " + myLinkedList.indexOf('c'));

        // // check if the list has the value c
        // System.out.println("List has value 'c': " + myLinkedList.contains('c'));

        // // Replace the items individually with the following: j a v a
        // char[] letters = {'j', 'a', 'v', 'a'};
        // for (int i = 0; i < letters.length; i++) {
        //     myLinkedList.set(i, letters[i]);
        // }
        // myLinkedList.print();


//------------------------------------------------------------------------------------------------------------------

        // MyLinkedList<String> list = new MyLinkedList<>();
        // list.appendEnd("linked list");
        // list.appendEnd("is");
        // list.appendEnd("easy");
        // list.display();

        // list.replace("easy", "hard");

        // list.display();


        // System.out.println("The removed word is " + list.removeInitial());

        // System.out.println("Does the list contain the word 'difficult'? " + list.contains2("difficult"));

        // list.clear();

        // System.out.println("List after calling list.clear():");
        // list.display();


      //  ----------------------------------------------------------------------------



       MyLinkedList<String> studentList = new MyLinkedList<>();
       Scanner input = new Scanner(System.in);
       String student;
       String oldName, newName;
       
       System.out.println("Enter your student name list. Enter 'n' to end.....");
       
       do {    
           student= input.nextLine();
           if(student.equals("n"))
               break;
           studentList.addLast(student);            
       } while(!student.equals("n"));
       
       System.out.println();
       
       System.out.println("You have entered the following students' name : ");   
       studentList.print();
       
       System.out.println();
       System.out.println("The number of students entered is : " + studentList.getSize()); 
       
       System.out.println();
    
       System.out.println("All the names entered are correct? Enter 'r' ro rename the student name, 'n' to proceed.");
       String changeStudent = input.nextLine();
       System.out.println();
        
       if(changeStudent.equalsIgnoreCase("r")) {
           System.out.println("Enter the existing student name that u want to rename : ");
           oldName = input.nextLine();
           System.out.println();
           System.out.println("Enter the new name : ");
           newName = input.nextLine();
           System.out.println();
                   
           if(studentList.contains(oldName)) {                  
               studentList.replace(oldName, newName);           
               System.out.println("The new student list is : ");
               studentList.print();                         
               System.out.println();
           }
           else {
                System.out.println("The student you entered is not in your current student list.");   
                System.out.println();
           }
       }

       String choiceRemoveStudent;
       
       System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
       choiceRemoveStudent = input.nextLine();     
       System.out.println();
       
       String removeStudent;
       
       if(choiceRemoveStudent.equalsIgnoreCase("y")) {
           System.out.println("Enter a student name to remove : ");
          removeStudent = input.nextLine();        
           System.out.println();
           
           if(studentList.contains(removeStudent)) {   
                studentList.removeElement(removeStudent);    
           }
           else {                                    
               System.out.println("Item you want to remove is not in the existing order list.");
           }
           
           System.out.println("The number of updated student is :" + studentList.getSize());  
           System.out.println("The updated students list is :");        
           studentList.print();
       }
       else {
           System.out.println();
           System.out.println("The number of student is :" + studentList.getSize());  
           System.out.println("You entered the following students list : ");
           studentList.print();
          
       }
       System.out.println();
       System.out.println("All student data captured complete. Thank you!");
       

       
   }    

  

        
    
}