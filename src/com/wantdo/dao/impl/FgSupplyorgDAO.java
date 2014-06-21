package com.wantdo.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wantdo.domain.FgSupplyorg;

/**
 	* A data access object (DAO) providing persistence and search support for FgSupplyorg entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.wantdo.domain.FgSupplyorg
  * @author MyEclipse Persistence Tools 
 */
public class FgSupplyorgDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(FgSupplyorgDAO.class);
		//property constants



	protected void initDao() {
		//do nothing
	}
    
    public void save(FgSupplyorg transientInstance) {
        log.debug("saving FgSupplyorg instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(FgSupplyorg persistentInstance) {
        log.debug("deleting FgSupplyorg instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public FgSupplyorg findById( java.lang.String id) {
        log.debug("getting FgSupplyorg instance with id: " + id);
        try {
            FgSupplyorg instance = (FgSupplyorg) getHibernateTemplate()
                    .get("com.wantdo.domain.FgSupplyorg", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(FgSupplyorg instance) {
        log.debug("finding FgSupplyorg instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding FgSupplyorg instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from FgSupplyorg as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all FgSupplyorg instances");
		try {
			String queryString = "from FgSupplyorg";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public FgSupplyorg merge(FgSupplyorg detachedInstance) {
        log.debug("merging FgSupplyorg instance");
        try {
            FgSupplyorg result = (FgSupplyorg) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(FgSupplyorg instance) {
        log.debug("attaching dirty FgSupplyorg instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(FgSupplyorg instance) {
        log.debug("attaching clean FgSupplyorg instance");
        try {
                      	getHibernateTemplate().lock(instance, LockMode.NONE);
                        log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static FgSupplyorgDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (FgSupplyorgDAO) ctx.getBean("FgSupplyorgDAO");
	}
}