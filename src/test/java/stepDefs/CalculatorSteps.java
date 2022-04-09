package stepDefs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {
	int result =0;
	
	@Given("I have a Calcultor")
	public void i_have_a_calcultor() {
	    // Write code here that turns the phrase above into concrete actions
	 
		System.out.println("Inside Calculator");
		
	}

	@When("I add {int} & {int}")
	public void i_add(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
	    
		result = num1 + num2;
	}

	@Then("I should be get the result as {int}")
	public void i_should_be_get_the_result_as(int res) {
	    // Write code here that turns the phrase above into concrete actions
	    
	Assert.assertEquals(res, result);		
		
	}

	@When("I sub {int} & {int}")
	public void i_sub(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
	    
		result = num1 - num2;
	}

	@When("I add {int} , {int} & {int}")
	public void i_add(int num1, int num2, int num3) {
	    // Write code here that turns the phrase above into concrete actions
	    
		result = num1+num2+num3;
	}
	
	@When("I add below numbers")
	public void i_add_below_numbers(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		int rows = dataTable.height();
		
		for(int i=0;i<rows;i++) {
			
			result =result + Integer.parseInt(dataTable.cell(i, 0));
		}
		
	}
	
	//List
	@When("I add below numbers using List")
	public void i_add_below_numbers_using_list(List<Integer>numbers) {
	    // Write code here that turns the phrase above into concrete actions
	   
		for(Integer num: numbers) {
			
			 result =result +num;
		}
		
	}

	@When("I order below Items")
	public void i_order_below_items(Map<String, Integer>priceList) {
	  
		for(String key: priceList.keySet()) {
			
			result = result + priceList.get(key);
			
		}
	
	
	}
	
	@When("I order below Items and quantity")
	public void i_order_below_items_and_quantity(io.cucumber.datatable.DataTable dataTable) {
	   
int rows = dataTable.height();
		
		for(int i=0;i<rows;i++) {
			
int qnt =Integer.parseInt(dataTable.cell(i, 1));
int val =Integer.parseInt(dataTable.cell(i, 2));

//			result =result + Integer.parseInt(dataTable.cell(i, 1))* Integer.parseInt(dataTable.cell(i, 2));
	
		result= result + qnt * val;

		}
		
		
		
	}
	
}
