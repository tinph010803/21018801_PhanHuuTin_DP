package adapter;

import org.json.JSONObject;
import org.json.XML;

public class XMLToJSONAdapter implements JSONService {
	private XMLService xmlService;

    public XMLToJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public void processJSON(String jsonData) {
        // Lấy dữ liệu XML từ Adaptee
        String xmlData = xmlService.getXMLData();

        // Chuyển đổi XML thành JSON
        JSONObject json = XML.toJSONObject(xmlData);

        // Xử lý JSON
        System.out.println("Đã chuyển đổi XML thành JSON:");
        System.out.println(json.toString(4)); // In JSON đẹp hơn
    }
}
