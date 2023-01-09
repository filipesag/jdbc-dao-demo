package model.dao;
import model.dao.ipml.SellerDaoJDBC;
import model.dao.ipml.DepartmentDaoJDBC;
import db.DB;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() { return new DepartmentDaoJDBC(DB.getConnection());}
}
