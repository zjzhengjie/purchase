package com.wantdo.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wantdo.domain.FgSupplyfile;
import com.wantdo.domain.FgSupplyfileId;

/**
 * A data access object (DAO) providing persistence and search support for
 * FgSupplyfile entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.wantdo.domain.FgSupplyfile
 * @author MyEclipse Persistence Tools
 */
public class FgSupplyfileDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(FgSupplyfileDAO.class);
	// property constants
	public static final String COMPNAME = "compname";
	public static final String REGIONNO = "regionno";
	public static final String SUPPCLASS = "suppclass";
	public static final String DEPTNO = "deptno";
	public static final String EMPNO = "empno";
	public static final String PURACCT = "puracct";
	public static final String PAYACCT = "payacct";
	public static final String PREPAYACCT = "prepayacct";
	public static final String PAYVOUACCT = "payvouacct";
	public static final String CREDITNUM = "creditnum";
	public static final String CREDITNO = "creditno";
	public static final String CREDITRANK = "creditrank";
	public static final String BILLTO = "billto";
	public static final String GOODSTO = "goodsto";
	public static final String BAL = "bal";
	public static final String _PMAXDAYS = "PMaxdays";
	public static final String _PMINDAYS = "PMindays";
	public static final String BACK_TOTAL = "backTotal";
	public static final String INVO_TOTAL = "invoTotal";
	public static final String SEND_TOTAL = "sendTotal";
	public static final String FIN_TOTAL = "finTotal";
	public static final String REMARKS = "remarks";
	public static final String AC_NEED = "acNeed";
	public static final String FC_CODE = "fcCode";
	public static final String DISCTYPE = "disctype";
	public static final String LASTINV = "lastinv";
	public static final String LASTREC = "lastrec";
	public static final String ACCSTOP = "accstop";
	public static final String PAYWAY = "payway";
	public static final String SHIPTYPE = "shiptype";
	public static final String DEF_NUM1 = "defNum1";
	public static final String DEF_NUM2 = "defNum2";
	public static final String DEF_INT1 = "defInt1";
	public static final String DEF_NUM3 = "defNum3";
	public static final String DEF_STR1 = "defStr1";
	public static final String DEF_STR2 = "defStr2";
	public static final String DEF_STR3 = "defStr3";
	public static final String DEF_STR4 = "defStr4";
	public static final String DEF_STR5 = "defStr5";
	public static final String SPRECORD = "sprecord";
	public static final String FSALEFLG = "fsaleflg";
	public static final String SUPITEMBARCODESTART = "supitembarcodestart";
	public static final String SUPITEMBARCODELENGTH = "supitembarcodelength";
	public static final String PROVIDENET = "providenet";
	public static final String BACKPERIOD = "backperiod";
	public static final String BACKRATE = "backrate";
	public static final String RATE = "rate";
	public static final String CREDITDAYS = "creditdays";
	public static final String ATTR_ID = "attrId";
	public static final String RELA_EMPNO = "relaEmpno";
	public static final String HISTORYMEMO = "historymemo";
	public static final String ABCTYPE = "abctype";
	public static final String SUPPLYRANK = "supplyrank";
	public static final String SYS_INITBAL = "sysInitbal";
	public static final String AUDITPSN = "auditpsn";
	public static final String AUDITFLG = "auditflg";
	public static final String PAYDAY = "payday";
	public static final String PURCYC = "purcyc";
	public static final String ORDERCYC = "ordercyc";
	public static final String DELDAY = "delday";
	public static final String SUPPLY_RANGE = "supplyRange";
	public static final String ACHIEVEMENT = "achievement";
	public static final String AUDIT_MEMO = "auditMemo";
	public static final String QUALIFICATION = "qualification";
	public static final String EXP_FLAG = "expFlag";
	public static final String VENDOR_TYPE = "vendorType";
	public static final String LEVEL_CODE = "levelCode";
	public static final String UICSENDRATE = "uicsendrate";
	public static final String BANKNO = "bankno";
	public static final String ACCOUNTNO = "accountno";
	public static final String GROUPCODE = "groupcode";
	public static final String ISPORTAL = "isportal";
	public static final String IS_BLACKLIST = "isBlacklist";
	public static final String ORG_TYPE = "orgType";
	public static final String ARTI_PERSON = "artiPerson";
	public static final String PROPERTY = "property";
	public static final String APTITUDE = "aptitude";
	public static final String TYPE = "type";
	public static final String VEN_TYPE = "venType";
	public static final String SUBPRO = "subpro";
	public static final String ISBLACKLIST = "isblacklist";
	public static final String EXPRESSNORULE = "expressnorule";
	public static final String SUPPKIND = "suppkind";
	public static final String REG_FUND = "regFund";
	public static final String MAINSELL = "mainsell";
	public static final String PARTSELL1 = "partsell1";
	public static final String PARTSELL2 = "partsell2";
	public static final String FILLER = "filler";
	public static final String BACKREASON = "backreason";
	public static final String BACKOPERATER = "backoperater";

	protected void initDao() {
		// do nothing
	}

	public void save(FgSupplyfile transientInstance) {
		log.debug("saving FgSupplyfile instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FgSupplyfile persistentInstance) {
		log.debug("deleting FgSupplyfile instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FgSupplyfile findById(com.wantdo.domain.FgSupplyfileId id) {
		log.debug("getting FgSupplyfile instance with id: " + id);
		try {
			FgSupplyfile instance = (FgSupplyfile) getHibernateTemplate().get(
					"com.wantdo.domain.FgSupplyfile", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FgSupplyfile instance) {
		log.debug("finding FgSupplyfile instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding FgSupplyfile instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from FgSupplyfile as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCompname(Object compname) {
		return findByProperty(COMPNAME, compname);
	}

	public List findByRegionno(Object regionno) {
		return findByProperty(REGIONNO, regionno);
	}

	public List findBySuppclass(Object suppclass) {
		return findByProperty(SUPPCLASS, suppclass);
	}

	public List findByDeptno(Object deptno) {
		return findByProperty(DEPTNO, deptno);
	}

	public List findByEmpno(Object empno) {
		return findByProperty(EMPNO, empno);
	}

	public List findByPuracct(Object puracct) {
		return findByProperty(PURACCT, puracct);
	}

	public List findByPayacct(Object payacct) {
		return findByProperty(PAYACCT, payacct);
	}

	public List findByPrepayacct(Object prepayacct) {
		return findByProperty(PREPAYACCT, prepayacct);
	}

	public List findByPayvouacct(Object payvouacct) {
		return findByProperty(PAYVOUACCT, payvouacct);
	}

	public List findByCreditnum(Object creditnum) {
		return findByProperty(CREDITNUM, creditnum);
	}

	public List findByCreditno(Object creditno) {
		return findByProperty(CREDITNO, creditno);
	}

	public List findByCreditrank(Object creditrank) {
		return findByProperty(CREDITRANK, creditrank);
	}

	public List findByBillto(Object billto) {
		return findByProperty(BILLTO, billto);
	}

	public List findByGoodsto(Object goodsto) {
		return findByProperty(GOODSTO, goodsto);
	}

	public List findByBal(Object bal) {
		return findByProperty(BAL, bal);
	}

	public List findByPMaxdays(Object PMaxdays) {
		return findByProperty(_PMAXDAYS, PMaxdays);
	}

	public List findByPMindays(Object PMindays) {
		return findByProperty(_PMINDAYS, PMindays);
	}

	public List findByBackTotal(Object backTotal) {
		return findByProperty(BACK_TOTAL, backTotal);
	}

	public List findByInvoTotal(Object invoTotal) {
		return findByProperty(INVO_TOTAL, invoTotal);
	}

	public List findBySendTotal(Object sendTotal) {
		return findByProperty(SEND_TOTAL, sendTotal);
	}

	public List findByFinTotal(Object finTotal) {
		return findByProperty(FIN_TOTAL, finTotal);
	}

	public List findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	public List findByAcNeed(Object acNeed) {
		return findByProperty(AC_NEED, acNeed);
	}

	public List findByFcCode(Object fcCode) {
		return findByProperty(FC_CODE, fcCode);
	}

	public List findByDisctype(Object disctype) {
		return findByProperty(DISCTYPE, disctype);
	}

	public List findByLastinv(Object lastinv) {
		return findByProperty(LASTINV, lastinv);
	}

	public List findByLastrec(Object lastrec) {
		return findByProperty(LASTREC, lastrec);
	}

	public List findByAccstop(Object accstop) {
		return findByProperty(ACCSTOP, accstop);
	}

	public List findByPayway(Object payway) {
		return findByProperty(PAYWAY, payway);
	}

	public List findByShiptype(Object shiptype) {
		return findByProperty(SHIPTYPE, shiptype);
	}

	public List findByDefNum1(Object defNum1) {
		return findByProperty(DEF_NUM1, defNum1);
	}

	public List findByDefNum2(Object defNum2) {
		return findByProperty(DEF_NUM2, defNum2);
	}

	public List findByDefInt1(Object defInt1) {
		return findByProperty(DEF_INT1, defInt1);
	}

	public List findByDefNum3(Object defNum3) {
		return findByProperty(DEF_NUM3, defNum3);
	}

	public List findByDefStr1(Object defStr1) {
		return findByProperty(DEF_STR1, defStr1);
	}

	public List findByDefStr2(Object defStr2) {
		return findByProperty(DEF_STR2, defStr2);
	}

	public List findByDefStr3(Object defStr3) {
		return findByProperty(DEF_STR3, defStr3);
	}

	public List findByDefStr4(Object defStr4) {
		return findByProperty(DEF_STR4, defStr4);
	}

	public List findByDefStr5(Object defStr5) {
		return findByProperty(DEF_STR5, defStr5);
	}

	public List findBySprecord(Object sprecord) {
		return findByProperty(SPRECORD, sprecord);
	}

	public List findByFsaleflg(Object fsaleflg) {
		return findByProperty(FSALEFLG, fsaleflg);
	}

	public List findBySupitembarcodestart(Object supitembarcodestart) {
		return findByProperty(SUPITEMBARCODESTART, supitembarcodestart);
	}

	public List findBySupitembarcodelength(Object supitembarcodelength) {
		return findByProperty(SUPITEMBARCODELENGTH, supitembarcodelength);
	}

	public List findByProvidenet(Object providenet) {
		return findByProperty(PROVIDENET, providenet);
	}

	public List findByBackperiod(Object backperiod) {
		return findByProperty(BACKPERIOD, backperiod);
	}

	public List findByBackrate(Object backrate) {
		return findByProperty(BACKRATE, backrate);
	}

	public List findByRate(Object rate) {
		return findByProperty(RATE, rate);
	}

	public List findByCreditdays(Object creditdays) {
		return findByProperty(CREDITDAYS, creditdays);
	}

	public List findByAttrId(Object attrId) {
		return findByProperty(ATTR_ID, attrId);
	}

	public List findByRelaEmpno(Object relaEmpno) {
		return findByProperty(RELA_EMPNO, relaEmpno);
	}

	public List findByHistorymemo(Object historymemo) {
		return findByProperty(HISTORYMEMO, historymemo);
	}

	public List findByAbctype(Object abctype) {
		return findByProperty(ABCTYPE, abctype);
	}

	public List findBySupplyrank(Object supplyrank) {
		return findByProperty(SUPPLYRANK, supplyrank);
	}

	public List findBySysInitbal(Object sysInitbal) {
		return findByProperty(SYS_INITBAL, sysInitbal);
	}

	public List findByAuditpsn(Object auditpsn) {
		return findByProperty(AUDITPSN, auditpsn);
	}

	public List findByAuditflg(Object auditflg) {
		return findByProperty(AUDITFLG, auditflg);
	}

	public List findByPayday(Object payday) {
		return findByProperty(PAYDAY, payday);
	}

	public List findByPurcyc(Object purcyc) {
		return findByProperty(PURCYC, purcyc);
	}

	public List findByOrdercyc(Object ordercyc) {
		return findByProperty(ORDERCYC, ordercyc);
	}

	public List findByDelday(Object delday) {
		return findByProperty(DELDAY, delday);
	}

	public List findBySupplyRange(Object supplyRange) {
		return findByProperty(SUPPLY_RANGE, supplyRange);
	}

	public List findByAchievement(Object achievement) {
		return findByProperty(ACHIEVEMENT, achievement);
	}

	public List findByAuditMemo(Object auditMemo) {
		return findByProperty(AUDIT_MEMO, auditMemo);
	}

	public List findByQualification(Object qualification) {
		return findByProperty(QUALIFICATION, qualification);
	}

	public List findByExpFlag(Object expFlag) {
		return findByProperty(EXP_FLAG, expFlag);
	}

	public List findByVendorType(Object vendorType) {
		return findByProperty(VENDOR_TYPE, vendorType);
	}

	public List findByLevelCode(Object levelCode) {
		return findByProperty(LEVEL_CODE, levelCode);
	}

	public List findByUicsendrate(Object uicsendrate) {
		return findByProperty(UICSENDRATE, uicsendrate);
	}

	public List findByBankno(Object bankno) {
		return findByProperty(BANKNO, bankno);
	}

	public List findByAccountno(Object accountno) {
		return findByProperty(ACCOUNTNO, accountno);
	}

	public List findByGroupcode(Object groupcode) {
		return findByProperty(GROUPCODE, groupcode);
	}

	public List findByIsportal(Object isportal) {
		return findByProperty(ISPORTAL, isportal);
	}

	public List findByIsBlacklist(Object isBlacklist) {
		return findByProperty(IS_BLACKLIST, isBlacklist);
	}

	public List findByOrgType(Object orgType) {
		return findByProperty(ORG_TYPE, orgType);
	}

	public List findByArtiPerson(Object artiPerson) {
		return findByProperty(ARTI_PERSON, artiPerson);
	}

	public List findByProperty(Object property) {
		return findByProperty(PROPERTY, property);
	}

	public List findByAptitude(Object aptitude) {
		return findByProperty(APTITUDE, aptitude);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByVenType(Object venType) {
		return findByProperty(VEN_TYPE, venType);
	}

	public List findBySubpro(Object subpro) {
		return findByProperty(SUBPRO, subpro);
	}

	public List findByIsblacklist(Object isblacklist) {
		return findByProperty(ISBLACKLIST, isblacklist);
	}

	public List findByExpressnorule(Object expressnorule) {
		return findByProperty(EXPRESSNORULE, expressnorule);
	}

	public List findBySuppkind(Object suppkind) {
		return findByProperty(SUPPKIND, suppkind);
	}

	public List findByRegFund(Object regFund) {
		return findByProperty(REG_FUND, regFund);
	}

	public List findByMainsell(Object mainsell) {
		return findByProperty(MAINSELL, mainsell);
	}

	public List findByPartsell1(Object partsell1) {
		return findByProperty(PARTSELL1, partsell1);
	}

	public List findByPartsell2(Object partsell2) {
		return findByProperty(PARTSELL2, partsell2);
	}

	public List findByFiller(Object filler) {
		return findByProperty(FILLER, filler);
	}

	public List findByBackreason(Object backreason) {
		return findByProperty(BACKREASON, backreason);
	}

	public List findByBackoperater(Object backoperater) {
		return findByProperty(BACKOPERATER, backoperater);
	}

	public List findAll() {
		log.debug("finding all FgSupplyfile instances");
		try {
			String queryString = "from FgSupplyfile";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FgSupplyfile merge(FgSupplyfile detachedInstance) {
		log.debug("merging FgSupplyfile instance");
		try {
			FgSupplyfile result = (FgSupplyfile) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FgSupplyfile instance) {
		log.debug("attaching dirty FgSupplyfile instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FgSupplyfile instance) {
		log.debug("attaching clean FgSupplyfile instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FgSupplyfileDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (FgSupplyfileDAO) ctx.getBean("FgSupplyfileDAO");
	}
}