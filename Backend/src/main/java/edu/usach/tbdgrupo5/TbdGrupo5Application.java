package edu.usach.tbdgrupo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan({"edu.usach.tbdgrupo5", "edu.usach.tbdgrupo5.rest"})
@EntityScan("edu.usach.tbdgrupo5.entities")
@EnableJpaRepositories("edu.usach.tbdgrupo5.repository")
@EnableScheduling
public class TbdGrupo5Application {
	
	
	public static void main(String[] args) {
		/*System.out.println("Empezar\n");
		MongoConnection mc = new MongoConnection("tweets", "tweetsPrueba");
		mc.connect();
		mc.mapReduce();
		Lucene lucene = new Lucene(mc);
		lucene.indexCreate();
		lucene.indexSearch("yandel");
		System.out.println(lucene.getIdList());*/

		/*
		Neo4j neo = new Neo4j();
		neo.connect("bolt://localhost", "neo4j", "root");
		neo.deleteAll();
		neo.crearEjemplo();
		//neo.getPersonNodes();
		//neo.getGameNodes();
		//neo.getPlaysRel();
		neo.getNodes();
		neo.getPlaysRelSingleList();
		neo.disconnect();
		*/


		SpringApplication.run(TbdGrupo5Application.class, args);
	}
	
}
