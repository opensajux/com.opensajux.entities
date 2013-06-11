package com.opensajux.entity;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
@Inheritance(customStrategy = "complete-table")
public class Weblet extends BaseEntity {
	private static final long serialVersionUID = -3048295512938733532L;

	@Persistent
	private String webletId;

	@Persistent
	private boolean active;

	/**
	 * @return the webletId
	 */
	public String getWebletId() {
		return webletId;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @param webletId
	 *            the webletId to set
	 */
	public void setWebletId(String webletId) {
		this.webletId = webletId;
	}
}
