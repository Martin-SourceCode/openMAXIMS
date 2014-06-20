// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.lookups;

import ims.framework.cn.data.TreeModel;
import ims.framework.cn.data.TreeNode;
import ims.vo.LookupInstanceCollection;
import ims.vo.LookupInstVo;

public class ReportNoteStatusCollection extends LookupInstanceCollection implements ims.vo.ImsCloneable, TreeModel
{
	private static final long serialVersionUID = 1L;
	public void add(ReportNoteStatus value)
	{
		super.add(value);
	}
	public int indexOf(ReportNoteStatus instance)
	{
		return super.indexOf(instance);
	}
	public boolean contains(ReportNoteStatus instance)
	{
		return indexOf(instance) >= 0;
	}
	public ReportNoteStatus get(int index)
	{
		return (ReportNoteStatus)super.getIndex(index);
	}
	public void remove(ReportNoteStatus instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public Object clone()
	{
		ReportNoteStatusCollection newCol = new ReportNoteStatusCollection();
		ReportNoteStatus item;
		for (int i = 0; i < super.size(); i++)
		{
			item = this.get(i);
			newCol.add(new ReportNoteStatus(item.getID(), item.getText(), item.isActive(), item.getParent(), item.getImage(), item.getColor(), item.getOrder()));
		}
		for (int i = 0; i < newCol.size(); i++)
		{
			item = newCol.get(i);
			if (item.getParent() != null)
			{
				int parentIndex = this.indexOf(item.getParent());
				if(parentIndex >= 0)
					item.setParent(newCol.get(parentIndex));
				else
					item.setParent((ReportNoteStatus)item.getParent().clone());
			}
		}
		return newCol;
	}
	public ReportNoteStatus getInstance(int instanceId)
	{
		return (ReportNoteStatus)super.getInstanceById(instanceId);
	}
	public TreeNode[] getRootNodes()
	{
		LookupInstVo[] roots = super.getRoots();
		TreeNode[] nodes = new TreeNode[roots.length];
		System.arraycopy(roots, 0, nodes, 0, roots.length);
		return nodes;
	}
	public ReportNoteStatus[] toArray()
	{
		ReportNoteStatus[] arr = new ReportNoteStatus[this.size()];
		super.toArray(arr);
		return arr;
	}
	public static ReportNoteStatusCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ReportNoteStatusCollection coll = new ReportNoteStatusCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while(iter.hasNext())
		{
			coll.add(ReportNoteStatus.buildLookup((ims.vo.LookupInstanceBean)iter.next()));
		}
		return coll;
	}
	public static ReportNoteStatusCollection buildFromBeanCollection(ims.vo.LookupInstanceBean[] beans)
	{
		ReportNoteStatusCollection coll = new ReportNoteStatusCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(ReportNoteStatus.buildLookup(beans[x]));
		}
		return coll;
	}
}