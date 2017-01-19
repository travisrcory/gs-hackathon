/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.gs.hack.timesheets.model.impl;

import aQute.bnd.annotation.ProviderType;
import com.liferay.gs.hack.timesheets.model.TimesheetTaskDuration;

import java.util.List;

/**
 * The extended model implementation for the TimesheetTask service. Represents a row in the &quot;TS_TimesheetTask&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.gs.hack.timesheets.model.TimesheetTask} interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
@ProviderType
public class TimesheetTaskImpl extends TimesheetTaskBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a timesheet task model instance should use the {@link com.liferay.gs.hack.timesheets.model.TimesheetTask} interface instead.
	 */
	public TimesheetTaskImpl() {
	}

	public List<TimesheetTaskDuration> getTimesheetTaskDurations() {
		return timesheetTaskDurations;
	}

	public void setTimesheetTaskDurations(List<TimesheetTaskDuration> timesheetTaskDurations) {
		this.timesheetTaskDurations = timesheetTaskDurations;
	}

	private List<TimesheetTaskDuration> timesheetTaskDurations;
}