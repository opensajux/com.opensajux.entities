package com.opensajux.entity;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.google.appengine.api.datastore.Text;

/**
 * @author Sheikh Mohammad Sajid
 * 
 */
@PersistenceCapable
public class Configuration extends BaseEntity {
	private static final long serialVersionUID = 2449100545486251218L;

	@Persistent
	private String groupName;

	@Persistent
	private String key;

	@Persistent
	private Text value;

	@Persistent
	private int datatype;
}
