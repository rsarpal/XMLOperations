import com.rsarpal.xmloperations.XMLOperations;

public class Test {

     public static void main(String args[]) {


        XMLOperations buildXML=new XMLOperations("sample1.xml");

        //update note

        buildXML.updateItemValue("//note/from", "ABC");

        System.out.println(buildXML.toString());


        //Write Content to XML File

         buildXML.writeXMLFile("" + "sample1"  + ".xml");


    }
}
