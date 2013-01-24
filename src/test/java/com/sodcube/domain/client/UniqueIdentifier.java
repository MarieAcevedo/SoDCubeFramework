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
package com.sodcube.domain.client;

import com.sodcube.domain.core.DomainObject;
import com.sodcube.domain.core.ValueObject;

/**
 * Classe définissant un identifiant unique sous forme de string
 * @author ”Marie Acevedo (http://www.sojanddesign.com)"
 * @version 17 Jan. 2013 -0.1
 */
public class UniqueIdentifier extends ValueObject {

    /**
     * string value of unique identifier
     */
    private final String id;
    
    /**
     * @param id
     */
    public UniqueIdentifier(String id) {
	this.id = id;
    }

    /**
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @see fr.sodcube.domain.core.DomainObject#isSameAs(fr.sodcube.domain.core.DomainObject)
     */
    @Override
    public boolean isSameAs(DomainObject dob) {
	boolean isSameAs = false;
	if (dob instanceof UniqueIdentifier){
	   isSameAs = id.equals(((UniqueIdentifier) dob).getId()); 
	}
	return isSameAs;
    }

}
