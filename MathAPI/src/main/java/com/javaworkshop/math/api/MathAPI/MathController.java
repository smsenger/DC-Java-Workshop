package com.javaworkshop.math.api.MathAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MathController {

    @GetMapping("/sum/{a}/{b}")
    public Answer sum(@PathVariable double a, @PathVariable double b) {
        Answer rv = new Answer();
        rv.setResult(a + b);
        return rv;
    }

    @GetMapping("/diff/{a}/{b}")
    public Answer diff(@PathVariable double a, @PathVariable double b) {
        Answer rv = new Answer();
        rv.setResult(a - b);
        return rv;
    }

    @GetMapping("/product/{a}/{b}")
    public Answer product(@PathVariable double a, @PathVariable double b) {
        Answer rv = new Answer();
        rv.setResult(a * b);
        return rv;
    }

    @GetMapping("/quot/{a}/{b}")
    public Answer quot(@PathVariable double a, @PathVariable double b) {
        Answer rv = new Answer();
        rv.setResult(a / b);
        return rv;
    }


//    @GetMapping("/sum/{a}/{b}")
//    public int getSum(@PathVariable int a, @PathVariable int b) {
//        return a + b;
//    }
//
//    @GetMapping("/sum/{numbers}")
//    public int getSumMulti(@PathVariable int a, @PathVariable int b) {
//        return a + b;
//    }
//
//    @GetMapping("/difference/{a}/{b}")
//    public int getDiff(@PathVariable int a, @PathVariable int b) {
//        return a - b;
//    }
//
//    @GetMapping("/product/{a}/{b}")
//    public int getProduct(@PathVariable int a, @PathVariable int b) {
//        return a * b;
//    }
//
//    @GetMapping("/quotient/{a}/{b}")
//    public int getQuotient(@PathVariable int a, @PathVariable int b) {
//        return a / b;
//    }

}
