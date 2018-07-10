package Config;

import POJO.*;
import POJO.Condition_class.PersonCondition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import web.Student;

@Configuration
public class ProfileConfig {
    @Bean
    @Conditional(PersonCondition.class)
    public Person getPerson() {
        return new Person();
    }

    @Bean
    @Cold
    public Fish getFish() {
        return new Fish();
    }

    @Bean
    public Chicken getChicken() {
        return new Chicken();
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Student getStudent(){
        return new Student();
    }

}
