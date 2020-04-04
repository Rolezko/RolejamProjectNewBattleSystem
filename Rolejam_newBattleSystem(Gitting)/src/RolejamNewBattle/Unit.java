package RolejamNewBattle;
import java.util.*;


public class Unit {
	
	public String Name;
	public int CurrentHP, MaxHP, AttackPower, AttackSpeed, Defence, Level, ExpCurrent, ExpMax, ExpToNextLevel, SpinCount;
	//public String[] MagicList;
	
	public ArrayList<String> MagicList = new ArrayList<String>();
	
	
	
	public ArrayList<String> getCurrentMagicList() {
		return this.MagicList;
	}
	
	public void setMagicList(String NewMagic) {
	this.MagicList.add(NewMagic);
				
	}


	public int getCurrentHP() {
		return this.CurrentHP;
	}
	
	public void setCurrentHP(int HP) {
		this.CurrentHP = HP;
	}
	
	public int getMaxHP() {
		return this.MaxHP;
	}
	
	public void setMaxHP(int HP) {
		this.MaxHP = HP;
	}
	
	
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getAttackPower() {
		return this.AttackPower;
	}
	
	public void setAttackPower(int AttackPower) {
		this.AttackPower = AttackPower;
	}
	
	public int getDefence() {
		return this.Defence;
	}
	
	public void setDefence(int Defence) {
		this.Defence = Defence;
	}
	
	public int getAttackSpeed() {
		return this.AttackSpeed;
	}
	
	public void setAttackSpeed(int AttackSpeed) {
		this.AttackSpeed = AttackSpeed;
	}
	
	public void setSpinCount(int SpinCount) {
		this.SpinCount = SpinCount;
	}
	
	public int getSpinCount() {
		return this.SpinCount;
	}
}