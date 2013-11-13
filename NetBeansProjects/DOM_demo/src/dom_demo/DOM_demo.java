/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dom_demo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



/**
 *
 * @author luan
 */
public class DOM_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File xmlFile=new File("./src/dom_demo/Student.xml");
            if(!xmlFile.isFile()){
                System.out.println("File not found !");
                return;
            }
            DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder=dbf.newDocumentBuilder();
            Document doc=dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root: "+doc.getDocumentElement().getNodeName());
            NodeList nList=doc.getElementsByTagName("staff");
            System.out.println("*************");
            for(int temp=0; temp<nList.getLength(); temp++){
                Node nNode=nList.item(temp);
                System.out.println("Current Node: "+nNode.getNodeName());
                    Element eElement=(Element) nNode;
                    System.out.println("Staff ID: "+eElement.getAttribute("id"));
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("./src/dom_demo/luan.xml"));
		transformer.transform(source, result);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DOM_demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(DOM_demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DOM_demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DOM_demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DOM_demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
