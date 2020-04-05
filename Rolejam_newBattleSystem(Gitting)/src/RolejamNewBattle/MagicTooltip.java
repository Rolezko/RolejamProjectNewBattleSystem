package RolejamNewBattle;

import javafx.scene.control.Tooltip;

public class MagicTooltip {

	Tooltip BattleMagicTip = new Tooltip();
	
	
	//MagicToolTip.
	
	public Tooltip getMagicToolTipInfo(String TypeOfMagic, Tooltip localTooltip) {
		
		String FireBall = 	"Наносит 3 ед. урона огнем за каждую Magic позицию.";
		String FrostBall = 	"Наносит 2 ед. урона льдом за каждую Magic позицию.";
		
		
		switch(TypeOfMagic) {
		
		case("FireBall"):
			localTooltip.setText(FireBall);
			return localTooltip;
		
		
		
		case("FrostBall"):
			localTooltip.setText(FrostBall);
			return localTooltip;
		
		}
		localTooltip.setText("-");
		return localTooltip;
	}
	
	
	
	
	
	
	
	
	
	
}
