# XMLOperations

- Package: XML Operations
- Author : Rishu Sarpal
- Date : 06/01/2019
- Description: Read any input XML , Search Tagnames and Update Values.

   - Constructor:
       XMLOperations(inputFile) - Pass the path of source input XML.
       XMLOperations() - creates a DocumentBuilder object to further use parseStringToXML() , toString() functions

   - Methods:
        1. public Node getParent(String tagName) - get first matching parent Node matching a tagName
        2. public Node getParentIndex(String tagName, int index) -get index based matching parent Node matching a tagName eg 1st or 4th
        3. public int getListCount (String tagName) - get count of number of occurrences of a tagname in XML
        4. public String getNodeValue(String tagName, Node parent ) - get the value of a Tagname eg <VBLEN>PT1234</VBLEN> returs PT1234
           public String getNodeValue(String path) - Uses XPath, not recommended for Performance testing. can cause Heap OOM errors
        5. public void updateItemValue(Node parent,String searchElement,String value)
               - find child searchElement/tagname of a parent and update its value, however doesnt searches for sub-child nodes of a child. Use updateSubNodeValue() for that.
        6. public void writeXMLFile(String destinationFile) - write modified XML to file
        7. public int getXpathCount(String inputxpath) - get the total occurences of an element using Xpath
        8. public void updateItemValue(String xpath, String newValue) - find element using Xpath and update its value
        9. public String toString() - returns String object for Document object.
        10. public void parseStringToXML(String textString) - Converts String to an XML Document object.
        11. public void parseStringToXMLFile(String textString, String outputFile) - Parses the String input as XML document object and writes to a file.
        12. public boolean updateSubNodeValue(Node parent,String searchChild,String value ) - Searches and updates the child node of a Parent Node.
        13. public Node findChildNodeOfParent(Node root, String searchElement) - Finds a child node of a Parent and returns a Node object to the child Node.