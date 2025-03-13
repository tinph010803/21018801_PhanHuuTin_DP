package decorator;

public abstract class TaxDecorator implements Product {
	protected Product decoratedProduct;

    public TaxDecorator(Product product) {
        this.decoratedProduct = product;
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice();
    }

    @Override
    public double calculateTax() {
        return decoratedProduct.calculateTax();
    }

    @Override
    public void displayInfo() {
        decoratedProduct.displayInfo();
    }
}
