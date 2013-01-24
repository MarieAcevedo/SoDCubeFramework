/**
 * Copyright 2013 Marie Acevedo (http://www.sojanddesign.com)
 * This file is part of Framework So'D Cube (http://www.sojanddesign.com/Sodcube).
 *
 * Framework So'D Cube is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Framework So'D Cube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Framework So'D Cube.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.sodcube.domain.core;

/**
 * DomainObject is an abstract class that represents structurals objects of the business model.
 * @author Marie Acevedo (http://www.sojanddesign.com)
 * @version 17 jan. 2013 - 0.1
 */
public abstract class DomainObject {
	
	/**
	 * Method to check if DomainObject are identical.
	 * @param dob other DomainObject to check
	 * @return true if DomainObject are the same
	 */
	public abstract boolean isSameAs(DomainObject dob);

	/**
	 * Delegate to <code>isSameAs</code> method
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		boolean equals = false; 
		if (obj instanceof DomainObject) {
			equals = this.isSameAs((DomainObject) obj);
		}
		return equals;
	}
	
}
