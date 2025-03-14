package decorator;

public class Main {
    public static void main(String[] args) {
        // Thanh toán bằng thẻ tín dụng (chưa có phí hoặc giảm giá)
        Payment creditCardPayment = new BasePayment("Thẻ tín dụng");
        creditCardPayment.processPayment(100);

        // Thêm phí xử lý
        Payment creditCardWithFee = new ProcessingFeeDecorator(creditCardPayment, 5);
        creditCardWithFee.processPayment(100);

        // Thêm mã giảm giá
        Payment creditCardWithDiscount = new DiscountDecorator(creditCardPayment, 10);
        creditCardWithDiscount.processPayment(100);

        // Kết hợp cả phí xử lý + mã giảm giá
        System.out.println("Áp dụng cả phí xử lý và mã giảm giá...");
        Payment fullPayment = new DiscountDecorator(new ProcessingFeeDecorator(creditCardPayment, 5), 10);
        fullPayment.processPayment(100);
    }
}
