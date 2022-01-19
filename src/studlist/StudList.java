/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studlist;

import java.util.Scanner;

/**
 *
 * @author Rabjeet singh
 */
public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student[] sList = new Student[5];
        Scanner keyboard = new Scanner(System.in);
        
        for(int i = 0; i <= sList.length-1; i++)
        {
            sList[i] = new Student();
            System.out.println("Enter the name of the Student : ");
            sList[i].setName(keyboard.nextLine());
        }
        
        for(int i = 0; i <= sList.length-1; i++)
        {
            System.out.println("Student name : "+ sList[i].getName());    
        }
    }
    
}
