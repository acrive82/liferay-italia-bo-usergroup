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

package it.dontesta.labs.liferay.lrbo16.servicebuilder.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HorseService}.
 *
 * @author Brian Wing Shun Chan
 * @see HorseService
 * @generated
 */
@ProviderType
public class HorseServiceWrapper implements HorseService,
	ServiceWrapper<HorseService> {
	public HorseServiceWrapper(HorseService horseService) {
		_horseService = horseService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _horseService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> getHorses() {
		return _horseService.getHorses();
	}

	@Override
	public java.util.List<it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse> getHorsesByName(
		java.lang.String name) {
		return _horseService.getHorsesByName(name);
	}

	@Override
	public HorseService getWrappedService() {
		return _horseService;
	}

	@Override
	public void setWrappedService(HorseService horseService) {
		_horseService = horseService;
	}

	private HorseService _horseService;
}