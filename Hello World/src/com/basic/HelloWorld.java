package com.basic;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class HelloWorld {

	public void foo(String s) {
		System.out.println("String");
	}

	public void foo(StringBuffer sb) {
		System.out.println("StringBuffer");
	}

	public static void main(String args[]) {
		System.out.println("Hello World");
		
		try {
			File fXmlFile = new File("C:/Users/neel_crasta/Desktop/Assignments/aie_assign3/countries.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();
			NodeList countryList = doc.getElementsByTagName("country");

			for (int temp1 = 0; temp1 < countryList.getLength(); temp1++) {
				Node nNode = countryList.item(temp1);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Country Name : "
							+ eElement.getAttribute("name"));
					System.out.println("climate : "
							+ eElement.getElementsByTagName("climate")
									.item(0).getTextContent());
					System.out.println("language : "
							+ eElement.getElementsByTagName("language").item(0)
									.getTextContent());
					
					NodeList cityList = eElement.getElementsByTagName("city");
					for (int temp2 = 0; temp2 < cityList.getLength(); temp2++) {
						nNode = cityList.item(temp2);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement1 = (Element) nNode;
							System.out.println("City Name : "
									+ eElement1.getAttribute("name"));
							System.out.println("City Population : "
									+ eElement.getElementsByTagName("city").item(temp2)
									.getTextContent());
						}
					}

				}
			}
		} catch(Exception e) {
			
		}
	}

}
