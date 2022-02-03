/**
 *  Copyright 2008 Studio Melipone
 * 
 *  This file is part of "Smash Uploader".
 *  
 *  Smash Uploader is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Foobar is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * 
 * plugin for UpShot (c)
 * http://www.upshotit.com
 * 
 */
package commands;
import java.awt.Desktop;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

import main.Smash;

/**
 * Command to execute dispose only
 * @author Maurício Bráz
 *
 */
public class VerifyDesktopSupportCommand extends Command {
    private String actionCommand;

    public VerifyDesktopSupportCommand(String actionCommand) {
        this.actionCommand = actionCommand;
    }

    public void execute() {
        try {
            if ( Desktop.isDesktopSupported() ) {//Test if the class Desktop is supported on the OS
                Desktop desktop = Desktop.getDesktop();
                
                if(actionCommand.equals("contactus")){
                    if(desktop.isSupported(Desktop.Action.MAIL))// test if the mail method is also supported
                        desktop.mail(new URI("mailto:contact@studiomelipone.eu"));
                }
                else if (desktop.isSupported(Desktop.Action.BROWSE)) {//test if the browse method is also supported
                    desktop.browse(new URI(actionCommand));
                }
            }
        } catch (MalformedURLException e) {
            JOptionPane.showMessageDialog(Smash.getFrames()[0], "About.actionPerformed() MalformedURException : "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(Smash.getFrames()[0], "About.actionPerformed() IOException : "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (URISyntaxException e) {
            JOptionPane.showMessageDialog(Smash.getFrames()[0], "About.actionPerformed() URISyntaxException : "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
