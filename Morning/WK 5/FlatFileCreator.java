import java.io.*;
//import org.json.JSONObject;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class FlatFileCreator {
    public static void main(String[] args) {
        createCSV();
        createTXT();
        //createJSON();
        createXML();
        createLOG();
        createINI();
    }

    public static void createCSV() {
        String fileName = "data.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Date,Customer,Amount,Payment Method\n");
            writer.write("2024-04-01,John Doe,250.00,Credit Card\n");
            writer.write("2024-04-02,Jane Smith,180.00,PayPal\n");
            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createTXT() {
        String fileName = "notes.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("This is a sample text file containing notes.\n");
            writer.write("Java file operations example.\n");
            System.out.println("TXT file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createJSON() {
        String fileName = "config.json";
        JSONObject json = new JSONObject();
        json.put("theme", "dark");
        json.put("notifications", true);
        json.put("language", "English");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(json.toString(4));
            System.out.println("JSON file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createXML() {
        String fileName = "data.xml";
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element root = doc.createElement("response");
            doc.appendChild(root);
            
            Element status = doc.createElement("status");
            status.appendChild(doc.createTextNode("Success"));
            root.appendChild(status);
            
            Element message = doc.createElement("message");
            message.appendChild(doc.createTextNode("User created successfully"));
            root.appendChild(message);
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(fileName));
            transformer.transform(source, result);
            System.out.println("XML file created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createLOG() {
        String fileName = "app.log";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("[2024-04-01 10:15:30] ERROR: Database connection failed\n");
            writer.write("[2024-04-01 10:20:00] INFO: User login successful (User: admin)\n");
            System.out.println("LOG file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createINI() {
        String fileName = "config.ini";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("[General]\n");
            writer.write("username=admin\n");
            writer.write("theme=dark\n");
            writer.write("autologin=true\n");
            System.out.println("INI file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
