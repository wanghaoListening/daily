package com.haothink.designpattern.proxy.jdkproxyprinciple;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

/*
 * jdk��̬����ʵ��˼·
 * 1����һ��Դ�루��̬��������
 * 2����Դ�루JDK Compiler API��,(�����µĴ�����)
 * 3�������load���ڴ��С�����һ���µĶ���
 * return���ش������
 * */
public class Proxy {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object newProxyInstance(Class infec,InvocationHandler h) throws Exception{
		String rt = "\r\n";
		
		String methodStr = "";
		for(Method m : infec.getMethods()){
			methodStr +=
			"	@Override" + rt +
			"	public void "+m.getName()+"() {" + rt +
			"      try{" +rt+
			"        Method md = "+infec.getName()+".class.getMethod(\""	
							+m.getName()+"\");"+ rt +
			" 	     h.invoke(this, md);"+ rt +	
			"      }"+ rt +	
			"      catch(Exception e){"+ rt +
			"            e.printStackTrace();"+ rt +
			"      }"+ rt +
			"	}";
		}
		String str = 
		"package com.haothink123.proxy;" + rt +	
		"import "+infec.getName()+";" + rt +
		"import java.lang.reflect.Method;" + rt +
		"import com.haothink123.proxy.jdkproxy.InvocationHandler;" + rt +
		"public class $Proxy0 implements "+infec.getName()+"{" + rt +
			
		"private "+infec.getName()+" movie;" + rt +
		"private InvocationHandler h;" + rt +	
			
		"	public $Proxy0() {" + rt +
		"		super();" + rt +
				
		"	}" + rt +
			
		"	public $Proxy0(InvocationHandler h) {" + rt +
		"		super();" + rt +
		"		this.h = h;" + rt +
		"	}" + rt +

		methodStr + rt +

		"}" + rt ;
		//�õ���ǰӦ�õ�·��
		String filename = System.getProperty("user.dir")
				+"/bin/com/haothink123/proxy/$Proxy0.java";
		//����һ��Java�ļ�
		File file = new File(filename);
		FileOutputStream fin = new FileOutputStream(file);
		fin.write(str.getBytes());
		fin.close();
		
		//����Java�ļ�
		//�õ�������(����������javac������ͬ)
		JavaCompiler  complier = ToolProvider.getSystemJavaCompiler();
		//�õ��ļ�������
		StandardJavaFileManager sjf = complier.getStandardFileManager(null, null, null);
		//��ȡ�ļ�
		Iterable it = sjf.getJavaFileObjects(filename);
		//�õ���������
		CompilationTask ct = complier.getTask(null, sjf, null, null, null, it);
		ct.call();//����
		sjf.close();
		
		//load ���ڴ浱��
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		//��class�ļ�load���ڴ浱��
		Class c = cl.loadClass("com.haothink123.proxy.$Proxy0");

		//���ݹ�����������������
		Constructor ctr = c.getConstructor(InvocationHandler.class);
		
		return ctr.newInstance(h);
		
	}
}
