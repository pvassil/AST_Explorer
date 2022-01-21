package MainJavaParser;

import java.io.File;
import java.io.IOException;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.text.edits.MalformedTreeException;




public class smallClient {

	public static void main(String[] args) throws MalformedTreeException, IOException, BadLocationException {
			
			File [] root = new File[1];
			root[0] = new File("D:\\Users\\pvassil\\COURSES\\SW_Eng\\SW_DEV\\SCRIPTS\\01_bookstore_advanced\\src");
			RecursiveFileVisitor visitor = new RecursiveFileVisitor (); 
			visitor.visitAllFiles(root);

	}

}//end class
