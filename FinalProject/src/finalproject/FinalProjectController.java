package finalproject;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FinalProjectController implements Initializable {
    
    private Player player;
    private Monster monster; 
    private int totalGold; 
    private int gold = 3;
    private int die; // random 20
    private boolean monsterEncounter = false;
    private boolean monsterEncounterSleep = false;
      
    @FXML
    private TextArea textLog;
    @FXML
    private Button northButton;
    @FXML
    private Button westButton;
    @FXML
    private Button southButton;
    @FXML
    private Button eastButton;     
    @FXML
    private Label hitPointsPLabel;  
    @FXML
    private Label strengthPLabel;
    @FXML
    private Label dexterityPLabel;
    @FXML
    private Label intelligencePLabel;
    @FXML
    private Label monsterHitPointsLabel;
    @FXML
    private Label monsterStrengthLabel;
    @FXML
    private Label monsterDexterityLabel;
    @FXML
    private Label monsterIntelligenceLabel;
    @FXML
    private Label totalGoldLabel;
    @FXML
    private Button fightButton;
    @FXML
    private Button searchButton;
    @FXML
    private Button runButton;
    @FXML
    private Button sleepButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          updateLabels();             
         textLog.appendText("Pick a direction to begin \n");
         optionsMode(true);
    }
    
    public FinalProjectController(){  // constructor for classes
       player = new Player();
       monster = new Monster();
       die = giveRandom2(21);
       int dieSide = (3);
    }
    
    public void directionBlocked (){
        int chance2 = this.giveRandom2(4 +1);
        if(chance2 == 1){
            northButton.setDisable(true);
            textLog.appendText("You were blocked, Pick a new direction \n");
        }
         if(chance2 == 2){
             southButton.setDisable(true);
             textLog.appendText("You were blocked, Pick a new direction \n");
         }
         if(chance2 == 3){
             eastButton.setDisable(true);
             textLog.appendText("You were blocked, Pick a new direction \n");
         }
         if(chance2 == 4){
            westButton.setDisable(true);
            textLog.appendText("You were blocked, Pick a new direction \n");
         }
    }
    
  
    public void monsterEncounter(int dieSide) {
        int chance = this.giveRandom2(3 +1);
        
        if(chance == 1) {
              monsterEncounter = true;
              battleMode(true);
              searchButton.setDisable(true);
              sleepButton.setDisable(true);
              fightButton.setDisable(false);
              runButton.setDisable(false);
              textLog.appendText("A monster is looking at you! \n");
            }
         else{
            battleMode(false);
            fightButton.setDisable(true);
            runButton.setDisable(false);
            searchButton.setDisable(false);
            sleepButton.setDisable(false);
            textLog.appendText("No monster, your safe! \n");
            }    
       }
    
        private int giveRandom(int max) {
    	Random rand = new Random();
    	int r = rand.nextInt(max)+1;
        if( r == 1){
        textLog.appendText("There's a Monster!!\n");
        }      
      return r;
     }
     private int giveRandom2(int max) {
    	Random rand = new Random();
    	int r = rand.nextInt(max)+1;
    	return r;
    }
      
    
    
    
     public void battleMode(Boolean state) {
    	 northButton.setDisable(state);
    	 southButton.setDisable(state);
    	 westButton.setDisable(state);
    	 eastButton.setDisable(state);
    }
     
     public void optionsMode (Boolean state){
         fightButton.setDisable(state);
         runButton.setDisable(state);
         searchButton.setDisable(state);
         sleepButton.setDisable(state);
     }
    
                          
    @FXML
    private void runButtonClicked(ActionEvent event) {
        this.die = this.giveRandom(21);
        if (die < monster.getIntelligenceMonster()){
            player.setHitPoints((player.getHitPoints() - 7));
            hitPointsPLabel.setText("Hit Points = \n" + player.getHitPoints());
            player.setHitPoints(player.getHitPoints());
        textLog.appendText("The monster hit you while you ran (-7 hit points) \n");
            battleMode(false);
            optionsMode(true);
            if(!player.alive()){
                textLog.appendText("You died. Game Over.");
                battleMode(true);
                optionsMode(true);
            }
        }else{
            textLog.appendText("Your sneaky.. You got away!!\n");
            battleMode(false);
            optionsMode(true);
        }
            }
       
      @FXML
    private void searchButtonClicked(ActionEvent event) {
        this.gold = this.giveRandom2(3);
        this.die = this.giveRandom2(21);
        if (die < player.getIntelligence()){
            player.setTotalGold(player.getTotalGold()+ gold);
            totalGoldLabel.setText("Gold = " + (player.getTotalGold()+ "\n"));
            textLog.appendText("Gold found = "+gold+" \n"); 
            battleMode(false);
            optionsMode(true);
        }
         else{
            textLog.appendText("No Gold Found.. Sorry.\n");
            battleMode(false);
            optionsMode(true);
            
          }
        
    }
    
    public void  monsterFightAI() {
        this.die = this.giveRandom2(21);
          if (die >= player.getDexterity()){
            player.setHitPoints((monster.getStrengthMonster() / 3));
            hitPointsPLabel.setText("Hit Points = "+ player.getHitPoints());
            player.setHitPoints(player.getHitPoints());
            textLog.appendText("The Monster hit you :( \n");
              optionsMode(true);
              battleMode(false);
            
          }
    }
                            
      @FXML
    private void fightButtonClicked(ActionEvent event) {
        this.die = this.giveRandom2(21);
     if (die >= monster.getDexterityMonster()){   
            monster = new Monster();
            monster.setHitPointsMonster((int) Math.ceil(player.getStrength() /3));
            monsterHitPointsLabel.setText("Hit Points = "+ monster.getHitPointsMonster());
            monster.setHitPointsMonster(monster.getHitPointsMonster());
            textLog.appendText("You hit the monster \n"); 
            battleMode(false);
            optionsMode(true);
                        
     }
         if(monster.alive() && player.alive()) {
        	monsterFightAI();
        	if(!player.alive()) {
                     textLog.appendText("Game Over \n");
                     battleMode(true);
                     optionsMode(true);
        	}
        }else {
        	textLog.appendText("Monster Dead!");
        	monster = new Monster();
        	battleMode(false);
        	monsterEncounter = false;
         }
        updateLabels();
    }
           
    @FXML
    private void sleepButtonClicked(ActionEvent event) {
            this.die = giveRandom2(7);
            player.setHitPoints(20);
            hitPointsPLabel.setText("Hit Points = " + player.getHitPoints());
            textLog.appendText("You slept. Hit Points = " + player.getHitPoints()+"\n");
                        
             if(this.die == 1){
                player.setHitPoints((player.getHitPoints() - 7));
                hitPointsPLabel.setText("Hit Points = \n" + player.getHitPoints());
                player.setHitPoints(player.getHitPoints());
                textLog.appendText("The monster hit you while sleeping (-7 hit points) \n");
                }
             
            optionsMode(true);
            battleMode(false);
    }
    
      @FXML
    private void northButtonClicked(ActionEvent event) {
        int chance2 = this.giveRandom2(4 +1);
        if(chance2 == 1){
            northButton.setDisable(true);
            textLog.appendText("You were blocked, Pick a new direction \n");
        }
        else{textLog.appendText("Clicked: North\n");
        monsterEncounter(3 +1);
         }
    }
    @FXML
    private void westButtonClicked(ActionEvent event) {
        int chance2 = this.giveRandom2(4 +1);
        if(chance2 == 1){
            westButton.setDisable(true);
            textLog.appendText("You were blocked, Pick a new direction \n");
        }
        else{ textLog.appendText("Clicked: West\n");
        monsterEncounter(3 +1);
         }
    }
    @FXML
    private void southButtonClicked(ActionEvent event) {
        int chance2 = this.giveRandom2(4 +1);
        if(chance2 == 1){
            southButton.setDisable(true);
            textLog.appendText("You were blocked, Pick a new direction \n");
        }else{
        textLog.appendText("Clicked: South\n");
        monsterEncounter(3 +1);
          }
    }
    
    @FXML
    private void eastButtonClicked(ActionEvent event) {
        int chance2 = this.giveRandom2(4 +1);
        if(chance2 == 1){
            eastButton.setDisable(true);
            textLog.appendText("You were blocked, Pick a new direction \n");
        }else{
        textLog.appendText("Clicked: East\n");
        monsterEncounter(3 +1);
          } 
    }
        
    private void updateLabels(){
        
        int hitpoints = player.getHitPoints();
        hitPointsPLabel.setText("Hit Points = " + hitpoints);
       
        int strength = player.getStrength();
        strengthPLabel.setText("Strength = " + strength);
        
        int dexterity = player.getDexterity();
        dexterityPLabel.setText("Dexterity = " + dexterity);
        
        int intelligence = player.getIntelligence();
        intelligencePLabel.setText("Intelligence = " + intelligence);
        
        int hitPointsMonster = monster.getHitPointsMonster();
        monsterHitPointsLabel.setText("Hit Points = " + hitPointsMonster);
        
        int strengthMonster = monster.getStrengthMonster();
        monsterStrengthLabel.setText("Strength = " + strengthMonster);
        
        int dexterityMonster = monster.getDexterityMonster();
        monsterDexterityLabel.setText("Dexterity = " + dexterityMonster);
        
        int intelligenceMonster = monster.getIntelligenceMonster();
        monsterIntelligenceLabel.setText("Intelligence = " + intelligenceMonster);
       
         totalGold = player.getTotalGold();
        totalGoldLabel.setText("Gold = " + totalGold);
       
    }
}
