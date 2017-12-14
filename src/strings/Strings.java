/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author MERC-LAB-01
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createString1();
        createString2();
        createString3();
        
        }
                
    public static void createString1() {
       
       String name = new String("Hemal");
        System.out.println(name);
    }
    public static void createString2 (){
    
       String name = "Hemal";
        System.out.println(name);
        }
    public static void createString3 (){
    
       char[] nameArray = {'H','E','M','A','L'};
        }
    
}

