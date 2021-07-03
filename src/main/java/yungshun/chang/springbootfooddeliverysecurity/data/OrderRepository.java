package yungshun.chang.springbootfooddeliverysecurity.data;

import org.springframework.data.repository.CrudRepository;
import yungshun.chang.springbootfooddeliverysecurity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
