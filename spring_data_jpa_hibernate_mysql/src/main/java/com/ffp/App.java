package com.ffp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ffp.entities.Pais;
import com.ffp.entities.Provincia;
import com.ffp.repositories.PaisRepository;
import com.ffp.repositories.ProvinciaRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext contexto = new ClassPathXmlApplicationContext("/spring/app-context.xml");
    	PaisRepository paisRepository = (PaisRepository) contexto.getBean("paisRepository");
    	ProvinciaRepository provinciaRepository = (ProvinciaRepository) contexto.getBean("provinciaRepository");
    	
    	 
    	
    	Pais pais = new Pais("paisConProvincias");
    	paisRepository.save(pais);
//    	List<Pais>l = paisRepository.findAll();
    	
    	Provincia provincia = new Provincia("prov1",pais);
    	Provincia provincia1 = new Provincia("prov2",pais);
    	Provincia provincia2 = new Provincia("prov3",pais);
    	
    	provinciaRepository.save(provincia);
    	provinciaRepository.save(provincia1);
    	provinciaRepository.save(provincia2);
    	
    	List<Provincia>lProv = new ArrayList<Provincia>();
    	lProv.add(provincia);
    	lProv.add(provincia1);
    	lProv.add(provincia2);

    	
    	
    	Pais pais2 = new Pais("paisSinProvincias");
    	pais2.setListProvincia(lProv);
    	paisRepository.save(pais2);
    	
//    	List<Provincia> ml  = pais2.getListProvincia();
//    	for (Provincia paux : ml) {
//			System.out.println(paux.getNombre()+paux.getIdProvincia());
//		}
//    	
    	
    	Pais pais3 = paisRepository.findOne(pais.getId());
    	
    	List<Provincia> ml  = pais3.getListProvincia();
    	for (Provincia paux : ml) {
			System.out.println(paux.toString());
		}
    }
}
