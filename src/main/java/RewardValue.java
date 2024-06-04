
public class RewardValue{
	
	private Double cashvalue;
	public static final Double MilesToCash_Ratio=0.0035; 
	
	public RewardValue(Double cashvalue) {
		this.cashvalue=cashvalue;
	}
	
	public RewardValue(int miles) {
		this.cashvalue=miles*MilesToCash_Ratio;
	}
	
	
	public Double getCashValue() {
		
		return cashvalue;
	}
	
	public int getMilesValue() {
		
		return (int)(cashvalue/MilesToCash_Ratio);
	}
	
}