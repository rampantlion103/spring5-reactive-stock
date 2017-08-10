/*
 * The MIT License
 *
 * Copyright 2017 Maikel Chandika <mkdika@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.mkdika.spring5reactivestock;

import java.util.function.Consumer;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReactiveAbcTest {
    
//    @Test
//    public void testAbcImperative() {
//        System.out.println("Test Imperative:");
//        int a = 2;
//        System.out.println("a: "+a);
//        int b = 3;
//        System.out.println("b: "+b);
//        int c = a + b;
//        System.out.println("c: "+ c);
//        b = 4;
//        System.out.println("b: "+ b);
//        System.out.println("c: "+ c);       
//        System.out.println("");
//    }
    
//    @Test
//    public void testAbcReactive() {
//        System.out.println("Test Reactive:");                
//        Mono<Integer> monoA = Mono.just(2);        
//        System.out.println("a: " + monoA.block());
//                
//        Mono<Integer> monoB = Mono.just(3);                              
//        System.out.println("b: " + monoB.block());              
//        System.out.println(""); 
//        
//        Mono<Void> abc= Mono.empty();
//    }
    
    @Test
    public void empty() {
        Flux<String> flux = emptyFlux();
        StepVerifier.create(flux)
                .expectComplete()
                .verify();
    }
    
    
    Flux<String> emptyFlux() {
        return Flux.empty();
    }
    
//    class SubcriberC implements Consumer<Integer> {
//        @Override
//        public void accept(Integer i) {
//            System.out.println("C: " + i);
//        }        
//    }
    
}