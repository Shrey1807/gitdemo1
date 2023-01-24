
package studentlist;

import java.util.Scanner;

/**
 * This class +++ Insert class description here +++
 *
 * @author Shrey Jani
 */
public class Studentlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Student[] slist = new Student[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<slist.length; i++){
        
        System.out.println("Enter Student Name");
        String n = sc.nextLine();
        
        System.out.println("Enter the Student ID");
        int id = sc.nextInt();
        
        Student s = new Student(n,id);
        slist[i] = s;
        
    }
        
        for(int i =0; i<slist.length; i++){
            System.out.println("Name:" +slist[i].getStuName());
            System.out.println("ID:" + slist[i].getStuId());
        }
        
    }

}

