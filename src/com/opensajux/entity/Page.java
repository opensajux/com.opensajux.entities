package com.opensajux.entity;

import java.util.Date;
import java.util.Set;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
@Inheritance(customStrategy = "complete-table")
public class Page extends BaseEntity {
	private static final long serialVersionUID = -6874146297545372744L;

	@Persistent
	private String name;

	@Persistent
	private String title;

	@Persistent
	private String friendlyUrl;

	@Persistent
	private int priority;

	@Persistent
	private Page parentPage;

	@Persistent
	@Element(dependent = "true")
	private Set<Page> children;

	@Persistent
	private Layout layout;

	public Page() {
	}

	public Page(String name, String title, String friendlyUrl, Page parentPage, Layout layout, int priority,
			Date createdDate, Date updatedDate) {
		super(createdDate, updatedDate);
		this.name = name;
		this.title = title;
		this.friendlyUrl = friendlyUrl;
		this.parentPage = parentPage;
		this.layout = layout;
		this.priority = priority;
	}

	/**
	 * @return the friendlyUrl
	 */
	public String getFriendlyUrl() {
		return friendlyUrl;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the parentPage
	 */
	public Page getParentPage() {
		return parentPage;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param friendlyUrl
	 *            the friendlyUrl to set
	 */
	public void setFriendlyUrl(String friendlyUrl) {
		this.friendlyUrl = friendlyUrl;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param parentPage
	 *            the parentPage to set
	 */
	public void setParentPage(Page parentPage) {
		this.parentPage = parentPage;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the layout
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * @param layout
	 *            the layout to set
	 */
	public void setLayout(Layout layout) {
		this.layout = layout;
	}

}
