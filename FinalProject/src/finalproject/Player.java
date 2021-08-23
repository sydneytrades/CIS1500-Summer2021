
package finalproject;

import java.util.Random;

public class Player {
    private int hitPoints;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int totalGold;
    
    
    public Player(){
        int multiple = 3;
        Random rand = new Random();
        hitPoints = 20;
        strength = rand.nextInt(5 +1) * multiple;
        dexterity = rand.nextInt(5 +1) * multiple;
        intelligence = rand.nextInt(5 +1) * multiple;
        totalGold = 0;
        
        strength+= 1 * 3;
        dexterity+= 1 * 3;
        intelligence+= 1 * 3;
     
    }
  
    public Boolean alive() {
    	if(this.hitPoints >0) {
    		return true;
    	}
    	return false;
    }
    
     public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void setTotalGold(int totalGold) {
		this.totalGold = totalGold;
		System.out.println(totalGold);
	}
    
     public int getHitPoints(){
        return hitPoints;
    }
    public int getStrength(){
       return strength;
    }
    public int getDexterity(){
       return dexterity;
    }
    public int getIntelligence(){
       return intelligence;
    }
    public int getTotalGold(){
        return totalGold;
    }
    
}
    
    
    
