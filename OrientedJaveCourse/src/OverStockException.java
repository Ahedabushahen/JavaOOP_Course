
public class OverStockException extends Exception{
	Product product;
	int provided;
	public OverStockException(Product product,int provided) {
		this.product = product;
		this.provided = provided;
	}

	public OverStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public OverStockException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public OverStockException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public OverStockException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProvided() {
		return provided;
	}

	public void setProvided(int provided) {
		this.provided = provided;
	}

}
