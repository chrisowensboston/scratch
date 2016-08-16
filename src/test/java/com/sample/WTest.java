package com.sample.test;


import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.rules.ExpectedException;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.runner.RunWith;
import org.junit.Rule;
import org.junit.Assert;
import org.junit.Test;



@RunWith(Arquillian.class)
public class WTest {

                @Deployment
		protected static WebArchive createDeployment() {
			WebArchive war = ShrinkWrap.create(WebArchive.class);
			//			war.addAsWebInfResource("test-openejb-jar.xml", "openejb-jar.xml");
			//			war.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
			return war;
		}

		@Rule
		public ExpectedException thrown = ExpectedException.none();

	
	@Test
	public void alwaysPasses() {
		System.out.println("Hi!");
		Assert.assertTrue("This will never print", true);
		
	}
		
		
}
