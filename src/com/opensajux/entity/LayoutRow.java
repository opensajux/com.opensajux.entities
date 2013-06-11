package com.opensajux.entity;

import java.util.List;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
@Inheritance(customStrategy = "complete-table")
public class LayoutRow extends BaseEntity {
	private static final long serialVersionUID = 6495563570672741889L;

	@Persistent
	private List<LayoutColumn> columns;

	/**
	 * @return the columns
	 */
	public List<LayoutColumn> getColumns() {
		return columns;
	}

	/**
	 * @param columns
	 *            the columns to set
	 */
	public void setColumns(List<LayoutColumn> columns) {
		this.columns = columns;
	}

}
