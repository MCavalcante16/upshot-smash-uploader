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

import java.util.Locale;

import main.About;

/**
 * Class to request commands
 * @author Maurício Bráz
 *
 */
public class Invoker {
    private Command command;

    public Invoker(){}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }

    public void executeAboutCommand(About about, String s) {
        switch(s) {
			case "ok":
				this.setCommand(new SimpleDisposeCommand(about));
				break;
			case "fr":
				this.setCommand(new SetNewLanguageCommand(about, new Locale("fr","FR")));
				break;
			case "en":
				this.setCommand(new SetNewLanguageCommand(about, new Locale("en","US")));
				break;
			default:
				this.setCommand(new VerifyDesktopSupportCommand(s));
		}

		this.executeCommand();
    }
}
