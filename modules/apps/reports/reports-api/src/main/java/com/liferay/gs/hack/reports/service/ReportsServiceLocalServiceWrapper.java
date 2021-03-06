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

package com.liferay.gs.hack.reports.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ReportsServiceLocalService}.
 *
 * @author Abdullah Bushnaq
 * @see ReportsServiceLocalService
 * @generated
 */
@ProviderType
public class ReportsServiceLocalServiceWrapper
	implements ReportsServiceLocalService,
		ServiceWrapper<ReportsServiceLocalService> {
	public ReportsServiceLocalServiceWrapper(
		ReportsServiceLocalService reportsServiceLocalService) {
		_reportsServiceLocalService = reportsServiceLocalService;
	}

	@Override
	public java.lang.Double generateUserTaskTime(long userId, long projectTaskId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _reportsServiceLocalService.generateUserTaskTime(userId,
			projectTaskId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _reportsServiceLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.Map<com.liferay.portal.kernel.model.User, java.lang.Double> generateClientReport(
		long clientOrganizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _reportsServiceLocalService.generateClientReport(clientOrganizationId);
	}

	@Override
	public java.util.Map<com.liferay.portal.kernel.model.User, java.lang.Double> generateProjectReport(
		long projectOrganizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _reportsServiceLocalService.generateProjectReport(projectOrganizationId);
	}

	@Override
	public java.util.Map<com.liferay.portal.kernel.model.User, java.lang.Double> generateTaskReport(
		long projectTaskId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _reportsServiceLocalService.generateTaskReport(projectTaskId);
	}

	@Override
	public java.util.Map<com.liferay.portal.kernel.model.User, java.lang.Double> mergeReport(
		java.util.Map<com.liferay.portal.kernel.model.User, java.lang.Double> totalReport,
		java.util.Map<com.liferay.portal.kernel.model.User, java.lang.Double> report) {
		return _reportsServiceLocalService.mergeReport(totalReport, report);
	}

	@Override
	public ReportsServiceLocalService getWrappedService() {
		return _reportsServiceLocalService;
	}

	@Override
	public void setWrappedService(
		ReportsServiceLocalService reportsServiceLocalService) {
		_reportsServiceLocalService = reportsServiceLocalService;
	}

	private ReportsServiceLocalService _reportsServiceLocalService;
}