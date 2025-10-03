/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaprefiexam;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
       Warrior warrior = new Warrior(1500, "Balo", 2000);
        System.out.println(warrior);
        
        try {
            warrior.attack();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        Weapon KatanaSword = new Weapon(1500, 2, "KatanaSword");
        warrior.setWeapon(KatanaSword);
        warrior.attack();
        warrior.defend();
        System.out.println();
        
        Mage mage = new Mage(1000, "Nichole", 1000);
        System.out.println(mage);
        
        try {
            mage.attack();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        Weapon AmberStaff = new Weapon(1000, 5, "AmberStaff");
        mage.setWeapon(AmberStaff);
        mage.attack();
        mage.defend();
        mage.defend();
        
        System.out.println(mage);
    }
}
