package com.minbo.dubbo.consumer;

import com.sun.scenario.animation.shared.PulseReceiver;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@SpringBootTest
public class DubboConsumerApplicationTests {
	@Autowired
	PulseReceiver pulseReceiver;

	@Test
	public void contextLoads() {

	}

	@Test
	public void  testHello(){
		String hello = "hello";
		System.out.println(hello);
		assert "hello".equals(hello);
	}

	@Test
	public void testCollection(){
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("learning");
		//System.out.println(list.size());
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}

	}

	@Test
	@SuppressWarnings({"all"})
	public void testList(){
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("caocao", "duangexing"));
		list.add(new Book("caoxuqin", "hongloumeng"));
		list.add(new Book("caozhi", "luoshenfu"));

		//System.out.println(list.size());
		Iterator<Book> iterator = list.iterator();
		while (iterator.hasNext()){
			Book next = iterator.next();
			System.out.println(next.toString());
		}
	}

	@Test
	public void testListOrder(){
		List<Book> books = new LinkedList<Book>();
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("caocao", "duangexing", 10));
		list.add(new Book("caoxuqin", "hongloumeng", 9));
		list.add(new Book("caozhi", "luoshenfu", 8));

	}

	@Data
	class Book{
		String author;
		String book;
		Integer price;

		public Book(String author, String book){
			this.author = author;
			this.book = book;
		}

		public Book(String author, String book, Integer price){
			this.author = author;
			this.book = book;
			this.price = price;
		}

		@Override
		public String toString(){
			return  this.author + " : " +  this.book + " : " + (this.price == null ? "" : this.price);
		}
	}
}
