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

package ims.careuk.vo.beans;

public class PatientElectiveListForTCIDetailsDialogVoBean extends ims.vo.ValueObjectBean
{
	public PatientElectiveListForTCIDetailsDialogVoBean()
	{
	}
	public PatientElectiveListForTCIDetailsDialogVoBean(ims.careuk.vo.PatientElectiveListForTCIDetailsDialogVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.electivelist = vo.getElectiveList() == null ? null : (ims.admin.vo.beans.ElectiveListConfigurationVoBean)vo.getElectiveList().getBean();
		this.electiveliststatus = vo.getElectiveListStatus() == null ? null : (ims.careuk.vo.beans.ElectiveListStatusVoBean)vo.getElectiveListStatus().getBean();
		this.electiveliststatushistory = vo.getElectiveListStatusHistory() == null ? null : vo.getElectiveListStatusHistory().getBeanCollection();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.referral = vo.getReferral() == null ? null : new ims.vo.RefVoBean(vo.getReferral().getBoId(), vo.getReferral().getBoVersion());
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.ward = vo.getWard() == null ? null : new ims.vo.RefVoBean(vo.getWard().getBoId(), vo.getWard().getBoVersion());
		this.consultant = vo.getConsultant() == null ? null : new ims.vo.RefVoBean(vo.getConsultant().getBoId(), vo.getConsultant().getBoVersion());
		this.dateonlist = vo.getDateOnList() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOnList().getBean();
		this.originaldecisiondate = vo.getOriginalDecisionDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getOriginalDecisionDate().getBean();
		this.electivelistreason = vo.getElectiveListReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getElectiveListReason().getBean();
		this.electiveadmissiontype = vo.getElectiveAdmissionType() == null ? null : (ims.vo.LookupInstanceBean)vo.getElectiveAdmissionType().getBean();
		this.intendedmanagement = vo.getIntendedManagement() == null ? null : (ims.vo.LookupInstanceBean)vo.getIntendedManagement().getBean();
		this.anticipatedstay = vo.getAnticipatedStay();
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		if(vo.getSuspensions() != null)
		{
			this.suspensions = new ims.vo.RefVoBean[vo.getSuspensions().size()];
			for(int suspensions_i = 0; suspensions_i < vo.getSuspensions().size(); suspensions_i++)
			{
				this.suspensions[suspensions_i] = new ims.vo.RefVoBean(vo.getSuspensions().get(suspensions_i).getBoId(),vo.getSuspensions().get(suspensions_i).getBoVersion());
			}
		}
		this.operativeprocedurestatus = vo.getOperativeProcedureStatus();
		this.primaryprocedure = vo.getPrimaryProcedure() == null ? null : new ims.vo.RefVoBean(vo.getPrimaryProcedure().getBoId(), vo.getPrimaryProcedure().getBoVersion());
		if(vo.getOtherProcedures() != null)
		{
			this.otherprocedures = new ims.vo.RefVoBean[vo.getOtherProcedures().size()];
			for(int otherprocedures_i = 0; otherprocedures_i < vo.getOtherProcedures().size(); otherprocedures_i++)
			{
				this.otherprocedures[otherprocedures_i] = new ims.vo.RefVoBean(vo.getOtherProcedures().get(otherprocedures_i).getBoId(),vo.getOtherProcedures().get(otherprocedures_i).getBoVersion());
			}
		}
		this.tcidetails = vo.getTCIDetails() == null ? null : (ims.careuk.vo.beans.PatientElectiveListTCIVoBean)vo.getTCIDetails().getBean();
		this.tcihistory = vo.getTCIHistory() == null ? null : vo.getTCIHistory().getBeanCollection();
		this.interpretatorrequired = vo.getInterpretatorRequired();
		this.transport = vo.getTransport() == null ? null : (ims.vo.LookupInstanceBean)vo.getTransport().getBean();
		if(vo.getNotes() != null)
		{
			this.notes = new ims.vo.RefVoBean[vo.getNotes().size()];
			for(int notes_i = 0; notes_i < vo.getNotes().size(); notes_i++)
			{
				this.notes[notes_i] = new ims.vo.RefVoBean(vo.getNotes().get(notes_i).getBoId(),vo.getNotes().get(notes_i).getBoVersion());
			}
		}
		this.erod = vo.getEROD() == null ? null : (ims.careuk.vo.beans.ReferralERODVoBean)vo.getEROD().getBean();
		this.erodhistory = vo.getERODHistory() == null ? null : vo.getERODHistory().getBeanCollection();
		this.pathwayclock = vo.getPathwayClock() == null ? null : new ims.vo.RefVoBean(vo.getPathwayClock().getBoId(), vo.getPathwayClock().getBoVersion());
		this.patientstatus = vo.getPatientStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientStatus().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.careuk.vo.PatientElectiveListForTCIDetailsDialogVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.electivelist = vo.getElectiveList() == null ? null : (ims.admin.vo.beans.ElectiveListConfigurationVoBean)vo.getElectiveList().getBean(map);
		this.electiveliststatus = vo.getElectiveListStatus() == null ? null : (ims.careuk.vo.beans.ElectiveListStatusVoBean)vo.getElectiveListStatus().getBean(map);
		this.electiveliststatushistory = vo.getElectiveListStatusHistory() == null ? null : vo.getElectiveListStatusHistory().getBeanCollection();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.referral = vo.getReferral() == null ? null : new ims.vo.RefVoBean(vo.getReferral().getBoId(), vo.getReferral().getBoVersion());
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.ward = vo.getWard() == null ? null : new ims.vo.RefVoBean(vo.getWard().getBoId(), vo.getWard().getBoVersion());
		this.consultant = vo.getConsultant() == null ? null : new ims.vo.RefVoBean(vo.getConsultant().getBoId(), vo.getConsultant().getBoVersion());
		this.dateonlist = vo.getDateOnList() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOnList().getBean();
		this.originaldecisiondate = vo.getOriginalDecisionDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getOriginalDecisionDate().getBean();
		this.electivelistreason = vo.getElectiveListReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getElectiveListReason().getBean();
		this.electiveadmissiontype = vo.getElectiveAdmissionType() == null ? null : (ims.vo.LookupInstanceBean)vo.getElectiveAdmissionType().getBean();
		this.intendedmanagement = vo.getIntendedManagement() == null ? null : (ims.vo.LookupInstanceBean)vo.getIntendedManagement().getBean();
		this.anticipatedstay = vo.getAnticipatedStay();
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		if(vo.getSuspensions() != null)
		{
			this.suspensions = new ims.vo.RefVoBean[vo.getSuspensions().size()];
			for(int suspensions_i = 0; suspensions_i < vo.getSuspensions().size(); suspensions_i++)
			{
				this.suspensions[suspensions_i] = new ims.vo.RefVoBean(vo.getSuspensions().get(suspensions_i).getBoId(),vo.getSuspensions().get(suspensions_i).getBoVersion());
			}
		}
		this.operativeprocedurestatus = vo.getOperativeProcedureStatus();
		this.primaryprocedure = vo.getPrimaryProcedure() == null ? null : new ims.vo.RefVoBean(vo.getPrimaryProcedure().getBoId(), vo.getPrimaryProcedure().getBoVersion());
		if(vo.getOtherProcedures() != null)
		{
			this.otherprocedures = new ims.vo.RefVoBean[vo.getOtherProcedures().size()];
			for(int otherprocedures_i = 0; otherprocedures_i < vo.getOtherProcedures().size(); otherprocedures_i++)
			{
				this.otherprocedures[otherprocedures_i] = new ims.vo.RefVoBean(vo.getOtherProcedures().get(otherprocedures_i).getBoId(),vo.getOtherProcedures().get(otherprocedures_i).getBoVersion());
			}
		}
		this.tcidetails = vo.getTCIDetails() == null ? null : (ims.careuk.vo.beans.PatientElectiveListTCIVoBean)vo.getTCIDetails().getBean(map);
		this.tcihistory = vo.getTCIHistory() == null ? null : vo.getTCIHistory().getBeanCollection();
		this.interpretatorrequired = vo.getInterpretatorRequired();
		this.transport = vo.getTransport() == null ? null : (ims.vo.LookupInstanceBean)vo.getTransport().getBean();
		if(vo.getNotes() != null)
		{
			this.notes = new ims.vo.RefVoBean[vo.getNotes().size()];
			for(int notes_i = 0; notes_i < vo.getNotes().size(); notes_i++)
			{
				this.notes[notes_i] = new ims.vo.RefVoBean(vo.getNotes().get(notes_i).getBoId(),vo.getNotes().get(notes_i).getBoVersion());
			}
		}
		this.erod = vo.getEROD() == null ? null : (ims.careuk.vo.beans.ReferralERODVoBean)vo.getEROD().getBean(map);
		this.erodhistory = vo.getERODHistory() == null ? null : vo.getERODHistory().getBeanCollection();
		this.pathwayclock = vo.getPathwayClock() == null ? null : new ims.vo.RefVoBean(vo.getPathwayClock().getBoId(), vo.getPathwayClock().getBoVersion());
		this.patientstatus = vo.getPatientStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientStatus().getBean();
	}

	public ims.careuk.vo.PatientElectiveListForTCIDetailsDialogVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.careuk.vo.PatientElectiveListForTCIDetailsDialogVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.careuk.vo.PatientElectiveListForTCIDetailsDialogVo vo = null;
		if(map != null)
			vo = (ims.careuk.vo.PatientElectiveListForTCIDetailsDialogVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.careuk.vo.PatientElectiveListForTCIDetailsDialogVo();
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
	public ims.admin.vo.beans.ElectiveListConfigurationVoBean getElectiveList()
	{
		return this.electivelist;
	}
	public void setElectiveList(ims.admin.vo.beans.ElectiveListConfigurationVoBean value)
	{
		this.electivelist = value;
	}
	public ims.careuk.vo.beans.ElectiveListStatusVoBean getElectiveListStatus()
	{
		return this.electiveliststatus;
	}
	public void setElectiveListStatus(ims.careuk.vo.beans.ElectiveListStatusVoBean value)
	{
		this.electiveliststatus = value;
	}
	public ims.careuk.vo.beans.ElectiveListStatusVoBean[] getElectiveListStatusHistory()
	{
		return this.electiveliststatushistory;
	}
	public void setElectiveListStatusHistory(ims.careuk.vo.beans.ElectiveListStatusVoBean[] value)
	{
		this.electiveliststatushistory = value;
	}
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.vo.RefVoBean getReferral()
	{
		return this.referral;
	}
	public void setReferral(ims.vo.RefVoBean value)
	{
		this.referral = value;
	}
	public ims.vo.RefVoBean getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.vo.RefVoBean value)
	{
		this.episodeofcare = value;
	}
	public ims.vo.RefVoBean getWard()
	{
		return this.ward;
	}
	public void setWard(ims.vo.RefVoBean value)
	{
		this.ward = value;
	}
	public ims.vo.RefVoBean getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.vo.RefVoBean value)
	{
		this.consultant = value;
	}
	public ims.framework.utils.beans.DateBean getDateOnList()
	{
		return this.dateonlist;
	}
	public void setDateOnList(ims.framework.utils.beans.DateBean value)
	{
		this.dateonlist = value;
	}
	public ims.framework.utils.beans.DateBean getOriginalDecisionDate()
	{
		return this.originaldecisiondate;
	}
	public void setOriginalDecisionDate(ims.framework.utils.beans.DateBean value)
	{
		this.originaldecisiondate = value;
	}
	public ims.vo.LookupInstanceBean getElectiveListReason()
	{
		return this.electivelistreason;
	}
	public void setElectiveListReason(ims.vo.LookupInstanceBean value)
	{
		this.electivelistreason = value;
	}
	public ims.vo.LookupInstanceBean getElectiveAdmissionType()
	{
		return this.electiveadmissiontype;
	}
	public void setElectiveAdmissionType(ims.vo.LookupInstanceBean value)
	{
		this.electiveadmissiontype = value;
	}
	public ims.vo.LookupInstanceBean getIntendedManagement()
	{
		return this.intendedmanagement;
	}
	public void setIntendedManagement(ims.vo.LookupInstanceBean value)
	{
		this.intendedmanagement = value;
	}
	public Integer getAnticipatedStay()
	{
		return this.anticipatedstay;
	}
	public void setAnticipatedStay(Integer value)
	{
		this.anticipatedstay = value;
	}
	public ims.vo.LookupInstanceBean getPriority()
	{
		return this.priority;
	}
	public void setPriority(ims.vo.LookupInstanceBean value)
	{
		this.priority = value;
	}
	public ims.vo.RefVoBean[] getSuspensions()
	{
		return this.suspensions;
	}
	public void setSuspensions(ims.vo.RefVoBean[] value)
	{
		this.suspensions = value;
	}
	public Boolean getOperativeProcedureStatus()
	{
		return this.operativeprocedurestatus;
	}
	public void setOperativeProcedureStatus(Boolean value)
	{
		this.operativeprocedurestatus = value;
	}
	public ims.vo.RefVoBean getPrimaryProcedure()
	{
		return this.primaryprocedure;
	}
	public void setPrimaryProcedure(ims.vo.RefVoBean value)
	{
		this.primaryprocedure = value;
	}
	public ims.vo.RefVoBean[] getOtherProcedures()
	{
		return this.otherprocedures;
	}
	public void setOtherProcedures(ims.vo.RefVoBean[] value)
	{
		this.otherprocedures = value;
	}
	public ims.careuk.vo.beans.PatientElectiveListTCIVoBean getTCIDetails()
	{
		return this.tcidetails;
	}
	public void setTCIDetails(ims.careuk.vo.beans.PatientElectiveListTCIVoBean value)
	{
		this.tcidetails = value;
	}
	public ims.careuk.vo.beans.PatientElectiveListTCIVoBean[] getTCIHistory()
	{
		return this.tcihistory;
	}
	public void setTCIHistory(ims.careuk.vo.beans.PatientElectiveListTCIVoBean[] value)
	{
		this.tcihistory = value;
	}
	public Boolean getInterpretatorRequired()
	{
		return this.interpretatorrequired;
	}
	public void setInterpretatorRequired(Boolean value)
	{
		this.interpretatorrequired = value;
	}
	public ims.vo.LookupInstanceBean getTransport()
	{
		return this.transport;
	}
	public void setTransport(ims.vo.LookupInstanceBean value)
	{
		this.transport = value;
	}
	public ims.vo.RefVoBean[] getNotes()
	{
		return this.notes;
	}
	public void setNotes(ims.vo.RefVoBean[] value)
	{
		this.notes = value;
	}
	public ims.careuk.vo.beans.ReferralERODVoBean getEROD()
	{
		return this.erod;
	}
	public void setEROD(ims.careuk.vo.beans.ReferralERODVoBean value)
	{
		this.erod = value;
	}
	public ims.careuk.vo.beans.ReferralERODVoBean[] getERODHistory()
	{
		return this.erodhistory;
	}
	public void setERODHistory(ims.careuk.vo.beans.ReferralERODVoBean[] value)
	{
		this.erodhistory = value;
	}
	public ims.vo.RefVoBean getPathwayClock()
	{
		return this.pathwayclock;
	}
	public void setPathwayClock(ims.vo.RefVoBean value)
	{
		this.pathwayclock = value;
	}
	public ims.vo.LookupInstanceBean getPatientStatus()
	{
		return this.patientstatus;
	}
	public void setPatientStatus(ims.vo.LookupInstanceBean value)
	{
		this.patientstatus = value;
	}

	private Integer id;
	private int version;
	private ims.admin.vo.beans.ElectiveListConfigurationVoBean electivelist;
	private ims.careuk.vo.beans.ElectiveListStatusVoBean electiveliststatus;
	private ims.careuk.vo.beans.ElectiveListStatusVoBean[] electiveliststatushistory;
	private ims.vo.RefVoBean patient;
	private ims.vo.RefVoBean referral;
	private ims.vo.RefVoBean episodeofcare;
	private ims.vo.RefVoBean ward;
	private ims.vo.RefVoBean consultant;
	private ims.framework.utils.beans.DateBean dateonlist;
	private ims.framework.utils.beans.DateBean originaldecisiondate;
	private ims.vo.LookupInstanceBean electivelistreason;
	private ims.vo.LookupInstanceBean electiveadmissiontype;
	private ims.vo.LookupInstanceBean intendedmanagement;
	private Integer anticipatedstay;
	private ims.vo.LookupInstanceBean priority;
	private ims.vo.RefVoBean[] suspensions;
	private Boolean operativeprocedurestatus;
	private ims.vo.RefVoBean primaryprocedure;
	private ims.vo.RefVoBean[] otherprocedures;
	private ims.careuk.vo.beans.PatientElectiveListTCIVoBean tcidetails;
	private ims.careuk.vo.beans.PatientElectiveListTCIVoBean[] tcihistory;
	private Boolean interpretatorrequired;
	private ims.vo.LookupInstanceBean transport;
	private ims.vo.RefVoBean[] notes;
	private ims.careuk.vo.beans.ReferralERODVoBean erod;
	private ims.careuk.vo.beans.ReferralERODVoBean[] erodhistory;
	private ims.vo.RefVoBean pathwayclock;
	private ims.vo.LookupInstanceBean patientstatus;
}