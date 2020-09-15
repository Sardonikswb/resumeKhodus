package by.khodus.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLog {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * by.khodus.dao.MobileDaoImpl.findAll())")
    public void pointCutService() {
    }

    @Before("pointCutService()")
    public void beforeUseService() {
        logger.info("TRYING TO FIND ALL MOBILES");
    }

    @After("pointCutService()")
    public void afterUseService() {
        logger.info("SUCCESS SERVICE");
    }


}
