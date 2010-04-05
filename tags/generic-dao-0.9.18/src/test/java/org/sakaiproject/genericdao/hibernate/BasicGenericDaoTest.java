/**
 * $Id$
 * $URL$
 * GenericDaoTest.java - genericdao - May 18, 2008 4:34:33 PM - azeckoski
 **************************************************************************
 * Copyright (c) 2008 Aaron Zeckoski
 * Licensed under the Apache License, Version 2.0
 * 
 * A copy of the Apache License has been included in this 
 * distribution and is available at: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * Aaron Zeckoski (azeckoski@gmail.com) (aaronz@vt.edu) (aaron@caret.cam.ac.uk)
 */

package org.sakaiproject.genericdao.hibernate;

import org.sakaiproject.genericdao.test.AbstractTestBasicGenericDao;

/**
 * Testing the {@link org.sakaiproject.genericdao.api.BasicGenericDao}
 * 
 * @author Aaron Zeckoski (aaronz@vt.edu)
 */
public class BasicGenericDaoTest extends AbstractTestBasicGenericDao {

   protected String[] getConfigLocations() {
      // point to the spring-hibernate.xml file, must be on the classpath
      // (add component/src/webapp/WEB-INF to the build path in Eclipse)
      return new String[] {"spring-common.xml","spring-hibernate.xml"};
   }

   // TESTS

}
