
package finalproject;

import java.util.Random;

public class Monster {
    private int hitPointsMonster;
    private int strengthMonster;
    private int dexterityMonster;
    private int intelligenceMonster;
    private int stats;
    
    public Monster(){
       Random rand = new Random();
       hitPointsMonster = rand.nextInt(5)+ 1;
       stats = hitPointsMonster * 2;
       strengthMonster = stats;
       dexterityMonster = stats;
       intelligenceMonster = stats;
       }
    
    public int getHitPointsMonster(){
        return hitPointsMonster;
    }
    public int getStrengthMonster(){
        return strengthMonster;
    }
    public int getDexterityMonster(){
        return dexterityMonster;
    }
    public int getIntelligenceMonster(){
        return intelligenceMonster;
    }
    public int getStats() {
        return stats;
    }

	public void setStats(int stats) {
		this.stats = stats;
	}

	public void setHitPointsMonster(int hitPointsMonster) {
		this.hitPointsMonster = hitPointsMonster;
	}

	public void setStrengthMonster(int strengthMonster) {
		this.strengthMonster = strengthMonster;
	}

	public void setDexterityMonster(int dexterityMonster) {
		this.dexterityMonster = dexterityMonster;
	}

	public void setIntelligenceMonster(int intelligenceMonster) {
		this.intelligenceMonster = intelligenceMonster;
	}
    
	  public Boolean alive() {
	    	if(this.hitPointsMonster >0) {
	    		return true;
	    	}
	    	return false;
	    }
    


    
}

    

