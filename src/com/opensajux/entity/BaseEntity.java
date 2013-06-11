package com.opensajux.entity;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

/**
 * The base entity class for all other entities. The <code>BaseEntity</code>
 * contains the Key. <code>Key</code> is the AppEngine provided identifier for
 * the record.
 * 
 * @author Sheikh Mohammad Sajid
 * @since 0.1.0
 */
@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.SUBCLASS_TABLE)
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = 186527523639731201L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	protected Key key;

	@Persistent
	private Date createdDate;

	@Persistent
	private Date updatedDate;

	public BaseEntity() {
	}

	/**
	 * @param createdDate
	 * @param updatedDate
	 */
	public BaseEntity(Date createdDate, Date updatedDate) {
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public Key getKey() {
		return key;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @param updatedDate
	 *            the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		if (this.getKey() != null)
			info.append(this.getClass().getName()).append("[key=").append(this.getKey().getId()).append("]");
		return info.toString();
	}
}
