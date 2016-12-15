package com.ffp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ffp.entities.Pais;
import com.ffp.repositories.PaisRepository;

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
    	
    	Pais pais = new Pais("New", "NewPaisano", "Newidioma");
    	paisRepository.save(pais);
    	
    }
}
