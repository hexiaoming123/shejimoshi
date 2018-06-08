package templatemethod.interest;

public abstract class Account {
	/**
     * 模板方法，计算利息数额
     * @return    返回利息数额
     */
	public final double calculateInterest(){
		
		double interestRate = doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount = calculateAmount(accountType);
		return amount * interestRate ;
	}
	/**
     * 基本方法留给子类实现
     */
	protected double doCalculateInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
     * 基本方法留给子类实现
     */
	protected String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return null;
	}
	 /**
     * 基本方法，已经实现
     */
	private double calculateAmount(String accountType) {
		  /**
         * 省略相关的业务逻辑
         */
        return 7243.00;
	}
}
