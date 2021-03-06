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
package org.eclipse.dirigible.core.git.project;

/**
 * The ProjectMetadata representation of the project.json file.
 */
public class ProjectMetadata {

	public static final String PROJECT_METADATA_FILE_NAME = "project.json"; //$NON-NLS-1$

	private String guid;

	private String name;

	private String component;

	private String description;

	private String author;

	private ProjectMetadataLicense[] licenses;

	private ProjectMetadataRepository repository;

	private ProjectMetadataDependency[] dependencies;

	/**
	 * Gets the guid.
	 *
	 * @return the guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * Sets the guid.
	 *
	 * @param guid
	 *            the new guid
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the component.
	 *
	 * @return the component
	 */
	public String getComponent() {
		return component;
	}

	/**
	 * Sets the component.
	 *
	 * @param component
	 *            the new component
	 */
	public void setComponent(String component) {
		this.component = component;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author
	 *            the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the licenses.
	 *
	 * @return the licenses
	 */
	public ProjectMetadataLicense[] getLicenses() {
		return licenses != null ? licenses.clone() : new ProjectMetadataLicense[] {};
	}

	/**
	 * Sets the licenses.
	 *
	 * @param licenses
	 *            the new licenses
	 */
	public void setLicenses(ProjectMetadataLicense[] licenses) {
		if (licenses != null) {
			this.licenses = licenses.clone();
		} else {
			this.licenses = null;
		}
	}

	/**
	 * Gets the repository.
	 *
	 * @return the repository
	 */
	public ProjectMetadataRepository getRepository() {
		return repository;
	}

	/**
	 * Sets the repository.
	 *
	 * @param repository
	 *            the new repository
	 */
	public void setRepository(ProjectMetadataRepository repository) {
		this.repository = repository;
	}

	/**
	 * Gets the dependencies.
	 *
	 * @return the dependencies
	 */
	public ProjectMetadataDependency[] getDependencies() {
		return dependencies != null ? dependencies.clone() : new ProjectMetadataDependency[] {};
	}

	/**
	 * Sets the dependencies.
	 *
	 * @param dependencies
	 *            the new dependencies
	 */
	public void setDependencies(ProjectMetadataDependency[] dependencies) {
		if (dependencies != null) {
			this.dependencies = dependencies.clone();
		} else {
			this.dependencies = null;
		}
	}

}
