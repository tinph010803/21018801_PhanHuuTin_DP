package adapter;

public class Main {
	 public static void main(String[] args) {
	        // Hệ thống gốc chỉ hỗ trợ XML
	        XMLService xmlService = new XMLService();

	        // Sử dụng Adapter để chuyển đổi sang JSON
	        JSONService adapter = new XMLToJSONAdapter(xmlService);

	        // Gọi dịch vụ JSON với dữ liệu XML đã được chuyển đổi
	        adapter.processJSON("");
	    }
}
