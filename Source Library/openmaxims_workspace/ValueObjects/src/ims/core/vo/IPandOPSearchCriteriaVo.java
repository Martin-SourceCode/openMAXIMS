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

package ims.core.vo;


public class IPandOPSearchCriteriaVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public IPandOPSearchCriteriaVo()
	{
	}
	public IPandOPSearchCriteriaVo(ims.core.vo.beans.IPandOPSearchCriteriaVoBean bean)
	{
		this.ward = bean.getWard() == null ? null : new ims.core.resource.place.vo.LocationRefVo(new Integer(bean.getWard().getId()), bean.getWard().getVersion());
		// Interface field type not supported.
		this.hcpdiscipline = bean.getHcpDiscipline() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getHcpDiscipline());
		this.hospital = bean.getHospital() == null ? null : new ims.core.resource.place.vo.LocationRefVo(new Integer(bean.getHospital().getId()), bean.getHospital().getVersion());
		this.date = bean.getDate() == null ? null : bean.getDate().buildDate();
		this.clinic = bean.getClinic() == null ? null : new ims.scheduling.vo.Sch_SessionRefVo(new Integer(bean.getClinic().getId()), bean.getClinic().getVersion());
		this.wastimeron = bean.getWasTimerOn();
		this.apptoutcome = bean.getApptOutcome() == null ? null : ims.scheduling.vo.lookups.ApptOutcome.buildLookup(bean.getApptOutcome());
		this.appointmentaction = bean.getAppointmentAction() == null ? null : ims.scheduling.vo.lookups.AppointmentAction.buildLookup(bean.getAppointmentAction());
		this.complete = bean.getComplete();
		this.apptdatefrom = bean.getApptDateFrom() == null ? null : bean.getApptDateFrom().buildDate();
		this.apptdateto = bean.getApptDateTo() == null ? null : bean.getApptDateTo().buildDate();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.IPandOPSearchCriteriaVoBean bean)
	{
		this.ward = bean.getWard() == null ? null : new ims.core.resource.place.vo.LocationRefVo(new Integer(bean.getWard().getId()), bean.getWard().getVersion());
		// Interface field type not supported.
		this.hcpdiscipline = bean.getHcpDiscipline() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getHcpDiscipline());
		this.hospital = bean.getHospital() == null ? null : new ims.core.resource.place.vo.LocationRefVo(new Integer(bean.getHospital().getId()), bean.getHospital().getVersion());
		this.date = bean.getDate() == null ? null : bean.getDate().buildDate();
		this.clinic = bean.getClinic() == null ? null : new ims.scheduling.vo.Sch_SessionRefVo(new Integer(bean.getClinic().getId()), bean.getClinic().getVersion());
		this.wastimeron = bean.getWasTimerOn();
		this.apptoutcome = bean.getApptOutcome() == null ? null : ims.scheduling.vo.lookups.ApptOutcome.buildLookup(bean.getApptOutcome());
		this.appointmentaction = bean.getAppointmentAction() == null ? null : ims.scheduling.vo.lookups.AppointmentAction.buildLookup(bean.getAppointmentAction());
		this.complete = bean.getComplete();
		this.apptdatefrom = bean.getApptDateFrom() == null ? null : bean.getApptDateFrom().buildDate();
		this.apptdateto = bean.getApptDateTo() == null ? null : bean.getApptDateTo().buildDate();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.IPandOPSearchCriteriaVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.IPandOPSearchCriteriaVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.IPandOPSearchCriteriaVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getWardIsNotNull()
	{
		return this.ward != null;
	}
	public ims.core.resource.place.vo.LocationRefVo getWard()
	{
		return this.ward;
	}
	public void setWard(ims.core.resource.place.vo.LocationRefVo value)
	{
		this.isValidated = false;
		this.ward = value;
	}
	public boolean getConsultantIsNotNull()
	{
		return this.consultant != null;
	}
	public ims.vo.interfaces.IMos getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.vo.interfaces.IMos value)
	{
		this.isValidated = false;
		this.consultant = value;
	}
	public boolean getHcpDisciplineIsNotNull()
	{
		return this.hcpdiscipline != null;
	}
	public ims.core.vo.lookups.HcpDisType getHcpDiscipline()
	{
		return this.hcpdiscipline;
	}
	public void setHcpDiscipline(ims.core.vo.lookups.HcpDisType value)
	{
		this.isValidated = false;
		this.hcpdiscipline = value;
	}
	public boolean getHospitalIsNotNull()
	{
		return this.hospital != null;
	}
	public ims.core.resource.place.vo.LocationRefVo getHospital()
	{
		return this.hospital;
	}
	public void setHospital(ims.core.resource.place.vo.LocationRefVo value)
	{
		this.isValidated = false;
		this.hospital = value;
	}
	public boolean getDateIsNotNull()
	{
		return this.date != null;
	}
	public ims.framework.utils.Date getDate()
	{
		return this.date;
	}
	public void setDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.date = value;
	}
	public boolean getClinicIsNotNull()
	{
		return this.clinic != null;
	}
	public ims.scheduling.vo.Sch_SessionRefVo getClinic()
	{
		return this.clinic;
	}
	public void setClinic(ims.scheduling.vo.Sch_SessionRefVo value)
	{
		this.isValidated = false;
		this.clinic = value;
	}
	public boolean getWasTimerOnIsNotNull()
	{
		return this.wastimeron != null;
	}
	public Boolean getWasTimerOn()
	{
		return this.wastimeron;
	}
	public void setWasTimerOn(Boolean value)
	{
		this.isValidated = false;
		this.wastimeron = value;
	}
	public boolean getApptOutcomeIsNotNull()
	{
		return this.apptoutcome != null;
	}
	public ims.scheduling.vo.lookups.ApptOutcome getApptOutcome()
	{
		return this.apptoutcome;
	}
	public void setApptOutcome(ims.scheduling.vo.lookups.ApptOutcome value)
	{
		this.isValidated = false;
		this.apptoutcome = value;
	}
	public boolean getAppointmentActionIsNotNull()
	{
		return this.appointmentaction != null;
	}
	public ims.scheduling.vo.lookups.AppointmentAction getAppointmentAction()
	{
		return this.appointmentaction;
	}
	public void setAppointmentAction(ims.scheduling.vo.lookups.AppointmentAction value)
	{
		this.isValidated = false;
		this.appointmentaction = value;
	}
	public boolean getCompleteIsNotNull()
	{
		return this.complete != null;
	}
	public Boolean getComplete()
	{
		return this.complete;
	}
	public void setComplete(Boolean value)
	{
		this.isValidated = false;
		this.complete = value;
	}
	public boolean getApptDateFromIsNotNull()
	{
		return this.apptdatefrom != null;
	}
	public ims.framework.utils.Date getApptDateFrom()
	{
		return this.apptdatefrom;
	}
	public void setApptDateFrom(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.apptdatefrom = value;
	}
	public boolean getApptDateToIsNotNull()
	{
		return this.apptdateto != null;
	}
	public ims.framework.utils.Date getApptDateTo()
	{
		return this.apptdateto;
	}
	public void setApptDateTo(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.apptdateto = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof IPandOPSearchCriteriaVo))
			return false;
		IPandOPSearchCriteriaVo compareObj = (IPandOPSearchCriteriaVo)obj;
		if(this.getWard() == null && compareObj.getWard() != null)
			return false;
		if(this.getWard() != null && compareObj.getWard() == null)
			return false;
		if(this.getWard() != null && compareObj.getWard() != null)
			return this.getWard().equals(compareObj.getWard());
		return super.equals(obj);
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		IPandOPSearchCriteriaVo clone = new IPandOPSearchCriteriaVo();
		
		clone.ward = this.ward;
		clone.consultant = this.consultant;
		if(this.hcpdiscipline == null)
			clone.hcpdiscipline = null;
		else
			clone.hcpdiscipline = (ims.core.vo.lookups.HcpDisType)this.hcpdiscipline.clone();
		clone.hospital = this.hospital;
		if(this.date == null)
			clone.date = null;
		else
			clone.date = (ims.framework.utils.Date)this.date.clone();
		clone.clinic = this.clinic;
		clone.wastimeron = this.wastimeron;
		if(this.apptoutcome == null)
			clone.apptoutcome = null;
		else
			clone.apptoutcome = (ims.scheduling.vo.lookups.ApptOutcome)this.apptoutcome.clone();
		if(this.appointmentaction == null)
			clone.appointmentaction = null;
		else
			clone.appointmentaction = (ims.scheduling.vo.lookups.AppointmentAction)this.appointmentaction.clone();
		clone.complete = this.complete;
		if(this.apptdatefrom == null)
			clone.apptdatefrom = null;
		else
			clone.apptdatefrom = (ims.framework.utils.Date)this.apptdatefrom.clone();
		if(this.apptdateto == null)
			clone.apptdateto = null;
		else
			clone.apptdateto = (ims.framework.utils.Date)this.apptdateto.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(IPandOPSearchCriteriaVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A IPandOPSearchCriteriaVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		IPandOPSearchCriteriaVo compareObj = (IPandOPSearchCriteriaVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getWard() == null && compareObj.getWard() != null)
				return -1;
			if(this.getWard() != null && compareObj.getWard() == null)
				return 1;
			if(this.getWard() != null && compareObj.getWard() != null)
				retVal = this.getWard().compareTo(compareObj.getWard());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.ward != null)
			count++;
		if(this.consultant != null)
			count++;
		if(this.hcpdiscipline != null)
			count++;
		if(this.hospital != null)
			count++;
		if(this.date != null)
			count++;
		if(this.clinic != null)
			count++;
		if(this.wastimeron != null)
			count++;
		if(this.apptoutcome != null)
			count++;
		if(this.appointmentaction != null)
			count++;
		if(this.complete != null)
			count++;
		if(this.apptdatefrom != null)
			count++;
		if(this.apptdateto != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 12;
	}
	protected ims.core.resource.place.vo.LocationRefVo ward;
	protected ims.vo.interfaces.IMos consultant;
	protected ims.core.vo.lookups.HcpDisType hcpdiscipline;
	protected ims.core.resource.place.vo.LocationRefVo hospital;
	protected ims.framework.utils.Date date;
	protected ims.scheduling.vo.Sch_SessionRefVo clinic;
	protected Boolean wastimeron;
	protected ims.scheduling.vo.lookups.ApptOutcome apptoutcome;
	protected ims.scheduling.vo.lookups.AppointmentAction appointmentaction;
	protected Boolean complete;
	protected ims.framework.utils.Date apptdatefrom;
	protected ims.framework.utils.Date apptdateto;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
