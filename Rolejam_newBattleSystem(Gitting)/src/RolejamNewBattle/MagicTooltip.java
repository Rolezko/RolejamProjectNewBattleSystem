package RolejamNewBattle;

import javafx.scene.control.Tooltip;

public class MagicTooltip {

	Tooltip BattleMagicTip = new Tooltip();
	
	
	//MagicToolTip.
	
	public Tooltip getMagicToolTipInfo(String TypeOfMagic, Tooltip localTooltip) {
		
		String FireBall = 	"������� 3 ��. ����� ����� �� ������ Magic �������.";
		String FrostBall = 	"������� 2 ��. ����� ����� �� ������ Magic �������.";
		
		
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
