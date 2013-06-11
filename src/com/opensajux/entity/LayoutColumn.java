package com.opensajux.entity;

import java.util.List;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
@Inheritance(customStrategy = "complete-table")
public class LayoutColumn extends BaseEntity {
	private static final long serialVersionUID = -3048295512938733532L;

	@Persistent
	private boolean customizable;

	@Persistent
	private List<WebletPreferences> webletInstances;

	/**
	 * @return the customizable
	 */
	public boolean isCustomizable() {
		return customizable;
	}

	/**
	 * @param customizable
	 *            the customizable to set
	 */
	public void setCustomizable(boolean customizable) {
		this.customizable = customizable;
	}

	/**
	 * @return the webletInstances
	 */
	public List<WebletPreferences> getWebletInstances() {
		return webletInstances;
	}

	/**
	 * @param webletInstances
	 *            the webletInstances to set
	 */
	public void setWebletInstances(List<WebletPreferences> webletInstances) {
		this.webletInstances = webletInstances;
	}
}
