package za.ac.pentec.cput_two;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class CheetahTest {

    Cat cat;
    Cheetah cheetah;
    private Cat kati;

    @Before
    public void setUp() throws Exception {
        cat = new Cheetah();
        cheetah = new Cheetah();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        kati = (Cat)ctx.getBean("calc");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMap() {
        Map map = cheetah.getMap();
        assertEquals(cheetah.getMap(),map);
    }

    @Test
    public void getSet() {
        Set set = cheetah.getSet();
        assertEquals(cheetah.getSet(),set);
    }

    @Test
    public void getList() {
        List list = cheetah.getList();
        assertEquals(cheetah.getList(),"");
    }

    @Test
    public void getCollection() {
        Collection collection = cheetah.getCollection();
        assertEquals(cheetah.getCollection(),"");
    }

    @Test
    public void getSound(){

        String sound = kati.getSound();
        assertEquals(kati.getSound(),sound);

    }
    @Test
    public void hasWiskers(){
        boolean wisker = kati.hasWiskers();
        Assert.assertEquals(wisker,"null");
    }
    @Test
    public void isBigCat(){
        boolean bigCat = kati.isBigCat();
        assertEquals(kati.isBigCat(),bigCat);
    }
    @Test
    public void move(){
        String move = kati.move();
        assertEquals(kati.move(),move);
    }
    @Test
    public void hasFourLegs(){
        boolean hasFourLegs = kati.hasFourLegs();
        assertEquals(kati.hasFourLegs(),hasFourLegs);
    }
    @Test
    public void eat(){
        String eat = cat.eat();
        assertEquals(cat.eat(),eat);
    }
}