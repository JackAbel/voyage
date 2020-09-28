import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.datastream.DataStream;

/**
 * @description: flink datastream example
 * @author: Xiangbao Jin
 * @since 2020/9/12 8:52 PM
 */
public class Example {
    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<Person> flintstones = env.fromElements(
                new Person("zhangsan", 12),
                new Person("lisi", 19),
                new Person("wanger", 34));
        DataStream<Person> adults = flintstones.filter(new FilterFunction<Person>() {
            @Override
            public boolean filter(Person person) {
                return person.age > 18;
            }
        });
        adults.print();
        env.execute();

    }

    public static class Person {
        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        private String name;
        private Integer age;

        public Person() {

        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return this.name.toString() + ": age " + this.age.toString();
        }
    }
}
