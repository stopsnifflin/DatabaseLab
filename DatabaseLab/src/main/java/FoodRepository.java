import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends CrudRepository<FoodTable, String> {

    List<FoodTable> findByFood(String food);

    }

