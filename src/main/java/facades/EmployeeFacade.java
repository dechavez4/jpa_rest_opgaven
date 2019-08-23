package facades;

import entities.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class EmployeeFacade {

    private static EmployeeFacade instance;
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EmployeeFacade facade = EmployeeFacade.getFacadeExample(emf);
    }

    //Private Constructor to ensure Singleton
    private EmployeeFacade() {
    }

    /**
     *
     * @param _emf
     * @return an instance of this facade class.
     */
    public static EmployeeFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new EmployeeFacade();
        }
        return instance;
    }

    public Employee getEmployeeById(long id) {
        EntityManager em = emf.createEntityManager();
        try {
            Employee empl = em.find(Employee.class, id);
            return empl;
        } finally {
            em.close();
        }
    }

    public Employee getEmployeeByName(String name) {
        EntityManager em = emf.createEntityManager();
        try {
            Employee empl = em.find(Employee.class, name);
            return empl;
        } finally {
            em.close();
        }
    }

    public List<Employee> getAllEmployees() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Employee> query
                    = em.createQuery("SELECT employee from Employee employee", Employee.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Employee> getHighestSallery() {
        EntityManager em = emf.createEntityManager();   
        try {
            TypedQuery query
                    = em.createQuery("SELECT e FROM Employee e where e.salery = (Select MAX(e2.salery) FROM Employee e2)", Employee.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public Employee addEmployee(String name, String address, double Salery) {
        Employee employee = new Employee(name, address, Salery);
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
            return employee;
        } finally {
            em.close();
        }
    }
}
