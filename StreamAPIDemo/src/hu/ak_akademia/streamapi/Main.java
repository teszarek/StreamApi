package hu.ak_akademia.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		Date signDate1 = new Date(1999, 11, 2);
		
		Name name1 = new Name ("Elek", "Teszt");
		Date dateOfBirth1 = new Date (1982, 2, 10);
		Name mothersName1 = new Name ("Boglárka", "Tóth");
		
		Person signee1 = new Person(name1, dateOfBirth1, mothersName1, 180, 70);
		
		Contract contract1 = new Contract(signDate1, signee1, "Szerzõdés szövege");
		
        Contract contract2 = new Contract(new Date(1989, 10, 9), new Person(new Name ("Jenõ", "Horváth"), new Date (1977, 5, 1), new Name ("Veronika", "Szabó"), 174, 69), "Másik szerzõdés szövege");
        Contract contract3 = new Contract(new Date(2000, 1, 5), new Person(new Name ("Béla", "Takács"), new Date (1965, 4, 2), new Name ("Cecília", "Kovács"), 160, 88), "Harmadik szerzõdés szövege");
        Contract contract4 = new Contract(new Date(2012, 12, 15), new Person(new Name ("Aladár", "Takács"), new Date (1997, 10, 1), new Name ("Ildikó", "Kovács"), 184, 75), "Negyedik szerzõdés szövege");
        Contract contract5 = new Contract(new Date(2006, 9, 24), new Person(new Name ("Elemér", "Szabó"), new Date (2005, 12, 20), new Name ("Cecíliaa", "Tóth"), 171, 71), "Ötödik szerzõdés szövege");
        
        List<Contract> contracts = new ArrayList<>();
        contracts.add(contract1);
        contracts.add(contract2);
        contracts.add(contract3);
        contracts.add(contract4);
        contracts.add(contract5);
        
        for (Contract contract : contracts) {
        	System.out.println(contract);
        }
        
//      List<Contract> results = getContractsSignedAfter2000(contracts);
        List<Contract> results = contracts.stream()
        		.filter(c -> c.getSignDate()
        				.getYear() >=2000)
        		 .collect(Collectors.toList());
        
        System.out.println("A 2000 után aláírt szerzõdések:");
        for (Contract contract : results) {
        	System.out.println(contract);
        } 

        
	}

	private static List<Contract> getContractsSignedAfter2000(List<Contract> contracts) {
		List<Contract> results = new ArrayList<>();
		for (Contract contract : contracts) {
			if (contract.getSignDate().getYear() >= 2000) {
				results.add(contract);
			}
			
		}
					
		return results;
	}

}
