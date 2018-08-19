package com.suntaragali.restapi.bdd.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetCallBDD {
	
	@Test
	public void  test_numberOfCircuitsFor2017_Season() {
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
			then().
				assertThat().
				statusCode(200).
				and().
				body("MRData.CircuitTable.Circuits.cicuitId", hasSize(20)).
				and().
				header("content-length", equalTo("4552"));
			}
	

}
