package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exchange {
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("D:\\IBM_21MAR2017_XW10LADD0001.mef3"));
			List<String> roles = new ArrayList<String>();
			roles.add("Organization Management");
			roles.add("Recipient Management");
			roles.add("View-Only Organization Management");
			roles.add("Public Folder Management");
			roles.add("Server Management");
			roles.add("Delegated Setup");
			roles.add("Discovery Management");
			roles.add("Help Desk");
			roles.add("Hygiene Management");
			roles.add("Records Management");
			roles.add("UM Management");
			roles.add("Compliance Management");
			
			while (scan.hasNext()){
				String s = scan.nextLine();
				if (isHasRole(s, roles))
					processRoles(s, roles);
//					System.out.println(s);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void processRoles(String s, List<String> roles) {
//		System.out.println(s);
//		StringTokenizer tokens = new StringTokenizer(s, "|");
		String[] items= s.split("\\|");
		int size = items.length;
		boolean isPrivExists = true;
		if (size == 10)
			isPrivExists = false;
		StringBuilder mefLine = new StringBuilder();
		
		mefLine.append(items[0] + "|"); //customer
		mefLine.append("A|"); //customer
		mefLine.append(items[2] + "|"); //hostname
		mefLine.append("EXCHANGE|"); //hostname
		mefLine.append(items[4] + "|"); //userID
		mefLine.append(items[5] + "|"); //UIC
		mefLine.append(items[6] + "|"); //descr
		mefLine.append(items[7] + "|"); //status
		mefLine.append(items[8] + "|"); //last logon
		
		
		//group
		String groups = items[9];
		StringBuilder groupsB = new StringBuilder();
		if (groups != null && groups.length() > 0){
			if (groups.indexOf(",") > 0){
				StringTokenizer groupsTokens = new StringTokenizer(groups, ",");
				while (groupsTokens.hasMoreTokens()){
					
					String grp = groupsTokens.nextToken();
					if (isHasRole(grp, roles))
						groupsB.append(grp + ",");
				}
			}else{
				if (isHasRole(groups, roles))
					groupsB.append(groups + ",");
			}
			mefLine.append(groupsB.toString());
		}
		mefLine.append("|");
		// priv
		if (isPrivExists){
			String privs = (items[10] != null)?items[10]:null;
			if (privs != null && privs.length() > 0) {
				if (privs.indexOf(",") > 0) {
					StringTokenizer privsTokens = new StringTokenizer(groups, ",");
					while (privsTokens.hasMoreTokens()) {

						String prv = privsTokens.nextToken();
						if (isHasRole(prv, roles))
							mefLine.append(prv + ",");
					}
				} else {
					if (isHasRole(privs, roles))
						mefLine.append(privs + ",");
				}
			}
		}else{
			mefLine.append(groupsB.toString());
		}
		
		mefLine.append("\n");
		
		System.out.print(mefLine.toString().replace(",|", "|").replace(",\n", "\n"));
	}

	private static boolean isHasRole(String s, List<String> roles) {
		for (String r:roles){
			if (s.indexOf(r) > -1)
				return true;
		}

		return false;
	}


}
