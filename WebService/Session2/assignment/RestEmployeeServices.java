package assignment;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@Path("/employee")
public class RestEmployeeServices {

	/**
	 * Web Service to get employee by its id
	 * @param id - The id of the employee
	 * @return - Response of the web service
	 */
	@GET
	@Path("/getEmployeeById")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployeeById(@QueryParam("id") int id) {
		//Getting employee list
		List<Employee> employeeList = EmployeeDAO.getObject().getEmployeeById(id);
		Gson gson = null;
		String employeesInJson=null;
		try{
			gson =  new Gson();
			employeesInJson = gson.toJson(employeeList);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return employeesInJson;
	}

	/**
	 * Web service to get employee by its name
	 * @param name - The name of the employee
	 * @return - Response of the web service
	 */
	@GET
	@Path("/getEmployeeByName")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployeeByName(@QueryParam("name") String name) {
		//Getting employee list
		List<Employee> employeeList = EmployeeDAO.getObject().getEmployeeByName(name);
		Gson gson = null;
		String employeesInJson=null;
		try{
			gson =  new Gson();
			employeesInJson = gson.toJson(employeeList);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return employeesInJson;
	}

	/**
	 * Web Service to get details of all the employees
	 * @return Response of the web service 
	 */
	@GET
	@Path("/getEmployees")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployees() {

		//Getting employee list
		List<Employee> employeeList = EmployeeDAO.getObject().getEmployees();
		Gson gson = null;
		String employeesInJson=null;
		try{
			gson =  new Gson();
			employeesInJson = gson.toJson(employeeList);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return employeesInJson;
	}

	/**
	 * Web service to delete employee record by id
	 * @param id - The id of the employee
	 * @return - Result if the record is successfully deleted or not
	 */
	@DELETE
	@Path("/deleteEmployee")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteEmployees(@QueryParam("id") int id) {
		boolean result = EmployeeDAO.getObject().deleteEmployee(id);
		if(result) {
			return "Employee record deleted successfully";
		} else {
			return "Employee record not found";
		}
	}

	/**
	 * Web service to create a employee record
	 * @param employee - The employee object to be inserted
	 * @return - Result if the record is successfully added or not
	 */
	@POST
	@Path("/insertEmployee")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String insertEmployees(String jsonStr) {

		Gson gson = new Gson();
		JsonElement element = gson.fromJson(jsonStr, JsonElement.class);
		JsonObject jsonObject = element.getAsJsonObject();
		int employeeID = Integer.parseInt(jsonObject.get("id").getAsString());
		String employeeName = jsonObject.get("name").getAsString();
		int employeeAge = Integer.parseInt(jsonObject.get("age").toString());
		int employeeSalary = Integer.parseInt(jsonObject.get("salary").toString());
		String employeeCity = jsonObject.get("city").getAsString();
		Employee employee = new Employee();
		employee.setAge(employeeAge);
		employee.setId(employeeID);
		employee.setName(employeeName);
		employee.setCity(employeeCity);
		employee.setSalary(employeeSalary);
		int result = EmployeeDAO.getObject().insertEmployee(employee);
		if(result != 0) {
			return "Employee record created successfully";
		} else {
			return "Error in employee details";
		}
	}
}
