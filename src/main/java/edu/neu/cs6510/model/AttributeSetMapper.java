package edu.neu.cs6510.model;

import java.util.HashMap;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

@SuppressWarnings("rawtypes")
public class AttributeSetMapper implements FieldSetMapper {

	@Override
	public RecordMap mapFieldSet(FieldSet fieldSet) throws BindException {
		RecordMap rec = new RecordMap();
		
		rec.data = new HashMap<Integer, Integer>();
		
		rec.setId(fieldSet.readInt("ID"));
		rec.setYear(fieldSet.readInt("Year4"));
		rec.setName(fieldSet.readString("Name"));
		
		if ( fieldSet.readString("Population").trim().length() > 0 && fieldSet.readInt("Population") != 0) {
		rec.getData().put(AttributeEnum.Population.getValue(),fieldSet.readInt("Population"));}
		if ( fieldSet.readString("FunctionCode").trim().length() > 0 && fieldSet.readInt("FunctionCode") != 0) {
		rec.getData().put(AttributeEnum.FunctionCode.getValue(),fieldSet.readInt("FunctionCode"));}
		if ( fieldSet.readString("Enrollment").trim().length() > 0 && fieldSet.readInt("Enrollment") != 0) {
		rec.getData().put(AttributeEnum.Enrollment.getValue(),fieldSet.readInt("Enrollment"));}
		if ( fieldSet.readString("Total_Revenue").trim().length() > 0 && fieldSet.readInt("Total_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Total_Revenue.getValue(),fieldSet.readInt("Total_Revenue"));}
		if ( fieldSet.readString("Total_Rev_Own_Sources").trim().length() > 0 && fieldSet.readInt("Total_Rev_Own_Sources") != 0) {
		rec.getData().put(AttributeEnum.Total_Rev_Own_Sources.getValue(),fieldSet.readInt("Total_Rev_Own_Sources"));}
		if ( fieldSet.readString("General_Revenue").trim().length() > 0 && fieldSet.readInt("General_Revenue") != 0) {
		rec.getData().put(AttributeEnum.General_Revenue.getValue(),fieldSet.readInt("General_Revenue"));}
		if ( fieldSet.readString("Gen_Rev_Own_Sources").trim().length() > 0 && fieldSet.readInt("Gen_Rev_Own_Sources") != 0) {
		rec.getData().put(AttributeEnum.Gen_Rev_Own_Sources.getValue(),fieldSet.readInt("Gen_Rev_Own_Sources"));}
		if ( fieldSet.readString("Total_Taxes").trim().length() > 0 && fieldSet.readInt("Total_Taxes") != 0) {
		rec.getData().put(AttributeEnum.Total.getValue(),fieldSet.readInt("Total_Taxes"));}
		if ( fieldSet.readString("Property_Tax").trim().length() > 0 && fieldSet.readInt("Property_Tax") != 0) {
		rec.getData().put(AttributeEnum.Property_Tax.getValue(),fieldSet.readInt("Property_Tax"));}
		if ( fieldSet.readString("Tot_Sales___Gr_Rec_Tax").trim().length() > 0 && fieldSet.readInt("Tot_Sales___Gr_Rec_Tax") != 0) {
		rec.getData().put(AttributeEnum.Tot_Sales___Gr_Rec_Tax.getValue(),fieldSet.readInt("Tot_Sales___Gr_Rec_Tax"));}
		if ( fieldSet.readString("Total_Gen_Sales_Tax").trim().length() > 0 && fieldSet.readInt("Total_Gen_Sales_Tax") != 0) {
		rec.getData().put(AttributeEnum.Total_Gen_Sales_Tax.getValue(),fieldSet.readInt("Total_Gen_Sales_Tax"));}
		if ( fieldSet.readString("Total_Select_Sales_Tax").trim().length() > 0 && fieldSet.readInt("Total_Select_Sales_Tax") != 0) {
		rec.getData().put(AttributeEnum.Total_Select_Sales_Tax.getValue(),fieldSet.readInt("Total_Select_Sales_Tax"));}
		if ( fieldSet.readString("Alcoholic_Beverage_Tax").trim().length() > 0 && fieldSet.readInt("Alcoholic_Beverage_Tax") != 0) {
		rec.getData().put(AttributeEnum.Alcoholic_Beverage_Tax.getValue(),fieldSet.readInt("Alcoholic_Beverage_Tax"));}
		if ( fieldSet.readString("Amusement_Tax").trim().length() > 0 && fieldSet.readInt("Amusement_Tax") != 0) {
		rec.getData().put(AttributeEnum.Amusement_Tax.getValue(),fieldSet.readInt("Amusement_Tax"));}
		if ( fieldSet.readString("Insurance_Premium_Tax").trim().length() > 0 && fieldSet.readInt("Insurance_Premium_Tax") != 0) {
		rec.getData().put(AttributeEnum.Insurance_Premium_Tax.getValue(),fieldSet.readInt("Insurance_Premium_Tax"));}
		if ( fieldSet.readString("Motor_Fuels_Tax").trim().length() > 0 && fieldSet.readInt("Motor_Fuels_Tax") != 0) {
		rec.getData().put(AttributeEnum.Motor_Fuels_Tax.getValue(),fieldSet.readInt("Motor_Fuels_Tax"));}
		if ( fieldSet.readString("Pari_mutuels_Tax").trim().length() > 0 && fieldSet.readInt("Pari_mutuels_Tax") != 0) {
		rec.getData().put(AttributeEnum.Pari_mutuels_Tax.getValue(),fieldSet.readInt("Pari_mutuels_Tax"));}
		if ( fieldSet.readString("Public_Utility_Tax").trim().length() > 0 && fieldSet.readInt("Public_Utility_Tax") != 0) {
		rec.getData().put(AttributeEnum.Public_Utility_Tax.getValue(),fieldSet.readInt("Public_Utility_Tax"));}
		if ( fieldSet.readString("Tobacco_Tax").trim().length() > 0 && fieldSet.readInt("Tobacco_Tax") != 0) {
		rec.getData().put(AttributeEnum.Tobacco_Tax.getValue(),fieldSet.readInt("Tobacco_Tax"));}
		if ( fieldSet.readString("Other_Select_Sales_Tax").trim().length() > 0 && fieldSet.readInt("Other_Select_Sales_Tax") != 0) {
		rec.getData().put(AttributeEnum.Other_Select_Sales_Tax.getValue(),fieldSet.readInt("Other_Select_Sales_Tax"));}
		if ( fieldSet.readString("Total_License_Taxes").trim().length() > 0 && fieldSet.readInt("Total_License_Taxes") != 0) {
		rec.getData().put(AttributeEnum.Total_License_Taxes.getValue(),fieldSet.readInt("Total_License_Taxes"));}
		if ( fieldSet.readString("Alcoholic_Beverage_Lic").trim().length() > 0 && fieldSet.readInt("Alcoholic_Beverage_Lic") != 0) {
		rec.getData().put(AttributeEnum.Alcoholic_Beverage_Lic.getValue(),fieldSet.readInt("Alcoholic_Beverage_Lic"));}
		if ( fieldSet.readString("Amusement_License").trim().length() > 0 && fieldSet.readInt("Amusement_License") != 0) {
		rec.getData().put(AttributeEnum.Amusement_License.getValue(),fieldSet.readInt("Amusement_License"));}
		if ( fieldSet.readString("Corporation_License").trim().length() > 0 && fieldSet.readInt("Corporation_License") != 0) {
		rec.getData().put(AttributeEnum.Corporation_License.getValue(),fieldSet.readInt("Corporation_License"));}
		if ( fieldSet.readString("Hunting___Fishing_License").trim().length() > 0 && fieldSet.readInt("Hunting___Fishing_License") != 0) {
		rec.getData().put(AttributeEnum.Hunting___Fishing_License.getValue(),fieldSet.readInt("Hunting___Fishing_License"));}
		if ( fieldSet.readString("Motor_Vehicle_License").trim().length() > 0 && fieldSet.readInt("Motor_Vehicle_License") != 0) {
		rec.getData().put(AttributeEnum.Motor_Vehicle_License.getValue(),fieldSet.readInt("Motor_Vehicle_License"));}
		if ( fieldSet.readString("Motor_Veh_Oper_License").trim().length() > 0 && fieldSet.readInt("Motor_Veh_Oper_License") != 0) {
		rec.getData().put(AttributeEnum.Motor_Veh_Oper_License.getValue(),fieldSet.readInt("Motor_Veh_Oper_License"));}
		if ( fieldSet.readString("Motor_Vehicle_License_Total").trim().length() > 0 && fieldSet.readInt("Motor_Vehicle_License_Total") != 0) {
		rec.getData().put(AttributeEnum.Motor_Vehicle_License_Total.getValue(),fieldSet.readInt("Motor_Vehicle_License_Total"));}
		if ( fieldSet.readString("Public_Utility_License").trim().length() > 0 && fieldSet.readInt("Public_Utility_License") != 0) {
		rec.getData().put(AttributeEnum.Public_Utility_License.getValue(),fieldSet.readInt("Public_Utility_License"));}
		if ( fieldSet.readString("Occup_and_Bus_Lic_NEC").trim().length() > 0 && fieldSet.readInt("Occup_and_Bus_Lic_NEC") != 0) {
		rec.getData().put(AttributeEnum.Occup_and_Bus_Lic_NEC.getValue(),fieldSet.readInt("Occup_and_Bus_Lic_NEC"));}
		if ( fieldSet.readString("Other_License_Taxes").trim().length() > 0 && fieldSet.readInt("Other_License_Taxes") != 0) {
		rec.getData().put(AttributeEnum.Other_License_Taxes.getValue(),fieldSet.readInt("Other_License_Taxes"));}
		if ( fieldSet.readString("Total_Income_Taxes").trim().length() > 0 && fieldSet.readInt("Total_Income_Taxes") != 0) {
		rec.getData().put(AttributeEnum.Total_Income_Taxes.getValue(),fieldSet.readInt("Total_Income_Taxes"));}
		if ( fieldSet.readString("Individual_Income_Tax").trim().length() > 0 && fieldSet.readInt("Individual_Income_Tax") != 0) {
		rec.getData().put(AttributeEnum.Individual_Income_Tax.getValue(),fieldSet.readInt("Individual_Income_Tax"));}
		if ( fieldSet.readString("Corp_Net_Income_Tax").trim().length() > 0 && fieldSet.readInt("Corp_Net_Income_Tax") != 0) {
		rec.getData().put(AttributeEnum.Corp_Net_Income_Tax.getValue(),fieldSet.readInt("Corp_Net_Income_Tax"));}
		if ( fieldSet.readString("Death_and_Gift_Tax").trim().length() > 0 && fieldSet.readInt("Death_and_Gift_Tax") != 0) {
		rec.getData().put(AttributeEnum.Death_and_Gift_Tax.getValue(),fieldSet.readInt("Death_and_Gift_Tax"));}
		if ( fieldSet.readString("Docum_and_Stock_Tr_Tax").trim().length() > 0 && fieldSet.readInt("Docum_and_Stock_Tr_Tax") != 0) {
		rec.getData().put(AttributeEnum.Docum_and_Stock_Tr_Tax.getValue(),fieldSet.readInt("Docum_and_Stock_Tr_Tax"));}
		if ( fieldSet.readString("Severance_Tax").trim().length() > 0 && fieldSet.readInt("Severance_Tax") != 0) {
		rec.getData().put(AttributeEnum.Severance_Tax.getValue(),fieldSet.readInt("Severance_Tax"));}
		if ( fieldSet.readString("Taxes_NEC").trim().length() > 0 && fieldSet.readInt("Taxes_NEC") != 0) {
		rec.getData().put(AttributeEnum.Taxes_NEC.getValue(),fieldSet.readInt("Taxes_NEC"));}
		if ( fieldSet.readString("Total_IG_Revenue").trim().length() > 0 && fieldSet.readInt("Total_IG_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Total_IG_Revenue.getValue(),fieldSet.readInt("Total_IG_Revenue"));}
		if ( fieldSet.readString("Total_Fed_IG_Revenue").trim().length() > 0 && fieldSet.readInt("Total_Fed_IG_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Total_Fed_IG_Revenue.getValue(),fieldSet.readInt("Total_Fed_IG_Revenue"));}
		if ( fieldSet.readString("Fed_IGR_Air_Transport").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Air_Transport") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Air_Transport.getValue(),fieldSet.readInt("Fed_IGR_Air_Transport"));}
		if ( fieldSet.readString("Fed_IGR_Education").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Education") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Education.getValue(),fieldSet.readInt("Fed_IGR_Education"));}
		if ( fieldSet.readString("Fed_IGR_Emp_Sec_Adm").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Emp_Sec_Adm") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Emp_Sec_Adm.getValue(),fieldSet.readInt("Fed_IGR_Emp_Sec_Adm"));}
		if ( fieldSet.readString("Fed_IGR_Gen_Rev_Shar").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Gen_Rev_Shar") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Gen_Rev_Shar.getValue(),fieldSet.readInt("Fed_IGR_Gen_Rev_Shar"));}
		if ( fieldSet.readString("Fed_IGR_Gen_Support").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Gen_Support") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Gen_Support.getValue(),fieldSet.readInt("Fed_IGR_Gen_Support"));}
		if ( fieldSet.readString("Fed_IGR_Health___Hos").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Health___Hos") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Health___Hos.getValue(),fieldSet.readInt("Fed_IGR_Health___Hos"));}
		if ( fieldSet.readString("Fed_IGR_Highways").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Highways") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Highways.getValue(),fieldSet.readInt("Fed_IGR_Highways"));}
		if ( fieldSet.readString("Fed_IGR_Transit_Sub").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Transit_Sub") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Transit_Sub.getValue(),fieldSet.readInt("Fed_IGR_Transit_Sub"));}
		if ( fieldSet.readString("Fed_IGR_Hous_Com_Dev").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Hous_Com_Dev") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Hous_Com_Dev.getValue(),fieldSet.readInt("Fed_IGR_Hous_Com_Dev"));}
		if ( fieldSet.readString("Fed_IGR_Natural_Res").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Natural_Res") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Natural_Res.getValue(),fieldSet.readInt("Fed_IGR_Natural_Res"));}
		if ( fieldSet.readString("Fed_IGR_Public_Welf").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Public_Welf") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Public_Welf.getValue(),fieldSet.readInt("Fed_IGR_Public_Welf"));}
		if ( fieldSet.readString("Fed_IGR_Sewerage").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Sewerage") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Sewerage.getValue(),fieldSet.readInt("Fed_IGR_Sewerage"));}
		if ( fieldSet.readString("Fed_IGR_Other").trim().length() > 0 && fieldSet.readInt("Fed_IGR_Other") != 0) {
		rec.getData().put(AttributeEnum.Fed_IGR_Other.getValue(),fieldSet.readInt("Fed_IGR_Other"));}
		if ( fieldSet.readString("Total_State_IG_Revenue").trim().length() > 0 && fieldSet.readInt("Total_State_IG_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Total_State_IG_Revenue.getValue(),fieldSet.readInt("Total_State_IG_Revenue"));}
		if ( fieldSet.readString("State_IGR_Education").trim().length() > 0 && fieldSet.readInt("State_IGR_Education") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Education.getValue(),fieldSet.readInt("State_IGR_Education"));}
		if ( fieldSet.readString("State_IGR_Tax_Relief").trim().length() > 0 && fieldSet.readInt("State_IGR_Tax_Relief") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Tax_Relief.getValue(),fieldSet.readInt("State_IGR_Tax_Relief"));}
		if ( fieldSet.readString("State_IGR_Oth_Gen_Sup").trim().length() > 0 && fieldSet.readInt("State_IGR_Oth_Gen_Sup") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Oth_Gen_Sup.getValue(),fieldSet.readInt("State_IGR_Oth_Gen_Sup"));}
		if ( fieldSet.readString("State_IGR_Gen_Sup").trim().length() > 0 && fieldSet.readInt("State_IGR_Gen_Sup") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Gen_Sup.getValue(),fieldSet.readInt("State_IGR_Gen_Sup"));}
		if ( fieldSet.readString("State_IGR_Health___Hos").trim().length() > 0 && fieldSet.readInt("State_IGR_Health___Hos") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Health___Hos.getValue(),fieldSet.readInt("State_IGR_Health___Hos"));}
		if ( fieldSet.readString("State_IGR_Highways").trim().length() > 0 && fieldSet.readInt("State_IGR_Highways") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Highways.getValue(),fieldSet.readInt("State_IGR_Highways"));}
		if ( fieldSet.readString("State_IGR_Transit_Sub").trim().length() > 0 && fieldSet.readInt("State_IGR_Transit_Sub") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Transit_Sub.getValue(),fieldSet.readInt("State_IGR_Transit_Sub"));}
		if ( fieldSet.readString("State_IGR_Hous_Com_Dev").trim().length() > 0 && fieldSet.readInt("State_IGR_Hous_Com_Dev") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Hous_Com_Dev.getValue(),fieldSet.readInt("State_IGR_Hous_Com_Dev"));}
		if ( fieldSet.readString("State_IGR_Public_Welf").trim().length() > 0 && fieldSet.readInt("State_IGR_Public_Welf") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Public_Welf.getValue(),fieldSet.readInt("State_IGR_Public_Welf"));}
		if ( fieldSet.readString("State_IGR_Sewerage").trim().length() > 0 && fieldSet.readInt("State_IGR_Sewerage") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Sewerage.getValue(),fieldSet.readInt("State_IGR_Sewerage"));}
		if ( fieldSet.readString("State_IGR_Other").trim().length() > 0 && fieldSet.readInt("State_IGR_Other") != 0) {
		rec.getData().put(AttributeEnum.State_IGR_Other.getValue(),fieldSet.readInt("State_IGR_Other"));}
		if ( fieldSet.readString("Tot_Local_IG_Rev").trim().length() > 0 && fieldSet.readInt("Tot_Local_IG_Rev") != 0) {
		rec.getData().put(AttributeEnum.Tot_Local_IG_Rev.getValue(),fieldSet.readInt("Tot_Local_IG_Rev"));}
		if ( fieldSet.readString("Local_IGR_InterSchool_Aid").trim().length() > 0 && fieldSet.readInt("Local_IGR_InterSchool_Aid") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_InterSchool_Aid.getValue(),fieldSet.readInt("Local_IGR_InterSchool_Aid"));}
		if ( fieldSet.readString("Local_IGR_Other_Education").trim().length() > 0 && fieldSet.readInt("Local_IGR_Other_Education") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_Other_Education.getValue(),fieldSet.readInt("Local_IGR_Other_Education"));}
		if ( fieldSet.readString("Local_IGR_Oth_Gen_Sup").trim().length() > 0 && fieldSet.readInt("Local_IGR_Oth_Gen_Sup") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_Oth_Gen_Sup.getValue(),fieldSet.readInt("Local_IGR_Oth_Gen_Sup"));}
		if ( fieldSet.readString("Local_IGR_Health___Hos").trim().length() > 0 && fieldSet.readInt("Local_IGR_Health___Hos") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_Health___Hos.getValue(),fieldSet.readInt("Local_IGR_Health___Hos"));}
		if ( fieldSet.readString("Local_IGR_Highways").trim().length() > 0 && fieldSet.readInt("Local_IGR_Highways") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_Highways.getValue(),fieldSet.readInt("Local_IGR_Highways"));}
		if ( fieldSet.readString("Local_IGR_Transit_Sub").trim().length() > 0 && fieldSet.readInt("Local_IGR_Transit_Sub") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_Transit_Sub.getValue(),fieldSet.readInt("Local_IGR_Transit_Sub"));}
		if ( fieldSet.readString("Local_IGR_Hous_Com_Dev").trim().length() > 0 && fieldSet.readInt("Local_IGR_Hous_Com_Dev") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_Hous_Com_Dev.getValue(),fieldSet.readInt("Local_IGR_Hous_Com_Dev"));}
		if ( fieldSet.readString("Local_IGR_Public_Welf").trim().length() > 0 && fieldSet.readInt("Local_IGR_Public_Welf") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_Public_Welf.getValue(),fieldSet.readInt("Local_IGR_Public_Welf"));}
		if ( fieldSet.readString("Local_IGR_Sewerage").trim().length() > 0 && fieldSet.readInt("Local_IGR_Sewerage") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_Sewerage.getValue(),fieldSet.readInt("Local_IGR_Sewerage"));}
		if ( fieldSet.readString("Local_IGR_Other").trim().length() > 0 && fieldSet.readInt("Local_IGR_Other") != 0) {
		rec.getData().put(AttributeEnum.Local_IGR_Other.getValue(),fieldSet.readInt("Local_IGR_Other"));}
		if ( fieldSet.readString("Tot_Chgs_and_Misc_Rev").trim().length() > 0 && fieldSet.readInt("Tot_Chgs_and_Misc_Rev") != 0) {
		rec.getData().put(AttributeEnum.Tot_Chgs_and_Misc_Rev.getValue(),fieldSet.readInt("Tot_Chgs_and_Misc_Rev"));}
		if ( fieldSet.readString("Total_General_Charges").trim().length() > 0 && fieldSet.readInt("Total_General_Charges") != 0) {
		rec.getData().put(AttributeEnum.Total_General_Charges.getValue(),fieldSet.readInt("Total_General_Charges"));}
		if ( fieldSet.readString("Chg_Air_Transportation").trim().length() > 0 && fieldSet.readInt("Chg_Air_Transportation") != 0) {
		rec.getData().put(AttributeEnum.Chg_Air_Transportation.getValue(),fieldSet.readInt("Chg_Air_Transportation"));}
		if ( fieldSet.readString("Chg_Misc_Com_Activ").trim().length() > 0 && fieldSet.readInt("Chg_Misc_Com_Activ") != 0) {
		rec.getData().put(AttributeEnum.Chg_Misc_Com_Activ.getValue(),fieldSet.readInt("Chg_Misc_Com_Activ"));}
		if ( fieldSet.readString("Chg_Total_Education").trim().length() > 0 && fieldSet.readInt("Chg_Total_Education") != 0) {
		rec.getData().put(AttributeEnum.Chg_Total_Education.getValue(),fieldSet.readInt("Chg_Total_Education"));}
		if ( fieldSet.readString("Chg_Total_Elem_Education").trim().length() > 0 && fieldSet.readInt("Chg_Total_Elem_Education") != 0) {
		rec.getData().put(AttributeEnum.Chg_Total_Elem_Education.getValue(),fieldSet.readInt("Chg_Total_Elem_Education"));}
		if ( fieldSet.readString("Chg_Elem_Ed_Sch_Lunch").trim().length() > 0 && fieldSet.readInt("Chg_Elem_Ed_Sch_Lunch") != 0) {
		rec.getData().put(AttributeEnum.Chg_Elem_Ed_Sch_Lunch.getValue(),fieldSet.readInt("Chg_Elem_Ed_Sch_Lunch"));}
		if ( fieldSet.readString("Chg_Elem_Ed_Tuition").trim().length() > 0 && fieldSet.readInt("Chg_Elem_Ed_Tuition") != 0) {
		rec.getData().put(AttributeEnum.Chg_Elem_Ed_Tuition.getValue(),fieldSet.readInt("Chg_Elem_Ed_Tuition"));}
		if ( fieldSet.readString("Chg_Elem_Ed_NEC").trim().length() > 0 && fieldSet.readInt("Chg_Elem_Ed_NEC") != 0) {
		rec.getData().put(AttributeEnum.Chg_Elem_Ed_NEC.getValue(),fieldSet.readInt("Chg_Elem_Ed_NEC"));}
		if ( fieldSet.readString("Chg_Total_High_Ed").trim().length() > 0 && fieldSet.readInt("Chg_Total_High_Ed") != 0) {
		rec.getData().put(AttributeEnum.Chg_Total_High_Ed.getValue(),fieldSet.readInt("Chg_Total_High_Ed"));}
		if ( fieldSet.readString("Chg_Hospitals").trim().length() > 0 && fieldSet.readInt("Chg_Hospitals") != 0) {
		rec.getData().put(AttributeEnum.Chg_Hospitals.getValue(),fieldSet.readInt("Chg_Hospitals"));}
		if ( fieldSet.readString("Chg_Highways").trim().length() > 0 && fieldSet.readInt("Chg_Highways") != 0) {
		rec.getData().put(AttributeEnum.Chg_Highways.getValue(),fieldSet.readInt("Chg_Highways"));}
		if ( fieldSet.readString("Chg_Regular_Highways").trim().length() > 0 && fieldSet.readInt("Chg_Regular_Highways") != 0) {
		rec.getData().put(AttributeEnum.Chg_Regular_Highways.getValue(),fieldSet.readInt("Chg_Regular_Highways"));}
		if ( fieldSet.readString("Chg_Toll_Highways").trim().length() > 0 && fieldSet.readInt("Chg_Toll_Highways") != 0) {
		rec.getData().put(AttributeEnum.Chg_Toll_Highways.getValue(),fieldSet.readInt("Chg_Toll_Highways"));}
		if ( fieldSet.readString("Chg_Housing___Comm_Dev").trim().length() > 0 && fieldSet.readInt("Chg_Housing___Comm_Dev") != 0) {
		rec.getData().put(AttributeEnum.Chg_Housing___Comm_Dev.getValue(),fieldSet.readInt("Chg_Housing___Comm_Dev"));}
		if ( fieldSet.readString("Chg_Total_Nat_Res").trim().length() > 0 && fieldSet.readInt("Chg_Total_Nat_Res") != 0) {
		rec.getData().put(AttributeEnum.Chg_Total_Nat_Res.getValue(),fieldSet.readInt("Chg_Total_Nat_Res"));}
		if ( fieldSet.readString("Chg_Parking").trim().length() > 0 && fieldSet.readInt("Chg_Parking") != 0) {
		rec.getData().put(AttributeEnum.Chg_Parking.getValue(),fieldSet.readInt("Chg_Parking"));}
		if ( fieldSet.readString("Chg_Parks___Recreation").trim().length() > 0 && fieldSet.readInt("Chg_Parks___Recreation") != 0) {
		rec.getData().put(AttributeEnum.Chg_Parks___Recreation.getValue(),fieldSet.readInt("Chg_Parks___Recreation"));}
		if ( fieldSet.readString("Chg_Sewerage").trim().length() > 0 && fieldSet.readInt("Chg_Sewerage") != 0) {
		rec.getData().put(AttributeEnum.Chg_Sewerage.getValue(),fieldSet.readInt("Chg_Sewerage"));}
		if ( fieldSet.readString("Chg_Solid_Waste_Mgmt").trim().length() > 0 && fieldSet.readInt("Chg_Solid_Waste_Mgmt") != 0) {
		rec.getData().put(AttributeEnum.Chg_Solid_Waste_Mgmt.getValue(),fieldSet.readInt("Chg_Solid_Waste_Mgmt"));}
		if ( fieldSet.readString("Chg_Water_Transport").trim().length() > 0 && fieldSet.readInt("Chg_Water_Transport") != 0) {
		rec.getData().put(AttributeEnum.Chg_Water_Transport.getValue(),fieldSet.readInt("Chg_Water_Transport"));}
		if ( fieldSet.readString("Chg_All_Other_NEC").trim().length() > 0 && fieldSet.readInt("Chg_All_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.Chg_All_Other_NEC.getValue(),fieldSet.readInt("Chg_All_Other_NEC"));}
		if ( fieldSet.readString("Misc_General_Revenue").trim().length() > 0 && fieldSet.readInt("Misc_General_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Misc_General_Revenue.getValue(),fieldSet.readInt("Misc_General_Revenue"));}
		if ( fieldSet.readString("Special_Assessments").trim().length() > 0 && fieldSet.readInt("Special_Assessments") != 0) {
		rec.getData().put(AttributeEnum.Special_Assessments.getValue(),fieldSet.readInt("Special_Assessments"));}
		if ( fieldSet.readString("Prop_Sale_Total").trim().length() > 0 && fieldSet.readInt("Prop_Sale_Total") != 0) {
		rec.getData().put(AttributeEnum.Prop_Sale_Total.getValue(),fieldSet.readInt("Prop_Sale_Total"));}
		if ( fieldSet.readString("Prop_Sale_Hous_Com_Dev").trim().length() > 0 && fieldSet.readInt("Prop_Sale_Hous_Com_Dev") != 0) {
		rec.getData().put(AttributeEnum.Prop_Sale_Hous_Com_Dev.getValue(),fieldSet.readInt("Prop_Sale_Hous_Com_Dev"));}
		if ( fieldSet.readString("Prop_Sale_Other").trim().length() > 0 && fieldSet.readInt("Prop_Sale_Other") != 0) {
		rec.getData().put(AttributeEnum.Prop_Sale_Other.getValue(),fieldSet.readInt("Prop_Sale_Other"));}
		if ( fieldSet.readString("Interest_Revenue").trim().length() > 0 && fieldSet.readInt("Interest_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Interest_Revenue.getValue(),fieldSet.readInt("Interest_Revenue"));}
		if ( fieldSet.readString("Fines_and_Forfeits").trim().length() > 0 && fieldSet.readInt("Fines_and_Forfeits") != 0) {
		rec.getData().put(AttributeEnum.Fines_and_Forfeits.getValue(),fieldSet.readInt("Fines_and_Forfeits"));}
		if ( fieldSet.readString("Rents_and_Royalties").trim().length() > 0 && fieldSet.readInt("Rents_and_Royalties") != 0) {
		rec.getData().put(AttributeEnum.Rents_and_Royalties.getValue(),fieldSet.readInt("Rents_and_Royalties"));}
		if ( fieldSet.readString("Net_Lottery_Revenue").trim().length() > 0 && fieldSet.readInt("Net_Lottery_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Net_Lottery_Revenue.getValue(),fieldSet.readInt("Net_Lottery_Revenue"));}
		if ( fieldSet.readString("Misc_General_Rev_NEC").trim().length() > 0 && fieldSet.readInt("Misc_General_Rev_NEC") != 0) {
		rec.getData().put(AttributeEnum.Misc_General_Rev_NEC.getValue(),fieldSet.readInt("Misc_General_Rev_NEC"));}
		if ( fieldSet.readString("Liquor_Stores_Revenue").trim().length() > 0 && fieldSet.readInt("Liquor_Stores_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Liquor_Stores_Revenue.getValue(),fieldSet.readInt("Liquor_Stores_Revenue"));}
		if ( fieldSet.readString("Total_Utility_Revenue").trim().length() > 0 && fieldSet.readInt("Total_Utility_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Total_Utility_Revenue.getValue(),fieldSet.readInt("Total_Utility_Revenue"));}
		if ( fieldSet.readString("Water_Utility_Revenue").trim().length() > 0 && fieldSet.readInt("Water_Utility_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Water_Utility_Revenue.getValue(),fieldSet.readInt("Water_Utility_Revenue"));}
		if ( fieldSet.readString("Electric_Utility_Rev").trim().length() > 0 && fieldSet.readInt("Electric_Utility_Rev") != 0) {
		rec.getData().put(AttributeEnum.Electric_Utility_Rev.getValue(),fieldSet.readInt("Electric_Utility_Rev"));}
		if ( fieldSet.readString("Gas_Utility_Rev").trim().length() > 0 && fieldSet.readInt("Gas_Utility_Rev") != 0) {
		rec.getData().put(AttributeEnum.Gas_Utility_Rev.getValue(),fieldSet.readInt("Gas_Utility_Rev"));}
		if ( fieldSet.readString("Transit_Utility_Rev").trim().length() > 0 && fieldSet.readInt("Transit_Utility_Rev") != 0) {
		rec.getData().put(AttributeEnum.Transit_Utility_Rev.getValue(),fieldSet.readInt("Transit_Utility_Rev"));}
		if ( fieldSet.readString("Total_Insur_Trust_Rev").trim().length() > 0 && fieldSet.readInt("Total_Insur_Trust_Rev") != 0) {
		rec.getData().put(AttributeEnum.Total_Insur_Trust_Rev.getValue(),fieldSet.readInt("Total_Insur_Trust_Rev"));}
		if ( fieldSet.readString("Total_Insur_Trust_Ctrb").trim().length() > 0 && fieldSet.readInt("Total_Insur_Trust_Ctrb") != 0) {
		rec.getData().put(AttributeEnum.Total_Insur_Trust_Ctrb.getValue(),fieldSet.readInt("Total_Insur_Trust_Ctrb"));}
		if ( fieldSet.readString("Tot_Ins_Trust_Inv_Rev").trim().length() > 0 && fieldSet.readInt("Tot_Ins_Trust_Inv_Rev") != 0) {
		rec.getData().put(AttributeEnum.Tot_Ins_Trust_Inv_Rev.getValue(),fieldSet.readInt("Tot_Ins_Trust_Inv_Rev"));}
		if ( fieldSet.readString("Total_Emp_Ret_Rev").trim().length() > 0 && fieldSet.readInt("Total_Emp_Ret_Rev") != 0) {
		rec.getData().put(AttributeEnum.Total_Emp_Ret_Rev.getValue(),fieldSet.readInt("Total_Emp_Ret_Rev"));}
		if ( fieldSet.readString("Emp_Ret_Total_Ctrib").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Total_Ctrib") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Total_Ctrib.getValue(),fieldSet.readInt("Emp_Ret_Total_Ctrib"));}
		if ( fieldSet.readString("Emp_Ret_Loc_Emp_Ctrib").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Loc_Emp_Ctrib") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Loc_Emp_Ctrib.getValue(),fieldSet.readInt("Emp_Ret_Loc_Emp_Ctrib"));}
		if ( fieldSet.readString("Emp_Ret_Loc_To_Loc_Sys").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Loc_To_Loc_Sys") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Loc_To_Loc_Sys.getValue(),fieldSet.readInt("Emp_Ret_Loc_To_Loc_Sys"));}
		if ( fieldSet.readString("Emp_Ret_From_Other_Gov").trim().length() > 0 && fieldSet.readInt("Emp_Ret_From_Other_Gov") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_From_Other_Gov.getValue(),fieldSet.readInt("Emp_Ret_From_Other_Gov"));}
		if ( fieldSet.readString("Emp_Ret_Sta_To_Sta_Ctr").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Sta_To_Sta_Ctr") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Sta_To_Sta_Ctr.getValue(),fieldSet.readInt("Emp_Ret_Sta_To_Sta_Ctr"));}
		if ( fieldSet.readString("Emp_Ret_Int_Rev").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Int_Rev") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Int_Rev.getValue(),fieldSet.readInt("Emp_Ret_Int_Rev"));}
		if ( fieldSet.readString("Emp_Ret_Other_Earnings").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Other_Earnings") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Other_Earnings.getValue(),fieldSet.readInt("Emp_Ret_Other_Earnings"));}
		if ( fieldSet.readString("Total_Unemp_Rev").trim().length() > 0 && fieldSet.readInt("Total_Unemp_Rev") != 0) {
		rec.getData().put(AttributeEnum.Total_Unemp_Rev.getValue(),fieldSet.readInt("Total_Unemp_Rev"));}
		if ( fieldSet.readString("Unemp_Payroll_Tax").trim().length() > 0 && fieldSet.readInt("Unemp_Payroll_Tax") != 0) {
		rec.getData().put(AttributeEnum.Unemp_Payroll_Tax.getValue(),fieldSet.readInt("Unemp_Payroll_Tax"));}
		if ( fieldSet.readString("Unemp_Int_Revenue").trim().length() > 0 && fieldSet.readInt("Unemp_Int_Revenue") != 0) {
		rec.getData().put(AttributeEnum.Unemp_Int_Revenue.getValue(),fieldSet.readInt("Unemp_Int_Revenue"));}
		if ( fieldSet.readString("Unemp_Federal_Advances").trim().length() > 0 && fieldSet.readInt("Unemp_Federal_Advances") != 0) {
		rec.getData().put(AttributeEnum.Unemp_Federal_Advances.getValue(),fieldSet.readInt("Unemp_Federal_Advances"));}
		if ( fieldSet.readString("Total_Expenditure").trim().length() > 0 && fieldSet.readInt("Total_Expenditure") != 0) {
		rec.getData().put(AttributeEnum.Total_Expenditure.getValue(),fieldSet.readInt("Total_Expenditure"));}
		if ( fieldSet.readString("Total_IG_Expenditure").trim().length() > 0 && fieldSet.readInt("Total_IG_Expenditure") != 0) {
		rec.getData().put(AttributeEnum.Total_IG_Expenditure.getValue(),fieldSet.readInt("Total_IG_Expenditure"));}
		if ( fieldSet.readString("Direct_Expenditure").trim().length() > 0 && fieldSet.readInt("Direct_Expenditure") != 0) {
		rec.getData().put(AttributeEnum.Direct_Expenditure.getValue(),fieldSet.readInt("Direct_Expenditure"));}
		if ( fieldSet.readString("Total_Current_Expend").trim().length() > 0 && fieldSet.readInt("Total_Current_Expend") != 0) {
		rec.getData().put(AttributeEnum.Total_Current_Expend.getValue(),fieldSet.readInt("Total_Current_Expend"));}
		if ( fieldSet.readString("Total_Current_Oper").trim().length() > 0 && fieldSet.readInt("Total_Current_Oper") != 0) {
		rec.getData().put(AttributeEnum.Total_Current_Oper.getValue(),fieldSet.readInt("Total_Current_Oper"));}
		if ( fieldSet.readString("Total_Capital_Outlays").trim().length() > 0 && fieldSet.readInt("Total_Capital_Outlays") != 0) {
		rec.getData().put(AttributeEnum.Total_Capital_Outlays.getValue(),fieldSet.readInt("Total_Capital_Outlays"));}
		if ( fieldSet.readString("Total_Construction").trim().length() > 0 && fieldSet.readInt("Total_Construction") != 0) {
		rec.getData().put(AttributeEnum.Total_Construction.getValue(),fieldSet.readInt("Total_Construction"));}
		if ( fieldSet.readString("Total_Other_Capital_Outlays").trim().length() > 0 && fieldSet.readInt("Total_Other_Capital_Outlays") != 0) {
		rec.getData().put(AttributeEnum.Total_Other_Capital_Outlays.getValue(),fieldSet.readInt("Total_Other_Capital_Outlays"));}
		if ( fieldSet.readString("Tot_Assist___Subsidies").trim().length() > 0 && fieldSet.readInt("Tot_Assist___Subsidies") != 0) {
		rec.getData().put(AttributeEnum.Tot_Assist___Subsidies.getValue(),fieldSet.readInt("Tot_Assist___Subsidies"));}
		if ( fieldSet.readString("Total_Interest_on_Debt").trim().length() > 0 && fieldSet.readInt("Total_Interest_on_Debt") != 0) {
		rec.getData().put(AttributeEnum.Total_Interest_on_Debt.getValue(),fieldSet.readInt("Total_Interest_on_Debt"));}
		if ( fieldSet.readString("Total_Insur_Trust_Ben").trim().length() > 0 && fieldSet.readInt("Total_Insur_Trust_Ben") != 0) {
		rec.getData().put(AttributeEnum.Total_Insur_Trust_Ben.getValue(),fieldSet.readInt("Total_Insur_Trust_Ben"));}
		if ( fieldSet.readString("Total_Salaries___Wages").trim().length() > 0 && fieldSet.readInt("Total_Salaries___Wages") != 0) {
		rec.getData().put(AttributeEnum.Total_Salaries___Wages.getValue(),fieldSet.readInt("Total_Salaries___Wages"));}
		if ( fieldSet.readString("General_Expenditure").trim().length() > 0 && fieldSet.readInt("General_Expenditure") != 0) {
		rec.getData().put(AttributeEnum.General_Expenditure.getValue(),fieldSet.readInt("General_Expenditure"));}
		if ( fieldSet.readString("IG_Exp_To_State_Govt").trim().length() > 0 && fieldSet.readInt("IG_Exp_To_State_Govt") != 0) {
		rec.getData().put(AttributeEnum.IG_Exp_To_State_Govt.getValue(),fieldSet.readInt("IG_Exp_To_State_Govt"));}
		if ( fieldSet.readString("IG_Exp_To_Local_Govts").trim().length() > 0 && fieldSet.readInt("IG_Exp_To_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.IG_Exp_To_Local_Govts.getValue(),fieldSet.readInt("IG_Exp_To_Local_Govts"));}
		if ( fieldSet.readString("IG_Exp_To_Federal_Govt").trim().length() > 0 && fieldSet.readInt("IG_Exp_To_Federal_Govt") != 0) {
		rec.getData().put(AttributeEnum.IG_Exp_To_Federal_Govt.getValue(),fieldSet.readInt("IG_Exp_To_Federal_Govt"));}
		if ( fieldSet.readString("Direct_General_Expend").trim().length() > 0 && fieldSet.readInt("Direct_General_Expend") != 0) {
		rec.getData().put(AttributeEnum.Direct_General_Expend.getValue(),fieldSet.readInt("Direct_General_Expend"));}
		if ( fieldSet.readString("General_Current_Expend").trim().length() > 0 && fieldSet.readInt("General_Current_Expend") != 0) {
		rec.getData().put(AttributeEnum.General_Current_Expend.getValue(),fieldSet.readInt("General_Current_Expend"));}
		if ( fieldSet.readString("General_Current_Oper").trim().length() > 0 && fieldSet.readInt("General_Current_Oper") != 0) {
		rec.getData().put(AttributeEnum.General_Current_Oper.getValue(),fieldSet.readInt("General_Current_Oper"));}
		if ( fieldSet.readString("General_Capital_Outlay").trim().length() > 0 && fieldSet.readInt("General_Capital_Outlay") != 0) {
		rec.getData().put(AttributeEnum.General_Capital_Outlay.getValue(),fieldSet.readInt("General_Capital_Outlay"));}
		if ( fieldSet.readString("General_Construction").trim().length() > 0 && fieldSet.readInt("General_Construction") != 0) {
		rec.getData().put(AttributeEnum.General_Construction.getValue(),fieldSet.readInt("General_Construction"));}
		if ( fieldSet.readString("General_Capital_Outlay_Other").trim().length() > 0 && fieldSet.readInt("General_Capital_Outlay_Other") != 0) {
		rec.getData().put(AttributeEnum.General_Capital_Outlay_Other.getValue(),fieldSet.readInt("General_Capital_Outlay_Other"));}
		if ( fieldSet.readString("General_Assist___Sub").trim().length() > 0 && fieldSet.readInt("General_Assist___Sub") != 0) {
		rec.getData().put(AttributeEnum.General_Assist___Sub.getValue(),fieldSet.readInt("General_Assist___Sub"));}
		if ( fieldSet.readString("General_Debt_Interest").trim().length() > 0 && fieldSet.readInt("General_Debt_Interest") != 0) {
		rec.getData().put(AttributeEnum.General_Debt_Interest.getValue(),fieldSet.readInt("General_Debt_Interest"));}
		if ( fieldSet.readString("Air_Trans_Total_Expend").trim().length() > 0 && fieldSet.readInt("Air_Trans_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Air_Trans_Total_Expend.getValue(),fieldSet.readInt("Air_Trans_Total_Expend"));}
		if ( fieldSet.readString("Air_Trans_Direct_Expend").trim().length() > 0 && fieldSet.readInt("Air_Trans_Direct_Expend") != 0) {
		rec.getData().put(AttributeEnum.Air_Trans_Direct_Expend.getValue(),fieldSet.readInt("Air_Trans_Direct_Expend"));}
		if ( fieldSet.readString("Air_Trans_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Air_Trans_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Air_Trans_Cap_Outlay.getValue(),fieldSet.readInt("Air_Trans_Cap_Outlay"));}
		if ( fieldSet.readString("Air_Trans_Current_Exp").trim().length() > 0 && fieldSet.readInt("Air_Trans_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Air_Trans_Current_Exp.getValue(),fieldSet.readInt("Air_Trans_Current_Exp"));}
		if ( fieldSet.readString("Air_Trans_Construction").trim().length() > 0 && fieldSet.readInt("Air_Trans_Construction") != 0) {
		rec.getData().put(AttributeEnum.Air_Trans_Construction.getValue(),fieldSet.readInt("Air_Trans_Construction"));}
		if ( fieldSet.readString("Air_Trans_IG_To_State").trim().length() > 0 && fieldSet.readInt("Air_Trans_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Air_Trans_IG_To_State.getValue(),fieldSet.readInt("Air_Trans_IG_To_State"));}
		if ( fieldSet.readString("Air_Trans_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Air_Trans_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Air_Trans_IG_Local_Govts.getValue(),fieldSet.readInt("Air_Trans_IG_Local_Govts"));}
		if ( fieldSet.readString("Misc_Com_Activ_Tot_Exp").trim().length() > 0 && fieldSet.readInt("Misc_Com_Activ_Tot_Exp") != 0) {
		rec.getData().put(AttributeEnum.Misc_Com_Activ_Tot_Exp.getValue(),fieldSet.readInt("Misc_Com_Activ_Tot_Exp"));}
		if ( fieldSet.readString("Misc_Com_Activ_Cap_Out").trim().length() > 0 && fieldSet.readInt("Misc_Com_Activ_Cap_Out") != 0) {
		rec.getData().put(AttributeEnum.Misc_Com_Activ_Cap_Out.getValue(),fieldSet.readInt("Misc_Com_Activ_Cap_Out"));}
		if ( fieldSet.readString("Misc_Com_Activ_Current_Exp").trim().length() > 0 && fieldSet.readInt("Misc_Com_Activ_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Misc_Com_Activ_Current_Exp.getValue(),fieldSet.readInt("Misc_Com_Activ_Current_Exp"));}
		if ( fieldSet.readString("Misc_Com_Activ_Constr").trim().length() > 0 && fieldSet.readInt("Misc_Com_Activ_Constr") != 0) {
		rec.getData().put(AttributeEnum.Misc_Com_Activ_Constr.getValue(),fieldSet.readInt("Misc_Com_Activ_Constr"));}
		if ( fieldSet.readString("Correct_Total_Exp").trim().length() > 0 && fieldSet.readInt("Correct_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Correct_Total_Exp.getValue(),fieldSet.readInt("Correct_Total_Exp"));}
		if ( fieldSet.readString("Correct_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Correct_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Correct_Direct_Exp.getValue(),fieldSet.readInt("Correct_Direct_Exp"));}
		if ( fieldSet.readString("Correct_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Correct_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Correct_Cap_Outlay.getValue(),fieldSet.readInt("Correct_Cap_Outlay"));}
		if ( fieldSet.readString("Correct_Current_Exp").trim().length() > 0 && fieldSet.readInt("Correct_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Correct_Current_Exp.getValue(),fieldSet.readInt("Correct_Current_Exp"));}
		if ( fieldSet.readString("Correct_Construct").trim().length() > 0 && fieldSet.readInt("Correct_Construct") != 0) {
		rec.getData().put(AttributeEnum.Correct_Construct.getValue(),fieldSet.readInt("Correct_Construct"));}
		if ( fieldSet.readString("Correct_IG_To_St").trim().length() > 0 && fieldSet.readInt("Correct_IG_To_St") != 0) {
		rec.getData().put(AttributeEnum.Correct_IG_To_St.getValue(),fieldSet.readInt("Correct_IG_To_St"));}
		if ( fieldSet.readString("Correct_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Correct_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Correct_IG_Loc_Govts.getValue(),fieldSet.readInt("Correct_IG_Loc_Govts"));}
		if ( fieldSet.readString("Total_Educ_Total_Exp").trim().length() > 0 && fieldSet.readInt("Total_Educ_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Educ_Total_Exp.getValue(),fieldSet.readInt("Total_Educ_Total_Exp"));}
		if ( fieldSet.readString("Total_Educ_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Total_Educ_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Educ_Direct_Exp.getValue(),fieldSet.readInt("Total_Educ_Direct_Exp"));}
		if ( fieldSet.readString("Total_Educ_Assist___Sub").trim().length() > 0 && fieldSet.readInt("Total_Educ_Assist___Sub") != 0) {
		rec.getData().put(AttributeEnum.Total_Educ_Assist___Sub.getValue(),fieldSet.readInt("Total_Educ_Assist___Sub"));}
		if ( fieldSet.readString("Total_Educ_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Total_Educ_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Total_Educ_Cap_Outlay.getValue(),fieldSet.readInt("Total_Educ_Cap_Outlay"));}
		if ( fieldSet.readString("Total_Educ_Current_Exp").trim().length() > 0 && fieldSet.readInt("Total_Educ_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Educ_Current_Exp.getValue(),fieldSet.readInt("Total_Educ_Current_Exp"));}
		if ( fieldSet.readString("Total_Educ_Construct").trim().length() > 0 && fieldSet.readInt("Total_Educ_Construct") != 0) {
		rec.getData().put(AttributeEnum.Total_Educ_Construct.getValue(),fieldSet.readInt("Total_Educ_Construct"));}
		if ( fieldSet.readString("Elem_Educ_Total_Exp").trim().length() > 0 && fieldSet.readInt("Elem_Educ_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Elem_Educ_Total_Exp.getValue(),fieldSet.readInt("Elem_Educ_Total_Exp"));}
		if ( fieldSet.readString("Elem_Educ_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Elem_Educ_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Elem_Educ_Direct_Exp.getValue(),fieldSet.readInt("Elem_Educ_Direct_Exp"));}
		if ( fieldSet.readString("Elem_Educ_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Elem_Educ_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Elem_Educ_Cap_Outlay.getValue(),fieldSet.readInt("Elem_Educ_Cap_Outlay"));}
		if ( fieldSet.readString("Elem_Educ_Current_Exp").trim().length() > 0 && fieldSet.readInt("Elem_Educ_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Elem_Educ_Current_Exp.getValue(),fieldSet.readInt("Elem_Educ_Current_Exp"));}
		if ( fieldSet.readString("Elem_Educ_Construction").trim().length() > 0 && fieldSet.readInt("Elem_Educ_Construction") != 0) {
		rec.getData().put(AttributeEnum.Elem_Educ_Construction.getValue(),fieldSet.readInt("Elem_Educ_Construction"));}
		if ( fieldSet.readString("Elem_Educ_IG_To_State").trim().length() > 0 && fieldSet.readInt("Elem_Educ_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Elem_Educ_IG_To_State.getValue(),fieldSet.readInt("Elem_Educ_IG_To_State"));}
		if ( fieldSet.readString("Elem_Educ_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Elem_Educ_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Elem_Educ_IG_Local_Govts.getValue(),fieldSet.readInt("Elem_Educ_IG_Local_Govts"));}
		if ( fieldSet.readString("Elem_Educ_IG_Sch_to_Sch").trim().length() > 0 && fieldSet.readInt("Elem_Educ_IG_Sch_to_Sch") != 0) {
		rec.getData().put(AttributeEnum.Elem_Educ_IG_Sch_to_Sch.getValue(),fieldSet.readInt("Elem_Educ_IG_Sch_to_Sch"));}
		if ( fieldSet.readString("Higher_Ed_Total_Exp").trim().length() > 0 && fieldSet.readInt("Higher_Ed_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Higher_Ed_Total_Exp.getValue(),fieldSet.readInt("Higher_Ed_Total_Exp"));}
		if ( fieldSet.readString("Higher_Ed_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Higher_Ed_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Higher_Ed_Direct_Exp.getValue(),fieldSet.readInt("Higher_Ed_Direct_Exp"));}
		if ( fieldSet.readString("Higher_Ed_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Higher_Ed_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Higher_Ed_Cap_Outlay.getValue(),fieldSet.readInt("Higher_Ed_Cap_Outlay"));}
		if ( fieldSet.readString("Higher_Ed_Current_Exp").trim().length() > 0 && fieldSet.readInt("Higher_Ed_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Higher_Ed_Current_Exp.getValue(),fieldSet.readInt("Higher_Ed_Current_Exp"));}
		if ( fieldSet.readString("Higher_Ed_Construct").trim().length() > 0 && fieldSet.readInt("Higher_Ed_Construct") != 0) {
		rec.getData().put(AttributeEnum.Higher_Ed_Construct.getValue(),fieldSet.readInt("Higher_Ed_Construct"));}
		if ( fieldSet.readString("Higher_Ed_IG_To_St").trim().length() > 0 && fieldSet.readInt("Higher_Ed_IG_To_St") != 0) {
		rec.getData().put(AttributeEnum.Higher_Ed_IG_To_St.getValue(),fieldSet.readInt("Higher_Ed_IG_To_St"));}
		if ( fieldSet.readString("Higher_Ed_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Higher_Ed_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Higher_Ed_IG_Loc_Govts.getValue(),fieldSet.readInt("Higher_Ed_IG_Loc_Govts"));}
		if ( fieldSet.readString("Educ_NEC_Total_Expend").trim().length() > 0 && fieldSet.readInt("Educ_NEC_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Educ_NEC_Total_Expend.getValue(),fieldSet.readInt("Educ_NEC_Total_Expend"));}
		if ( fieldSet.readString("Educ_NEC_Direct_Expend").trim().length() > 0 && fieldSet.readInt("Educ_NEC_Direct_Expend") != 0) {
		rec.getData().put(AttributeEnum.Educ_NEC_Direct_Expend.getValue(),fieldSet.readInt("Educ_NEC_Direct_Expend"));}
		if ( fieldSet.readString("Educ_NEC_Assistance").trim().length() > 0 && fieldSet.readInt("Educ_NEC_Assistance") != 0) {
		rec.getData().put(AttributeEnum.Educ_NEC_Assistance.getValue(),fieldSet.readInt("Educ_NEC_Assistance"));}
		if ( fieldSet.readString("Educ_NEC_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Educ_NEC_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Educ_NEC_Cap_Outlay.getValue(),fieldSet.readInt("Educ_NEC_Cap_Outlay"));}
		if ( fieldSet.readString("Educ_NEC_Current_Exp").trim().length() > 0 && fieldSet.readInt("Educ_NEC_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Educ_NEC_Current_Exp.getValue(),fieldSet.readInt("Educ_NEC_Current_Exp"));}
		if ( fieldSet.readString("Educ_NEC_Construction").trim().length() > 0 && fieldSet.readInt("Educ_NEC_Construction") != 0) {
		rec.getData().put(AttributeEnum.Educ_NEC_Construction.getValue(),fieldSet.readInt("Educ_NEC_Construction"));}
		if ( fieldSet.readString("Educ_NEC_IG_To_State").trim().length() > 0 && fieldSet.readInt("Educ_NEC_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Educ_NEC_IG_To_State.getValue(),fieldSet.readInt("Educ_NEC_IG_To_State"));}
		if ( fieldSet.readString("Educ_NEC_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Educ_NEC_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Educ_NEC_IG_Local_Govts.getValue(),fieldSet.readInt("Educ_NEC_IG_Local_Govts"));}
		if ( fieldSet.readString("Emp_Sec_Adm_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Emp_Sec_Adm_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Emp_Sec_Adm_Direct_Exp.getValue(),fieldSet.readInt("Emp_Sec_Adm_Direct_Exp"));}
		if ( fieldSet.readString("Emp_Sec_Adm_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Emp_Sec_Adm_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Emp_Sec_Adm_Cap_Outlay.getValue(),fieldSet.readInt("Emp_Sec_Adm_Cap_Outlay"));}
		if ( fieldSet.readString("Emp_Sec_Adm_Current_Exp").trim().length() > 0 && fieldSet.readInt("Emp_Sec_Adm_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Emp_Sec_Adm_Current_Exp.getValue(),fieldSet.readInt("Emp_Sec_Adm_Current_Exp"));}
		if ( fieldSet.readString("Emp_Sec_Adm_Construct").trim().length() > 0 && fieldSet.readInt("Emp_Sec_Adm_Construct") != 0) {
		rec.getData().put(AttributeEnum.Emp_Sec_Adm_Construct.getValue(),fieldSet.readInt("Emp_Sec_Adm_Construct"));}
		if ( fieldSet.readString("Fin_Admin_Total_Exp").trim().length() > 0 && fieldSet.readInt("Fin_Admin_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Fin_Admin_Total_Exp.getValue(),fieldSet.readInt("Fin_Admin_Total_Exp"));}
		if ( fieldSet.readString("Fin_Admin_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Fin_Admin_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Fin_Admin_Direct_Exp.getValue(),fieldSet.readInt("Fin_Admin_Direct_Exp"));}
		if ( fieldSet.readString("Fin_Admin_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Fin_Admin_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Fin_Admin_Cap_Outlay.getValue(),fieldSet.readInt("Fin_Admin_Cap_Outlay"));}
		if ( fieldSet.readString("Fin_Admin_Current_Exp").trim().length() > 0 && fieldSet.readInt("Fin_Admin_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Fin_Admin_Current_Exp.getValue(),fieldSet.readInt("Fin_Admin_Current_Exp"));}
		if ( fieldSet.readString("Fin_Admin_Construction").trim().length() > 0 && fieldSet.readInt("Fin_Admin_Construction") != 0) {
		rec.getData().put(AttributeEnum.Fin_Admin_Construction.getValue(),fieldSet.readInt("Fin_Admin_Construction"));}
		if ( fieldSet.readString("Fin_Admin_IG_To_State").trim().length() > 0 && fieldSet.readInt("Fin_Admin_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Fin_Admin_IG_To_State.getValue(),fieldSet.readInt("Fin_Admin_IG_To_State"));}
		if ( fieldSet.readString("Fin_Admin_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Fin_Admin_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Fin_Admin_IG_Local_Govts.getValue(),fieldSet.readInt("Fin_Admin_IG_Local_Govts"));}
		if ( fieldSet.readString("Fire_Prot_Total_Expend").trim().length() > 0 && fieldSet.readInt("Fire_Prot_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Fire_Prot_Total_Expend.getValue(),fieldSet.readInt("Fire_Prot_Total_Expend"));}
		if ( fieldSet.readString("Fire_Prot_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Fire_Prot_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Fire_Prot_Direct_Exp.getValue(),fieldSet.readInt("Fire_Prot_Direct_Exp"));}
		if ( fieldSet.readString("Fire_Prot_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Fire_Prot_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Fire_Prot_Cap_Outlay.getValue(),fieldSet.readInt("Fire_Prot_Cap_Outlay"));}
		if ( fieldSet.readString("Fire_Prot_Current_Exp").trim().length() > 0 && fieldSet.readInt("Fire_Prot_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Fire_Prot_Current_Exp.getValue(),fieldSet.readInt("Fire_Prot_Current_Exp"));}
		if ( fieldSet.readString("Fire_Prot_Construction").trim().length() > 0 && fieldSet.readInt("Fire_Prot_Construction") != 0) {
		rec.getData().put(AttributeEnum.Fire_Prot_Construction.getValue(),fieldSet.readInt("Fire_Prot_Construction"));}
		if ( fieldSet.readString("Fire_Prot_IG_To_State").trim().length() > 0 && fieldSet.readInt("Fire_Prot_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Fire_Prot_IG_To_State.getValue(),fieldSet.readInt("Fire_Prot_IG_To_State"));}
		if ( fieldSet.readString("Fire_Prot_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Fire_Prot_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Fire_Prot_IG_Local_Govts.getValue(),fieldSet.readInt("Fire_Prot_IG_Local_Govts"));}
		if ( fieldSet.readString("Judicial_Total_Expend").trim().length() > 0 && fieldSet.readInt("Judicial_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Judicial_Total_Expend.getValue(),fieldSet.readInt("Judicial_Total_Expend"));}
		if ( fieldSet.readString("Judicial_Direct_Expend").trim().length() > 0 && fieldSet.readInt("Judicial_Direct_Expend") != 0) {
		rec.getData().put(AttributeEnum.Judicial_Direct_Expend.getValue(),fieldSet.readInt("Judicial_Direct_Expend"));}
		if ( fieldSet.readString("Judicial_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Judicial_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Judicial_Cap_Outlay.getValue(),fieldSet.readInt("Judicial_Cap_Outlay"));}
		if ( fieldSet.readString("Judicial_Current_Exp").trim().length() > 0 && fieldSet.readInt("Judicial_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Judicial_Current_Exp.getValue(),fieldSet.readInt("Judicial_Current_Exp"));}
		if ( fieldSet.readString("Judicial_Construction").trim().length() > 0 && fieldSet.readInt("Judicial_Construction") != 0) {
		rec.getData().put(AttributeEnum.Judicial_Construction.getValue(),fieldSet.readInt("Judicial_Construction"));}
		if ( fieldSet.readString("Judicial_IG_To_State").trim().length() > 0 && fieldSet.readInt("Judicial_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Judicial_IG_To_State.getValue(),fieldSet.readInt("Judicial_IG_To_State"));}
		if ( fieldSet.readString("Judicial_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Judicial_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Judicial_IG_Local_Govts.getValue(),fieldSet.readInt("Judicial_IG_Local_Govts"));}
		if ( fieldSet.readString("Cen_Staff_Total_Expend").trim().length() > 0 && fieldSet.readInt("Cen_Staff_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Cen_Staff_Total_Expend.getValue(),fieldSet.readInt("Cen_Staff_Total_Expend"));}
		if ( fieldSet.readString("Cen_Staff_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Cen_Staff_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Cen_Staff_Direct_Exp.getValue(),fieldSet.readInt("Cen_Staff_Direct_Exp"));}
		if ( fieldSet.readString("Cen_Staff_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Cen_Staff_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Cen_Staff_Cap_Outlay.getValue(),fieldSet.readInt("Cen_Staff_Cap_Outlay"));}
		if ( fieldSet.readString("Cen_Staff_Current_Exp").trim().length() > 0 && fieldSet.readInt("Cen_Staff_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Cen_Staff_Current_Exp.getValue(),fieldSet.readInt("Cen_Staff_Current_Exp"));}
		if ( fieldSet.readString("Cen_Staff_Construction").trim().length() > 0 && fieldSet.readInt("Cen_Staff_Construction") != 0) {
		rec.getData().put(AttributeEnum.Cen_Staff_Construction.getValue(),fieldSet.readInt("Cen_Staff_Construction"));}
		if ( fieldSet.readString("Cen_Staff_IG_To_State").trim().length() > 0 && fieldSet.readInt("Cen_Staff_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Cen_Staff_IG_To_State.getValue(),fieldSet.readInt("Cen_Staff_IG_To_State"));}
		if ( fieldSet.readString("Cen_Staff_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Cen_Staff_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Cen_Staff_IG_Local_Govts.getValue(),fieldSet.readInt("Cen_Staff_IG_Local_Govts"));}
		if ( fieldSet.readString("Gen_Pub_Bldg_Total_Exp").trim().length() > 0 && fieldSet.readInt("Gen_Pub_Bldg_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Gen_Pub_Bldg_Total_Exp.getValue(),fieldSet.readInt("Gen_Pub_Bldg_Total_Exp"));}
		if ( fieldSet.readString("Gen_Pub_Bldg_Cap_Out").trim().length() > 0 && fieldSet.readInt("Gen_Pub_Bldg_Cap_Out") != 0) {
		rec.getData().put(AttributeEnum.Gen_Pub_Bldg_Cap_Out.getValue(),fieldSet.readInt("Gen_Pub_Bldg_Cap_Out"));}
		if ( fieldSet.readString("Gen_Pub_Bldg_Current_Exp").trim().length() > 0 && fieldSet.readInt("Gen_Pub_Bldg_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Gen_Pub_Bldg_Current_Exp.getValue(),fieldSet.readInt("Gen_Pub_Bldg_Current_Exp"));}
		if ( fieldSet.readString("Gen_Pub_Bldg_Construct").trim().length() > 0 && fieldSet.readInt("Gen_Pub_Bldg_Construct") != 0) {
		rec.getData().put(AttributeEnum.Gen_Pub_Bldg_Construct.getValue(),fieldSet.readInt("Gen_Pub_Bldg_Construct"));}
		if ( fieldSet.readString("Health_Total_Expend").trim().length() > 0 && fieldSet.readInt("Health_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Health_Total_Expend.getValue(),fieldSet.readInt("Health_Total_Expend"));}
		if ( fieldSet.readString("Health_Direct_Expend").trim().length() > 0 && fieldSet.readInt("Health_Direct_Expend") != 0) {
		rec.getData().put(AttributeEnum.Health_Direct_Expend.getValue(),fieldSet.readInt("Health_Direct_Expend"));}
		if ( fieldSet.readString("Health_Capital_Outlay").trim().length() > 0 && fieldSet.readInt("Health_Capital_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Health_Capital_Outlay.getValue(),fieldSet.readInt("Health_Capital_Outlay"));}
		if ( fieldSet.readString("Health_Current_Exp").trim().length() > 0 && fieldSet.readInt("Health_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Health_Current_Exp.getValue(),fieldSet.readInt("Health_Current_Exp"));}
		if ( fieldSet.readString("Health_Construction").trim().length() > 0 && fieldSet.readInt("Health_Construction") != 0) {
		rec.getData().put(AttributeEnum.Health_Construction.getValue(),fieldSet.readInt("Health_Construction"));}
		if ( fieldSet.readString("Health_IG_To_State").trim().length() > 0 && fieldSet.readInt("Health_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Health_IG_To_State.getValue(),fieldSet.readInt("Health_IG_To_State"));}
		if ( fieldSet.readString("Health_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Health_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Health_IG_Local_Govts.getValue(),fieldSet.readInt("Health_IG_Local_Govts"));}
		if ( fieldSet.readString("Total_Hospital_Total_Exp").trim().length() > 0 && fieldSet.readInt("Total_Hospital_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Hospital_Total_Exp.getValue(),fieldSet.readInt("Total_Hospital_Total_Exp"));}
		if ( fieldSet.readString("Total_Hospital_Dir_Exp").trim().length() > 0 && fieldSet.readInt("Total_Hospital_Dir_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Hospital_Dir_Exp.getValue(),fieldSet.readInt("Total_Hospital_Dir_Exp"));}
		if ( fieldSet.readString("Total_Hospital_Cap_Out").trim().length() > 0 && fieldSet.readInt("Total_Hospital_Cap_Out") != 0) {
		rec.getData().put(AttributeEnum.Total_Hospital_Cap_Out.getValue(),fieldSet.readInt("Total_Hospital_Cap_Out"));}
		if ( fieldSet.readString("Total_Hospital_Current_Exp").trim().length() > 0 && fieldSet.readInt("Total_Hospital_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Hospital_Current_Exp.getValue(),fieldSet.readInt("Total_Hospital_Current_Exp"));}
		if ( fieldSet.readString("Total_Hospital_Construct").trim().length() > 0 && fieldSet.readInt("Total_Hospital_Construct") != 0) {
		rec.getData().put(AttributeEnum.Total_Hospital_Construct.getValue(),fieldSet.readInt("Total_Hospital_Construct"));}
		if ( fieldSet.readString("Total_Hospital_IG_To_State").trim().length() > 0 && fieldSet.readInt("Total_Hospital_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Total_Hospital_IG_To_State.getValue(),fieldSet.readInt("Total_Hospital_IG_To_State"));}
		if ( fieldSet.readString("Total_Hospital_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Total_Hospital_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Total_Hospital_IG_Loc_Govts.getValue(),fieldSet.readInt("Total_Hospital_IG_Loc_Govts"));}
		if ( fieldSet.readString("Own_Hospital_Total_Exp").trim().length() > 0 && fieldSet.readInt("Own_Hospital_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Own_Hospital_Total_Exp.getValue(),fieldSet.readInt("Own_Hospital_Total_Exp"));}
		if ( fieldSet.readString("Own_Hospital_Cap_Out").trim().length() > 0 && fieldSet.readInt("Own_Hospital_Cap_Out") != 0) {
		rec.getData().put(AttributeEnum.Own_Hospital_Cap_Out.getValue(),fieldSet.readInt("Own_Hospital_Cap_Out"));}
		if ( fieldSet.readString("Own_Hospital_Current_Exp").trim().length() > 0 && fieldSet.readInt("Own_Hospital_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Own_Hospital_Current_Exp.getValue(),fieldSet.readInt("Own_Hospital_Current_Exp"));}
		if ( fieldSet.readString("Own_Hospital_Construct").trim().length() > 0 && fieldSet.readInt("Own_Hospital_Construct") != 0) {
		rec.getData().put(AttributeEnum.Own_Hospital_Construct.getValue(),fieldSet.readInt("Own_Hospital_Construct"));}
		if ( fieldSet.readString("Hosp_Other_Total_Exp").trim().length() > 0 && fieldSet.readInt("Hosp_Other_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Hosp_Other_Total_Exp.getValue(),fieldSet.readInt("Hosp_Other_Total_Exp"));}
		if ( fieldSet.readString("Hosp_Other_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Hosp_Other_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Hosp_Other_Direct_Exp.getValue(),fieldSet.readInt("Hosp_Other_Direct_Exp"));}
		if ( fieldSet.readString("Hosp_Other_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Hosp_Other_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Hosp_Other_Cap_Outlay.getValue(),fieldSet.readInt("Hosp_Other_Cap_Outlay"));}
		if ( fieldSet.readString("Hosp_Other_Current_Exp").trim().length() > 0 && fieldSet.readInt("Hosp_Other_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Hosp_Other_Current_Exp.getValue(),fieldSet.readInt("Hosp_Other_Current_Exp"));}
		if ( fieldSet.readString("Hosp_Other_Construct").trim().length() > 0 && fieldSet.readInt("Hosp_Other_Construct") != 0) {
		rec.getData().put(AttributeEnum.Hosp_Other_Construct.getValue(),fieldSet.readInt("Hosp_Other_Construct"));}
		if ( fieldSet.readString("Hosp_Other_IG_To_State").trim().length() > 0 && fieldSet.readInt("Hosp_Other_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Hosp_Other_IG_To_State.getValue(),fieldSet.readInt("Hosp_Other_IG_To_State"));}
		if ( fieldSet.readString("Hosp_Other_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Hosp_Other_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Hosp_Other_IG_Loc_Govts.getValue(),fieldSet.readInt("Hosp_Other_IG_Loc_Govts"));}
		if ( fieldSet.readString("Total_Highways_Tot_Exp").trim().length() > 0 && fieldSet.readInt("Total_Highways_Tot_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Highways_Tot_Exp.getValue(),fieldSet.readInt("Total_Highways_Tot_Exp"));}
		if ( fieldSet.readString("Total_Highways_Dir_Exp").trim().length() > 0 && fieldSet.readInt("Total_Highways_Dir_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Highways_Dir_Exp.getValue(),fieldSet.readInt("Total_Highways_Dir_Exp"));}
		if ( fieldSet.readString("Total_Highways_Cap_Out").trim().length() > 0 && fieldSet.readInt("Total_Highways_Cap_Out") != 0) {
		rec.getData().put(AttributeEnum.Total_Highways_Cap_Out.getValue(),fieldSet.readInt("Total_Highways_Cap_Out"));}
		if ( fieldSet.readString("Total_Highways_Current_Exp").trim().length() > 0 && fieldSet.readInt("Total_Highways_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Highways_Current_Exp.getValue(),fieldSet.readInt("Total_Highways_Current_Exp"));}
		if ( fieldSet.readString("Total_Highways_Construct").trim().length() > 0 && fieldSet.readInt("Total_Highways_Construct") != 0) {
		rec.getData().put(AttributeEnum.Total_Highways_Construct.getValue(),fieldSet.readInt("Total_Highways_Construct"));}
		if ( fieldSet.readString("Regular_Hwy_Total_Exp").trim().length() > 0 && fieldSet.readInt("Regular_Hwy_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Regular_Hwy_Total_Exp.getValue(),fieldSet.readInt("Regular_Hwy_Total_Exp"));}
		if ( fieldSet.readString("Regular_Hwy_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Regular_Hwy_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Regular_Hwy_Direct_Exp.getValue(),fieldSet.readInt("Regular_Hwy_Direct_Exp"));}
		if ( fieldSet.readString("Regular_Hwy_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Regular_Hwy_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Regular_Hwy_Cap_Outlay.getValue(),fieldSet.readInt("Regular_Hwy_Cap_Outlay"));}
		if ( fieldSet.readString("Regular_Hwy_Current_Exp").trim().length() > 0 && fieldSet.readInt("Regular_Hwy_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Regular_Hwy_Current_Exp.getValue(),fieldSet.readInt("Regular_Hwy_Current_Exp"));}
		if ( fieldSet.readString("Regular_Hwy_Construct").trim().length() > 0 && fieldSet.readInt("Regular_Hwy_Construct") != 0) {
		rec.getData().put(AttributeEnum.Regular_Hwy_Construct.getValue(),fieldSet.readInt("Regular_Hwy_Construct"));}
		if ( fieldSet.readString("Regular_Hwy_IG_To_Sta").trim().length() > 0 && fieldSet.readInt("Regular_Hwy_IG_To_Sta") != 0) {
		rec.getData().put(AttributeEnum.Regular_Hwy_IG_To_Sta.getValue(),fieldSet.readInt("Regular_Hwy_IG_To_Sta"));}
		if ( fieldSet.readString("Regular_Hwy_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Regular_Hwy_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Regular_Hwy_IG_Loc_Govts.getValue(),fieldSet.readInt("Regular_Hwy_IG_Loc_Govts"));}
		if ( fieldSet.readString("Toll_Hwy_Total_Expend").trim().length() > 0 && fieldSet.readInt("Toll_Hwy_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Toll_Hwy_Total_Expend.getValue(),fieldSet.readInt("Toll_Hwy_Total_Expend"));}
		if ( fieldSet.readString("Toll_Hwy_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Toll_Hwy_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Toll_Hwy_Cap_Outlay.getValue(),fieldSet.readInt("Toll_Hwy_Cap_Outlay"));}
		if ( fieldSet.readString("Toll_Hwy_Current_Exp").trim().length() > 0 && fieldSet.readInt("Toll_Hwy_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Toll_Hwy_Current_Exp.getValue(),fieldSet.readInt("Toll_Hwy_Current_Exp"));}
		if ( fieldSet.readString("Toll_Hwy_Construction").trim().length() > 0 && fieldSet.readInt("Toll_Hwy_Construction") != 0) {
		rec.getData().put(AttributeEnum.Toll_Hwy_Construction.getValue(),fieldSet.readInt("Toll_Hwy_Construction"));}
		if ( fieldSet.readString("Transit_Sub_Total_Exp").trim().length() > 0 && fieldSet.readInt("Transit_Sub_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Transit_Sub_Total_Exp.getValue(),fieldSet.readInt("Transit_Sub_Total_Exp"));}
		if ( fieldSet.readString("Transit_Sub_Direct_Sub").trim().length() > 0 && fieldSet.readInt("Transit_Sub_Direct_Sub") != 0) {
		rec.getData().put(AttributeEnum.Transit_Sub_Direct_Sub.getValue(),fieldSet.readInt("Transit_Sub_Direct_Sub"));}
		if ( fieldSet.readString("Transit_Sub_IG_To_Sta").trim().length() > 0 && fieldSet.readInt("Transit_Sub_IG_To_Sta") != 0) {
		rec.getData().put(AttributeEnum.Transit_Sub_IG_To_Sta.getValue(),fieldSet.readInt("Transit_Sub_IG_To_Sta"));}
		if ( fieldSet.readString("Transit_Sub_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Transit_Sub_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Transit_Sub_IG_Loc_Govts.getValue(),fieldSet.readInt("Transit_Sub_IG_Loc_Govts"));}
		if ( fieldSet.readString("Transit_Sub_To_Own_Sys").trim().length() > 0 && fieldSet.readInt("Transit_Sub_To_Own_Sys") != 0) {
		rec.getData().put(AttributeEnum.Transit_Sub_To_Own_Sys.getValue(),fieldSet.readInt("Transit_Sub_To_Own_Sys"));}
		if ( fieldSet.readString("Hous___Com_Total_Exp").trim().length() > 0 && fieldSet.readInt("Hous___Com_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Hous___Com_Total_Exp.getValue(),fieldSet.readInt("Hous___Com_Total_Exp"));}
		if ( fieldSet.readString("Hous___Com_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Hous___Com_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Hous___Com_Direct_Exp.getValue(),fieldSet.readInt("Hous___Com_Direct_Exp"));}
		if ( fieldSet.readString("Hous___Com_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Hous___Com_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Hous___Com_Cap_Outlay.getValue(),fieldSet.readInt("Hous___Com_Cap_Outlay"));}
		if ( fieldSet.readString("Hous___Com_Current_Exp").trim().length() > 0 && fieldSet.readInt("Hous___Com_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Hous___Com_Current_Exp.getValue(),fieldSet.readInt("Hous___Com_Current_Exp"));}
		if ( fieldSet.readString("Hous___Com_Construct").trim().length() > 0 && fieldSet.readInt("Hous___Com_Construct") != 0) {
		rec.getData().put(AttributeEnum.Hous___Com_Construct.getValue(),fieldSet.readInt("Hous___Com_Construct"));}
		if ( fieldSet.readString("Hous___Com_IG_To_State").trim().length() > 0 && fieldSet.readInt("Hous___Com_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Hous___Com_IG_To_State.getValue(),fieldSet.readInt("Hous___Com_IG_To_State"));}
		if ( fieldSet.readString("Hous___Com_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Hous___Com_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Hous___Com_IG_Loc_Govts.getValue(),fieldSet.readInt("Hous___Com_IG_Loc_Govts"));}
		if ( fieldSet.readString("Libraries_Total_Expend").trim().length() > 0 && fieldSet.readInt("Libraries_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Libraries_Total_Expend.getValue(),fieldSet.readInt("Libraries_Total_Expend"));}
		if ( fieldSet.readString("Libraries_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Libraries_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Libraries_Direct_Exp.getValue(),fieldSet.readInt("Libraries_Direct_Exp"));}
		if ( fieldSet.readString("Libraries_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Libraries_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Libraries_Cap_Outlay.getValue(),fieldSet.readInt("Libraries_Cap_Outlay"));}
		if ( fieldSet.readString("Libraries_Current_Exp").trim().length() > 0 && fieldSet.readInt("Libraries_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Libraries_Current_Exp.getValue(),fieldSet.readInt("Libraries_Current_Exp"));}
		if ( fieldSet.readString("Libraries_Construction").trim().length() > 0 && fieldSet.readInt("Libraries_Construction") != 0) {
		rec.getData().put(AttributeEnum.Libraries_Construction.getValue(),fieldSet.readInt("Libraries_Construction"));}
		if ( fieldSet.readString("Libraries_IG_To_State").trim().length() > 0 && fieldSet.readInt("Libraries_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Libraries_IG_To_State.getValue(),fieldSet.readInt("Libraries_IG_To_State"));}
		if ( fieldSet.readString("Libraries_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Libraries_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Libraries_IG_Local_Govts.getValue(),fieldSet.readInt("Libraries_IG_Local_Govts"));}
		if ( fieldSet.readString("Natural_Res_Total_Exp").trim().length() > 0 && fieldSet.readInt("Natural_Res_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Natural_Res_Total_Exp.getValue(),fieldSet.readInt("Natural_Res_Total_Exp"));}
		if ( fieldSet.readString("Natural_Res_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Natural_Res_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Natural_Res_Direct_Exp.getValue(),fieldSet.readInt("Natural_Res_Direct_Exp"));}
		if ( fieldSet.readString("Natural_Res_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Natural_Res_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Natural_Res_Cap_Outlay.getValue(),fieldSet.readInt("Natural_Res_Cap_Outlay"));}
		if ( fieldSet.readString("Natural_Res_Current_Exp").trim().length() > 0 && fieldSet.readInt("Natural_Res_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Natural_Res_Current_Exp.getValue(),fieldSet.readInt("Natural_Res_Current_Exp"));}
		if ( fieldSet.readString("Natural_Res_Construct").trim().length() > 0 && fieldSet.readInt("Natural_Res_Construct") != 0) {
		rec.getData().put(AttributeEnum.Natural_Res_Construct.getValue(),fieldSet.readInt("Natural_Res_Construct"));}
		if ( fieldSet.readString("Natural_Res_IG_To_Sta").trim().length() > 0 && fieldSet.readInt("Natural_Res_IG_To_Sta") != 0) {
		rec.getData().put(AttributeEnum.Natural_Res_IG_To_Sta.getValue(),fieldSet.readInt("Natural_Res_IG_To_Sta"));}
		if ( fieldSet.readString("Natural_Res_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Natural_Res_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Natural_Res_IG_Loc_Govts.getValue(),fieldSet.readInt("Natural_Res_IG_Loc_Govts"));}
		if ( fieldSet.readString("Parking_Total_Expend").trim().length() > 0 && fieldSet.readInt("Parking_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Parking_Total_Expend.getValue(),fieldSet.readInt("Parking_Total_Expend"));}
		if ( fieldSet.readString("Parking_Direct_Expend").trim().length() > 0 && fieldSet.readInt("Parking_Direct_Expend") != 0) {
		rec.getData().put(AttributeEnum.Parking_Direct_Expend.getValue(),fieldSet.readInt("Parking_Direct_Expend"));}
		if ( fieldSet.readString("Parking_Capital_Outlay").trim().length() > 0 && fieldSet.readInt("Parking_Capital_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Parking_Capital_Outlay.getValue(),fieldSet.readInt("Parking_Capital_Outlay"));}
		if ( fieldSet.readString("Parking_Current_Exp").trim().length() > 0 && fieldSet.readInt("Parking_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Parking_Current_Exp.getValue(),fieldSet.readInt("Parking_Current_Exp"));}
		if ( fieldSet.readString("Parking_Construction").trim().length() > 0 && fieldSet.readInt("Parking_Construction") != 0) {
		rec.getData().put(AttributeEnum.Parking_Construction.getValue(),fieldSet.readInt("Parking_Construction"));}
		if ( fieldSet.readString("Parking_IG_To_State").trim().length() > 0 && fieldSet.readInt("Parking_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Parking_IG_To_State.getValue(),fieldSet.readInt("Parking_IG_To_State"));}
		if ( fieldSet.readString("Parking_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Parking_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Parking_IG_Local_Govts.getValue(),fieldSet.readInt("Parking_IG_Local_Govts"));}
		if ( fieldSet.readString("Parks___Rec_Total_Exp").trim().length() > 0 && fieldSet.readInt("Parks___Rec_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Parks___Rec_Total_Exp.getValue(),fieldSet.readInt("Parks___Rec_Total_Exp"));}
		if ( fieldSet.readString("Parks___Rec_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Parks___Rec_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Parks___Rec_Direct_Exp.getValue(),fieldSet.readInt("Parks___Rec_Direct_Exp"));}
		if ( fieldSet.readString("Parks___Rec_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Parks___Rec_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Parks___Rec_Cap_Outlay.getValue(),fieldSet.readInt("Parks___Rec_Cap_Outlay"));}
		if ( fieldSet.readString("Parks___Rec_Current_Exp").trim().length() > 0 && fieldSet.readInt("Parks___Rec_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Parks___Rec_Current_Exp.getValue(),fieldSet.readInt("Parks___Rec_Current_Exp"));}
		if ( fieldSet.readString("Parks___Rec_Construct").trim().length() > 0 && fieldSet.readInt("Parks___Rec_Construct") != 0) {
		rec.getData().put(AttributeEnum.Parks___Rec_Construct.getValue(),fieldSet.readInt("Parks___Rec_Construct"));}
		if ( fieldSet.readString("Parks___Rec_IG_To_Sta").trim().length() > 0 && fieldSet.readInt("Parks___Rec_IG_To_Sta") != 0) {
		rec.getData().put(AttributeEnum.Parks___Rec_IG_To_Sta.getValue(),fieldSet.readInt("Parks___Rec_IG_To_Sta"));}
		if ( fieldSet.readString("Parks___Rec_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Parks___Rec_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Parks___Rec_IG_Loc_Govts.getValue(),fieldSet.readInt("Parks___Rec_IG_Loc_Govts"));}
		if ( fieldSet.readString("Police_Prot_Total_Exp").trim().length() > 0 && fieldSet.readInt("Police_Prot_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Police_Prot_Total_Exp.getValue(),fieldSet.readInt("Police_Prot_Total_Exp"));}
		if ( fieldSet.readString("Police_Prot_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Police_Prot_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Police_Prot_Direct_Exp.getValue(),fieldSet.readInt("Police_Prot_Direct_Exp"));}
		if ( fieldSet.readString("Police_Prot_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Police_Prot_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Police_Prot_Cap_Outlay.getValue(),fieldSet.readInt("Police_Prot_Cap_Outlay"));}
		if ( fieldSet.readString("Police_Prot_Current_Exp").trim().length() > 0 && fieldSet.readInt("Police_Prot_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Police_Prot_Current_Exp.getValue(),fieldSet.readInt("Police_Prot_Current_Exp"));}
		if ( fieldSet.readString("Police_Prot_Construct").trim().length() > 0 && fieldSet.readInt("Police_Prot_Construct") != 0) {
		rec.getData().put(AttributeEnum.Police_Prot_Construct.getValue(),fieldSet.readInt("Police_Prot_Construct"));}
		if ( fieldSet.readString("Police_Prot_IG_To_Sta").trim().length() > 0 && fieldSet.readInt("Police_Prot_IG_To_Sta") != 0) {
		rec.getData().put(AttributeEnum.Police_Prot_IG_To_Sta.getValue(),fieldSet.readInt("Police_Prot_IG_To_Sta"));}
		if ( fieldSet.readString("Police_Prot_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Police_Prot_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Police_Prot_IG_Loc_Govts.getValue(),fieldSet.readInt("Police_Prot_IG_Loc_Govts"));}
		if ( fieldSet.readString("Prot_Insp_Total_Exp").trim().length() > 0 && fieldSet.readInt("Prot_Insp_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Prot_Insp_Total_Exp.getValue(),fieldSet.readInt("Prot_Insp_Total_Exp"));}
		if ( fieldSet.readString("Prot_Insp_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Prot_Insp_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Prot_Insp_Direct_Exp.getValue(),fieldSet.readInt("Prot_Insp_Direct_Exp"));}
		if ( fieldSet.readString("Prot_Insp_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Prot_Insp_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Prot_Insp_Cap_Outlay.getValue(),fieldSet.readInt("Prot_Insp_Cap_Outlay"));}
		if ( fieldSet.readString("Prot_Insp_Current_Exp").trim().length() > 0 && fieldSet.readInt("Prot_Insp_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Prot_Insp_Current_Exp.getValue(),fieldSet.readInt("Prot_Insp_Current_Exp"));}
		if ( fieldSet.readString("Prot_Insp_Construction").trim().length() > 0 && fieldSet.readInt("Prot_Insp_Construction") != 0) {
		rec.getData().put(AttributeEnum.Prot_Insp_Construction.getValue(),fieldSet.readInt("Prot_Insp_Construction"));}
		if ( fieldSet.readString("Prot_Insp_IG_To_State").trim().length() > 0 && fieldSet.readInt("Prot_Insp_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Prot_Insp_IG_To_State.getValue(),fieldSet.readInt("Prot_Insp_IG_To_State"));}
		if ( fieldSet.readString("Prot_Insp_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Prot_Insp_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Prot_Insp_IG_Local_Govts.getValue(),fieldSet.readInt("Prot_Insp_IG_Local_Govts"));}
		if ( fieldSet.readString("Public_Welf_Total_Exp").trim().length() > 0 && fieldSet.readInt("Public_Welf_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Public_Welf_Total_Exp.getValue(),fieldSet.readInt("Public_Welf_Total_Exp"));}
		if ( fieldSet.readString("Public_Welf_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Public_Welf_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Public_Welf_Direct_Exp.getValue(),fieldSet.readInt("Public_Welf_Direct_Exp"));}
		if ( fieldSet.readString("Public_Welf_Cash_Asst").trim().length() > 0 && fieldSet.readInt("Public_Welf_Cash_Asst") != 0) {
		rec.getData().put(AttributeEnum.Public_Welf_Cash_Asst.getValue(),fieldSet.readInt("Public_Welf_Cash_Asst"));}
		if ( fieldSet.readString("Public_Welf_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Public_Welf_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Public_Welf_Cap_Outlay.getValue(),fieldSet.readInt("Public_Welf_Cap_Outlay"));}
		if ( fieldSet.readString("Public_Welf_Current_Exp").trim().length() > 0 && fieldSet.readInt("Public_Welf_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Public_Welf_Current_Exp.getValue(),fieldSet.readInt("Public_Welf_Current_Exp"));}
		if ( fieldSet.readString("Public_Welf_Construct").trim().length() > 0 && fieldSet.readInt("Public_Welf_Construct") != 0) {
		rec.getData().put(AttributeEnum.Public_Welf_Construct.getValue(),fieldSet.readInt("Public_Welf_Construct"));}
		if ( fieldSet.readString("Welf_Categ_Total_Exp").trim().length() > 0 && fieldSet.readInt("Welf_Categ_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Welf_Categ_Total_Exp.getValue(),fieldSet.readInt("Welf_Categ_Total_Exp"));}
		if ( fieldSet.readString("Welf_Categ_Cash_Assist").trim().length() > 0 && fieldSet.readInt("Welf_Categ_Cash_Assist") != 0) {
		rec.getData().put(AttributeEnum.Welf_Categ_Cash_Assist.getValue(),fieldSet.readInt("Welf_Categ_Cash_Assist"));}
		if ( fieldSet.readString("Welf_Categ_IG_To_State").trim().length() > 0 && fieldSet.readInt("Welf_Categ_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Welf_Categ_IG_To_State.getValue(),fieldSet.readInt("Welf_Categ_IG_To_State"));}
		if ( fieldSet.readString("Welf_Categ_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Welf_Categ_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Welf_Categ_IG_Loc_Govts.getValue(),fieldSet.readInt("Welf_Categ_IG_Loc_Govts"));}
		if ( fieldSet.readString("Welf_Cash_Total_Exp").trim().length() > 0 && fieldSet.readInt("Welf_Cash_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Welf_Cash_Total_Exp.getValue(),fieldSet.readInt("Welf_Cash_Total_Exp"));}
		if ( fieldSet.readString("Welf_Cash_Cash_Assist").trim().length() > 0 && fieldSet.readInt("Welf_Cash_Cash_Assist") != 0) {
		rec.getData().put(AttributeEnum.Welf_Cash_Cash_Assist.getValue(),fieldSet.readInt("Welf_Cash_Cash_Assist"));}
		if ( fieldSet.readString("Welf_Cash_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Welf_Cash_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Welf_Cash_IG_Local_Govts.getValue(),fieldSet.readInt("Welf_Cash_IG_Local_Govts"));}
		if ( fieldSet.readString("Welf_Vend_Pmts_Medical").trim().length() > 0 && fieldSet.readInt("Welf_Vend_Pmts_Medical") != 0) {
		rec.getData().put(AttributeEnum.Welf_Vend_Pmts_Medical.getValue(),fieldSet.readInt("Welf_Vend_Pmts_Medical"));}
		if ( fieldSet.readString("Welf_Vend_Pmts_NEC").trim().length() > 0 && fieldSet.readInt("Welf_Vend_Pmts_NEC") != 0) {
		rec.getData().put(AttributeEnum.Welf_Vend_Pmts_NEC.getValue(),fieldSet.readInt("Welf_Vend_Pmts_NEC"));}
		if ( fieldSet.readString("Welf_State_Share_Part_D").trim().length() > 0 && fieldSet.readInt("Welf_State_Share_Part_D") != 0) {
		rec.getData().put(AttributeEnum.Welf_State_Share_Part_D.getValue(),fieldSet.readInt("Welf_State_Share_Part_D"));}
		if ( fieldSet.readString("Welf_Ins_Total_Exp").trim().length() > 0 && fieldSet.readInt("Welf_Ins_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Welf_Ins_Total_Exp.getValue(),fieldSet.readInt("Welf_Ins_Total_Exp"));}
		if ( fieldSet.readString("Welf_Ins_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Welf_Ins_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Welf_Ins_Cap_Outlay.getValue(),fieldSet.readInt("Welf_Ins_Cap_Outlay"));}
		if ( fieldSet.readString("Welf_Ins_Current_Exp").trim().length() > 0 && fieldSet.readInt("Welf_Ins_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Welf_Ins_Current_Exp.getValue(),fieldSet.readInt("Welf_Ins_Current_Exp"));}
		if ( fieldSet.readString("Welf_Ins_Construction").trim().length() > 0 && fieldSet.readInt("Welf_Ins_Construction") != 0) {
		rec.getData().put(AttributeEnum.Welf_Ins_Construction.getValue(),fieldSet.readInt("Welf_Ins_Construction"));}
		if ( fieldSet.readString("Welf_NEC_Total_Expend").trim().length() > 0 && fieldSet.readInt("Welf_NEC_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Welf_NEC_Total_Expend.getValue(),fieldSet.readInt("Welf_NEC_Total_Expend"));}
		if ( fieldSet.readString("Welf_NEC_Direct_Expend").trim().length() > 0 && fieldSet.readInt("Welf_NEC_Direct_Expend") != 0) {
		rec.getData().put(AttributeEnum.Welf_NEC_Direct_Expend.getValue(),fieldSet.readInt("Welf_NEC_Direct_Expend"));}
		if ( fieldSet.readString("Welf_NEC_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Welf_NEC_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Welf_NEC_Cap_Outlay.getValue(),fieldSet.readInt("Welf_NEC_Cap_Outlay"));}
		if ( fieldSet.readString("Welf_NEC_Current_Exp").trim().length() > 0 && fieldSet.readInt("Welf_NEC_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Welf_NEC_Current_Exp.getValue(),fieldSet.readInt("Welf_NEC_Current_Exp"));}
		if ( fieldSet.readString("Welf_NEC_Construction").trim().length() > 0 && fieldSet.readInt("Welf_NEC_Construction") != 0) {
		rec.getData().put(AttributeEnum.Welf_NEC_Construction.getValue(),fieldSet.readInt("Welf_NEC_Construction"));}
		if ( fieldSet.readString("Welf_NEC_IG_To_State").trim().length() > 0 && fieldSet.readInt("Welf_NEC_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Welf_NEC_IG_To_State.getValue(),fieldSet.readInt("Welf_NEC_IG_To_State"));}
		if ( fieldSet.readString("Welf_NEC_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Welf_NEC_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Welf_NEC_IG_Local_Govts.getValue(),fieldSet.readInt("Welf_NEC_IG_Local_Govts"));}
		if ( fieldSet.readString("Sewerage_Total_Expend").trim().length() > 0 && fieldSet.readInt("Sewerage_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Sewerage_Total_Expend.getValue(),fieldSet.readInt("Sewerage_Total_Expend"));}
		if ( fieldSet.readString("Sewerage_Direct_Expend").trim().length() > 0 && fieldSet.readInt("Sewerage_Direct_Expend") != 0) {
		rec.getData().put(AttributeEnum.Sewerage_Direct_Expend.getValue(),fieldSet.readInt("Sewerage_Direct_Expend"));}
		if ( fieldSet.readString("Sewerage_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Sewerage_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Sewerage_Cap_Outlay.getValue(),fieldSet.readInt("Sewerage_Cap_Outlay"));}
		if ( fieldSet.readString("Sewerage_Current_Exp").trim().length() > 0 && fieldSet.readInt("Sewerage_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Sewerage_Current_Exp.getValue(),fieldSet.readInt("Sewerage_Current_Exp"));}
		if ( fieldSet.readString("Sewerage_Construction").trim().length() > 0 && fieldSet.readInt("Sewerage_Construction") != 0) {
		rec.getData().put(AttributeEnum.Sewerage_Construction.getValue(),fieldSet.readInt("Sewerage_Construction"));}
		if ( fieldSet.readString("Sewerage_IG_To_State").trim().length() > 0 && fieldSet.readInt("Sewerage_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.Sewerage_IG_To_State.getValue(),fieldSet.readInt("Sewerage_IG_To_State"));}
		if ( fieldSet.readString("Sewerage_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("Sewerage_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.Sewerage_IG_Local_Govts.getValue(),fieldSet.readInt("Sewerage_IG_Local_Govts"));}
		if ( fieldSet.readString("SW_Mgmt_Total_Expend").trim().length() > 0 && fieldSet.readInt("SW_Mgmt_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.SW_Mgmt_Total_Expend.getValue(),fieldSet.readInt("SW_Mgmt_Total_Expend"));}
		if ( fieldSet.readString("SW_Mgmt_Direct_Expend").trim().length() > 0 && fieldSet.readInt("SW_Mgmt_Direct_Expend") != 0) {
		rec.getData().put(AttributeEnum.SW_Mgmt_Direct_Expend.getValue(),fieldSet.readInt("SW_Mgmt_Direct_Expend"));}
		if ( fieldSet.readString("SW_Mgmt_Capital_Outlay").trim().length() > 0 && fieldSet.readInt("SW_Mgmt_Capital_Outlay") != 0) {
		rec.getData().put(AttributeEnum.SW_Mgmt_Capital_Outlay.getValue(),fieldSet.readInt("SW_Mgmt_Capital_Outlay"));}
		if ( fieldSet.readString("SW_Mgmt_Current_Exp").trim().length() > 0 && fieldSet.readInt("SW_Mgmt_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.SW_Mgmt_Current_Exp.getValue(),fieldSet.readInt("SW_Mgmt_Current_Exp"));}
		if ( fieldSet.readString("SW_Mgmt_Construction").trim().length() > 0 && fieldSet.readInt("SW_Mgmt_Construction") != 0) {
		rec.getData().put(AttributeEnum.SW_Mgmt_Construction.getValue(),fieldSet.readInt("SW_Mgmt_Construction"));}
		if ( fieldSet.readString("SW_Mgmt_IG_To_State").trim().length() > 0 && fieldSet.readInt("SW_Mgmt_IG_To_State") != 0) {
		rec.getData().put(AttributeEnum.SW_Mgmt_IG_To_State.getValue(),fieldSet.readInt("SW_Mgmt_IG_To_State"));}
		if ( fieldSet.readString("SW_Mgmt_IG_Local_Govts").trim().length() > 0 && fieldSet.readInt("SW_Mgmt_IG_Local_Govts") != 0) {
		rec.getData().put(AttributeEnum.SW_Mgmt_IG_Local_Govts.getValue(),fieldSet.readInt("SW_Mgmt_IG_Local_Govts"));}
		if ( fieldSet.readString("Water_Trans_Total_Exp").trim().length() > 0 && fieldSet.readInt("Water_Trans_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Water_Trans_Total_Exp.getValue(),fieldSet.readInt("Water_Trans_Total_Exp"));}
		if ( fieldSet.readString("Water_Trans_Direct_Exp").trim().length() > 0 && fieldSet.readInt("Water_Trans_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.Water_Trans_Direct_Exp.getValue(),fieldSet.readInt("Water_Trans_Direct_Exp"));}
		if ( fieldSet.readString("Water_Trans_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Water_Trans_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Water_Trans_Cap_Outlay.getValue(),fieldSet.readInt("Water_Trans_Cap_Outlay"));}
		if ( fieldSet.readString("Water_Trans_Current_Exp").trim().length() > 0 && fieldSet.readInt("Water_Trans_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Water_Trans_Current_Exp.getValue(),fieldSet.readInt("Water_Trans_Current_Exp"));}
		if ( fieldSet.readString("Water_Trans_Construct").trim().length() > 0 && fieldSet.readInt("Water_Trans_Construct") != 0) {
		rec.getData().put(AttributeEnum.Water_Trans_Construct.getValue(),fieldSet.readInt("Water_Trans_Construct"));}
		if ( fieldSet.readString("Water_Trans_IG_To_Sta").trim().length() > 0 && fieldSet.readInt("Water_Trans_IG_To_Sta") != 0) {
		rec.getData().put(AttributeEnum.Water_Trans_IG_To_Sta.getValue(),fieldSet.readInt("Water_Trans_IG_To_Sta"));}
		if ( fieldSet.readString("Water_Trans_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("Water_Trans_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.Water_Trans_IG_Loc_Govts.getValue(),fieldSet.readInt("Water_Trans_IG_Loc_Govts"));}
		if ( fieldSet.readString("Interest_on_Gen_Debt").trim().length() > 0 && fieldSet.readInt("Interest_on_Gen_Debt") != 0) {
		rec.getData().put(AttributeEnum.Interest_on_Gen_Debt.getValue(),fieldSet.readInt("Interest_on_Gen_Debt"));}
		if ( fieldSet.readString("General_NEC_Total_Exp").trim().length() > 0 && fieldSet.readInt("General_NEC_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.General_NEC_Total_Exp.getValue(),fieldSet.readInt("General_NEC_Total_Exp"));}
		if ( fieldSet.readString("General_NEC_Direct_Exp").trim().length() > 0 && fieldSet.readInt("General_NEC_Direct_Exp") != 0) {
		rec.getData().put(AttributeEnum.General_NEC_Direct_Exp.getValue(),fieldSet.readInt("General_NEC_Direct_Exp"));}
		if ( fieldSet.readString("VetBonus").trim().length() > 0 && fieldSet.readInt("VetBonus") != 0) {
		rec.getData().put(AttributeEnum.VetBonus.getValue(),fieldSet.readInt("VetBonus"));}
		if ( fieldSet.readString("General_NEC_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("General_NEC_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.General_NEC_Cap_Outlay.getValue(),fieldSet.readInt("General_NEC_Cap_Outlay"));}
		if ( fieldSet.readString("General_NEC_Current_Exp").trim().length() > 0 && fieldSet.readInt("General_NEC_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.General_NEC_Current_Exp.getValue(),fieldSet.readInt("General_NEC_Current_Exp"));}
		if ( fieldSet.readString("General_NEC_Construct").trim().length() > 0 && fieldSet.readInt("General_NEC_Construct") != 0) {
		rec.getData().put(AttributeEnum.General_NEC_Construct.getValue(),fieldSet.readInt("General_NEC_Construct"));}
		if ( fieldSet.readString("General_NEC_IG_To_St").trim().length() > 0 && fieldSet.readInt("General_NEC_IG_To_St") != 0) {
		rec.getData().put(AttributeEnum.General_NEC_IG_To_St.getValue(),fieldSet.readInt("General_NEC_IG_To_St"));}
		if ( fieldSet.readString("General_NEC_IG_Loc_Govts").trim().length() > 0 && fieldSet.readInt("General_NEC_IG_Loc_Govts") != 0) {
		rec.getData().put(AttributeEnum.General_NEC_IG_Loc_Govts.getValue(),fieldSet.readInt("General_NEC_IG_Loc_Govts"));}
		if ( fieldSet.readString("General_NEC_IG_To_Fed").trim().length() > 0 && fieldSet.readInt("General_NEC_IG_To_Fed") != 0) {
		rec.getData().put(AttributeEnum.General_NEC_IG_To_Fed.getValue(),fieldSet.readInt("General_NEC_IG_To_Fed"));}
		if ( fieldSet.readString("Liquor_Stores_Tot_Exp").trim().length() > 0 && fieldSet.readInt("Liquor_Stores_Tot_Exp") != 0) {
		rec.getData().put(AttributeEnum.Liquor_Stores_Tot_Exp.getValue(),fieldSet.readInt("Liquor_Stores_Tot_Exp"));}
		if ( fieldSet.readString("Liquor_Stores_Cap_Out").trim().length() > 0 && fieldSet.readInt("Liquor_Stores_Cap_Out") != 0) {
		rec.getData().put(AttributeEnum.Liquor_Stores_Cap_Out.getValue(),fieldSet.readInt("Liquor_Stores_Cap_Out"));}
		if ( fieldSet.readString("Liquor_Stores_Current_Exp").trim().length() > 0 && fieldSet.readInt("Liquor_Stores_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Liquor_Stores_Current_Exp.getValue(),fieldSet.readInt("Liquor_Stores_Current_Exp"));}
		if ( fieldSet.readString("Liquor_Stores_Constr").trim().length() > 0 && fieldSet.readInt("Liquor_Stores_Constr") != 0) {
		rec.getData().put(AttributeEnum.Liquor_Stores_Constr.getValue(),fieldSet.readInt("Liquor_Stores_Constr"));}
		if ( fieldSet.readString("Total_Util_Total_Exp").trim().length() > 0 && fieldSet.readInt("Total_Util_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Util_Total_Exp.getValue(),fieldSet.readInt("Total_Util_Total_Exp"));}
		if ( fieldSet.readString("Total_Util_Inter_Exp").trim().length() > 0 && fieldSet.readInt("Total_Util_Inter_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Util_Inter_Exp.getValue(),fieldSet.readInt("Total_Util_Inter_Exp"));}
		if ( fieldSet.readString("Total_Util_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Total_Util_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Total_Util_Cap_Outlay.getValue(),fieldSet.readInt("Total_Util_Cap_Outlay"));}
		if ( fieldSet.readString("Total_Util_Current_Exp").trim().length() > 0 && fieldSet.readInt("Total_Util_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Total_Util_Current_Exp.getValue(),fieldSet.readInt("Total_Util_Current_Exp"));}
		if ( fieldSet.readString("Total_Util_Construct").trim().length() > 0 && fieldSet.readInt("Total_Util_Construct") != 0) {
		rec.getData().put(AttributeEnum.Total_Util_Construct.getValue(),fieldSet.readInt("Total_Util_Construct"));}
		if ( fieldSet.readString("Water_Util_Total_Exp").trim().length() > 0 && fieldSet.readInt("Water_Util_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Water_Util_Total_Exp.getValue(),fieldSet.readInt("Water_Util_Total_Exp"));}
		if ( fieldSet.readString("Water_Util_Inter_Exp").trim().length() > 0 && fieldSet.readInt("Water_Util_Inter_Exp") != 0) {
		rec.getData().put(AttributeEnum.Water_Util_Inter_Exp.getValue(),fieldSet.readInt("Water_Util_Inter_Exp"));}
		if ( fieldSet.readString("Water_Util_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Water_Util_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Water_Util_Cap_Outlay.getValue(),fieldSet.readInt("Water_Util_Cap_Outlay"));}
		if ( fieldSet.readString("Water_Util_Current_Exp").trim().length() > 0 && fieldSet.readInt("Water_Util_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Water_Util_Current_Exp.getValue(),fieldSet.readInt("Water_Util_Current_Exp"));}
		if ( fieldSet.readString("Water_Util_Construct").trim().length() > 0 && fieldSet.readInt("Water_Util_Construct") != 0) {
		rec.getData().put(AttributeEnum.Water_Util_Construct.getValue(),fieldSet.readInt("Water_Util_Construct"));}
		if ( fieldSet.readString("Elec_Util_Total_Exp").trim().length() > 0 && fieldSet.readInt("Elec_Util_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Elec_Util_Total_Exp.getValue(),fieldSet.readInt("Elec_Util_Total_Exp"));}
		if ( fieldSet.readString("Elec_Util_Inter_Exp").trim().length() > 0 && fieldSet.readInt("Elec_Util_Inter_Exp") != 0) {
		rec.getData().put(AttributeEnum.Elec_Util_Inter_Exp.getValue(),fieldSet.readInt("Elec_Util_Inter_Exp"));}
		if ( fieldSet.readString("Elec_Util_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Elec_Util_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Elec_Util_Cap_Outlay.getValue(),fieldSet.readInt("Elec_Util_Cap_Outlay"));}
		if ( fieldSet.readString("Elec_Util_Current_Exp").trim().length() > 0 && fieldSet.readInt("Elec_Util_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Elec_Util_Current_Exp.getValue(),fieldSet.readInt("Elec_Util_Current_Exp"));}
		if ( fieldSet.readString("Elec_Util_Construct").trim().length() > 0 && fieldSet.readInt("Elec_Util_Construct") != 0) {
		rec.getData().put(AttributeEnum.Elec_Util_Construct.getValue(),fieldSet.readInt("Elec_Util_Construct"));}
		if ( fieldSet.readString("Gas_Util_Total_Exp").trim().length() > 0 && fieldSet.readInt("Gas_Util_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Gas_Util_Total_Exp.getValue(),fieldSet.readInt("Gas_Util_Total_Exp"));}
		if ( fieldSet.readString("Gas_Util_Inter_Exp").trim().length() > 0 && fieldSet.readInt("Gas_Util_Inter_Exp") != 0) {
		rec.getData().put(AttributeEnum.Gas_Util_Inter_Exp.getValue(),fieldSet.readInt("Gas_Util_Inter_Exp"));}
		if ( fieldSet.readString("Gas_Util_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Gas_Util_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Gas_Util_Cap_Outlay.getValue(),fieldSet.readInt("Gas_Util_Cap_Outlay"));}
		if ( fieldSet.readString("Gas_Util_Current_Exp").trim().length() > 0 && fieldSet.readInt("Gas_Util_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Gas_Util_Current_Exp.getValue(),fieldSet.readInt("Gas_Util_Current_Exp"));}
		if ( fieldSet.readString("Gas_Util_Construct").trim().length() > 0 && fieldSet.readInt("Gas_Util_Construct") != 0) {
		rec.getData().put(AttributeEnum.Gas_Util_Construct.getValue(),fieldSet.readInt("Gas_Util_Construct"));}
		if ( fieldSet.readString("Trans_Util_Total_Exp").trim().length() > 0 && fieldSet.readInt("Trans_Util_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Trans_Util_Total_Exp.getValue(),fieldSet.readInt("Trans_Util_Total_Exp"));}
		if ( fieldSet.readString("Trans_Util_Inter_Exp").trim().length() > 0 && fieldSet.readInt("Trans_Util_Inter_Exp") != 0) {
		rec.getData().put(AttributeEnum.Trans_Util_Inter_Exp.getValue(),fieldSet.readInt("Trans_Util_Inter_Exp"));}
		if ( fieldSet.readString("Trans_Util_Cap_Outlay").trim().length() > 0 && fieldSet.readInt("Trans_Util_Cap_Outlay") != 0) {
		rec.getData().put(AttributeEnum.Trans_Util_Cap_Outlay.getValue(),fieldSet.readInt("Trans_Util_Cap_Outlay"));}
		if ( fieldSet.readString("Trans_Util_Current_Exp").trim().length() > 0 && fieldSet.readInt("Trans_Util_Current_Exp") != 0) {
		rec.getData().put(AttributeEnum.Trans_Util_Current_Exp.getValue(),fieldSet.readInt("Trans_Util_Current_Exp"));}
		if ( fieldSet.readString("Trans_Util_Construct").trim().length() > 0 && fieldSet.readInt("Trans_Util_Construct") != 0) {
		rec.getData().put(AttributeEnum.Trans_Util_Construct.getValue(),fieldSet.readInt("Trans_Util_Construct"));}
		if ( fieldSet.readString("Emp_Ret_Total_Expend").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Total_Expend") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Total_Expend.getValue(),fieldSet.readInt("Emp_Ret_Total_Expend"));}
		if ( fieldSet.readString("Emp_Ret_Benefit_Paymts").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Benefit_Paymts") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Benefit_Paymts.getValue(),fieldSet.readInt("Emp_Ret_Benefit_Paymts"));}
		if ( fieldSet.readString("Emp_Ret_Withdrawals").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Withdrawals") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Withdrawals.getValue(),fieldSet.readInt("Emp_Ret_Withdrawals"));}
		if ( fieldSet.readString("Emp_Ret_Other_Paymts").trim().length() > 0 && fieldSet.readInt("Emp_Ret_Other_Paymts") != 0) {
		rec.getData().put(AttributeEnum.Emp_Ret_Other_Paymts.getValue(),fieldSet.readInt("Emp_Ret_Other_Paymts"));}
		if ( fieldSet.readString("Unemp_Comp_Total_Exp").trim().length() > 0 && fieldSet.readInt("Unemp_Comp_Total_Exp") != 0) {
		rec.getData().put(AttributeEnum.Unemp_Comp_Total_Exp.getValue(),fieldSet.readInt("Unemp_Comp_Total_Exp"));}
		if ( fieldSet.readString("Unemp_Comp_Ben_Paymts").trim().length() > 0 && fieldSet.readInt("Unemp_Comp_Ben_Paymts") != 0) {
		rec.getData().put(AttributeEnum.Unemp_Comp_Ben_Paymts.getValue(),fieldSet.readInt("Unemp_Comp_Ben_Paymts"));}
		if ( fieldSet.readString("Unemp_Ext___Spec_Pmts").trim().length() > 0 && fieldSet.readInt("Unemp_Ext___Spec_Pmts") != 0) {
		rec.getData().put(AttributeEnum.Unemp_Ext___Spec_Pmts.getValue(),fieldSet.readInt("Unemp_Ext___Spec_Pmts"));}
		if ( fieldSet.readString("Total_Debt_Outstanding").trim().length() > 0 && fieldSet.readInt("Total_Debt_Outstanding") != 0) {
		rec.getData().put(AttributeEnum.Total_Debt_Outstanding.getValue(),fieldSet.readInt("Total_Debt_Outstanding"));}
		if ( fieldSet.readString("Total_Long_Term_Debt_Out").trim().length() > 0 && fieldSet.readInt("Total_Long_Term_Debt_Out") != 0) {
		rec.getData().put(AttributeEnum.Total_Long_Term_Debt_Out.getValue(),fieldSet.readInt("Total_Long_Term_Debt_Out"));}
		if ( fieldSet.readString("ST_Debt_End_of_Year").trim().length() > 0 && fieldSet.readInt("ST_Debt_End_of_Year") != 0) {
		rec.getData().put(AttributeEnum.ST_Debt_End_of_Year.getValue(),fieldSet.readInt("ST_Debt_End_of_Year"));}
		if ( fieldSet.readString("Total_Beg_LTD_Out").trim().length() > 0 && fieldSet.readInt("Total_Beg_LTD_Out") != 0) {
		rec.getData().put(AttributeEnum.Total_Beg_LTD_Out.getValue(),fieldSet.readInt("Total_Beg_LTD_Out"));}
		if ( fieldSet.readString("Beg_LTD_Out_Private_Purp").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_Private_Purp") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_Private_Purp.getValue(),fieldSet.readInt("Beg_LTD_Out_Private_Purp"));}
		if ( fieldSet.readString("Beg_LTD_Out_All_Other").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_All_Other") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_All_Other.getValue(),fieldSet.readInt("Beg_LTD_Out_All_Other"));}
		if ( fieldSet.readString("Beg_LTD_Out_Utility").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_Utility") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_Utility.getValue(),fieldSet.readInt("Beg_LTD_Out_Utility"));}
		if ( fieldSet.readString("Beg_LTD_Out_Water_Util").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_Water_Util") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_Water_Util.getValue(),fieldSet.readInt("Beg_LTD_Out_Water_Util"));}
		if ( fieldSet.readString("Beg_LTD_Out_Elec_Util").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_Elec_Util") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_Elec_Util.getValue(),fieldSet.readInt("Beg_LTD_Out_Elec_Util"));}
		if ( fieldSet.readString("Beg_LTD_Out_Gas_Util").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_Gas_Util") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_Gas_Util.getValue(),fieldSet.readInt("Beg_LTD_Out_Gas_Util"));}
		if ( fieldSet.readString("Beg_LTD_Out_Trans_Util").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_Trans_Util") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_Trans_Util.getValue(),fieldSet.readInt("Beg_LTD_Out_Trans_Util"));}
		if ( fieldSet.readString("Beg_LTD_Out_General").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_General") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_General.getValue(),fieldSet.readInt("Beg_LTD_Out_General"));}
		if ( fieldSet.readString("Beg_LTD_Out_Education").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_Education") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_Education.getValue(),fieldSet.readInt("Beg_LTD_Out_Education"));}
		if ( fieldSet.readString("Beg_LTD_Out_Priv_Purp").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_Priv_Purp") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_Priv_Purp.getValue(),fieldSet.readInt("Beg_LTD_Out_Priv_Purp"));}
		if ( fieldSet.readString("Beg_LTD_Out_Other_NEC").trim().length() > 0 && fieldSet.readInt("Beg_LTD_Out_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.Beg_LTD_Out_Other_NEC.getValue(),fieldSet.readInt("Beg_LTD_Out_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Issued").trim().length() > 0 && fieldSet.readInt("Total_LTD_Issued") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Issued.getValue(),fieldSet.readInt("Total_LTD_Issued"));}
		if ( fieldSet.readString("LTD_Iss_Private_Purp").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Private_Purp") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Private_Purp.getValue(),fieldSet.readInt("LTD_Iss_Private_Purp"));}
		if ( fieldSet.readString("LTD_Iss_All_Other").trim().length() > 0 && fieldSet.readInt("LTD_Iss_All_Other") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_All_Other.getValue(),fieldSet.readInt("LTD_Iss_All_Other"));}
		if ( fieldSet.readString("LTD_Iss_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Utility.getValue(),fieldSet.readInt("LTD_Iss_Utility"));}
		if ( fieldSet.readString("LTD_Iss_Util_Water").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Util_Water") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Util_Water.getValue(),fieldSet.readInt("LTD_Iss_Util_Water"));}
		if ( fieldSet.readString("LTD_Iss_Util_Electric").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Util_Electric") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Util_Electric.getValue(),fieldSet.readInt("LTD_Iss_Util_Electric"));}
		if ( fieldSet.readString("LTD_Iss_Util_Gas_Supply").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Util_Gas_Supply") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Util_Gas_Supply.getValue(),fieldSet.readInt("LTD_Iss_Util_Gas_Supply"));}
		if ( fieldSet.readString("LTD_Iss_Util_Transit").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Util_Transit") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Util_Transit.getValue(),fieldSet.readInt("LTD_Iss_Util_Transit"));}
		if ( fieldSet.readString("LTD_Iss_General").trim().length() > 0 && fieldSet.readInt("LTD_Iss_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_General.getValue(),fieldSet.readInt("LTD_Iss_General"));}
		if ( fieldSet.readString("LTD_Iss_Gen_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Gen_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Gen_Elem_Educ.getValue(),fieldSet.readInt("LTD_Iss_Gen_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Iss_Gen_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Gen_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Gen_Other_Educ.getValue(),fieldSet.readInt("LTD_Iss_Gen_Other_Educ"));}
		if ( fieldSet.readString("LTD_Iss_Gen_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Gen_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Gen_Other_NEC.getValue(),fieldSet.readInt("LTD_Iss_Gen_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Iss_FFC").trim().length() > 0 && fieldSet.readInt("Total_LTD_Iss_FFC") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Iss_FFC.getValue(),fieldSet.readInt("Total_LTD_Iss_FFC"));}
		if ( fieldSet.readString("LTD_Iss_FFC_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Iss_FFC_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_FFC_Utility.getValue(),fieldSet.readInt("LTD_Iss_FFC_Utility"));}
		if ( fieldSet.readString("LTD_Iss_FFC_Water_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_FFC_Water_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_FFC_Water_Util.getValue(),fieldSet.readInt("LTD_Iss_FFC_Water_Util"));}
		if ( fieldSet.readString("LTD_Iss_FFC_Elec_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_FFC_Elec_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_FFC_Elec_Util.getValue(),fieldSet.readInt("LTD_Iss_FFC_Elec_Util"));}
		if ( fieldSet.readString("LTD_Iss_FFC_Gas_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_FFC_Gas_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_FFC_Gas_Util.getValue(),fieldSet.readInt("LTD_Iss_FFC_Gas_Util"));}
		if ( fieldSet.readString("LTD_Iss_FFC_Trans_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_FFC_Trans_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_FFC_Trans_Util.getValue(),fieldSet.readInt("LTD_Iss_FFC_Trans_Util"));}
		if ( fieldSet.readString("LTD_Iss_FFC_General").trim().length() > 0 && fieldSet.readInt("LTD_Iss_FFC_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_FFC_General.getValue(),fieldSet.readInt("LTD_Iss_FFC_General"));}
		if ( fieldSet.readString("LTD_Iss_FFC_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Iss_FFC_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_FFC_Elem_Educ.getValue(),fieldSet.readInt("LTD_Iss_FFC_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Iss_FFC_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Iss_FFC_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_FFC_Other_Educ.getValue(),fieldSet.readInt("LTD_Iss_FFC_Other_Educ"));}
		if ( fieldSet.readString("LTD_Iss_FFC_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Iss_FFC_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_FFC_Other_NEC.getValue(),fieldSet.readInt("LTD_Iss_FFC_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Iss_NG").trim().length() > 0 && fieldSet.readInt("Total_LTD_Iss_NG") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Iss_NG.getValue(),fieldSet.readInt("Total_LTD_Iss_NG"));}
		if ( fieldSet.readString("LTD_Iss_NG_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_Utility.getValue(),fieldSet.readInt("LTD_Iss_NG_Utility"));}
		if ( fieldSet.readString("LTD_Iss_NG_Water_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_Water_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_Water_Util.getValue(),fieldSet.readInt("LTD_Iss_NG_Water_Util"));}
		if ( fieldSet.readString("LTD_Iss_NG_Elec_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_Elec_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_Elec_Util.getValue(),fieldSet.readInt("LTD_Iss_NG_Elec_Util"));}
		if ( fieldSet.readString("LTD_Iss_NG_Gas_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_Gas_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_Gas_Util.getValue(),fieldSet.readInt("LTD_Iss_NG_Gas_Util"));}
		if ( fieldSet.readString("LTD_Iss_NG_Trans_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_Trans_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_Trans_Util.getValue(),fieldSet.readInt("LTD_Iss_NG_Trans_Util"));}
		if ( fieldSet.readString("LTD_Iss_NG_General").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_General.getValue(),fieldSet.readInt("LTD_Iss_NG_General"));}
		if ( fieldSet.readString("LTD_Iss_NG_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_Elem_Educ.getValue(),fieldSet.readInt("LTD_Iss_NG_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Iss_NG_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_Other_Educ.getValue(),fieldSet.readInt("LTD_Iss_NG_Other_Educ"));}
		if ( fieldSet.readString("LTD_Iss_NG_Private_Purp").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_Private_Purp") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_Private_Purp.getValue(),fieldSet.readInt("LTD_Iss_NG_Private_Purp"));}
		if ( fieldSet.readString("LTD_Iss_NG_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Iss_NG_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_NG_Other_NEC.getValue(),fieldSet.readInt("LTD_Iss_NG_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Iss_Unsp").trim().length() > 0 && fieldSet.readInt("Total_LTD_Iss_Unsp") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Iss_Unsp.getValue(),fieldSet.readInt("Total_LTD_Iss_Unsp"));}
		if ( fieldSet.readString("LTD_Iss_Unsp_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Unsp_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Unsp_Utility.getValue(),fieldSet.readInt("LTD_Iss_Unsp_Utility"));}
		if ( fieldSet.readString("LTD_Iss_Unsp_Water_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Unsp_Water_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Unsp_Water_Util.getValue(),fieldSet.readInt("LTD_Iss_Unsp_Water_Util"));}
		if ( fieldSet.readString("LTD_Iss_Unsp_Elec_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Unsp_Elec_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Unsp_Elec_Util.getValue(),fieldSet.readInt("LTD_Iss_Unsp_Elec_Util"));}
		if ( fieldSet.readString("LTD_Iss_Unsp_Gas_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Unsp_Gas_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Unsp_Gas_Util.getValue(),fieldSet.readInt("LTD_Iss_Unsp_Gas_Util"));}
		if ( fieldSet.readString("LTD_Iss_Unsp_Trans_Util").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Unsp_Trans_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Unsp_Trans_Util.getValue(),fieldSet.readInt("LTD_Iss_Unsp_Trans_Util"));}
		if ( fieldSet.readString("LTD_Iss_Unsp_General").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Unsp_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Unsp_General.getValue(),fieldSet.readInt("LTD_Iss_Unsp_General"));}
		if ( fieldSet.readString("LTD_Iss_Unsp_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Unsp_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Unsp_Elem_Educ.getValue(),fieldSet.readInt("LTD_Iss_Unsp_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Iss_Unsp_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Unsp_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Unsp_Other_Educ.getValue(),fieldSet.readInt("LTD_Iss_Unsp_Other_Educ"));}
		if ( fieldSet.readString("LTD_Iss_Unsp_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Iss_Unsp_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Iss_Unsp_Other_NEC.getValue(),fieldSet.readInt("LTD_Iss_Unsp_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Retired").trim().length() > 0 && fieldSet.readInt("Total_LTD_Retired") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Retired.getValue(),fieldSet.readInt("Total_LTD_Retired"));}
		if ( fieldSet.readString("LTD_Ret_Private_Purp").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Private_Purp") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Private_Purp.getValue(),fieldSet.readInt("LTD_Ret_Private_Purp"));}
		if ( fieldSet.readString("LTD_Ret_All_Other").trim().length() > 0 && fieldSet.readInt("LTD_Ret_All_Other") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_All_Other.getValue(),fieldSet.readInt("LTD_Ret_All_Other"));}
		if ( fieldSet.readString("LTD_Ret_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Utility.getValue(),fieldSet.readInt("LTD_Ret_Utility"));}
		if ( fieldSet.readString("LTD_Ret_Util_Water").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Util_Water") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Util_Water.getValue(),fieldSet.readInt("LTD_Ret_Util_Water"));}
		if ( fieldSet.readString("LTD_Ret_Util_Electric").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Util_Electric") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Util_Electric.getValue(),fieldSet.readInt("LTD_Ret_Util_Electric"));}
		if ( fieldSet.readString("LTD_Ret_Util_Gas_Supply").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Util_Gas_Supply") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Util_Gas_Supply.getValue(),fieldSet.readInt("LTD_Ret_Util_Gas_Supply"));}
		if ( fieldSet.readString("LTD_Ret_Util_Transit").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Util_Transit") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Util_Transit.getValue(),fieldSet.readInt("LTD_Ret_Util_Transit"));}
		if ( fieldSet.readString("LTD_Ret_General").trim().length() > 0 && fieldSet.readInt("LTD_Ret_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_General.getValue(),fieldSet.readInt("LTD_Ret_General"));}
		if ( fieldSet.readString("LTD_Ret_Gen_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Gen_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Gen_Elem_Educ.getValue(),fieldSet.readInt("LTD_Ret_Gen_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Ret_Gen_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Gen_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Gen_Other_Educ.getValue(),fieldSet.readInt("LTD_Ret_Gen_Other_Educ"));}
		if ( fieldSet.readString("LTD_Ret_Gen_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Gen_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Gen_Other_NEC.getValue(),fieldSet.readInt("LTD_Ret_Gen_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Ret_FFC").trim().length() > 0 && fieldSet.readInt("Total_LTD_Ret_FFC") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Ret_FFC.getValue(),fieldSet.readInt("Total_LTD_Ret_FFC"));}
		if ( fieldSet.readString("LTD_Ret_FFC_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Ret_FFC_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_FFC_Utility.getValue(),fieldSet.readInt("LTD_Ret_FFC_Utility"));}
		if ( fieldSet.readString("LTD_Ret_FFC_Water_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_FFC_Water_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_FFC_Water_Util.getValue(),fieldSet.readInt("LTD_Ret_FFC_Water_Util"));}
		if ( fieldSet.readString("LTD_Ret_FFC_Elec_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_FFC_Elec_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_FFC_Elec_Util.getValue(),fieldSet.readInt("LTD_Ret_FFC_Elec_Util"));}
		if ( fieldSet.readString("LTD_Ret_FFC_Gas_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_FFC_Gas_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_FFC_Gas_Util.getValue(),fieldSet.readInt("LTD_Ret_FFC_Gas_Util"));}
		if ( fieldSet.readString("LTD_Ret_FFC_Trans_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_FFC_Trans_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_FFC_Trans_Util.getValue(),fieldSet.readInt("LTD_Ret_FFC_Trans_Util"));}
		if ( fieldSet.readString("LTD_Ret_FFC_General").trim().length() > 0 && fieldSet.readInt("LTD_Ret_FFC_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_FFC_General.getValue(),fieldSet.readInt("LTD_Ret_FFC_General"));}
		if ( fieldSet.readString("LTD_Ret_FFC_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Ret_FFC_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_FFC_Elem_Educ.getValue(),fieldSet.readInt("LTD_Ret_FFC_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Ret_FFC_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Ret_FFC_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_FFC_Other_Educ.getValue(),fieldSet.readInt("LTD_Ret_FFC_Other_Educ"));}
		if ( fieldSet.readString("LTD_Ret_FFC_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Ret_FFC_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_FFC_Other_NEC.getValue(),fieldSet.readInt("LTD_Ret_FFC_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Ret_NG").trim().length() > 0 && fieldSet.readInt("Total_LTD_Ret_NG") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Ret_NG.getValue(),fieldSet.readInt("Total_LTD_Ret_NG"));}
		if ( fieldSet.readString("LTD_Ret_NG_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_Utility.getValue(),fieldSet.readInt("LTD_Ret_NG_Utility"));}
		if ( fieldSet.readString("LTD_Ret_NG_Water_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_Water_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_Water_Util.getValue(),fieldSet.readInt("LTD_Ret_NG_Water_Util"));}
		if ( fieldSet.readString("LTD_Ret_NG_Elec_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_Elec_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_Elec_Util.getValue(),fieldSet.readInt("LTD_Ret_NG_Elec_Util"));}
		if ( fieldSet.readString("LTD_Ret_NG_Gas_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_Gas_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_Gas_Util.getValue(),fieldSet.readInt("LTD_Ret_NG_Gas_Util"));}
		if ( fieldSet.readString("LTD_Ret_NG_Trans_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_Trans_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_Trans_Util.getValue(),fieldSet.readInt("LTD_Ret_NG_Trans_Util"));}
		if ( fieldSet.readString("LTD_Ret_NG_General").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_General.getValue(),fieldSet.readInt("LTD_Ret_NG_General"));}
		if ( fieldSet.readString("LTD_Ret_NG_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_Elem_Educ.getValue(),fieldSet.readInt("LTD_Ret_NG_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Ret_NG_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_Other_Educ.getValue(),fieldSet.readInt("LTD_Ret_NG_Other_Educ"));}
		if ( fieldSet.readString("LTD_Ret_NG_Private_Purp").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_Private_Purp") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_Private_Purp.getValue(),fieldSet.readInt("LTD_Ret_NG_Private_Purp"));}
		if ( fieldSet.readString("LTD_Ret_NG_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Ret_NG_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_NG_Other_NEC.getValue(),fieldSet.readInt("LTD_Ret_NG_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Ret_Unsp").trim().length() > 0 && fieldSet.readInt("Total_LTD_Ret_Unsp") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Ret_Unsp.getValue(),fieldSet.readInt("Total_LTD_Ret_Unsp"));}
		if ( fieldSet.readString("LTD_Ret_Unsp_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Unsp_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Unsp_Utility.getValue(),fieldSet.readInt("LTD_Ret_Unsp_Utility"));}
		if ( fieldSet.readString("LTD_Ret_Unsp_Water_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Unsp_Water_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Unsp_Water_Util.getValue(),fieldSet.readInt("LTD_Ret_Unsp_Water_Util"));}
		if ( fieldSet.readString("LTD_Ret_Unsp_Elec_Utili").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Unsp_Elec_Utili") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Unsp_Elec_Utili.getValue(),fieldSet.readInt("LTD_Ret_Unsp_Elec_Utili"));}
		if ( fieldSet.readString("LTD_Ret_Unsp_Gas_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Unsp_Gas_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Unsp_Gas_Util.getValue(),fieldSet.readInt("LTD_Ret_Unsp_Gas_Util"));}
		if ( fieldSet.readString("LTD_Ret_Unsp_Trans_Util").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Unsp_Trans_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Unsp_Trans_Util.getValue(),fieldSet.readInt("LTD_Ret_Unsp_Trans_Util"));}
		if ( fieldSet.readString("LTD_Ret_Unsp_General").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Unsp_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Unsp_General.getValue(),fieldSet.readInt("LTD_Ret_Unsp_General"));}
		if ( fieldSet.readString("LTD_Ret_Unsp_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Unsp_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Unsp_Elem_Educ.getValue(),fieldSet.readInt("LTD_Ret_Unsp_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Ret_Unsp_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Unsp_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Unsp_Other_Educ.getValue(),fieldSet.readInt("LTD_Ret_Unsp_Other_Educ"));}
		if ( fieldSet.readString("LTD_Ret_Unsp_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Ret_Unsp_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Ret_Unsp_Other_NEC.getValue(),fieldSet.readInt("LTD_Ret_Unsp_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Out").trim().length() > 0 && fieldSet.readInt("Total_LTD_Out") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Out.getValue(),fieldSet.readInt("Total_LTD_Out"));}
		if ( fieldSet.readString("LTD_Out_Private_Purp").trim().length() > 0 && fieldSet.readInt("LTD_Out_Private_Purp") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_Private_Purp.getValue(),fieldSet.readInt("LTD_Out_Private_Purp"));}
		if ( fieldSet.readString("LTD_Out_All_Other").trim().length() > 0 && fieldSet.readInt("LTD_Out_All_Other") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_All_Other.getValue(),fieldSet.readInt("LTD_Out_All_Other"));}
		if ( fieldSet.readString("Total_LTD_Out_Utility").trim().length() > 0 && fieldSet.readInt("Total_LTD_Out_Utility") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Out_Utility.getValue(),fieldSet.readInt("Total_LTD_Out_Utility"));}
		if ( fieldSet.readString("LTD_Out_Util_Water").trim().length() > 0 && fieldSet.readInt("LTD_Out_Util_Water") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_Util_Water.getValue(),fieldSet.readInt("LTD_Out_Util_Water"));}
		if ( fieldSet.readString("LTD_Out_Util_Electric").trim().length() > 0 && fieldSet.readInt("LTD_Out_Util_Electric") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_Util_Electric.getValue(),fieldSet.readInt("LTD_Out_Util_Electric"));}
		if ( fieldSet.readString("LTD_Out_Util_Gas_Supply").trim().length() > 0 && fieldSet.readInt("LTD_Out_Util_Gas_Supply") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_Util_Gas_Supply.getValue(),fieldSet.readInt("LTD_Out_Util_Gas_Supply"));}
		if ( fieldSet.readString("LTD_Out_Util_Transit").trim().length() > 0 && fieldSet.readInt("LTD_Out_Util_Transit") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_Util_Transit.getValue(),fieldSet.readInt("LTD_Out_Util_Transit"));}
		if ( fieldSet.readString("LTD_Out_General").trim().length() > 0 && fieldSet.readInt("LTD_Out_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_General.getValue(),fieldSet.readInt("LTD_Out_General"));}
		if ( fieldSet.readString("LTD_Out_Gen_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Out_Gen_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_Gen_Elem_Educ.getValue(),fieldSet.readInt("LTD_Out_Gen_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Out_Gen_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Out_Gen_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_Gen_Other_Educ.getValue(),fieldSet.readInt("LTD_Out_Gen_Other_Educ"));}
		if ( fieldSet.readString("LTD_Out_Gen_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Out_Gen_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_Gen_Other_NEC.getValue(),fieldSet.readInt("LTD_Out_Gen_Other_NEC"));}
		if ( fieldSet.readString("Total_LTD_Out_FFC").trim().length() > 0 && fieldSet.readInt("Total_LTD_Out_FFC") != 0) {
		rec.getData().put(AttributeEnum.Total_LTD_Out_FFC.getValue(),fieldSet.readInt("Total_LTD_Out_FFC"));}
		if ( fieldSet.readString("LTD_Out_FFC_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Out_FFC_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_FFC_Utility.getValue(),fieldSet.readInt("LTD_Out_FFC_Utility"));}
		if ( fieldSet.readString("LTD_Out_FFC_Water_Util").trim().length() > 0 && fieldSet.readInt("LTD_Out_FFC_Water_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_FFC_Water_Util.getValue(),fieldSet.readInt("LTD_Out_FFC_Water_Util"));}
		if ( fieldSet.readString("LTD_Out_FFC_Elec_Util").trim().length() > 0 && fieldSet.readInt("LTD_Out_FFC_Elec_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_FFC_Elec_Util.getValue(),fieldSet.readInt("LTD_Out_FFC_Elec_Util"));}
		if ( fieldSet.readString("LTD_Out_FFC_Gas_Util").trim().length() > 0 && fieldSet.readInt("LTD_Out_FFC_Gas_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_FFC_Gas_Util.getValue(),fieldSet.readInt("LTD_Out_FFC_Gas_Util"));}
		if ( fieldSet.readString("LTD_Out_FFC_Trans_Util").trim().length() > 0 && fieldSet.readInt("LTD_Out_FFC_Trans_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_FFC_Trans_Util.getValue(),fieldSet.readInt("LTD_Out_FFC_Trans_Util"));}
		if ( fieldSet.readString("LTD_Out_FFC_General").trim().length() > 0 && fieldSet.readInt("LTD_Out_FFC_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_FFC_General.getValue(),fieldSet.readInt("LTD_Out_FFC_General"));}
		if ( fieldSet.readString("LTD_Out_FFC_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Out_FFC_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_FFC_Elem_Educ.getValue(),fieldSet.readInt("LTD_Out_FFC_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Out_FFC_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Out_FFC_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_FFC_Other_Educ.getValue(),fieldSet.readInt("LTD_Out_FFC_Other_Educ"));}
		if ( fieldSet.readString("LTD_Out_FFC_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Out_FFC_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_FFC_Other_NEC.getValue(),fieldSet.readInt("LTD_Out_FFC_Other_NEC"));}
		if ( fieldSet.readString("Tot_LTD_Out_NG").trim().length() > 0 && fieldSet.readInt("Tot_LTD_Out_NG") != 0) {
		rec.getData().put(AttributeEnum.Tot_LTD_Out_NG.getValue(),fieldSet.readInt("Tot_LTD_Out_NG"));}
		if ( fieldSet.readString("LTD_Out_NG_Utility").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_Utility") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_Utility.getValue(),fieldSet.readInt("LTD_Out_NG_Utility"));}
		if ( fieldSet.readString("LTD_Out_NG_Water_Util").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_Water_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_Water_Util.getValue(),fieldSet.readInt("LTD_Out_NG_Water_Util"));}
		if ( fieldSet.readString("LTD_Out_NG_Elec_Util").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_Elec_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_Elec_Util.getValue(),fieldSet.readInt("LTD_Out_NG_Elec_Util"));}
		if ( fieldSet.readString("LTD_Out_NG_Gas_Util").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_Gas_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_Gas_Util.getValue(),fieldSet.readInt("LTD_Out_NG_Gas_Util"));}
		if ( fieldSet.readString("LTD_Out_NG_Trans_Util").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_Trans_Util") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_Trans_Util.getValue(),fieldSet.readInt("LTD_Out_NG_Trans_Util"));}
		if ( fieldSet.readString("LTD_Out_NG_General").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_General") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_General.getValue(),fieldSet.readInt("LTD_Out_NG_General"));}
		if ( fieldSet.readString("LTD_Out_NG_Elem_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_Elem_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_Elem_Educ.getValue(),fieldSet.readInt("LTD_Out_NG_Elem_Educ"));}
		if ( fieldSet.readString("LTD_Out_NG_Other_Educ").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_Other_Educ") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_Other_Educ.getValue(),fieldSet.readInt("LTD_Out_NG_Other_Educ"));}
		if ( fieldSet.readString("LTD_Out_NG_Private_Purp").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_Private_Purp") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_Private_Purp.getValue(),fieldSet.readInt("LTD_Out_NG_Private_Purp"));}
		if ( fieldSet.readString("LTD_Out_NG_Other_NEC").trim().length() > 0 && fieldSet.readInt("LTD_Out_NG_Other_NEC") != 0) {
		rec.getData().put(AttributeEnum.LTD_Out_NG_Other_NEC.getValue(),fieldSet.readInt("LTD_Out_NG_Other_NEC"));}
		if ( fieldSet.readString("Total_Cash___Securities").trim().length() > 0 && fieldSet.readInt("Total_Cash___Securities") != 0) {
		rec.getData().put(AttributeEnum.Total_Cash___Securities.getValue(),fieldSet.readInt("Total_Cash___Securities"));}
		if ( fieldSet.readString("Insur_Trust_Cash___Sec").trim().length() > 0 && fieldSet.readInt("Insur_Trust_Cash___Sec") != 0) {
		rec.getData().put(AttributeEnum.Insur_Trust_Cash___Sec.getValue(),fieldSet.readInt("Insur_Trust_Cash___Sec"));}
		if ( fieldSet.readString("Emp_Retire_Cash___Sec").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Cash___Sec") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Cash___Sec.getValue(),fieldSet.readInt("Emp_Retire_Cash___Sec"));}
		if ( fieldSet.readString("Emp_Retire_Cash___Dep").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Cash___Dep") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Cash___Dep.getValue(),fieldSet.readInt("Emp_Retire_Cash___Dep"));}
		if ( fieldSet.readString("Emp_Retire_Total_Sec").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Total_Sec") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Total_Sec.getValue(),fieldSet.readInt("Emp_Retire_Total_Sec"));}
		if ( fieldSet.readString("Emp_Retire_Sec_Tot_Fed").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Sec_Tot_Fed") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Sec_Tot_Fed.getValue(),fieldSet.readInt("Emp_Retire_Sec_Tot_Fed"));}
		if ( fieldSet.readString("Emp_Retire_Sec_S_L_Secur").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Sec_S_L_Secur") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Sec_S_L_Secur.getValue(),fieldSet.readInt("Emp_Retire_Sec_S_L_Secur"));}
		if ( fieldSet.readString("Emp_Retire_Sec_Tot_Nong").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Sec_Tot_Nong") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Sec_Tot_Nong.getValue(),fieldSet.readInt("Emp_Retire_Sec_Tot_Nong"));}
		if ( fieldSet.readString("Emp_Retire_Sec_Corp_Bds").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Sec_Corp_Bds") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Sec_Corp_Bds.getValue(),fieldSet.readInt("Emp_Retire_Sec_Corp_Bds"));}
		if ( fieldSet.readString("Emp_Retire_Sec_Corp_Stk").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Sec_Corp_Stk") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Sec_Corp_Stk.getValue(),fieldSet.readInt("Emp_Retire_Sec_Corp_Stk"));}
		if ( fieldSet.readString("Emp_Retire_Sec_Mortgages").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Sec_Mortgages") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Sec_Mortgages.getValue(),fieldSet.readInt("Emp_Retire_Sec_Mortgages"));}
		if ( fieldSet.readString("Emp_Retire_Sec_Misc_Inv").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Sec_Misc_Inv") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Sec_Misc_Inv.getValue(),fieldSet.readInt("Emp_Retire_Sec_Misc_Inv"));}
		if ( fieldSet.readString("Emp_Retire_Sec_Oth_Nong").trim().length() > 0 && fieldSet.readInt("Emp_Retire_Sec_Oth_Nong") != 0) {
		rec.getData().put(AttributeEnum.Emp_Retire_Sec_Oth_Nong.getValue(),fieldSet.readInt("Emp_Retire_Sec_Oth_Nong"));}
		if ( fieldSet.readString("Unemp_Comp_Cash___Sec").trim().length() > 0 && fieldSet.readInt("Unemp_Comp_Cash___Sec") != 0) {
		rec.getData().put(AttributeEnum.Unemp_Comp_Cash___Sec.getValue(),fieldSet.readInt("Unemp_Comp_Cash___Sec"));}
		if ( fieldSet.readString("Unemp_Comp_Bal_In_US_Trs").trim().length() > 0 && fieldSet.readInt("Unemp_Comp_Bal_In_US_Trs") != 0) {
		rec.getData().put(AttributeEnum.Unemp_Comp_Bal_In_US_Trs.getValue(),fieldSet.readInt("Unemp_Comp_Bal_In_US_Trs"));}
		if ( fieldSet.readString("Unemp_Comp_Other_Balance").trim().length() > 0 && fieldSet.readInt("Unemp_Comp_Other_Balance") != 0) {
		rec.getData().put(AttributeEnum.Unemp_Comp_Other_Balance.getValue(),fieldSet.readInt("Unemp_Comp_Other_Balance"));}
		if ( fieldSet.readString("Nonin_Trust_Cash___Sec").trim().length() > 0 && fieldSet.readInt("Nonin_Trust_Cash___Sec") != 0) {
		rec.getData().put(AttributeEnum.Nonin_Trust_Cash___Sec.getValue(),fieldSet.readInt("Nonin_Trust_Cash___Sec"));}
		if ( fieldSet.readString("Sinking_Fd_Cash___Sec").trim().length() > 0 && fieldSet.readInt("Sinking_Fd_Cash___Sec") != 0) {
		rec.getData().put(AttributeEnum.Sinking_Fd_Cash___Sec.getValue(),fieldSet.readInt("Sinking_Fd_Cash___Sec"));}
		if ( fieldSet.readString("Bond_Fd_Cash___Sec").trim().length() > 0 && fieldSet.readInt("Bond_Fd_Cash___Sec") != 0) {
		rec.getData().put(AttributeEnum.Bond_Fd_Cash___Sec.getValue(),fieldSet.readInt("Bond_Fd_Cash___Sec"));}
		if ( fieldSet.readString("Oth_Nonin_Fd_Cash___Sec").trim().length() > 0 && fieldSet.readInt("Oth_Nonin_Fd_Cash___Sec") != 0) {
		rec.getData().put(AttributeEnum.Oth_Nonin_Fd_Cash___Sec.getValue(),fieldSet.readInt("Oth_Nonin_Fd_Cash___Sec"));}
		return rec;
	}
	
}

