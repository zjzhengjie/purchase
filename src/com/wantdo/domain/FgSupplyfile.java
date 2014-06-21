package com.wantdo.domain;

import java.sql.Timestamp;

/**
 * FgSupplyfile entity. @author MyEclipse Persistence Tools
 */

public class FgSupplyfile implements java.io.Serializable {

	// Fields

	private FgSupplyfileId id;
	private String compname;
	private String regionno;
	private String suppclass;
	private String deptno;
	private String empno;
	private String puracct;
	private String payacct;
	private String prepayacct;
	private String payvouacct;
	private Double creditnum;
	private String creditno;
	private String creditrank;
	private String billto;
	private String goodsto;
	private Double bal;
	private Short PMaxdays;
	private Short PMindays;
	private Timestamp fsttransdt;
	private Double backTotal;
	private Double invoTotal;
	private Double sendTotal;
	private Double finTotal;
	private String remarks;
	private String acNeed;
	private String fcCode;
	private String disctype;
	private Timestamp lastinvdt;
	private Double lastinv;
	private Timestamp lastrecdt;
	private Double lastrec;
	private Short accstop;
	private String payway;
	private String shiptype;
	private Double defNum1;
	private Double defNum2;
	private Integer defInt1;
	private Timestamp defDate1;
	private Double defNum3;
	private String defStr1;
	private String defStr2;
	private String defStr3;
	private String defStr4;
	private String defStr5;
	private String sprecord;
	private Timestamp verdtm;
	private Short fsaleflg;
	private Short supitembarcodestart;
	private Short supitembarcodelength;
	private String providenet;
	private Integer backperiod;
	private Double backrate;
	private Double rate;
	private Integer creditdays;
	private Integer attrId;
	private String relaEmpno;
	private String historymemo;
	private String abctype;
	private String supplyrank;
	private Double sysInitbal;
	private Timestamp fsaledt;
	private Timestamp auditdt;
	private String auditpsn;
	private Short auditflg;
	private Timestamp maturedate;
	private Integer payday;
	private Integer purcyc;
	private Integer ordercyc;
	private Integer delday;
	private String supplyRange;
	private String achievement;
	private String auditMemo;
	private String qualification;
	private Timestamp auditDt;
	private Short expFlag;
	private String vendorType;
	private String levelCode;
	private Double uicsendrate;
	private String bankno;
	private String accountno;
	private String groupcode;
	private Short isportal;
	private String isBlacklist;
	private String orgType;
	private String artiPerson;
	private String property;
	private String aptitude;
	private String type;
	private String venType;
	private String subpro;
	private String isblacklist;
	private String expressnorule;
	private String suppkind;
	private Double regFund;
	private String mainsell;
	private String partsell1;
	private String partsell2;
	private String filler;
	private String backreason;
	private Timestamp qfdeadline;
	private String backoperater;
	private Timestamp sqcertificateDtB;
	private Timestamp sqcertificateDtE;

	// Constructors

	/** default constructor */
	public FgSupplyfile() {
	}

	/** minimal constructor */
	public FgSupplyfile(FgSupplyfileId id) {
		this.id = id;
	}

	/** full constructor */
	public FgSupplyfile(FgSupplyfileId id, String compname, String regionno,
			String suppclass, String deptno, String empno, String puracct,
			String payacct, String prepayacct, String payvouacct,
			Double creditnum, String creditno, String creditrank,
			String billto, String goodsto, Double bal, Short PMaxdays,
			Short PMindays, Timestamp fsttransdt, Double backTotal,
			Double invoTotal, Double sendTotal, Double finTotal,
			String remarks, String acNeed, String fcCode, String disctype,
			Timestamp lastinvdt, Double lastinv, Timestamp lastrecdt,
			Double lastrec, Short accstop, String payway, String shiptype,
			Double defNum1, Double defNum2, Integer defInt1,
			Timestamp defDate1, Double defNum3, String defStr1, String defStr2,
			String defStr3, String defStr4, String defStr5, String sprecord,
			Timestamp verdtm, Short fsaleflg, Short supitembarcodestart,
			Short supitembarcodelength, String providenet, Integer backperiod,
			Double backrate, Double rate, Integer creditdays, Integer attrId,
			String relaEmpno, String historymemo, String abctype,
			String supplyrank, Double sysInitbal, Timestamp fsaledt,
			Timestamp auditdt, String auditpsn, Short auditflg,
			Timestamp maturedate, Integer payday, Integer purcyc,
			Integer ordercyc, Integer delday, String supplyRange,
			String achievement, String auditMemo, String qualification,
			Timestamp auditDt, Short expFlag, String vendorType,
			String levelCode, Double uicsendrate, String bankno,
			String accountno, String groupcode, Short isportal,
			String isBlacklist, String orgType, String artiPerson,
			String property, String aptitude, String type, String venType,
			String subpro, String isblacklist, String expressnorule,
			String suppkind, Double regFund, String mainsell, String partsell1,
			String partsell2, String filler, String backreason,
			Timestamp qfdeadline, String backoperater,
			Timestamp sqcertificateDtB, Timestamp sqcertificateDtE) {
		this.id = id;
		this.compname = compname;
		this.regionno = regionno;
		this.suppclass = suppclass;
		this.deptno = deptno;
		this.empno = empno;
		this.puracct = puracct;
		this.payacct = payacct;
		this.prepayacct = prepayacct;
		this.payvouacct = payvouacct;
		this.creditnum = creditnum;
		this.creditno = creditno;
		this.creditrank = creditrank;
		this.billto = billto;
		this.goodsto = goodsto;
		this.bal = bal;
		this.PMaxdays = PMaxdays;
		this.PMindays = PMindays;
		this.fsttransdt = fsttransdt;
		this.backTotal = backTotal;
		this.invoTotal = invoTotal;
		this.sendTotal = sendTotal;
		this.finTotal = finTotal;
		this.remarks = remarks;
		this.acNeed = acNeed;
		this.fcCode = fcCode;
		this.disctype = disctype;
		this.lastinvdt = lastinvdt;
		this.lastinv = lastinv;
		this.lastrecdt = lastrecdt;
		this.lastrec = lastrec;
		this.accstop = accstop;
		this.payway = payway;
		this.shiptype = shiptype;
		this.defNum1 = defNum1;
		this.defNum2 = defNum2;
		this.defInt1 = defInt1;
		this.defDate1 = defDate1;
		this.defNum3 = defNum3;
		this.defStr1 = defStr1;
		this.defStr2 = defStr2;
		this.defStr3 = defStr3;
		this.defStr4 = defStr4;
		this.defStr5 = defStr5;
		this.sprecord = sprecord;
		this.verdtm = verdtm;
		this.fsaleflg = fsaleflg;
		this.supitembarcodestart = supitembarcodestart;
		this.supitembarcodelength = supitembarcodelength;
		this.providenet = providenet;
		this.backperiod = backperiod;
		this.backrate = backrate;
		this.rate = rate;
		this.creditdays = creditdays;
		this.attrId = attrId;
		this.relaEmpno = relaEmpno;
		this.historymemo = historymemo;
		this.abctype = abctype;
		this.supplyrank = supplyrank;
		this.sysInitbal = sysInitbal;
		this.fsaledt = fsaledt;
		this.auditdt = auditdt;
		this.auditpsn = auditpsn;
		this.auditflg = auditflg;
		this.maturedate = maturedate;
		this.payday = payday;
		this.purcyc = purcyc;
		this.ordercyc = ordercyc;
		this.delday = delday;
		this.supplyRange = supplyRange;
		this.achievement = achievement;
		this.auditMemo = auditMemo;
		this.qualification = qualification;
		this.auditDt = auditDt;
		this.expFlag = expFlag;
		this.vendorType = vendorType;
		this.levelCode = levelCode;
		this.uicsendrate = uicsendrate;
		this.bankno = bankno;
		this.accountno = accountno;
		this.groupcode = groupcode;
		this.isportal = isportal;
		this.isBlacklist = isBlacklist;
		this.orgType = orgType;
		this.artiPerson = artiPerson;
		this.property = property;
		this.aptitude = aptitude;
		this.type = type;
		this.venType = venType;
		this.subpro = subpro;
		this.isblacklist = isblacklist;
		this.expressnorule = expressnorule;
		this.suppkind = suppkind;
		this.regFund = regFund;
		this.mainsell = mainsell;
		this.partsell1 = partsell1;
		this.partsell2 = partsell2;
		this.filler = filler;
		this.backreason = backreason;
		this.qfdeadline = qfdeadline;
		this.backoperater = backoperater;
		this.sqcertificateDtB = sqcertificateDtB;
		this.sqcertificateDtE = sqcertificateDtE;
	}

	// Property accessors

	public FgSupplyfileId getId() {
		return this.id;
	}

	public void setId(FgSupplyfileId id) {
		this.id = id;
	}

	public String getCompname() {
		return this.compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getRegionno() {
		return this.regionno;
	}

	public void setRegionno(String regionno) {
		this.regionno = regionno;
	}

	public String getSuppclass() {
		return this.suppclass;
	}

	public void setSuppclass(String suppclass) {
		this.suppclass = suppclass;
	}

	public String getDeptno() {
		return this.deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getEmpno() {
		return this.empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getPuracct() {
		return this.puracct;
	}

	public void setPuracct(String puracct) {
		this.puracct = puracct;
	}

	public String getPayacct() {
		return this.payacct;
	}

	public void setPayacct(String payacct) {
		this.payacct = payacct;
	}

	public String getPrepayacct() {
		return this.prepayacct;
	}

	public void setPrepayacct(String prepayacct) {
		this.prepayacct = prepayacct;
	}

	public String getPayvouacct() {
		return this.payvouacct;
	}

	public void setPayvouacct(String payvouacct) {
		this.payvouacct = payvouacct;
	}

	public Double getCreditnum() {
		return this.creditnum;
	}

	public void setCreditnum(Double creditnum) {
		this.creditnum = creditnum;
	}

	public String getCreditno() {
		return this.creditno;
	}

	public void setCreditno(String creditno) {
		this.creditno = creditno;
	}

	public String getCreditrank() {
		return this.creditrank;
	}

	public void setCreditrank(String creditrank) {
		this.creditrank = creditrank;
	}

	public String getBillto() {
		return this.billto;
	}

	public void setBillto(String billto) {
		this.billto = billto;
	}

	public String getGoodsto() {
		return this.goodsto;
	}

	public void setGoodsto(String goodsto) {
		this.goodsto = goodsto;
	}

	public Double getBal() {
		return this.bal;
	}

	public void setBal(Double bal) {
		this.bal = bal;
	}

	public Short getPMaxdays() {
		return this.PMaxdays;
	}

	public void setPMaxdays(Short PMaxdays) {
		this.PMaxdays = PMaxdays;
	}

	public Short getPMindays() {
		return this.PMindays;
	}

	public void setPMindays(Short PMindays) {
		this.PMindays = PMindays;
	}

	public Timestamp getFsttransdt() {
		return this.fsttransdt;
	}

	public void setFsttransdt(Timestamp fsttransdt) {
		this.fsttransdt = fsttransdt;
	}

	public Double getBackTotal() {
		return this.backTotal;
	}

	public void setBackTotal(Double backTotal) {
		this.backTotal = backTotal;
	}

	public Double getInvoTotal() {
		return this.invoTotal;
	}

	public void setInvoTotal(Double invoTotal) {
		this.invoTotal = invoTotal;
	}

	public Double getSendTotal() {
		return this.sendTotal;
	}

	public void setSendTotal(Double sendTotal) {
		this.sendTotal = sendTotal;
	}

	public Double getFinTotal() {
		return this.finTotal;
	}

	public void setFinTotal(Double finTotal) {
		this.finTotal = finTotal;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getAcNeed() {
		return this.acNeed;
	}

	public void setAcNeed(String acNeed) {
		this.acNeed = acNeed;
	}

	public String getFcCode() {
		return this.fcCode;
	}

	public void setFcCode(String fcCode) {
		this.fcCode = fcCode;
	}

	public String getDisctype() {
		return this.disctype;
	}

	public void setDisctype(String disctype) {
		this.disctype = disctype;
	}

	public Timestamp getLastinvdt() {
		return this.lastinvdt;
	}

	public void setLastinvdt(Timestamp lastinvdt) {
		this.lastinvdt = lastinvdt;
	}

	public Double getLastinv() {
		return this.lastinv;
	}

	public void setLastinv(Double lastinv) {
		this.lastinv = lastinv;
	}

	public Timestamp getLastrecdt() {
		return this.lastrecdt;
	}

	public void setLastrecdt(Timestamp lastrecdt) {
		this.lastrecdt = lastrecdt;
	}

	public Double getLastrec() {
		return this.lastrec;
	}

	public void setLastrec(Double lastrec) {
		this.lastrec = lastrec;
	}

	public Short getAccstop() {
		return this.accstop;
	}

	public void setAccstop(Short accstop) {
		this.accstop = accstop;
	}

	public String getPayway() {
		return this.payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	public String getShiptype() {
		return this.shiptype;
	}

	public void setShiptype(String shiptype) {
		this.shiptype = shiptype;
	}

	public Double getDefNum1() {
		return this.defNum1;
	}

	public void setDefNum1(Double defNum1) {
		this.defNum1 = defNum1;
	}

	public Double getDefNum2() {
		return this.defNum2;
	}

	public void setDefNum2(Double defNum2) {
		this.defNum2 = defNum2;
	}

	public Integer getDefInt1() {
		return this.defInt1;
	}

	public void setDefInt1(Integer defInt1) {
		this.defInt1 = defInt1;
	}

	public Timestamp getDefDate1() {
		return this.defDate1;
	}

	public void setDefDate1(Timestamp defDate1) {
		this.defDate1 = defDate1;
	}

	public Double getDefNum3() {
		return this.defNum3;
	}

	public void setDefNum3(Double defNum3) {
		this.defNum3 = defNum3;
	}

	public String getDefStr1() {
		return this.defStr1;
	}

	public void setDefStr1(String defStr1) {
		this.defStr1 = defStr1;
	}

	public String getDefStr2() {
		return this.defStr2;
	}

	public void setDefStr2(String defStr2) {
		this.defStr2 = defStr2;
	}

	public String getDefStr3() {
		return this.defStr3;
	}

	public void setDefStr3(String defStr3) {
		this.defStr3 = defStr3;
	}

	public String getDefStr4() {
		return this.defStr4;
	}

	public void setDefStr4(String defStr4) {
		this.defStr4 = defStr4;
	}

	public String getDefStr5() {
		return this.defStr5;
	}

	public void setDefStr5(String defStr5) {
		this.defStr5 = defStr5;
	}

	public String getSprecord() {
		return this.sprecord;
	}

	public void setSprecord(String sprecord) {
		this.sprecord = sprecord;
	}

	public Timestamp getVerdtm() {
		return this.verdtm;
	}

	public void setVerdtm(Timestamp verdtm) {
		this.verdtm = verdtm;
	}

	public Short getFsaleflg() {
		return this.fsaleflg;
	}

	public void setFsaleflg(Short fsaleflg) {
		this.fsaleflg = fsaleflg;
	}

	public Short getSupitembarcodestart() {
		return this.supitembarcodestart;
	}

	public void setSupitembarcodestart(Short supitembarcodestart) {
		this.supitembarcodestart = supitembarcodestart;
	}

	public Short getSupitembarcodelength() {
		return this.supitembarcodelength;
	}

	public void setSupitembarcodelength(Short supitembarcodelength) {
		this.supitembarcodelength = supitembarcodelength;
	}

	public String getProvidenet() {
		return this.providenet;
	}

	public void setProvidenet(String providenet) {
		this.providenet = providenet;
	}

	public Integer getBackperiod() {
		return this.backperiod;
	}

	public void setBackperiod(Integer backperiod) {
		this.backperiod = backperiod;
	}

	public Double getBackrate() {
		return this.backrate;
	}

	public void setBackrate(Double backrate) {
		this.backrate = backrate;
	}

	public Double getRate() {
		return this.rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Integer getCreditdays() {
		return this.creditdays;
	}

	public void setCreditdays(Integer creditdays) {
		this.creditdays = creditdays;
	}

	public Integer getAttrId() {
		return this.attrId;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	public String getRelaEmpno() {
		return this.relaEmpno;
	}

	public void setRelaEmpno(String relaEmpno) {
		this.relaEmpno = relaEmpno;
	}

	public String getHistorymemo() {
		return this.historymemo;
	}

	public void setHistorymemo(String historymemo) {
		this.historymemo = historymemo;
	}

	public String getAbctype() {
		return this.abctype;
	}

	public void setAbctype(String abctype) {
		this.abctype = abctype;
	}

	public String getSupplyrank() {
		return this.supplyrank;
	}

	public void setSupplyrank(String supplyrank) {
		this.supplyrank = supplyrank;
	}

	public Double getSysInitbal() {
		return this.sysInitbal;
	}

	public void setSysInitbal(Double sysInitbal) {
		this.sysInitbal = sysInitbal;
	}

	public Timestamp getFsaledt() {
		return this.fsaledt;
	}

	public void setFsaledt(Timestamp fsaledt) {
		this.fsaledt = fsaledt;
	}

	public Timestamp getAuditdt() {
		return this.auditdt;
	}

	public void setAuditdt(Timestamp auditdt) {
		this.auditdt = auditdt;
	}

	public String getAuditpsn() {
		return this.auditpsn;
	}

	public void setAuditpsn(String auditpsn) {
		this.auditpsn = auditpsn;
	}

	public Short getAuditflg() {
		return this.auditflg;
	}

	public void setAuditflg(Short auditflg) {
		this.auditflg = auditflg;
	}

	public Timestamp getMaturedate() {
		return this.maturedate;
	}

	public void setMaturedate(Timestamp maturedate) {
		this.maturedate = maturedate;
	}

	public Integer getPayday() {
		return this.payday;
	}

	public void setPayday(Integer payday) {
		this.payday = payday;
	}

	public Integer getPurcyc() {
		return this.purcyc;
	}

	public void setPurcyc(Integer purcyc) {
		this.purcyc = purcyc;
	}

	public Integer getOrdercyc() {
		return this.ordercyc;
	}

	public void setOrdercyc(Integer ordercyc) {
		this.ordercyc = ordercyc;
	}

	public Integer getDelday() {
		return this.delday;
	}

	public void setDelday(Integer delday) {
		this.delday = delday;
	}

	public String getSupplyRange() {
		return this.supplyRange;
	}

	public void setSupplyRange(String supplyRange) {
		this.supplyRange = supplyRange;
	}

	public String getAchievement() {
		return this.achievement;
	}

	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}

	public String getAuditMemo() {
		return this.auditMemo;
	}

	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}

	public String getQualification() {
		return this.qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Timestamp getAuditDt() {
		return this.auditDt;
	}

	public void setAuditDt(Timestamp auditDt) {
		this.auditDt = auditDt;
	}

	public Short getExpFlag() {
		return this.expFlag;
	}

	public void setExpFlag(Short expFlag) {
		this.expFlag = expFlag;
	}

	public String getVendorType() {
		return this.vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	public String getLevelCode() {
		return this.levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public Double getUicsendrate() {
		return this.uicsendrate;
	}

	public void setUicsendrate(Double uicsendrate) {
		this.uicsendrate = uicsendrate;
	}

	public String getBankno() {
		return this.bankno;
	}

	public void setBankno(String bankno) {
		this.bankno = bankno;
	}

	public String getAccountno() {
		return this.accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getGroupcode() {
		return this.groupcode;
	}

	public void setGroupcode(String groupcode) {
		this.groupcode = groupcode;
	}

	public Short getIsportal() {
		return this.isportal;
	}

	public void setIsportal(Short isportal) {
		this.isportal = isportal;
	}

	public String getIsBlacklist() {
		return this.isBlacklist;
	}

	public void setIsBlacklist(String isBlacklist) {
		this.isBlacklist = isBlacklist;
	}

	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getArtiPerson() {
		return this.artiPerson;
	}

	public void setArtiPerson(String artiPerson) {
		this.artiPerson = artiPerson;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getAptitude() {
		return this.aptitude;
	}

	public void setAptitude(String aptitude) {
		this.aptitude = aptitude;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVenType() {
		return this.venType;
	}

	public void setVenType(String venType) {
		this.venType = venType;
	}

	public String getSubpro() {
		return this.subpro;
	}

	public void setSubpro(String subpro) {
		this.subpro = subpro;
	}

	public String getIsblacklist() {
		return this.isblacklist;
	}

	public void setIsblacklist(String isblacklist) {
		this.isblacklist = isblacklist;
	}

	public String getExpressnorule() {
		return this.expressnorule;
	}

	public void setExpressnorule(String expressnorule) {
		this.expressnorule = expressnorule;
	}

	public String getSuppkind() {
		return this.suppkind;
	}

	public void setSuppkind(String suppkind) {
		this.suppkind = suppkind;
	}

	public Double getRegFund() {
		return this.regFund;
	}

	public void setRegFund(Double regFund) {
		this.regFund = regFund;
	}

	public String getMainsell() {
		return this.mainsell;
	}

	public void setMainsell(String mainsell) {
		this.mainsell = mainsell;
	}

	public String getPartsell1() {
		return this.partsell1;
	}

	public void setPartsell1(String partsell1) {
		this.partsell1 = partsell1;
	}

	public String getPartsell2() {
		return this.partsell2;
	}

	public void setPartsell2(String partsell2) {
		this.partsell2 = partsell2;
	}

	public String getFiller() {
		return this.filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public String getBackreason() {
		return this.backreason;
	}

	public void setBackreason(String backreason) {
		this.backreason = backreason;
	}

	public Timestamp getQfdeadline() {
		return this.qfdeadline;
	}

	public void setQfdeadline(Timestamp qfdeadline) {
		this.qfdeadline = qfdeadline;
	}

	public String getBackoperater() {
		return this.backoperater;
	}

	public void setBackoperater(String backoperater) {
		this.backoperater = backoperater;
	}

	public Timestamp getSqcertificateDtB() {
		return this.sqcertificateDtB;
	}

	public void setSqcertificateDtB(Timestamp sqcertificateDtB) {
		this.sqcertificateDtB = sqcertificateDtB;
	}

	public Timestamp getSqcertificateDtE() {
		return this.sqcertificateDtE;
	}

	public void setSqcertificateDtE(Timestamp sqcertificateDtE) {
		this.sqcertificateDtE = sqcertificateDtE;
	}

}