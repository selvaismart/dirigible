package org.eclipse.dirigible.runtime.repository.processor;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	
	private String name;
	
	private String path;
	
	private List<Collection> collections = new ArrayList<Collection>();
	
	private List<Resource> resources = new ArrayList<Resource>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<Collection> getCollections() {
		return collections;
	}

	public void setCollections(List<Collection> collections) {
		this.collections = collections;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

}
