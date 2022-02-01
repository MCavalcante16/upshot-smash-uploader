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
package table;

import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.table.TableCellRenderer;

/**
 * Create a special cell render for the first column of Smash images table
 * This cell render let us display a JButton associated with the given file in order
 * to permit its deletion from the tablelist
 * @author Gregory Durelle
 *
 */
public abstract class CellRender extends JButton implements TableCellRenderer{

	private static final long serialVersionUID = 1L;
	private ResourceBundle msg;

	/**
	 * Set the language resource as given in Smash class
	 * @param rb the ResourceBundle representing the language
	 */
	public abstract void setResourceBundle(ResourceBundle rb);
	
	/**
	 * Redraw all labels and buttons in the appropriate language
	 */
	private abstract void displayLanguage();
}
