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
 * @author ”Marie Acevedo (http://www.sojanddesign.com)"
 *
 */
public class Adress extends ValueObject {
    
    private String street;
    private String city;
    private String state;
    private String country;

    /**
     * @param street
     * @param city
     * @param state
     * @param country
     */
    public Adress(String street, String city, String state, String country) {
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;
    }

    /* (non-Javadoc)
     * @see fr.sodcube.domain.core.DomainObject#isSameAs(fr.sodcube.domain.core.DomainObject)
     */
    @Override
    public boolean isSameAs(DomainObject dob) {
	boolean isSameAs = false;
	if(dob instanceof Adress){
	    isSameAs = street.trim().equalsIgnoreCase(((Adress) dob).getStreet().trim());
	    isSameAs = isSameAs && city.trim().equalsIgnoreCase(((Adress) dob).getCity().trim());
	    isSameAs = isSameAs && state.trim().equalsIgnoreCase(((Adress) dob).getState().trim());
	    isSameAs = isSameAs && country.trim().equalsIgnoreCase(((Adress) dob).getCountry().trim());
	}
	return isSameAs;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

}
