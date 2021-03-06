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
package org.eclipse.dirigible.runtime.core.version;

import java.io.IOException;
import java.util.Properties;

import org.eclipse.dirigible.commons.api.helpers.GsonHelper;
import org.eclipse.dirigible.commons.api.module.DirigibleModulesInstallerModule;
import org.eclipse.dirigible.commons.config.Configuration;
import org.eclipse.dirigible.database.api.IDatabase;
import org.eclipse.dirigible.engine.api.EngineExecutorFactory;
import org.eclipse.dirigible.repository.api.IRepository;

public class VersionProcessor {
	
	public Version getVersion() throws IOException {
		Version version = new Version();
		final Properties properties = new Properties();
		properties.load(VersionProcessor.class.getResourceAsStream("/dirigible.properties"));
		version.setProductName(properties.getProperty("DIRIGIBLE_PRODUCT_NAME"));
		version.setProductVersion(properties.getProperty("DIRIGIBLE_PRODUCT_VERSION"));
		version.setProductType(properties.getProperty("DIRIGIBLE_PRODUCT_TYPE"));
		version.setInstanceName(properties.getProperty("DIRIGIBLE_INSTANCE_NAME"));
		version.setRepositoryProvider(Configuration.get(IRepository.DIRIGIBLE_REPOSITORY_PROVIDER));
		version.setDatabaseProvider(Configuration.get(IDatabase.DIRIGIBLE_DATABASE_PROVIDER));
		version.getModules().addAll(DirigibleModulesInstallerModule.getModules());
		version.getEngines().addAll(EngineExecutorFactory.getEnginesNames());
		return version;
	}
	
	public String version() throws IOException {
		return GsonHelper.GSON.toJson(getVersion());
	}
	
	

}
