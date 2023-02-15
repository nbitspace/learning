package com.nbit.learn.thread;

import com.nbit.learn.oops.Car;

public class InterThreadEg {
	public int amt;

	public InterThreadEg(int amt) {
		this.amt = amt;
	}

	synchronized public void withdraw(int amt) {
		try {
			System.out.println();
			System.out.println("Amount before withdraw: " + this.amt);
			System.out.println("Withdraw: " + amt);
			while (true) {
				if (this.amt < amt) {
					System.out.println("Low balance...");
					wait();
					continue;
				} else {
					break;
				}
			}
			this.amt = this.amt - amt;
			System.out.println("Amount after withdraw " + amt + ": " + this.amt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized void deposit(int amt) {
		System.out.println();
		System.out.println("Amount before deposit: " + this.amt);
		System.out.println("Deposit: " + amt);
		this.amt = this.amt + amt;
		System.out.println("Amount after deposit " + amt + ": " + this.amt);
		notify();
	}
}
