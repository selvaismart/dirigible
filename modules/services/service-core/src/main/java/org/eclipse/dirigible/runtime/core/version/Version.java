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

import java.util.HashSet;
import java.util.Set;

/**
 * Version properties
 *
 */
public class Version {
	
	private String productName;
	
	private String productVersion;
	
	private String productType;
	
	private String instanceName;
	
	private String repositoryProvider = "local";
	
	private String databaseProvider = "local";
	
	private Set<String> modules = new HashSet<String>();
	
	private Set<String> engines = new HashSet<String>();

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productVersion
	 */
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * @param productVersion the productVersion to set
	 */
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the instanceName
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * @param instanceName the instanceName to set
	 */
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	/**
	 * @return the repositoryProvider
	 */
	public String getRepositoryProvider() {
		return repositoryProvider;
	}

	/**
	 * @param repositoryProvider the repositoryProvider to set
	 */
	public void setRepositoryProvider(String repositoryProvider) {
		this.repositoryProvider = repositoryProvider;
	}

	/**
	 * @return the databaseProvider
	 */
	public String getDatabaseProvider() {
		return databaseProvider;
	}

	/**
	 * @param databaseProvider the databaseProvider to set
	 */
	public void setDatabaseProvider(String databaseProvider) {
		this.databaseProvider = databaseProvider;
	}

	/**
	 * @return the modules
	 */
	public Set<String> getModules() {
		return modules;
	}

	/**
	 * @param modules the modules to set
	 */
	public void setModules(Set<String> modules) {
		this.modules = modules;
	}
	
	/**
	 * @return the engines
	 */
	public Set<String> getEngines() {
		return engines;
	}

	/**
	 * @param engines the engines to set
	 */
	public void setEngines(Set<String> engines) {
		this.engines = engines;
	}

}
