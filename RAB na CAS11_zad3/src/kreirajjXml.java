import java.util.List;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;
class kreirajjXml {
    public void createXml(String filename, List<Student> studentList) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("students");
            doc.appendChild(rootElement);

            // student elements
            for (int i = 0; i < studentList.size(); i++) {
                Student student = studentList.get(i);

                Element studentElement = doc.createElement("student");
                rootElement.appendChild(studentElement);

                // set attribute to student element
                Attr attr = doc.createAttribute("id");
                attr.setValue(String.valueOf(i + 1));
                studentElement.setAttributeNode(attr);

                // shorten getter and setter names for readability
                Element imeElement = doc.createElement("ime");
                imeElement.appendChild(doc.createTextNode(student.getIme()));
                studentElement.appendChild(imeElement);

                Element prezimeElement = doc.createElement("prezime");
                prezimeElement.appendChild(doc.createTextNode(student.getPrezime()));
                studentElement.appendChild(prezimeElement);

                Element indexElement = doc.createElement("index");
                indexElement.appendChild(doc.createTextNode(String.valueOf(Integer.valueOf(student.getIndex()))));
                studentElement.appendChild(indexElement);

            }

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filename));
            StreamResult result1 = new StreamResult(System.out);
            transformer.transform(source, result);

            System.out.println("Student XML file e napraven!");

        } catch (Exception e) {
            System.out.println(toString());
        }
    }
}