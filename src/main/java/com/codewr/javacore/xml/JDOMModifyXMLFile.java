package com.codewr.javacore.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author codewr
 */
public class JDOMModifyXMLFile {

    public static void main(String[] args) {

        try {

            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File("c:\\uploadFile\\staff_modify.xml");

            Document doc = (Document) builder.build(xmlFile);
            Element rootNode = doc.getRootElement();

            // update staff id attribute
            Element staff = rootNode.getChild("staff");
            staff.getAttribute("id").setValue("2");
            System.out.println("update staff id is 2");
            // add new age element
            Element age = new Element("age").setText("28");
            staff.addContent(age);
            System.out.println("add new age element");
            // update salary value
            staff.getChild("salary").setText("7000");
            System.out.println("update salary value is 7000");
            // remove firstname element
            staff.removeChild("firstname");
            System.out.println("remove firstname elemen");
            XMLOutputter xmlOutput = new XMLOutputter();

            // display nice nice
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("c:\\uploadFile\\staff_modify.xml"));

            // xmlOutput.output(doc, System.out);
            System.out.println("File updated!");
        } catch (IOException io) {
            io.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        }
    }
}
