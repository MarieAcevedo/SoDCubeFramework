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
 * Entity is an abstract DomainObject class which has an identity that makes it
 * unique regardless of its state in the system. This identity is expressed in
 * the form of a dedicated attribute <code>uniqueIdentifier</code>.</br>
 * 
 * <code>uniqueIdentifier</code> is a ValueObject in read only. it is
 * initialized to the construction of the entity. </br> Each Entity is free to
 * choose the identification strategy to implement.
 * 
 * @author Marie Acevedo (http://www.sojanddesign.com)
 * @version 17 Jan. 2013 - 0.1
 */
public abstract class Entity <T extends ValueObject> extends DomainObject {

    /**
     * Fieds identity
     */
    private final T uniqueIdentifier;
    
    /**
     * Default constructeur.
     * At least an Entity must be defined with <code>uniqueIdentifier</code> 
     * @param uniqueIdentifier
     */
    public Entity(T uniqueIdentifier) {
	this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * @return the uniqueIdentifier
     */
    public T getUniqueIdentifier() {
	return this.uniqueIdentifier;
    }

    /**
     * Method delegating to the uniqueIdentifier ValueObject check if objects are even
     * @param dob DomainObject to equals
     * @return true if entity are even
     * @see fr.sodcube.domain.core.DomainObject#isSameAs(fr.sodcube.domain.core.DomainObject)
     */
    public boolean isSameAs(DomainObject dob) {
	return this.uniqueIdentifier.isSameAs(dob);
    }

}
