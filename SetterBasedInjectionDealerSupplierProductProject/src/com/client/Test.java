package com.client;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Dealer;
import com.model.Product;
import com.model.Supplier;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Product p=ac.getBean("prd",Product.class);
		//System.out.println(p);
		System.out.println("Product Id:- "+p.getProductId());
		System.out.println("Product Name:- "+p.getProductName());
		System.out.println("Product Price:- "+p.getProductPrice());
		List<Dealer>dlr=p.getLd();
		for (Dealer dealer : dlr) {
			System.out.println("Dealer Id:- "+dealer.getDealerId());
			System.out.println("Dealer Name:- "+dealer.getDealerName());
			System.out.println("Dealer Mobno:- "+dealer.getDealerMobno());
		}
		Map<Integer, Supplier>spl=p.getMs();
		Set<Integer>keys=spl.keySet();
		for (Integer k : keys) {
			Supplier sup=spl.get(k);
			System.out.println("Supplier Id:- "+sup.getSupId());
			System.out.println("Supplier Name:- "+sup.getSupName());
			System.out.println("Supplier Mobno:- "+sup.getSupMobno());
			List<String>city=sup.getCities();
			for (String c : city) {
				System.out.println("Supplier city:- "+c);
			}
		}

	}
}
