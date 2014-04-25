package week7;

import java.util.Observable;

public class PanelDemoModel extends Observable {

   private boolean red;

   private boolean blue;

   private boolean white;

   public PanelDemoModel() {
      red = false;
      blue = false;
      white = false;
   }

   public void changeRed() {
      red = !red;
      setChanged();
      notifyObservers();
   }

   public void changeBlue() {
      blue = !blue;
      setChanged();
      notifyObservers();
   }

   public void changeWhite() {
      white = !white;
      setChanged();
      notifyObservers();
   }

   public boolean getRed() {
      return red;
   }

   public boolean getBlue() {
      return blue;
   }

   public boolean getWhite() {
      return white;
   }
}