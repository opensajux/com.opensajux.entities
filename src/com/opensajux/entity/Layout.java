package com.opensajux.entity;

import java.util.Date;
import java.util.List;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
@Inheritance(customStrategy = "complete-table")
public class Layout extends BaseEntity {
	private static final long serialVersionUID = -2589455894452695883L;

	@Persistent
	private String name;

	@Persistent
	private List<LayoutRow> rows;

	public Layout() {
	}

	/**
	 * @param name
	 */
	public Layout(String name, Date createdDate, Date updatedDate) {
		super(createdDate, updatedDate);
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rows
	 */
	public List<LayoutRow> getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            the rows to set
	 */
	public void setRows(List<LayoutRow> rows) {
		this.rows = rows;
	}

}
