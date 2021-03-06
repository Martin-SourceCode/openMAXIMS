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
 * Linked to RefMan.Prescription business object (ID: 1096100036).
 */
public class PrescriptionsVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<PrescriptionsVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<PrescriptionsVo> col = new ArrayList<PrescriptionsVo>();
	public String getBoClassName()
	{
		return "ims.RefMan.domain.objects.Prescription";
	}
	public boolean add(PrescriptionsVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, PrescriptionsVo value)
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
	public int indexOf(PrescriptionsVo instance)
	{
		return col.indexOf(instance);
	}
	public PrescriptionsVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, PrescriptionsVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(PrescriptionsVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(PrescriptionsVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		PrescriptionsVoCollection clone = new PrescriptionsVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((PrescriptionsVo)this.col.get(x).clone());
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
	public PrescriptionsVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public PrescriptionsVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public PrescriptionsVoCollection sort(SortOrder order)
	{
		return sort(new PrescriptionsVoComparator(order));
	}
	public PrescriptionsVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new PrescriptionsVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public PrescriptionsVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.RefMan.vo.PrescriptionRefVoCollection toRefVoCollection()
	{
		ims.RefMan.vo.PrescriptionRefVoCollection result = new ims.RefMan.vo.PrescriptionRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public PrescriptionsVo[] toArray()
	{
		PrescriptionsVo[] arr = new PrescriptionsVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<PrescriptionsVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class PrescriptionsVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public PrescriptionsVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public PrescriptionsVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public PrescriptionsVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			PrescriptionsVo voObj1 = (PrescriptionsVo)obj1;
			PrescriptionsVo voObj2 = (PrescriptionsVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.PrescriptionsVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.PrescriptionsVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.PrescriptionsVoBean[] result = new ims.RefMan.vo.beans.PrescriptionsVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			PrescriptionsVo vo = ((PrescriptionsVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.PrescriptionsVoBean)vo.getBean();
		}
		return result;
	}
	public static PrescriptionsVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		PrescriptionsVoCollection coll = new PrescriptionsVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.PrescriptionsVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static PrescriptionsVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.PrescriptionsVoBean[] beans)
	{
		PrescriptionsVoCollection coll = new PrescriptionsVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
