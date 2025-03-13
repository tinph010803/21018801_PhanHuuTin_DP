package decorator;

public class ConsumptionTaxDecorator extends TaxDecorator {
	public ConsumptionTaxDecorator(Product product) {
        super(product);
    }

    @Override
    public double calculateTax() {
        return super.calculateTax() + getPrice() * 0.05;
    }

    @Override
    public void displayInfo() {
        System.out.println("Áp dụng thuế tiêu thụ (5%)...");
        super.displayInfo();
    }
}
