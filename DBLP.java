import java.util.*;
import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class DBLP {

	private ArrayList<Publication> publications = new ArrayList<Publication>();
	
	public void addPub(Publication x)
	{
		publications.add(x);
	}
	
	public static void main(String[] args) throws IOException, SAXException{
		System.setProperty("jdk.xml.entityExpansionLimit", "0");

		// XMLReader p = XMLReaderFactory.createXMLReader();
		// p.setContentHandler(new PREPROCESS());
		// p.parse("dblp.xml");
		String str = ""
		System.out.println()

		// p = XMLReaderFactory.createXMLReader();
		// p.setContentHandler(new Parser());
		// p.parse("C:/Users/Chainika Tanwar/java/DBLP/src/dblp.xml");
		
	}
}
