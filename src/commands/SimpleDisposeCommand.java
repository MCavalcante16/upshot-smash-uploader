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
import main.About;

/**
 * Command to execute dispose only
 * @author Maurício Bráz
 *
 */
public class SimpleDisposeCommand extends Command {
    private About about;

    public SimpleDisposeCommand(About about) {
        this.about = about;
    }

    public void execute() {
        about.dispose();
    }
}
