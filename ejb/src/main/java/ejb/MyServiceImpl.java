package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import api.MyService;
import api.Person;

@Stateless
public class MyServiceImpl implements MyService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Person findPerson(Long id) {
        return this.entityManager.find(PersonEntity.class, id);
    }

}
