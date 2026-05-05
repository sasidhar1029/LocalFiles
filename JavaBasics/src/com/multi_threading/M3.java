package com.multi_threading;

class AudioInfo extends Thread {
	@Override
	public void run() {
		System.out.println("Audio info called & name:" + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Audio" + i);
		}
	}
}

class videoInfo extends Thread {
	@Override
	public void run() {
		System.out.println("video info called & name:" + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("video" + i);
		}
	}
}

class TimerInfo extends Thread {
	@Override
	public void run() {
		System.out.println("Audio info called & name:" + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Timer" + i);
		}
	}
}

public class M3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		AudioInfo a = new AudioInfo();
		videoInfo v = new videoInfo();
		TimerInfo t = new TimerInfo();
		a.start();
		v.start();
		t.start();

	}

}
