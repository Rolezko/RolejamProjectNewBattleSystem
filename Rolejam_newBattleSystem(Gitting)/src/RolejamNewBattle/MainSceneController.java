package RolejamNewBattle;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;



public class MainSceneController {
	
	@FXML
	Label HeroStatAttackPowerL, HeroStatHpL, HeroStatDefenceL, HeroStatAttackSpeedL, HeroExpL, HeroLevelL;
	
	@FXML
	ProgressBar HeroStatHPPb, HeroExpPb;
	
	@FXML
	Button FindBattleB;
	
	@FXML
	ChoiceBox<String> HeroStatMagicSelector;
	

	
	Hero Hero = new Hero();
		
	public void UpdateHeroStat() {
		
		HeroStatHpL.setText(String.valueOf(Hero.getCurrentHP()) + "/" + String.valueOf(Hero.getMaxHP()));
		HeroStatHPPb.setProgress((double) Hero.CurrentHP / (double) Hero.MaxHP);
		HeroStatAttackPowerL.setText(String.valueOf(Hero.getAttackPower()));
		HeroStatDefenceL.setText(String.valueOf(Hero.getDefence()));
		HeroStatAttackSpeedL.setText(String.valueOf(Hero.getAttackSpeed()));
		HeroExpL.setText(String.valueOf(Hero.ExpCurrent) + "/" + String.valueOf(Hero.ExpMax));
		HeroExpPb.setProgress( (double) Hero.ExpCurrent / (double) Hero.ExpMax);
		HeroLevelL.setText(String.valueOf(Hero.Level));
		HeroStatMagicSelector.setItems(FXCollections.observableArrayList(Hero.HeroMagicList));
		HeroStatMagicSelector.setValue("-");
		//Hero.SelectedMagic = HeroStatMagicSelector.getValue();
		//System.out.println(Hero.SelectedMagic);

		
		
		
	}
	
	public void getSelectedMagic() {
		Hero.SelectedMagic = HeroStatMagicSelector.getValue();
	}
	
	@FXML
	public void FindBattleBPressed() {
		
		 try {
			 
	         FXMLLoader loader = new FXMLLoader(getClass().getResource("/RolejamNewBattle/BattleScene.fxml"));
	         Parent root = (Parent) loader.load();
	         Stage stage = new Stage();
	         stage.setTitle("BattleScene");
	         stage.setScene(new Scene(root));
	         stage.setResizable(false);
	         getSelectedMagic();
	         BattleSceneController localBSController = new BattleSceneController();
	         localBSController = loader.getController();
	         localBSController.Hero = this.Hero;
	         localBSController.UpdateAllParam();
	         localBSController.SetMainController(this);
	         
	         
	         stage.show();
	      
	     } 
		 catch (IOException e) {
	         e.printStackTrace();
	     }

		
	}
	
	public void SetHeroInfoFromBattleScene(Hero localHero) {
		Hero = localHero;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}