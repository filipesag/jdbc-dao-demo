package application;
import model.dao.SellerDao;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.*;
import java.util.List;
import java.util.ArrayList;

import db.DB;

public class Program {

    public static void main(String[] args) {



        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        Department department = new Department(null,"Music");
        depDao.insert(department);

        List<Department> list = depDao.findAll();

        list.forEach(System.out::println);






    }
}
