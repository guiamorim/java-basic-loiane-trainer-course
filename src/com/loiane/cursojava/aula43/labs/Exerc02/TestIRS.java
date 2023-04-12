package com.loiane.cursojava.aula43.labs.Exerc02;

public class TestIRS {

	public static void main(String[] args) {

		PrivatePerson p1 = new PrivatePerson();

		p1.setName("Guilherme Amorim");
		p1.setGrossIncome(1000);
		p1.setVat("184120942");

		
		PrivatePerson p2 = new PrivatePerson();

		p2.setName("Glória Amorim");
		p2.setGrossIncome(2000);
		p2.setVat("121074943");

		
		PrivatePerson p3 = new PrivatePerson();

		p3.setName("Leidiane Amorim");
		p3.setGrossIncome(3707);
		p3.setVat("169017710");

		
		LegalPerson p4 = new LegalPerson();

		p4.setName("Amorim Lda");
		p4.setGrossIncome(4000);
		p4.setTin("509922520");

		
		LegalPerson p5 = new LegalPerson();

		p5.setName("Piccolo Lda");
		p5.setGrossIncome(5000);
		p5.setTin("598989234");

		
		LegalPerson p6 = new LegalPerson();

		p6.setName("Krokko Lda");
		p6.setGrossIncome(6000);
		p6.setTin("");

		
		Taxpayer[] taxpayers = new Taxpayer[6];
		taxpayers[0] = p1;
		taxpayers[1] = p2;
		taxpayers[2] = p3;
		taxpayers[3] = p4;
		taxpayers[4] = p5;
		taxpayers[5] = p6;

		//Testing polymorfism
		for (Taxpayer p : taxpayers) {
			System.out.println(p.toString());

		}

	}

}
