/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaprefiexam;

/**
 *
 * @author User
 */
public class Mage extends Character {
    private int mana;

    public Mage(int mana, String name, int health) {
        super(name, 1, health, null);
        this.mana = mana;
    }
    
    public int getMana() {
        return mana;
    }
    
    public void setMana(int mana) {
        this.mana = mana;
    }
    
    @Override
    public void attack() {
        if (getWeapon() == null) {
            throw new IllegalStateException(getName() + " cannot attack without a weapon!");
        }
        if (mana < 10){
            throw new IllegalStateException(getName() + " does not have enough mana to attack!");
        }
        mana -= 10;
        
        System.out.println(getName() + " cast a spell with " + getWeapon().getType() +
                " dealing " + getWeapon().getDamage() + " magical damage. Remaining mana: " + mana);
    }
    
    @Override
    public void defend() {
        if (mana < 5) {
            System.out.println(getName() + " tries to defend but lacks of enough mana. Uses physical defense.");
            return;
        }
        mana -= 5;
        System.out.println(getName() + " casts a magical shield, reducing damage. Remaining mana: " + mana);
        
    }
    
    @Override
    public String toString() {
        return "Warrior{" +
                "name'" + getName() + '\'' +
                ", level=" + getLevel() +
                ", mana=" + mana +
                ", weapon=" + getWeapon() +
                '}';
    }
    
}
