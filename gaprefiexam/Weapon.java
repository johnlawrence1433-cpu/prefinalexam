/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaprefiexam;

/**
 *
 * @author User
 */
public class Weapon {
   private int damage;
   private int range;
   private String type;

   public Weapon(int damage, int range, String type) {
       this.damage = damage;
       this.range = range;
       this.type = type;
   }
   
   public int getDamage() {
       return damage;
   }
   
   public void setDamage(int damage) {
       this.damage = damage;
   }
   
   public int getRange() {
       return range;
   }
   
   public void setRange(int range) {
       this.range = range;
   }
   
   public String getType() {
       return type;
   }
   
   public String getType(String type) {
       this.type = type;
       return null;
   }
   
   @Override
   public String toString() {
       return "Weapon{" +
               "damage=" + damage +
               ", range=" + range +
               ", type=" + type + '\'' +
               '}';
                       
   }
}
