/*******************************************************************************
 * Copyright (c) 2017 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * SAP - initial API and implementation
 *******************************************************************************/

package org.eclipse.dirigible.database.squle.dialects.hana;

import org.eclipse.dirigible.database.squle.builders.DropBranchingBuilder;
import org.eclipse.dirigible.database.squle.builders.records.DeleteBuilder;
import org.eclipse.dirigible.database.squle.builders.records.InsertBuilder;
import org.eclipse.dirigible.database.squle.builders.records.SelectBuilder;
import org.eclipse.dirigible.database.squle.builders.records.UpdateBuilder;
import org.eclipse.dirigible.database.squle.builders.sequence.NextValueSequenceBuilder;
import org.eclipse.dirigible.database.squle.dialects.DefaultSquleDialect;

public class HanaSquleDialect extends DefaultSquleDialect<SelectBuilder, InsertBuilder, UpdateBuilder, DeleteBuilder, HanaCreateBranchingBuilder, DropBranchingBuilder, HanaNextValueSequenceBuilder> {

	public HanaNextValueSequenceBuilder nextval(String sequence) {
		return new HanaNextValueSequenceBuilder(this, sequence);
	}

	@Override
	public HanaCreateBranchingBuilder create() {
		return new HanaCreateBranchingBuilder(this);
	}
}