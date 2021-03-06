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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class PatientMergeFields extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public PatientMergeFields()
	{
		super();
	}
	public PatientMergeFields(int id)
	{
		super(id, "", true);
	}
	public PatientMergeFields(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public PatientMergeFields(int id, String text, boolean active, PatientMergeFields parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public PatientMergeFields(int id, String text, boolean active, PatientMergeFields parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public PatientMergeFields(int id, String text, boolean active, PatientMergeFields parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static PatientMergeFields buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new PatientMergeFields(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (PatientMergeFields)super.getParentInstance();
	}
	public PatientMergeFields getParent()
	{
		return (PatientMergeFields)super.getParentInstance();
	}
	public void setParent(PatientMergeFields parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		PatientMergeFields[] typedChildren = new PatientMergeFields[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (PatientMergeFields)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof PatientMergeFields)
		{
			super.addChild((PatientMergeFields)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof PatientMergeFields)
		{
			super.removeChild((PatientMergeFields)child);
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
		PatientMergeFieldsCollection result = new PatientMergeFieldsCollection();
		result.add(NAME);
		result.add(TITLE);
		result.add(SURNAME);
		result.add(FORENAME);
		result.add(MIDDLENAME);
		result.add(SEX);
		result.add(DATE_OF_BIRTH);
		result.add(DATE_OF_DEATH);
		result.add(ETHNIC_ORIGIN);
		result.add(RELIGION);
		result.add(MARITAL_STATUS);
		result.add(OCCUPATION);
		result.add(LANGUAGE);
		result.add(ADDRESS);
		result.add(ADDRESSLINE1);
		result.add(ADDRESSLINE2);
		result.add(ADDRESSLINE3);
		result.add(ADDRESSLINE4);
		result.add(ADDRESSLINE5);
		result.add(POSTCODE);
		result.add(PHONE);
		result.add(FAX);
		result.add(ADDRESSTYPE);
		result.add(CCG);
		result.add(OTHERPHONE);
		result.add(IDENTIFIERS);
		result.add(GP);
		result.add(GP_SURGERY);
		result.add(NEXT_OF_KIN);
		result.add(MEDICAL_CARD_INFORMATION);
		result.add(COMMUNICATION_CHANNELS);
		return result;
	}
	public static PatientMergeFields[] getNegativeInstances()
	{
		PatientMergeFields[] instances = new PatientMergeFields[31];
		instances[0] = NAME;
		instances[1] = TITLE;
		instances[2] = SURNAME;
		instances[3] = FORENAME;
		instances[4] = MIDDLENAME;
		instances[5] = SEX;
		instances[6] = DATE_OF_BIRTH;
		instances[7] = DATE_OF_DEATH;
		instances[8] = ETHNIC_ORIGIN;
		instances[9] = RELIGION;
		instances[10] = MARITAL_STATUS;
		instances[11] = OCCUPATION;
		instances[12] = LANGUAGE;
		instances[13] = ADDRESS;
		instances[14] = ADDRESSLINE1;
		instances[15] = ADDRESSLINE2;
		instances[16] = ADDRESSLINE3;
		instances[17] = ADDRESSLINE4;
		instances[18] = ADDRESSLINE5;
		instances[19] = POSTCODE;
		instances[20] = PHONE;
		instances[21] = FAX;
		instances[22] = ADDRESSTYPE;
		instances[23] = CCG;
		instances[24] = OTHERPHONE;
		instances[25] = IDENTIFIERS;
		instances[26] = GP;
		instances[27] = GP_SURGERY;
		instances[28] = NEXT_OF_KIN;
		instances[29] = MEDICAL_CARD_INFORMATION;
		instances[30] = COMMUNICATION_CHANNELS;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[31];
		negativeInstances[0] = "NAME";
		negativeInstances[1] = "TITLE";
		negativeInstances[2] = "SURNAME";
		negativeInstances[3] = "FORENAME";
		negativeInstances[4] = "MIDDLENAME";
		negativeInstances[5] = "SEX";
		negativeInstances[6] = "DATE_OF_BIRTH";
		negativeInstances[7] = "DATE_OF_DEATH";
		negativeInstances[8] = "ETHNIC_ORIGIN";
		negativeInstances[9] = "RELIGION";
		negativeInstances[10] = "MARITAL_STATUS";
		negativeInstances[11] = "OCCUPATION";
		negativeInstances[12] = "LANGUAGE";
		negativeInstances[13] = "ADDRESS";
		negativeInstances[14] = "ADDRESSLINE1";
		negativeInstances[15] = "ADDRESSLINE2";
		negativeInstances[16] = "ADDRESSLINE3";
		negativeInstances[17] = "ADDRESSLINE4";
		negativeInstances[18] = "ADDRESSLINE5";
		negativeInstances[19] = "POSTCODE";
		negativeInstances[20] = "PHONE";
		negativeInstances[21] = "FAX";
		negativeInstances[22] = "ADDRESSTYPE";
		negativeInstances[23] = "CCG";
		negativeInstances[24] = "OTHERPHONE";
		negativeInstances[25] = "IDENTIFIERS";
		negativeInstances[26] = "GP";
		negativeInstances[27] = "GP_SURGERY";
		negativeInstances[28] = "NEXT_OF_KIN";
		negativeInstances[29] = "MEDICAL_CARD_INFORMATION";
		negativeInstances[30] = "COMMUNICATION_CHANNELS";
		return negativeInstances;
	}
	public static PatientMergeFields getNegativeInstance(String name)
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
	public static PatientMergeFields getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		PatientMergeFields[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021287;
	public static final PatientMergeFields NAME = new PatientMergeFields(-2567, "Name", true, null, null, Color.Default);
	public static final PatientMergeFields TITLE = new PatientMergeFields(-2568, "Title", true, PatientMergeFields.NAME, null, Color.Default);
	public static final PatientMergeFields SURNAME = new PatientMergeFields(-2569, "Surname", true, PatientMergeFields.NAME, null, Color.Default);
	public static final PatientMergeFields FORENAME = new PatientMergeFields(-2570, "Forename", true, PatientMergeFields.NAME, null, Color.Default);
	public static final PatientMergeFields MIDDLENAME = new PatientMergeFields(-2571, "Middlename", true, PatientMergeFields.NAME, null, Color.Default);
	public static final PatientMergeFields SEX = new PatientMergeFields(-2572, "Sex", true, null, null, Color.Default);
	public static final PatientMergeFields DATE_OF_BIRTH = new PatientMergeFields(-2573, "Date of Birth", true, null, null, Color.Default);
	public static final PatientMergeFields DATE_OF_DEATH = new PatientMergeFields(-2574, "Date of Death", true, null, null, Color.Default);
	public static final PatientMergeFields ETHNIC_ORIGIN = new PatientMergeFields(-2575, "Ethnic Origin", true, null, null, Color.Default);
	public static final PatientMergeFields RELIGION = new PatientMergeFields(-2576, "Religion", true, null, null, Color.Default);
	public static final PatientMergeFields MARITAL_STATUS = new PatientMergeFields(-2577, "Marital Status", true, null, null, Color.Default);
	public static final PatientMergeFields OCCUPATION = new PatientMergeFields(-2578, "Occupation", true, null, null, Color.Default);
	public static final PatientMergeFields LANGUAGE = new PatientMergeFields(-2579, "Language", true, null, null, Color.Default);
	public static final PatientMergeFields ADDRESS = new PatientMergeFields(-2580, "Address", true, null, null, Color.Default);
	public static final PatientMergeFields ADDRESSLINE1 = new PatientMergeFields(-2581, "Address Line 1", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields ADDRESSLINE2 = new PatientMergeFields(-2582, "Address Line 2", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields ADDRESSLINE3 = new PatientMergeFields(-2583, "Address Line 3", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields ADDRESSLINE4 = new PatientMergeFields(-2584, "Address Line 4", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields ADDRESSLINE5 = new PatientMergeFields(-2585, "Address Line 5", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields POSTCODE = new PatientMergeFields(-2586, "Postcode", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields PHONE = new PatientMergeFields(-2587, "Phone", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields FAX = new PatientMergeFields(-2588, "Fax", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields ADDRESSTYPE = new PatientMergeFields(-2589, "Address Type", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields CCG = new PatientMergeFields(-2590, "CCG", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields OTHERPHONE = new PatientMergeFields(-2591, "Other Phone", true, PatientMergeFields.ADDRESS, null, Color.Default);
	public static final PatientMergeFields IDENTIFIERS = new PatientMergeFields(-2592, "Identifiers", true, null, null, Color.Default);
	public static final PatientMergeFields GP = new PatientMergeFields(-2593, "GP", true, null, null, Color.Default);
	public static final PatientMergeFields GP_SURGERY = new PatientMergeFields(-2594, "GP Surgery", true, null, null, Color.Default);
	public static final PatientMergeFields NEXT_OF_KIN = new PatientMergeFields(-2595, "Next of Kin", true, null, null, Color.Default);
	public static final PatientMergeFields MEDICAL_CARD_INFORMATION = new PatientMergeFields(-2596, "Medical Card Information", true, null, null, Color.Default);
	public static final PatientMergeFields COMMUNICATION_CHANNELS = new PatientMergeFields(-2597, "Communication Channels", true, null, null, Color.Default);
}
