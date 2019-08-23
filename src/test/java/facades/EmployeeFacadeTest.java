/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Employee;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renz
 */
//public class EmployeeFacadeTest {
//
//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//    EmployeeFacade facade = EmployeeFacade.getFacadeExample(emf);
//
//    public EmployeeFacadeTest() {
//    }
//
//    @org.junit.BeforeClass
//    public static void setUpClass() throws Exception {
//    }
//
//    @org.junit.AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//
//    @org.junit.Before
//    public void setUp() throws Exception {
//    }
//
//    @org.junit.After
//    public void tearDown() throws Exception {
//    }
//
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of main method, of class EmployeeFacade.
     */
//    @org.junit.Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        EmployeeFacade.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * // * Test of getFacadeExample method, of class EmployeeFacade. //
//     */
////    @org.junit.Test
////    public void testGetFacadeExample() {
////        System.out.println("getFacadeExample");
////        EntityManagerFactory _emf = null;
////        EmployeeFacade expResult = null;
////        EmployeeFacade result = EmployeeFacade.getFacadeExample(_emf);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//    /**
//     * Test of getEmployeeById method, of class EmployeeFacade.
//     */
//    @org.junit.Test
//    public void testGetEmployeeById() {
//        System.out.println("getEmployeeById");
//        int id = 0;
//        EmployeeFacade instance = EmployeeFacade.getFacadeExample(emf);
//        Employee expResult = null;
//        Employee result = instance.getEmployeeById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEmployeeByName method, of class EmployeeFacade.
//     */
//    @org.junit.Test
//    public void testGetEmployeeByName() {
//        System.out.println("getEmployeeByName");
//        String name = "";
//        EmployeeFacade instance = null;
//        Employee expResult = null;
//        Employee result = instance.getEmployeeByName(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllEmployees method, of class EmployeeFacade.
//     */
//    @org.junit.Test
//    public void testGetAllEmployees() {
//        System.out.println("getAllEmployees");
//        EmployeeFacade instance = null;
//        List<Employee> expResult = null;
//        List<Employee> result = instance.getAllEmployees();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getHighestSallery method, of class EmployeeFacade.
//     */
//    @org.junit.Test
//    public void testGetHighestSallery() {
//        System.out.println("getHighestSallery");
//        EmployeeFacade instance = null;
//        List<Employee> expResult = null;
//        List<Employee> result = instance.getHighestSallery();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addEmployee method, of class EmployeeFacade.
//     */
//    @org.junit.Test
//    public void testAddEmployee() {
//        System.out.println("addEmployee");
//        String name = "";
//        String address = "";
//        double Salery = 0.0;
//        EmployeeFacade instance = null;
//        Employee expResult = null;
//        Employee result = instance.addEmployee(name, address, Salery);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//}
