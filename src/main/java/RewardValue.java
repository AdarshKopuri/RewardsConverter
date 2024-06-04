
public class RewardValue{
	
	private Double cashvalue;
	private float miles;
	
	public RewardValue(Double cashvalue) {
		this.cashvalue=cashvalue;
	}
	
	public RewardValue(float miles) {
		this.miles=miles;
	}
	
	
	public Double getCashValue() {
		
		return miles/0.0035;
	}
	
	public Double getMilesValue() {
		
		return cashvalue*0.0035;
	}
	
}