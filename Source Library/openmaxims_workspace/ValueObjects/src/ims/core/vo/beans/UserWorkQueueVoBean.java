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

package ims.core.vo.beans;

public class UserWorkQueueVoBean extends ims.vo.ValueObjectBean
{
	public UserWorkQueueVoBean()
	{
	}
	public UserWorkQueueVoBean(ims.core.vo.UserWorkQueueVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.targetuser = vo.getTargetUser() == null ? null : (ims.core.vo.beans.MemberOfStaffShortVoBean)vo.getTargetUser().getBean();
		this.requestedby = vo.getRequestedBy() == null ? null : (ims.core.vo.beans.MemberOfStaffShortVoBean)vo.getRequestedBy().getBean();
		this.requestdatetime = vo.getRequestDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRequestDateTime().getBean();
		this.requiredondate = vo.getRequiredOnDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getRequiredOnDate().getBean();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentStatus().getBean();
		this.requestingobjectid = vo.getRequestingObjectID();
		this.description = vo.getDescription();
		this.targetobjectid = vo.getTargetObjectID();
		this.requestingform = vo.getRequestingForm() == null ? null : (ims.framework.utils.beans.FormNameBean)vo.getRequestingForm().getBean();
		this.targetform = vo.getTargetForm() == null ? null : (ims.framework.utils.beans.FormNameBean)vo.getTargetForm().getBean();
		this.requesttype = vo.getRequestType() == null ? null : (ims.core.vo.beans.ActivityVoBean)vo.getRequestType().getBean();
		this.statushistory = vo.getStatusHistory() == null ? null : vo.getStatusHistory().getBeanCollection();
		this.orignotetype = vo.getOrigNoteType() == null ? null : (ims.vo.LookupInstanceBean)vo.getOrigNoteType().getBean();
		this.comments = vo.getComments();
		this.procedurelocationservice = vo.getProcedureLocationService() == null ? null : new ims.vo.RefVoBean(vo.getProcedureLocationService().getBoId(), vo.getProcedureLocationService().getBoVersion());
		this.procedureactivity = vo.getProcedureActivity() == null ? null : new ims.vo.RefVoBean(vo.getProcedureActivity().getBoId(), vo.getProcedureActivity().getBoVersion());
		this.procedurecontext = vo.getProcedureContext() == null ? null : (ims.vo.LookupInstanceBean)vo.getProcedureContext().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.UserWorkQueueVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.targetuser = vo.getTargetUser() == null ? null : (ims.core.vo.beans.MemberOfStaffShortVoBean)vo.getTargetUser().getBean(map);
		this.requestedby = vo.getRequestedBy() == null ? null : (ims.core.vo.beans.MemberOfStaffShortVoBean)vo.getRequestedBy().getBean(map);
		this.requestdatetime = vo.getRequestDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRequestDateTime().getBean();
		this.requiredondate = vo.getRequiredOnDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getRequiredOnDate().getBean();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentStatus().getBean();
		this.requestingobjectid = vo.getRequestingObjectID();
		this.description = vo.getDescription();
		this.targetobjectid = vo.getTargetObjectID();
		this.requestingform = vo.getRequestingForm() == null ? null : (ims.framework.utils.beans.FormNameBean)vo.getRequestingForm().getBean();
		this.targetform = vo.getTargetForm() == null ? null : (ims.framework.utils.beans.FormNameBean)vo.getTargetForm().getBean();
		this.requesttype = vo.getRequestType() == null ? null : (ims.core.vo.beans.ActivityVoBean)vo.getRequestType().getBean(map);
		this.statushistory = vo.getStatusHistory() == null ? null : vo.getStatusHistory().getBeanCollection();
		this.orignotetype = vo.getOrigNoteType() == null ? null : (ims.vo.LookupInstanceBean)vo.getOrigNoteType().getBean();
		this.comments = vo.getComments();
		this.procedurelocationservice = vo.getProcedureLocationService() == null ? null : new ims.vo.RefVoBean(vo.getProcedureLocationService().getBoId(), vo.getProcedureLocationService().getBoVersion());
		this.procedureactivity = vo.getProcedureActivity() == null ? null : new ims.vo.RefVoBean(vo.getProcedureActivity().getBoId(), vo.getProcedureActivity().getBoVersion());
		this.procedurecontext = vo.getProcedureContext() == null ? null : (ims.vo.LookupInstanceBean)vo.getProcedureContext().getBean();
	}

	public ims.core.vo.UserWorkQueueVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.UserWorkQueueVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.UserWorkQueueVo vo = null;
		if(map != null)
			vo = (ims.core.vo.UserWorkQueueVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.UserWorkQueueVo();
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
	public ims.core.vo.beans.MemberOfStaffShortVoBean getTargetUser()
	{
		return this.targetuser;
	}
	public void setTargetUser(ims.core.vo.beans.MemberOfStaffShortVoBean value)
	{
		this.targetuser = value;
	}
	public ims.core.vo.beans.MemberOfStaffShortVoBean getRequestedBy()
	{
		return this.requestedby;
	}
	public void setRequestedBy(ims.core.vo.beans.MemberOfStaffShortVoBean value)
	{
		this.requestedby = value;
	}
	public ims.framework.utils.beans.DateTimeBean getRequestDateTime()
	{
		return this.requestdatetime;
	}
	public void setRequestDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.requestdatetime = value;
	}
	public ims.framework.utils.beans.DateBean getRequiredOnDate()
	{
		return this.requiredondate;
	}
	public void setRequiredOnDate(ims.framework.utils.beans.DateBean value)
	{
		this.requiredondate = value;
	}
	public ims.vo.LookupInstanceBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.vo.LookupInstanceBean value)
	{
		this.currentstatus = value;
	}
	public Integer getRequestingObjectID()
	{
		return this.requestingobjectid;
	}
	public void setRequestingObjectID(Integer value)
	{
		this.requestingobjectid = value;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String value)
	{
		this.description = value;
	}
	public Integer getTargetObjectID()
	{
		return this.targetobjectid;
	}
	public void setTargetObjectID(Integer value)
	{
		this.targetobjectid = value;
	}
	public ims.framework.utils.beans.FormNameBean getRequestingForm()
	{
		return this.requestingform;
	}
	public void setRequestingForm(ims.framework.utils.beans.FormNameBean value)
	{
		this.requestingform = value;
	}
	public ims.framework.utils.beans.FormNameBean getTargetForm()
	{
		return this.targetform;
	}
	public void setTargetForm(ims.framework.utils.beans.FormNameBean value)
	{
		this.targetform = value;
	}
	public ims.core.vo.beans.ActivityVoBean getRequestType()
	{
		return this.requesttype;
	}
	public void setRequestType(ims.core.vo.beans.ActivityVoBean value)
	{
		this.requesttype = value;
	}
	public ims.core.vo.beans.WorkQueueStatusHistoryVoBean[] getStatusHistory()
	{
		return this.statushistory;
	}
	public void setStatusHistory(ims.core.vo.beans.WorkQueueStatusHistoryVoBean[] value)
	{
		this.statushistory = value;
	}
	public ims.vo.LookupInstanceBean getOrigNoteType()
	{
		return this.orignotetype;
	}
	public void setOrigNoteType(ims.vo.LookupInstanceBean value)
	{
		this.orignotetype = value;
	}
	public String getComments()
	{
		return this.comments;
	}
	public void setComments(String value)
	{
		this.comments = value;
	}
	public ims.vo.RefVoBean getProcedureLocationService()
	{
		return this.procedurelocationservice;
	}
	public void setProcedureLocationService(ims.vo.RefVoBean value)
	{
		this.procedurelocationservice = value;
	}
	public ims.vo.RefVoBean getProcedureActivity()
	{
		return this.procedureactivity;
	}
	public void setProcedureActivity(ims.vo.RefVoBean value)
	{
		this.procedureactivity = value;
	}
	public ims.vo.LookupInstanceBean getProcedureContext()
	{
		return this.procedurecontext;
	}
	public void setProcedureContext(ims.vo.LookupInstanceBean value)
	{
		this.procedurecontext = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.MemberOfStaffShortVoBean targetuser;
	private ims.core.vo.beans.MemberOfStaffShortVoBean requestedby;
	private ims.framework.utils.beans.DateTimeBean requestdatetime;
	private ims.framework.utils.beans.DateBean requiredondate;
	private ims.vo.LookupInstanceBean currentstatus;
	private Integer requestingobjectid;
	private String description;
	private Integer targetobjectid;
	private ims.framework.utils.beans.FormNameBean requestingform;
	private ims.framework.utils.beans.FormNameBean targetform;
	private ims.core.vo.beans.ActivityVoBean requesttype;
	private ims.core.vo.beans.WorkQueueStatusHistoryVoBean[] statushistory;
	private ims.vo.LookupInstanceBean orignotetype;
	private String comments;
	private ims.vo.RefVoBean procedurelocationservice;
	private ims.vo.RefVoBean procedureactivity;
	private ims.vo.LookupInstanceBean procedurecontext;
}
