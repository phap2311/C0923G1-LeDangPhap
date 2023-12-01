package case_study.services.i_ser;

import case_study.models.person.Employee;

import java.util.List;

public interface IService <E>{
    List<E> getAll();
    void save(E e);


}
