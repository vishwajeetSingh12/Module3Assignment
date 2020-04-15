package com.capgemini.Client;

import com.capgemini.Entity.Author;
import com.capgemini.Service.AuthorService;
import com.capgemini.Service.AuthorServiceImp;

public class Client {
	public static void main(String ar[])
	{
		AuthorService authorService=new AuthorServiceImp();
		
		Author author=new Author();
		author.setAuthorId(1);
		author.setAuthorFirstName("Vishwajeet");
		author.setAuthorLastName("Singh");
		author.setAuthorPhoneNumber("9592328145");
		authorService.addAuthor(author);
		
		Author author2=new Author();
		author2.setAuthorId(2);
		author2.setAuthorFirstName("Rudra");
		author2.setAuthorLastName("Singh");
		author2.setAuthorPhoneNumber("9593654876");
		authorService.addAuthor(author);
		
		System.out.println(authorService.findAuthorById(1));
		author.setAuthorPhoneNumber("7985658457");
		authorService.updateAuthor(author);
		
		
		System.out.println(authorService.findAuthorById(1));
		authorService.removeAuthor(author2);
		
	}

}
