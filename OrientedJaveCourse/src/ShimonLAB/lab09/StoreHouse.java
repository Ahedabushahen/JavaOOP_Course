package ShimonLAB.lab09;

import java.util.HashMap;
import java.util.Map;

// storehouse.txt
public class StoreHouse{
	Map<Product,Integer> storeMap = new HashMap<Product, Integer>();
	public void define(Product product,int stock) { //redefine check
		storeMap.put(product, stock);
		
	}
	public void order(Product product,int stockOrder) throws OverStockException { // not defined
		if(this.storeMap.get(product) + stockOrder > product.getMaxStock()) {
			throw new OverStockException("too much");
		}
		this.storeMap.put(product, product.getMaxStock() + stockOrder);
	}
	public void supply(Product productName,int supplyAmount) throws OutOfStockException {
		if(this.storeMap.get(productName) < supplyAmount) {
			throw new OutOfStockException("out of stock");
		}
		this.storeMap.put(productName, this.storeMap.get(productName) - supplyAmount);
	}
	@Override
	public String toString() {
		return "StoreHouse [storeMap=" + storeMap + "]";
	}

}
