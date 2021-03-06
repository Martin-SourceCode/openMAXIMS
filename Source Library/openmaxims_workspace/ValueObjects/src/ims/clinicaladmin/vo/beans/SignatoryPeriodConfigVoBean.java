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

package ims.clinicaladmin.vo.beans;

public class SignatoryPeriodConfigVoBean extends ims.vo.ValueObjectBean
{
	public SignatoryPeriodConfigVoBean()
	{
	}
	public SignatoryPeriodConfigVoBean(ims.clinicaladmin.vo.SignatoryPeriodConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.timeperiods = vo.getTimePeriods() == null ? null : vo.getTimePeriods().getBeanCollection();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinicaladmin.vo.SignatoryPeriodConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.timeperiods = vo.getTimePeriods() == null ? null : vo.getTimePeriods().getBeanCollection();
	}

	public ims.clinicaladmin.vo.SignatoryPeriodConfigVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinicaladmin.vo.SignatoryPeriodConfigVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinicaladmin.vo.SignatoryPeriodConfigVo vo = null;
		if(map != null)
			vo = (ims.clinicaladmin.vo.SignatoryPeriodConfigVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinicaladmin.vo.SignatoryPeriodConfigVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String value)
	{
		this.name = value;
	}
	public java.util.Collection getTimePeriods()
	{
		return this.timeperiods;
	}
	public void setTimePeriods(java.util.Collection value)
	{
		this.timeperiods = value;
	}
	public void addTimePeriods(java.util.Collection value)
	{
		if(this.timeperiods == null)
			this.timeperiods = new java.util.ArrayList();
		this.timeperiods.add(value);
	}

	private Integer id;
	private int version;
	private String name;
	private java.util.Collection timeperiods;
}
