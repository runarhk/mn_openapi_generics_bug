package test;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller("/test")
@Tag(name = "testservice")
public class TestController {


    /**
     * Does nothing usefull
     *
     * @param input the input
     * @return the result
     */
    @Get("/{input}")
    public Flowable<MyDtoImpl> doSomeStuff(String input) {
        return Flowable.just(new MyDtoImpl());
    }

}
