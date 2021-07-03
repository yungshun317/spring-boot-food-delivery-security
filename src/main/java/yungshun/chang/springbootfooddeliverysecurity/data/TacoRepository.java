package yungshun.chang.springbootfooddeliverysecurity.data;

import org.springframework.data.repository.CrudRepository;
import yungshun.chang.springbootfooddeliverysecurity.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
