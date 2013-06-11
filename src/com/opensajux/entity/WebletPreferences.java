package com.opensajux.entity;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.google.appengine.api.datastore.Text;

@PersistenceCapable
@Inheritance(customStrategy = "complete-table")
public class WebletPreferences extends BaseEntity {
	private static final long serialVersionUID = -2416878942427023864L;

	@Persistent
	private Weblet weblet;

	@Persistent
	private String webletId;

	@Persistent
	private Text preferences;

	/**
	 * @return the webletId
	 */
	public String getWebletId() {
		return webletId;
	}

	/**
	 * @param webletId
	 *            the webletId to set
	 */
	public void setWebletId(String webletId) {
		this.webletId = webletId;
	}

	/**
	 * @return the preferences
	 */
	public Text getPreferences() {
		return preferences;
	}

	/**
	 * @param preferences
	 *            the preferences to set
	 */
	public void setPreferences(Text preferences) {
		this.preferences = preferences;
	}

	/**
	 * @return the weblet
	 */
	public Weblet getWeblet() {
		return weblet;
	}

	/**
	 * @param weblet
	 *            the weblet to set
	 */
	public void setWeblet(Weblet weblet) {
		this.weblet = weblet;
	}
}
