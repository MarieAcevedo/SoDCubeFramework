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

import com.sodcube.domain.core.Entity;


/**
 * Entity root of Client aggregate
 * @author ”Marie Acevedo (http://www.sojanddesign.com)"
 *
 */
public class Client extends Entity<UniqueIdentifier> {

    /**
     * client's name
     */
    private String name;
    
    /**
     * client's adress
     */
    private Adress adress;
    
    /**
     * @param uniqueIdentifier
     */
    public Client(UniqueIdentifier uniqueIdentifier) {
	super(uniqueIdentifier);
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adress
     */
    public Adress getAdress() {
        return this.adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

}
