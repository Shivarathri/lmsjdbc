package com.capgemini.librarymanagementjdbc.controller;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.librarymanagementjdbc.dto.BookBean;
import com.capgemini.librarymanagementjdbc.dto.UsersBean;
import com.capgemini.librarymanagementjdbc.exception.ValidationException;
import com.capgemini.librarymanagementjdbc.service.UsersService;
import com.capgemini.librarymanagementjdbc.validation.ValidationAdminStudent;

public class Jdbc {
	
		public static void main(String[] args) {
			doReg();
		}
		public static void doReg() {
			boolean flag = false;

			int regId = 0; 
			String regFirstName = null; 
			String regLastName = null; 
			long regMobile = 0;
			String regEmail = null;
			String regPassword = null;

			boolean loginStatus = true;
			ValidationAdminStudent validation = new ValidationAdminStudent();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Press 1 to Register");
			System.out.println("Press 2 to Login");
			System.out.println("Press 3 to EXIT");
			do {
				UsersService service1= LibraryFactory.getUsersService();
				int choice = scanner.nextInt();
				switch(choice) {
				case 1:
					do {
						try {
							System.out.println("Enter ID :");
							regId = scanner.nextInt();
							validation.validatedId(regId);
							flag = true;
						} catch (InputMismatchException e) {
							flag = false;
							System.err.println("Id should contains only digits");
						} catch (ValidationException e) {
							flag = false;
							System.err.println(e.getMessage());
						}
					} while (!flag);

					do {
						try {
							System.out.println("Enter First Name :");
							regFirstName = scanner.next();
							validation.validatedName(regFirstName);
							flag = true;
						} catch (InputMismatchException e) {
							flag = false;
							System.err.println("Name should contains only Alphabates");
						} catch (ValidationException e) {
							flag = false;
							System.err.println(e.getMessage());
						}
					} while (!flag);
					do {
						try {
							System.out.println("Enter Last Name :");
							regLastName = scanner.next();
							validation.validatedName(regLastName);
							flag = true;
						} catch (InputMismatchException e) {
							flag = false;
							System.err.println("Name should contains only Alphabates");
						} catch (ValidationException e) {
							flag = false;
							System.err.println(e.getMessage());
						}
					} while (!flag);

					do {
						try {
							System.out.println("Enter Email :");
							regEmail = scanner.next();
							validation.validatedEmail(regEmail);
							flag = true;
						} catch (InputMismatchException e) {
							flag = false;
							System.err.println("Email should be proper ");
						} catch (ValidationException e) {
							flag = false;
							System.err.println(e.getMessage());
						}
					} while (!flag);

					do {
						try {
							System.out.println("Enter Password :");
							regPassword = scanner.next();
							validation.validatedPassword(regPassword);
							flag = true;
						} catch (InputMismatchException e) {
							flag = false;
							System.err.println("Enter correct Password ");
						} catch (ValidationException e) {
							flag = false;
							System.err.println(e.getMessage());
						}
					} while (!flag);

					do {
						try {
							System.out.println("Enter Mobile :");
							regMobile = scanner.nextLong();
							validation.validatedMobile(regMobile);
							flag = true;
						} catch (InputMismatchException e) {
							flag = false;
							System.err.println("Mobile Number  should contains only numbers");
						} catch (ValidationException e) {
							flag = false;
							System.err.println(e.getMessage());
						}
					} while (!flag);
					System.out.println("Enter the role");
					String regRole = scanner.next();
					UsersBean ai = new UsersBean();
					ai.setUid(regId);
					ai.setUname(regFirstName);
					//ai.setLastName(regLastName);
					ai.setEmail(regEmail);
					ai.setPassword(regPassword);
					ai.setMoblie(regMobile);
					ai.setRole(regRole);
					boolean check=service1.register(ai);
					if(check) {
						System.out.println("Registered");
					}else {
						System.out.println("Already user is registered");
					}
					break;
				case 2:
					System.out.println("enter email");
					String email=scanner.next();
					System.out.println("enter password");
					String password=scanner.next();
					try {
						UsersBean loginInfo=service1.login(email, password);
						System.out.println("Logged In");
						if(loginInfo.getRole().equals("admin")) {
							do {
								System.out.println("Press 1 to add book");
								System.out.println("Press 2 to remove book");
								System.out.println("Press 3 to issue book");
								System.out.println("Press 4 to Search the Book by Author");
								System.out.println("Press 5 to Search the Book by Title");
								System.out.println("Press 6 to Get the Book Information");
								System.out.println("Press 7 to update the book");
								System.out.println("Press 8 to log out");

								int choice1 = scanner.nextInt();
								switch (choice1) {
								case 1:
									System.out.println("enter id");
									int addId=scanner.nextInt();
									System.out.println("enter bookname");
									String addName=scanner.next();
									System.out.println("enter authorname");
									String addAuth=scanner.next();
									System.out.println("enter category");
									String addCategory=scanner.next();
									System.out.println("enter publisher");
									String addPublisher=scanner.next();
									System.out.println("enter no of copies");
									int addCopies = scanner.nextInt();
									BookBean bi =new BookBean();
									bi.setBid(addId);
									bi.setBname(addName);
									bi.setBauthor(addAuth);
									bi.setCategory(addCategory);
									bi.setPublishername(addPublisher);
									//bi.setCopies(addCopies);
									boolean check2=service1.addBook(bi);
									if(check2) 
										System.out.println("Added Book");
									else
										System.out.println("Book not added");
									break;	
								case 2:
									System.out.println("enter id");
									int removeId=scanner.nextInt();
									boolean check3=service1.removeBook(removeId);
									if(check3)
										System.out.println("Removed Book");
									else
										System.out.println("Book not removed");
									break;

								case 3:
									System.out.println("enter id");
									int issueId=scanner.nextInt();
									boolean check4=service1.issueBook(issueId);
									if(check4)
										System.out.println("Book Issued");
									else
										System.out.println("Book not issued");
									break;
								case 4:
									System.out.println("Search the book by the Author Name:");
									String author = scanner.next();

									BookBean bean3 = new BookBean();
									bean3.setBauthor(author);
									List<BookBean> bookauthor = service1.searchBookByAuthor(author);
									for (BookBean bookBean : bookauthor) {

										if (bookBean != null) {
											System.out.println("Book_Id is-->"+bookBean.getBid());
											System.out.println("Book_Name is-->"+bookBean.getBname());
											System.out.println("Book_Author is-->"+bookBean.getBauthor());
											System.out.println("Book_PublisherName is-->"+bookBean.getPublishername());
											System.out.println("Book_Category is-->"+bookBean.getCategory());
											//System.out.println("No_Of_Copies are-->"+bookBean.getCopies());
										} else {
											System.out.println("No books are available written by this author");
										}
									}
									break;
								case 5:
									System.out.println("  Search the book by the Book_Title :");
									String btitle = scanner.next();

									BookBean bean4 = new BookBean();
									bean4.setBauthor(btitle);
									List<BookBean> booktitle = service1.searchBookByTitle(btitle);
									for (BookBean bookBean : booktitle) {	
										if (bookBean != null) {
											System.out.println("Book_Id is-->"+bookBean.getBid());
											System.out.println("Book_Name is-->"+bookBean.getBname());
											System.out.println("Book_Author is-->"+bookBean.getBauthor());
											System.out.println("Book_PublisherName is-->"+bookBean.getPublishername());
											System.out.println("Book_Category is-->"+bookBean.getCategory());
											//System.out.println("No_Of_Copies are-->"+bookBean.getCopies());
										} else {
											System.out.println("No books are available with this title.");
										}
									}
									break;

								case 6:
									LinkedList<BookBean> info = service1.getBooksInfo();
									for (BookBean bookBean : info) {

										if (bookBean != null) {
											System.out.println("Book_Id is-->"+bookBean.getBid());
											System.out.println("Book_Name is-->"+bookBean.getBname());
											System.out.println("Book_Author is-->"+bookBean.getBauthor());
											System.out.println("Book_PublisherName is-->"+bookBean.getPublishername());
											System.out.println("Book_Category is-->"+bookBean.getCategory());
											//System.out.println("No_Of_Copies are-->"+bookBean.getCopies());
										} else {
											System.out.println("Books info is not present");
										}
									}
									break;
								case 7:
									System.out.println("Enter the updated id :");
									int bid= scanner.nextInt();
									System.out.println("Enter no of copies to be updtaed");
									int updatedCopies =scanner.nextInt();
									BookBean bean2 = new BookBean();
									bean2.setBid(bid);
									//bean2.setCopies(updatedCopies);
									boolean updated = service1.updateBook(bean2);
									if (updated) {
										System.out.println("Book is updated");
									} else {
										System.out.println("Book is not updated");
									}
									break;


								case 8:
									doReg();

								default:
									System.out.println("Invalid Choice");
									break;
								}
							}while(true);
						}
						else if(loginInfo.getRole().equals("student")) {
							do {
								System.out.println("Press 1 to request book");
								System.out.println("Press 2 to borrow book");
								System.out.println("Press 3 to search book by author");
								System.out.println("Press 4 to search book by title");
								System.out.println("Press 5 to get books info");
								System.out.println("Press 6 to return book");
								System.out.println("Press 7 to main");


								int choice2 = scanner.nextInt();
								switch (choice2) {
								case 1:
									System.out.println("Enter the Book Requested_id :");
									int reqId= scanner.nextInt();
									System.out.println("Enter the Author Name :");
									String reqAuthor = scanner.next();

									BookBean beans = new BookBean();
									beans.setBid(reqId);
									beans.setBauthor(reqAuthor);
									boolean requested = service1.request(reqId, reqAuthor);
									if (requested != false) {
										System.out.println("Book is Requested");
									} else {
										System.out.println("Book is not Requested");
									}	
									break;
								case 2:
									System.out.println("enter id");
									int borrowId=scanner.nextInt();
									try {
										BookBean bi2=service1.borrowBook(borrowId);
										System.out.println("Book borrowed");
									}catch(Exception e) {
										System.out.println("Invalid credentials");	
									}
									break;
								case 3:
									System.out.println("Search the book by the Author Name :");
									String author = scanner.next();

									BookBean bean2 = new BookBean();
									bean2.setBauthor(author);
									List<BookBean> bookauthor = service1.searchBookByAuthor(author);
									for (BookBean bookBean : bookauthor) {

										if (bookBean != null) {
											System.out.println("Book_Id is-->"+bookBean.getBid());
											System.out.println("Book_Name is-->"+bookBean.getBname());
											System.out.println("Book_Author is-->"+bookBean.getBauthor());
											System.out.println("Book_PublisherName is-->"+bookBean.getPublishername());
											System.out.println("Book_Category is-->"+bookBean.getCategory());
											//System.out.println("No_Of_Copies are-->"+bookBean.getCopies());
										} else {
											System.out.println("No books are available written by this author");
										}
									}
									break;
								case 4:
									System.out.println("Search the book by the Book Title :");
									String btitle = scanner.next();

									BookBean bean3 = new BookBean();
									bean3.setBauthor(btitle);
									List<BookBean> booktitle = service1.searchBookByAuthor(btitle);
									for (BookBean bookBean : booktitle) {	
										if (bookBean != null) {
											System.out.println("Book_Id is-->"+bookBean.getBid());
											System.out.println("Book_Name is-->"+bookBean.getBname());
											System.out.println("Book_Author is-->"+bookBean.getBauthor());
											System.out.println("Book_PublisherName is-->"+bookBean.getPublishername());
											System.out.println("Book_Category is-->"+bookBean.getCategory());
											//System.out.println("No_Of_Copies are-->"+bookBean.getCopies());
										} else {
											System.out.println("No books are available with this title.");
										}
									}
									break;
								case 5:
									LinkedList<BookBean> info = service1.getBooksInfo();
									for (BookBean bookBean : info) {

										if (bookBean != null) {
											System.out.println("Book_Id is-->"+bookBean.getBid());
											System.out.println("Book_Name is-->"+bookBean.getBname());
											System.out.println("Book_Author is-->"+bookBean.getBauthor());
											System.out.println("Book_PublisherName is-->"+bookBean.getPublishername());
											System.out.println("Book_Category is-->"+bookBean.getCategory());
											//System.out.println("No_Of_Copies are-->"+bookBean.getCopies());
										} else {
											System.out.println("Books info is not presernt");
										}
									}
									break;
								case 6:
									System.out.println("Enter the Book Requested_id :");
									int returnId= scanner.nextInt();

									BookBean bean6 = new BookBean();
									bean6.setBid(returnId);

									boolean returned = service1.returnBook(returnId);
									if (returned != false) {
										System.out.println("Book is Requested");
									} else {
										System.out.println("Book is not Requested");
									}	
									break;

								case 7:
									doReg();
								default:
									break;
								}
							}while(true);
						}
					}catch(Exception e) {
						System.out.println("Invalid Credentials");
					}
					break;
				default:
					System.out.println("Exit");
					loginStatus = false;
				}
			}while(loginStatus);
		}
	}

