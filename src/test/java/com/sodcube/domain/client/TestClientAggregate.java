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

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author ”Marie Acevedo (http://www.sojanddesign.com)"
 *
 */
public class TestClientAggregate {

    @Test
    public void testCreateClientAggregate() {
	Client client1 = new Client(new UniqueIdentifier("1"));
	client1.setName("Marie");
	client1.setAdress(new Adress("avenue de Chiquet", "Pessac", "Gironde", "France"));
	Client client2 = new Client(new UniqueIdentifier("2"));
	client2.setName("Marie");
	client2.setAdress(new Adress("avenue de Chiquet", "Pessac", "Gironde", "France"));
	
	Assert.assertFalse(client1.isSameAs(client2));
	Assert.assertTrue(client1.getAdress().isSameAs(client2.getAdress()));
    }

}
