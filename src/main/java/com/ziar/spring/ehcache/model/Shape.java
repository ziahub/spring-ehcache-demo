/**
 * 
 */
package com.ziar.spring.ehcache.model;

import java.io.Serializable;

/**
 * @author admin
 *
 */
public class Shape implements Area, Volume, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2629405912953776578L;

	@Override
	public Long getAreaa() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Long getVolume() {
		throw new UnsupportedOperationException();
	}
}
