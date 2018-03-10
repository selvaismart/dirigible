/*
 * Copyright (c) 2017 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * SAP - initial API and implementation
 */

package org.eclipse.dirigible.bpm.flowable.synchronizer;

import org.eclipse.dirigible.core.scheduler.api.IJobDefinitionProvider;
import org.eclipse.dirigible.core.scheduler.api.ISchedulerCoreService;
import org.eclipse.dirigible.core.scheduler.service.definition.JobDefinition;

/**
 * The Class BPMSynchronizerJobDefinitionProvider.
 */
public class BpmSynchronizerJobDefinitionProvider implements IJobDefinitionProvider {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.dirigible.core.scheduler.api.IJobDefinitionProvider#getJobDefinition()
	 */
	@Override
	public JobDefinition getJobDefinition() {
		JobDefinition jobDefinition = new JobDefinition();
		jobDefinition.setName("dirigible-internal-bpm-synchronizer-job");
		jobDefinition.setGroup(ISchedulerCoreService.JOB_GROUP_INTERNAL);
		jobDefinition.setClazz(BpmSynchronizerJob.class.getCanonicalName());
		jobDefinition.setDescription("BPM Synchronizer Job");
		jobDefinition.setExpression("0/30 * * * * ?");
		jobDefinition.setSingleton(true);
		return jobDefinition;
	}

}
