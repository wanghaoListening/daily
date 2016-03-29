package com.haothink.designpattern.template.hibernate;

public class HibernateTemplate {

	private void executeWithNativeSession(HibernateCallback callback){
		Session s = null;  
		try{  
			s = getSession();  
			s.beginTransaction();  

			//ִ�нӿڵķ����������Ǹ���Ҫ��ʵ��������ӿھ͵�ʵ���ⷽ�����൱���ⷽ���嵽�˴˴�  
			callback.doInHibernate(s);  

			s.getTransaction().commit();  

		}catch(Exception e){  
			s.beginTransaction().rollback();  
		}finally{  

		}  
	}

	private Session getSession() {  
		return new Session();  
	}  
	
	public void save(final Object o){
		new HibernateTemplate().executeWithNativeSession(new HibernateCallback() {
			
			@Override
			public void doInHibernate(Session s) {
				s.save(o);
				
			}
		});
	}
}
