
package proyectoprogra1;

public class Personaje {
    public String nombre;
    public int vitality; 
    public int strength;
    public int stamina;
    public int agility;
    public int intelligence;
    public int dexterity; 
    public int resistance; 
    public int luck;
    public String attribute;
    public String weapon; 

    public Personaje(String nombre, int vitality, int strength, int stamina, int agility, int intelligence, int dexterity, int resistance, int luck, String attribute,String weapon) {
        this.nombre = nombre;
        this.vitality = vitality;
        this.strength = strength;
        this.stamina = stamina;
        this.agility = agility;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.resistance = resistance;
        this.luck = luck;
        this.weapon = weapon;
        this.attribute = attribute;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Personaje: " + nombre + "\nVitality: " + vitality + "\nStrength: " + strength + "\nStamina: " + stamina + "\nAgility: " + agility + "\nIntelligence: " + intelligence + "\nDexterity: " + dexterity + "\nResistance: " + resistance + "\nLuck: " + luck + "\nWeapon: " + weapon;
    }
    
    
}
