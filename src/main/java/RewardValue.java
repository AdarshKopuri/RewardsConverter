
public class RewardValue{
	
	private Double cashvalue;
	public static final MilesToCash_Ratio=0.0035; 
	
	public RewardValue(Double cashvalue) {
		this.cashvalue=cashvalue;
	}
	
	public RewardValue(int miles) {
		this.cashvalue=miles*MilesToCash_Ratio;
	}
	
	
	public Double getCashValue() {
		
		return miles*MilesToCash_Ratio;
	}
	
	public int getMilesValue() {
		
		return (int)(cashvalueMilesToCash_Ratio);
	}
	
}