package week7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.SwingWorker;

public class FileContentReader extends SwingWorker<String, Void> {

   public static String NEW_LINE = System.getProperty("line.separator");

   private StringBuffer contents;

   private File file;
   
   private WorkerGui handle;

   public FileContentReader(String filename, WorkerGui gui) {
      file = new File(filename);
      contents = new StringBuffer();
      handle = gui;
   }

   @Override
   protected String doInBackground() throws Exception {
      if (file.exists()) {
         BufferedReader reader = new BufferedReader(new FileReader(file));
         String line;
         while ((line = reader.readLine()) != null) {
            contents.append(line).append(NEW_LINE);
         }
         reader.close();
      }
      return new String(contents);
   }

   @Override
   protected void done() {
      handle.addContents(new String(contents));
   }
}
