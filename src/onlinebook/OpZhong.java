package onlinebook;

import java.util.List;
import javaee.jsf.StuEntities.StudentEO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

//������һ�� ��״̬�ỰBean��ʵ��ʵ��ĸ��ֲ���
@Stateless
public class OpZhong {
	//@PersistenceContext�����Ա�ע�ķ�ʽע��һ��ʵ������������еġ�jsf_example������persistence.xml�ж���ĳ־û���Ԫ������
	@PersistenceContext(unitName = "jsf_example")
	private EntityManager em;

    public OpZhong() {
        
    }
    public void jian1(LianEO x)
    {
    	em.persist(x);
    }
    public void jian2(OrderEO x)
    {
    	em.persist(x);
    }
}