/**
 * $Id$
 * $URL$
 * Order.java - genericdao - Aug 3, 2008 12:43:54 PM - azeckoski
 **************************************************************************
 * Copyright (c) 2008 Aaron Zeckoski
 * Licensed under the Apache License, Version 2.0
 * 
 * A copy of the Apache License has been included in this 
 * distribution and is available at: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * Aaron Zeckoski (azeckoski @ gmail.com) (aaronz @ vt.edu) (aaron @ caret.cam.ac.uk)
 */

package org.sakaiproject.genericdao.api.search;

/**
 * A simple bean which defines the order to return the results of a search<br/>
 * Example usage:<br/>
 * <code>Order ota = new Order("title"); // order by title ascending</code><br/>
 * <code>Order otd = new Order("title", false); // order by title descending</code><br/>
 *
 * @author Aaron Zeckoski (azeckoski@gmail.com)
 */
public class Order {

	/**
	 * the name of the field (property) in the persisted object
	 */
	public String property;
   /**
    * the name of the field (property) in the persisted object
    */
   public String getProperty() {
      return property;
   }
   public void setProperty(String property) {
      this.property = property;
   }

   /**
	 * if true then the return order is ascending,
	 * if false then return order is descending
	 */
	public boolean ascending = true;
   /**
    * if true then the return order is ascending,
    * if false then return order is descending
    */
   public boolean isAscending() {
      return ascending;
   }
   public void setAscending(boolean ascending) {
      this.ascending = ascending;
   }

	/**
	 * a simple order for a property which is ascending
	 * @param property the name of the field (property) in the persisted object
	 */
	public Order(String property) {
		this.property = property;
		this.ascending = true;
	}

	/**
	 * define an order for a property
	 * @param property the name of the field (property) in the persisted object
	 * @param ascending if true then the return order is ascending,
	 * if false then return order is descending
	 */
	public Order(String property, boolean ascending) {
		this.property = property;
		this.ascending = ascending;
	}

   @Override
   public boolean equals(Object obj) {
      if (null == obj)
         return false;
      if (!(obj instanceof Order))
         return false;
      else {
         Order castObj = (Order) obj;
         boolean eq = (this.property == null ? castObj.property == null : this.property.equals(castObj.property))
               && this.ascending == castObj.ascending;
         return eq;
      }
   }

   @Override
   public int hashCode() {
      String hashStr = this.getClass().getName() + ":" + this.property + ":" + this.ascending;
      return hashStr.hashCode();
   }

	@Override
	public String toString() {
	   return "order::prop:" + property + ",asc:" + ascending;
	}

}