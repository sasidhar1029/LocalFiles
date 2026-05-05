package com.projects;

class BookMySeats {
	int totalTicktets = 10;

	synchronized void bookSeats(int seats) {
		if (seats <= totalTicktets) {
			System.out.println("Your tickets Booked Sucessfully:" + seats);
			totalTicktets = totalTicktets - seats;
			System.out.println("Remaing avaliable Tickets:" + totalTicktets);
		} else {
			System.err.println("Tickets have been sold out!");
			System.err.println("Available Tickets:" + totalTicktets);
		}
	}
}

public class BookMyMovieApp extends Thread {
	static BookMySeats b;
	int seats;

	@Override
	public void run() {
		b.bookSeats(seats);
	}

	public static void main(String[] args) {
		System.out.println("Main metod strated");
		b = new BookMySeats();
		BookMyMovieApp srikanth = new BookMyMovieApp();
		srikanth.seats = 6;
		srikanth.start();

		BookMyMovieApp sasi = new BookMyMovieApp();
		sasi.seats = 4;
		sasi.start();

		BookMyMovieApp subbu = new BookMyMovieApp();
		subbu.seats = 4;
		subbu.start();
	}

}
