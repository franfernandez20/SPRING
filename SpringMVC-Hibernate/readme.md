	/** Integracion MVC con hibernate sobre bd mysql**/


Clases:

		PersonDao --> Interface con operaciones tipo CRUD 
		PersonDaoImpl --> La implimentacion de estas operaciones usando un objeto tipo session  :  - delega en el para la operaciones de acceso a la BD)
						  Es el Repository														   - tiene operaciones que usan querys directamente
		
		PersonService --> Interface con operaciones tipo CRUD tambien 
		PersonServiceImpl --> Es otra "especie de interface" que te abstrae de la clase PersonDao
							  Utiliza un PersonDao y sobre el realiza las operaciones tipo CRUD (simplemente invoca a sus metodos) 
							  Anotado como Service
							  
		Person --> clase entidad
		
		PersonController --> Utiliza un PersonService con el que pide los objetos tipo Person a la BD 
		
XML config:

		web.xml --> creado por spring. Aqui se referencia a servlet-contex.xml que es donde si ponemos datos de config
		
		servlet-contex.xml --> · Al spring preparar el proyecto mvc crea la config para encontrar las vistas (en resources )
							   · Para configurar  el accso a la BD hay que crear unos beans :  - dataSource --> Es de una classe especial para apache servlet class="org.apache.commons.dbcp.BasicDataSource"
																							   - sessionFactory --> Se le indica la clase de sessionFactory q es class="org.springframework.orm.hibernate4.LocalSessionFactoryBean"
																												  Se referencia al dataSource
																												  Se le indica donde estaran las entidades. En este caso \com.ffp.spring.entities.Person
																												  Se le indica el dialecto de la BD y otras propiedades  de hibernate
																							 
																							   - PersonDao --> Es el que utiliza un sessionFactory por tanto referencia al bean anterior 
																							   - PersonService --> Este a su vez usa un PersonDao por tanto lo referencia.
																							 
																							   - TransactionManager --> Este bean referenciara tambien a sessionFactory
							  
							  · la etiqueta <context:component-scan base-package="com.ffp.spring" /> para indicar donde buscara los componentes (@Repositry , @Service , @ Entitty)
							  
POM : 



		Al crear el proyecto para mvc spring ya incluye las dependecias necesarias
		Para la parte de modelo se añaden las siguientes:
															-	<!-- Spring ORM -->
															
																		<groupId>org.springframework</groupId>
																		<artifactId>spring-orm</artifactId>
																	
																	
																<!-- Hibernate -->
																
																		<groupId>org.hibernate</groupId>
																		<artifactId>hibernate-core</artifactId>
																	
																	
																		<groupId>org.hibernate</groupId>
																		<artifactId>hibernate-entitymanager</artifactId>
																	
																	
																<!-- Apache Commons DBCP -->
																	
																		
																		<artifactId>commons-dbcp</artifactId>
																		<version>1.4</version>
																
																	
																<!-- mysql driven  -->															
																		
																		<artifactId>mysql-connector-java</artifactId>
																		
	
		
		
		
		