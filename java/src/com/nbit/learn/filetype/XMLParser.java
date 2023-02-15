package com.nbit.learn.filetype;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser {

	public static void xmlParse() throws ParserConfigurationException, 
				IOException, SAXException {
		File f = new File("resources/contacts.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(f);
		doc.getDocumentElement().normalize();
		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
		
		NodeList nodeList = doc.getElementsByTagName("contact-info");
		
		for(int i=0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element e = (Element) node;
				System.out.println("Name:" + e.getElementsByTagName("name").item(0).getTextContent());
				System.out.print("Age:" + e.getElementsByTagName("age").item(0).getTextContent());
				if (e.getElementsByTagName("age").item(0).hasAttributes()) {
				
					System.out.println(e.getElementsByTagName("age").item(0).getAttributes().getNamedItem("type").getTextContent()); 
				}
				System.out.println("Ph:" + e.getElementsByTagName("phone").item(0).getTextContent());
			}
			System.out.println();
		}
	}
}
