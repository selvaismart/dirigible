/*******************************************************************************
 * Copyright (c) 2017 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * SAP - initial API and implementation
 *******************************************************************************/

package org.eclipse.dirigible.database.squle.test.derby;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.dirigible.database.squle.DataType;
import org.eclipse.dirigible.database.squle.Squle;
import org.eclipse.dirigible.database.squle.dialects.derby.DerbySquleDialect;
import org.junit.Test;

public class CreateTableTest {
	
	@Test
	public void createTableGeneric() {
		String sql = Squle.getNative(new DerbySquleDialect())
			.create()
			.table("CUSTOMERS")
			.column("ID", DataType.INTEGER, true, false, false)
			.column("FIRST_NAME", DataType.VARCHAR, false, false, true, "(20)")
			.column("LAST_NAME", DataType.VARCHAR, false, true, false, "(30)")
			.toString();
		
		assertNotNull(sql);
		assertEquals("CREATE TABLE CUSTOMERS ( ID INTEGER NOT NULL PRIMARY KEY , FIRST_NAME VARCHAR (20) NOT NULL UNIQUE , LAST_NAME VARCHAR (30) )", sql);
	}
	
	@Test
	public void createTableTypeSafe() {
		String sql = Squle.getNative(new DerbySquleDialect())
			.create()
			.table("CUSTOMERS")
			.columnInteger("ID", true, false, false)
			.columnVarchar("FIRST_NAME", 20, false, true, true)
			.columnVarchar("LAST_NAME", 30, false, true, false)
			.toString();
		
		assertNotNull(sql);
		assertEquals("CREATE TABLE CUSTOMERS ( ID INTEGER NOT NULL PRIMARY KEY , FIRST_NAME VARCHAR (20) UNIQUE , LAST_NAME VARCHAR (30) )", sql);
	}

}