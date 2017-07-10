package test;

import java.sql.Date;

import com.magazine.bo.CommentAndReview;
import com.magazine.service.ManagerService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:/mvc-dispacther-servlet.xml"})
public class ManagerServiceTest {

    @Autowired
    @Qualifier("managerService")
    ManagerService managerService;
    
    private CommentAndReview prepareCommentAndReview(){
    	CommentAndReview cust = new CommentAndReview();
    	cust.setComment("comment");
    	cust.setReview("review");
    	cust.setCreateOn(new Date(new java.util.Date().getTime()));
    	cust.setCreateBy("TEST");
    	return cust;
    }
    
    @Test
    public void test_ml_always_return_true() {
    	CommentAndReview cust = prepareCommentAndReview();
    	managerService.createCommentAndReview(cust);
    	assertNotNull(cust.getCommentId());
    }
}
