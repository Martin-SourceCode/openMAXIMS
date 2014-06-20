// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to core.clinical.PatientProcedure business object (ID: 1003100017).
 */
public class PatientProcedureForAppointmentOutcomeVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<PatientProcedureForAppointmentOutcomeVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<PatientProcedureForAppointmentOutcomeVo> col = new ArrayList<PatientProcedureForAppointmentOutcomeVo>();
	public String getBoClassName()
	{
		return "ims.core.clinical.domain.objects.PatientProcedure";
	}
	public boolean add(PatientProcedureForAppointmentOutcomeVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, PatientProcedureForAppointmentOutcomeVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(PatientProcedureForAppointmentOutcomeVo instance)
	{
		return col.indexOf(instance);
	}
	public PatientProcedureForAppointmentOutcomeVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, PatientProcedureForAppointmentOutcomeVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(PatientProcedureForAppointmentOutcomeVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(PatientProcedureForAppointmentOutcomeVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		PatientProcedureForAppointmentOutcomeVoCollection clone = new PatientProcedureForAppointmentOutcomeVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((PatientProcedureForAppointmentOutcomeVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public PatientProcedureForAppointmentOutcomeVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public PatientProcedureForAppointmentOutcomeVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public PatientProcedureForAppointmentOutcomeVoCollection sort(SortOrder order)
	{
		return sort(new PatientProcedureForAppointmentOutcomeVoComparator(order));
	}
	public PatientProcedureForAppointmentOutcomeVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new PatientProcedureForAppointmentOutcomeVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public PatientProcedureForAppointmentOutcomeVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.core.clinical.vo.PatientProcedureRefVoCollection toRefVoCollection()
	{
		ims.core.clinical.vo.PatientProcedureRefVoCollection result = new ims.core.clinical.vo.PatientProcedureRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public PatientProcedureForAppointmentOutcomeVo[] toArray()
	{
		PatientProcedureForAppointmentOutcomeVo[] arr = new PatientProcedureForAppointmentOutcomeVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public ims.vo.interfaces.IClinicalCodingValue[] toIClinicalCodingValueArray()
	{
		ims.vo.interfaces.IClinicalCodingValue[] arr = new ims.vo.interfaces.IClinicalCodingValue[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<PatientProcedureForAppointmentOutcomeVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class PatientProcedureForAppointmentOutcomeVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public PatientProcedureForAppointmentOutcomeVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public PatientProcedureForAppointmentOutcomeVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public PatientProcedureForAppointmentOutcomeVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			PatientProcedureForAppointmentOutcomeVo voObj1 = (PatientProcedureForAppointmentOutcomeVo)obj1;
			PatientProcedureForAppointmentOutcomeVo voObj2 = (PatientProcedureForAppointmentOutcomeVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.PatientProcedureForAppointmentOutcomeVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.PatientProcedureForAppointmentOutcomeVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.PatientProcedureForAppointmentOutcomeVoBean[] result = new ims.RefMan.vo.beans.PatientProcedureForAppointmentOutcomeVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			PatientProcedureForAppointmentOutcomeVo vo = ((PatientProcedureForAppointmentOutcomeVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.PatientProcedureForAppointmentOutcomeVoBean)vo.getBean();
		}
		return result;
	}
	public static PatientProcedureForAppointmentOutcomeVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		PatientProcedureForAppointmentOutcomeVoCollection coll = new PatientProcedureForAppointmentOutcomeVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.PatientProcedureForAppointmentOutcomeVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static PatientProcedureForAppointmentOutcomeVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.PatientProcedureForAppointmentOutcomeVoBean[] beans)
	{
		PatientProcedureForAppointmentOutcomeVoCollection coll = new PatientProcedureForAppointmentOutcomeVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}