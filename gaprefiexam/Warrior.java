/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaprefiexam;

/**
 *
 * @author User
 */
public class Warrior extends Character {

    private int armor_strength;
    
    public Warrior(int armor_strength, String name, int health) {
        super(name, 1, health, null);
        this.armor_strength = armor_strength;
    }

    
    public int getArmor_strength() {
        return armor_strength;
    }
    
    public void setArmor_strength(int armor_strength) {
        this.armor_strength = armor_strength;
    }
    
    @Override
    public void attack() {
        if (getWeapon() == null) {
            throw new IllegalStateException(getName() + " cannot attack a weapon!");
        }
        System.out.println(getName() + " attacks with " + getWeapon().getType() +
                " dealing " + getWeapon().getDamage() + " damage.");
    }
    
    @Override
    public void defend() {
        System.out.println(getName() + " defends with armor strength " + armor_strength + ".");
    }
    
    @Override
    public String toString() {
        return "Warrior{" +
                "name'" + getName() + '\'' +
                ", level=" + getLevel() +
                ", armor_strength=" + armor_strength +
                ", weapon=" + getWeapon() +
                '}';
    }
}    

