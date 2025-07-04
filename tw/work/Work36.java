package tw.work;

import java.util.HashSet;

import tw.sam.api.Member;

public class Work36 {

	public static void main(String[] args) {
		Member m1 = new Member(1,"Brad");
		Member m2 = new Member(2,"Eric");
		Member m3 = new Member(1,"Tony");
		Member m4 = new Member(4,"Andy");
		
		HashSet<Member> member = new HashSet<>();
		member.add(m1);
		member.add(m2);
		member.add(m3);
		member.add(m4);
		
		System.out.println(member.size());
		System.out.println(member);

	}

}
