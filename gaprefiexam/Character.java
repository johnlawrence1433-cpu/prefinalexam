/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaprefiexam;

/**
 *
 * @author User
 */
public abstract class Character {
    private String name;
    private int level;
    private int health;
    private Weapon weapon;
    
    public Character(String name, int level, int health, Weapon weapon) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.weapon = weapon;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public Weapon getWeapon() {
        return weapon;
    }
    
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", weapon=" + weapon +
                '}';
    }
        
        public abstract void attack();
        public abstract void defend();    
        }
                
    
   
