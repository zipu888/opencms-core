/*
 * File   : $Source: /alkacon/cvs/opencms/src/org/opencms/db/I_CmsCacheKey.java,v $
 * Date   : $Date: 2003/09/17 16:15:06 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (C) 2002 - 2003 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.opencms.db;

import org.opencms.security.CmsPermissionSet;

import com.opencms.file.CmsRequestContext;
import com.opencms.file.CmsResource;
import com.opencms.file.CmsUser;

/**
 * @version $Revision: 1.1 $ $Date: 2003/09/17 16:15:06 $
 * @author Carsten Weinholz (c.weinholz@alkacon.com)
 */
public interface I_CmsCacheKey {

    /**
     * Returns the cache key for the permission cache.<p>
     * 
     * @param context the context
     * @param resource the resource
     * @param requiredPermissions the permissions to check
     * @param strongCheck indicates if all required permissions must be satisfied
     * @return a cache key that is unique for the set of parameters
     */
    String getCacheKeyForUserPermissions (CmsRequestContext context, CmsResource resource, CmsPermissionSet requiredPermissions, boolean strongCheck);

    /**
     * Returns the cache key for the user groups cache.<p>
     * 
     * @param context the context
     * @param user the resource
     * @return a cache key that is unique for the set of parameters
     */
    String getCacheKeyForUserGroups (CmsRequestContext context, CmsUser user);
}
