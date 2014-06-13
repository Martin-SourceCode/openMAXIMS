//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.careuk.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class AnotherConsultationAppt extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public AnotherConsultationAppt()
	{
		super();
	}
	public AnotherConsultationAppt(int id)
	{
		super(id, "", true);
	}
	public AnotherConsultationAppt(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public AnotherConsultationAppt(int id, String text, boolean active, AnotherConsultationAppt parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public AnotherConsultationAppt(int id, String text, boolean active, AnotherConsultationAppt parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public AnotherConsultationAppt(int id, String text, boolean active, AnotherConsultationAppt parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static AnotherConsultationAppt buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new AnotherConsultationAppt(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (AnotherConsultationAppt)super.getParentInstance();
	}
	public AnotherConsultationAppt getParent()
	{
		return (AnotherConsultationAppt)super.getParentInstance();
	}
	public void setParent(AnotherConsultationAppt parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		AnotherConsultationAppt[] typedChildren = new AnotherConsultationAppt[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (AnotherConsultationAppt)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof AnotherConsultationAppt)
		{
			super.addChild((AnotherConsultationAppt)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof AnotherConsultationAppt)
		{
			super.removeChild((AnotherConsultationAppt)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		AnotherConsultationApptCollection result = new AnotherConsultationApptCollection();
		result.add(PROCEDURE);
		result.add(MED_INCOMPLETE);
		return result;
	}
	public static AnotherConsultationAppt[] getNegativeInstances()
	{
		AnotherConsultationAppt[] instances = new AnotherConsultationAppt[2];
		instances[0] = PROCEDURE;
		instances[1] = MED_INCOMPLETE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[2];
		negativeInstances[0] = "PROCEDURE";
		negativeInstances[1] = "MED_INCOMPLETE";
		return negativeInstances;
	}
	public static AnotherConsultationAppt getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static AnotherConsultationAppt getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		AnotherConsultationAppt[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1341005;
	public static final AnotherConsultationAppt PROCEDURE = new AnotherConsultationAppt(-1506, "Procedure", true, null, null, Color.Default);
	public static final AnotherConsultationAppt MED_INCOMPLETE = new AnotherConsultationAppt(-1507, "Medically Incomplete", true, null, null, Color.Default);
}