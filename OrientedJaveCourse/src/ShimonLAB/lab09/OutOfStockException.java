package ShimonLAB.lab09;


public class OutOfStockException extends Exception{
	Product product;
	int needed;
	public OutOfStockException(Product product,int needed) {
		this.product = product;
		this.needed = needed;
		// TODO Auto-generated constructor stub
	}

	public OutOfStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public OutOfStockException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public OutOfStockException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public OutOfStockException(Throwable cause) {
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

	public int getNeeded() {
		return needed;
	}

	public void setNeeded(int needed) {
		this.needed = needed;
	}

}
