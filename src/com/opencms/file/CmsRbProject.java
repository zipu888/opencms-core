package com.opencms.file;

import java.util.*;

import com.opencms.core.*;

/**
 * This class describes a resource broker for projects in the Cms.<BR/>
 * <B>All</B> Methods get a first parameter: A_CmsUser. It is the current user. This 
 * is for security-reasons, to check if this current user has the rights to call the
 * method.<BR/>
 * 
 * All methods have package-visibility for security-reasons.
 * 
 * @author Andreas Schouten
 * @version $Revision: 1.3 $ $Date: 1999/12/17 17:25:36 $
 */
class CmsRbProject extends A_CmsRbProject implements I_CmsConstants {
	
    /**
     * The project access object which is required to access the
     * project database.
     */
    private A_CmsAccessProject m_accessProject;
    
    /**
     * Constructor, creates a new Cms Project Resource Broker.
     * 
     * @param accessProject The project access object.
     */
    public CmsRbProject(A_CmsAccessProject accessProject)
    {
        m_accessProject = accessProject;
    }
	
	/**
	 * Reads a project from the Cms.
	 * 
	 * @param name The name of the project to read.
	 * 
	 * @exception CmsException Throws CmsException if something goes wrong.
	 */
	 A_CmsProject readProject(String name)
		 throws CmsException {
		 return( m_accessProject.readProject(name) );
	 }
	
	/**
	 * Creates a project.
	 * 
	 * @param name The name of the project to read.
	 * @param description The description for the new project.
	 * @param task The globe task.
	 * @param owner The owner to be set.
	 * @param group the group to be set.
	 * @param flags The flags to be set.
	 * 
	 * @exception CmsException Throws CmsException if something goes wrong.
	 */
	 A_CmsProject createProject(String name, String description, A_CmsTask task, 
								A_CmsUser owner, A_CmsGroup group, int flags)
		 throws CmsException {
		 return( m_accessProject.createProject(name, description, task, 
											   owner, group,
											   flags) );
	 }
	
	/**
	 * Updates a project.
	 * 
	 * @param project The project that will be written.
	 * 
	 * @exception CmsException Throws CmsException if something goes wrong.
	 */
	 A_CmsProject writeProject(A_CmsProject project)
		 throws CmsException {
		 return( m_accessProject.writeProject(project) );
	 }

	/**
	 * Returns all projects, which are owned by a user.
	 * 
	 * @param user The user to test.
	 * 
	 * @return a Vector of projects.
	 */
	 Vector getAllAccessibleProjectsByUser(A_CmsUser user)
		 throws CmsException {
		 return( m_accessProject.getAllAccessibleProjectsByUser(user) );
	 }

	/**
	 * Returns all projects, which the group may access.
	 * 
	 * @param group The group to test.
	 * 
	 * @return a Vector of projects.
	 */
	 Vector getAllAccessibleProjectsByGroup(A_CmsGroup group)
		 throws CmsException {
		 return( m_accessProject.getAllAccessibleProjectsByGroup(group) );
	 }
}
