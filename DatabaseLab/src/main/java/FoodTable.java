
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class FoodTable

{

    @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        public String food;
        public String calorie;
        public String foodNum;



        public void setFoodNum(String foodNum) {
            this.foodNum = foodNum;
        }

        public void setFood(String food) {
            this.food = food;
        }

        public void setCalorie(String calorie) {
            this.calorie = calorie;
        }

        public String getFoodNum() {
            return foodNum;
        }

        public String getFood() {
            return food;
        }

        public String getCalorie() {
            return calorie;
        }

        @Override
        public String toString()
        {
            return "FoodTable [Food Number =" + foodNum + ", food name =" + food + ", calorie = "  + calorie;

        }


    }

