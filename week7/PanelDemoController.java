package week7;

import java.awt.*;
import java.awt.event.*;

public class PanelDemoController {

    private PanelDemoModel model;

    private PanelDemoGUI view;

    private ActionListener colourListener;

    public PanelDemoController(PanelDemoModel model, PanelDemoGUI gui) {
        this.model = model;
        this.view = gui;
        gui.addActionListener(new ColourListener());
        model.addObserver(gui);
    }

    private class ColourListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Component source = (Component) e.getSource();
            if (source == view.getRedButton() || source == view.getRedChoice()) {
               model.changeRed();
            } else if (source == view.getBlueButton()
                    || source == view.getBlueChoice()) {
               model.changeBlue();
            } else if (source == view.getWhiteButton()
                    || source == view.getWhiteChoice()) {
               model.changeWhite();
            }
        }
    }

}