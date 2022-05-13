package service.serviceImpl;

import dao.CompanyDao;
import dao.daoImpl.CompanyDaoImpl;
import entity.Company;
import exception.ShowException;
import org.hibernate.HibernateError;
import service.CompanyService;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {

    CompanyDao companyDao = new CompanyDaoImpl();

    public CompanyServiceImpl() {}

    @Override
    public boolean addCompany(Company company) {
        boolean isAdded = false;
        try {
            companyDao.addCompany(company);
            isAdded = true;
        }
        catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return isAdded;
    }

    @Override
    public boolean updateCompany(Company company) {
        boolean isUpdated = false;
        try {
            if (companyDao.updateCompany(company))
                isUpdated = true;
        }
        catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        System.out.println("Это ДЗ ++++++");
        return isUpdated;
    }

    /** @Override
    public boolean updatePerson(Person person) {
    boolean isUpdated = false;
    try {
    if (personDao.updatePerson(person))
    isUpdated = true;
    }
    catch (HibernateError e) {
    ShowException.showNotice(e);
    }
    return isUpdated;
    }
     **/

    @Override
    public boolean deleteCompany(int id) {
        boolean isDeleted = false;
        try {
            if (companyDao.deleteCompany(id))
                isDeleted = true;
        } catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        System.out.println("Это ДЗ 1111");
        return isDeleted;
       // return false;
    }

    /** @Override
    public boolean deletePerson(int id) {
    boolean isDeleted = false;
    try {
    if (personDao.deletePerson(id))
    isDeleted = true;
    }
    catch (HibernateError e) {
    ShowException.showNotice(e);
    }
    return isDeleted;
    }**/

    @Override
    public List<Company> showCompanies() {
        List<Company> companies = null;
        try {
            companies = companyDao.showCompanies();
        }
        catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        System.out.println("Это ДЗ-666");
        return companies;
        //return null;
    }
/** @Override
public List<Person> showPeople() {
List<Person> people = null;
try {
people = personDao.showPeople();
}
catch (HibernateError e) {
ShowException.showNotice(e);
}
return people;
}
 **/
    @Override
    public Company findCompanyById(int id) {
        Company company = null;
        try {
            company = companyDao.findCompanyById(id);
        }
        catch (HibernateError e) {
            ShowException.showNotice(e);
        }

        System.out.println("Это ДЗ22222");
        return company;
        //return null;
    }
    /** @Override
    public Person findPersonById(int id) {
    Person person = null;
    try {
    person = personDao.findPersonById(id);
    }
    catch (HibernateError e) {
    ShowException.showNotice(e);
    }
    return person;
    }
    }**/

    @Override
    public Company findCompanyByName(String name) {
        Company company = null;
        try {
            company = companyDao.findCompanyByName(name);
        }
        catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        System.out.println("Это ДЗ");
         return company;
        //return null;
    }

    /** @Override
    public Person findPersonById(int id) {
    Person person = null;
    try {
    person = personDao.findPersonById(id);
    }
    catch (HibernateError e) {
    ShowException.showNotice(e);
    }
    return person;
    }
    }**/
}
