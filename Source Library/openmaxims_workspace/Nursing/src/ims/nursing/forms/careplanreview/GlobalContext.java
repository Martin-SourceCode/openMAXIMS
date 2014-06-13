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

package ims.nursing.forms.careplanreview;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		COE = new COEContext(context);
		Nursing = new NursingContext(context);
		Core = new CoreContext(context);
	}
	public final class COEContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private COEContext(ims.framework.Context context)
		{
			this.context = context;

			CarePlanReview = new CarePlanReviewContext(context);
		}
		public final class CarePlanReviewContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private CarePlanReviewContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getSearchCriteriaIsNotNull()
			{
				return !cx_COECarePlanReviewSearchCriteria.getValueIsNull(context);
			}
			public ims.core.vo.CarePlanReviewVo getSearchCriteria()
			{
				return (ims.core.vo.CarePlanReviewVo)cx_COECarePlanReviewSearchCriteria.getValue(context);
			}
		public void setSearchCriteria(ims.core.vo.CarePlanReviewVo value)
		{
				cx_COECarePlanReviewSearchCriteria.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COECarePlanReviewSearchCriteria = new ims.framework.ContextVariable("COE.CarePlanReview.SearchCriteria", "_cvp_COE.CarePlanReview.SearchCriteria");
			private ims.framework.Context context;
		}

		public boolean getCarePlanIDIsNotNull()
		{
			return !cx_COECarePlanID.getValueIsNull(context);
		}
		public Integer getCarePlanID()
		{
			return (Integer)cx_COECarePlanID.getValue(context);
		}
		public void setCarePlanID(Integer value)
		{
			cx_COECarePlanID.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_COECarePlanID = new ims.framework.ContextVariable("COE.CarePlanID", "_cv_COE.CarePlanID");

		public CarePlanReviewContext CarePlanReview;
		private ims.framework.Context context;
	}
	public final class NursingContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private NursingContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getShowCarePlanRvwDialogIsNotNull()
		{
			return !cx_NursingShowCarePlanRvwDialog.getValueIsNull(context);
		}
		public Boolean getShowCarePlanRvwDialog()
		{
			return (Boolean)cx_NursingShowCarePlanRvwDialog.getValue(context);
		}
		public void setShowCarePlanRvwDialog(Boolean value)
		{
			cx_NursingShowCarePlanRvwDialog.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_NursingShowCarePlanRvwDialog = new ims.framework.ContextVariable("Nursing.ShowCarePlanRvwDialog", "_cv_Nursing.ShowCarePlanRvwDialog");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getHospitalIsNotNull()
		{
			return !cx_CoreHospital.getValueIsNull(context);
		}
		public ims.core.vo.LocMostVo getHospital()
		{
			return (ims.core.vo.LocMostVo)cx_CoreHospital.getValue(context);
		}
		public void setHospital(ims.core.vo.LocMostVo value)
		{
			cx_CoreHospital.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreHospital = new ims.framework.ContextVariable("Core.Hospital", "_cv_Core.Hospital");
		public boolean getWardIsNotNull()
		{
			return !cx_CoreWard.getValueIsNull(context);
		}
		public ims.core.vo.LocMostVo getWard()
		{
			return (ims.core.vo.LocMostVo)cx_CoreWard.getValue(context);
		}
		public void setWard(ims.core.vo.LocMostVo value)
		{
			cx_CoreWard.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreWard = new ims.framework.ContextVariable("Core.Ward", "_cv_Core.Ward");
		public boolean getCurrentClinicalContactIsNotNull()
		{
			return !cx_CoreCurrentClinicalContact.getValueIsNull(context);
		}
		public ims.core.vo.ClinicalContactShortVo getCurrentClinicalContact()
		{
			return (ims.core.vo.ClinicalContactShortVo)cx_CoreCurrentClinicalContact.getValue(context);
		}

		private ims.framework.ContextVariable cx_CoreCurrentClinicalContact = new ims.framework.ContextVariable("Core.CurrentClinicalContact", "_cvp_Core.CurrentClinicalContact");
		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");
		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}
		public void setCurrentCareContext(ims.core.vo.CareContextShortVo value)
		{
			cx_CoreCurrentCareContext.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");

		private ims.framework.Context context;
	}

	public COEContext COE;
	public NursingContext Nursing;
	public CoreContext Core;
}