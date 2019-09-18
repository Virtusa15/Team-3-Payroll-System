package bean;

import java.util.*;

public class SalaryDetailsBO {
	private String DESIGNATION;
	private double BASIC_PAY;
	private double HRA;
	private double LEAVE_TRAVEL_ASSISTANCE;
	private double PHONE_INTERNET_REIMBURSEMENT;
	private double BONUS;
	private double CHILD_EDU_FEE;
	private double SPECIAL_ALLOWANCE;
	private double FOOD_REIMBURSEMENT;
	private double PF;
	private double ESIC;
	private double FIXED_COMPENSATION;
	private double VAR_COMPENSATION;
	private double COST_TO_COMPANY;
	private int EMP_ID;
	private Date FROM_DATE;
	private Date TO_DATE;
	private int LOPS;
	private int FOOD_REIMBERSMNET;
	private double TRANSPORT_REIMBERSMENT;
	private double INTERNET_REIMBERSMENT;
	private float TRANSPORT;
	float tax;	
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getTRANSPORT() {
		return TRANSPORT;
	}
	public void setTRANSPORT(float tRANSPORT) {
		TRANSPORT = tRANSPORT;
	}
	public int getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(int EMP_ID) {
		this.EMP_ID = EMP_ID;
	}
	public Date getFROM_DATE() {
		return FROM_DATE;
	}
	public void setFROM_DATE(Date FROM_DATE) {
		this.FROM_DATE = FROM_DATE;
	}
	public Date getTO_DATE() {
		return TO_DATE;
	}
	public void setTO_DATE(Date TO_DATE) {
		this.TO_DATE = TO_DATE;
	}
	public int getLOPS() {
		return LOPS;
	}
	public void setLOPS(int LOPS) {
		this.LOPS = LOPS;
	}
	public int getFOOD_REIMBERSMNET() {
		return FOOD_REIMBERSMNET;
	}
	public void setFOOD_REIMBERSMNET(int FOOD_REIMBERSMNET) {
		this.FOOD_REIMBERSMNET = FOOD_REIMBERSMNET;
	}
	public double getTRANSPORT_REIMBERSMENT() {
		return TRANSPORT_REIMBERSMENT;
	}
	public void setTRANSPORT_REIMBERSMENT(double TRANSPORT_REIMBERSMENT) {
		this.TRANSPORT_REIMBERSMENT = TRANSPORT_REIMBERSMENT;
	}
	public double getINTERNET_REIMBERSMENT() {
		return INTERNET_REIMBERSMENT;
	}
	public void setINTERNET_REIMBERSMENT(double iNTERNET_REIMBERSMENT) {
		this.INTERNET_REIMBERSMENT = iNTERNET_REIMBERSMENT;
	}
	public String getDESIGNATION() {
		return DESIGNATION;
	}
	public void setDESIGNATION(String DESIGNATION) {
		this.DESIGNATION = DESIGNATION;
	}
	public Double getBASIC_PAY() {
		return BASIC_PAY;
	}
	public void setBASIC_PAY(Double BASIC_PAY) {
		this.BASIC_PAY = BASIC_PAY;
	}
	public Double getHRA() {
		return HRA;
	}
	public void setHRA(Double HRA) {
		this.HRA = HRA;
	}
	public Double getLEAVE_TRAVEL_ASSISTANCE() {
		return LEAVE_TRAVEL_ASSISTANCE;
	}
	public void setLEAVE_TRAVEL_ASSISTANCE(Double LEAVE_TRAVEL_ASSISTANCE) {
		this.LEAVE_TRAVEL_ASSISTANCE = LEAVE_TRAVEL_ASSISTANCE;
	}
	public Double getPHONE_INTERNET_REIMBURSEMENT() {
		return PHONE_INTERNET_REIMBURSEMENT;
	}
	public void setPHONE_INTERNET_REIMBURSEMENT(Double PHONE_INTERNET_REIMBURSEMENT) {
		this.PHONE_INTERNET_REIMBURSEMENT = PHONE_INTERNET_REIMBURSEMENT;
	}
	public Double getBONUS() {
		return BONUS;
	}
	public void setBONUS(Double BONUS) {
		this.BONUS = BONUS;
	}
	public Double getCHILD_EDU_FEE() {
		return CHILD_EDU_FEE;
	}
	public void setCHILD_EDU_FEE(Double CHILD_EDU_FEE) {
		this.CHILD_EDU_FEE = CHILD_EDU_FEE;
	}
	public Double getSPECIAL_ALLOWANCE() {
		return SPECIAL_ALLOWANCE;
	}
	public void setSPECIAL_ALLOWANCE(Double SPECIAL_ALLOWANCE) {
		this.SPECIAL_ALLOWANCE = SPECIAL_ALLOWANCE;
	}
	public Double getFOOD_REIMBURSEMENT() {
		return FOOD_REIMBURSEMENT;
	}
	public void setFOOD_REIMBURSEMENT(Double FOOD_REIMBURSEMENT) {
		this.FOOD_REIMBURSEMENT = FOOD_REIMBURSEMENT;
	}
	public Double getPF() {
		return PF;
	}
	public void setPF(Double PF) {
		this.PF = PF;
	}
	public Double getESIC() {
		return ESIC;
	}
	public void setESIC(Double ESIC) {
		this.ESIC = ESIC;
	}
	public Double getFIXED_COMPENSATION() {
		return FIXED_COMPENSATION;
	}
	public void setFIXED_COMPENSATION(Double FIXED_COMPENSATION) {
		this.FIXED_COMPENSATION = FIXED_COMPENSATION;
	}
	public Double getVAR_COMPENSATION() {
		return VAR_COMPENSATION;
	}
	public void setVAR_COMPENSATION(Double VAR_COMPENSATION) {
		this.VAR_COMPENSATION = VAR_COMPENSATION;
	}
	public Double getCOST_TO_COMPANY() {
		return COST_TO_COMPANY;
	}
	public void setCOST_TO_COMPANY(Double COST_TO_COMPANY) {
		this.COST_TO_COMPANY = COST_TO_COMPANY;
	}
	
}
