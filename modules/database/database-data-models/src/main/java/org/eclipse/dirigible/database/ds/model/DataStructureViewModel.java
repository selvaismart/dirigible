/**
 * Copyright (c) 2010-2018 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 */
package org.eclipse.dirigible.database.ds.model;

/**
 * The view model representation.
 */
public class DataStructureViewModel extends DataStructureModel {

	private String query;

	/**
	 * Getter for the query field.
	 *
	 * @return the SQL query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * Setter for the query field.
	 *
	 * @param query            the SQL query
	 */
	public void setQuery(String query) {
		this.query = query;
	}

}
