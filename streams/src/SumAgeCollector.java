import string_02_02_22hw.streams.src.Person3;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class SumAgeCollector implements Collector<Person3, List<Person3>, Integer> {

    @Override
    public Supplier<List<Person3>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Person3>, Person3> accumulator() {
        return List::add;
    }

    @Override
    public BinaryOperator<List<Person3>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<Person3>, Integer> finisher() {

        return
                list -> {
                    int salary =
                            list.stream().mapToInt(p -> p.getSalary()).reduce(0, (accumulator, element) -> accumulator + element);
                    return salary;
                };


    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT);
    }
}
