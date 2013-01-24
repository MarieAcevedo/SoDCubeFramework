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
package com.sodcube.domain.factory;


import com.sodcube.domain.client.Adress;
import com.sodcube.domain.client.Client;
import com.sodcube.domain.client.UniqueIdentifier;
import com.sodcube.domain.factory.AggregateFactory;

/**
 * Factory of client root entity 
 * @author ”Marie Acevedo (http://www.sojanddesign.com)"
 *
 */
public class ClientAggregateFactory implements AggregateFactory {
    
    public Client create(String name, Adress adress){
	Client newClient = new Client(generateId());
	newClient.setName(name);
	newClient.setAdress(adress);
	return newClient;
    }

    private UniqueIdentifier generateId(){
	return new UniqueIdentifier(String.valueOf(Math.random()));
    }
}
