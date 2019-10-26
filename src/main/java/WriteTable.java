import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class WriteTable{
    private final String url = "jdbc:postgresql://127.0.0.1:5432/test";
    private final String user = "postgres";
    private final String password = "08112015";


    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();

    // создаем пустой объект Document, в котором будем
    // создавать наш xml-файл
    Document doc = builder.newDocument();
    // создаем корневой элемент
    Element rootElement = doc.createElement("");
    doc.appendChild(rootElement);

