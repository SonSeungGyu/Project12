package map.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Quiz4 {
	public static void main(String[] args) {

		Student stu1 = new Student(1001, "둘리", 90, 80, 70);
		Student stu2 = new Student(1002, "도우너", 55, 65, 75);
		Student stu3 = new Student(1003, "또치", 80, 50, 50);

		HashMap<Integer, Student> map = new HashMap<>();
		map.put(1001, stu1);
		map.put(1002, stu2);
		map.put(1003, stu3);

		Set<Integer> set = map.keySet();
		System.out.println(set);

		// 키를 사용해서 map을 순회
		for (int key : set) {
			// 키를 사용해서 맵에서 학생객체 꺼내기
			Student student = map.get(key);// 키를 이용하면 벨류의 값을 가져올 수 있음
			int sum = student.korScore + student.engScore + student.mathScore;
			double avg = sum / 3;

			System.out.println(student.name + "의 총점: " + sum + " 평균: " + avg);
		}
		
		//각 과목의 총점을 구하기
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;
		for (int key : set) {
			Student student = map.get(key);
			korSum += student.korScore;
			mathSum += student.mathScore;
			engSum += student.engScore;
		}
		System.out.println("국어의 총점: " + korSum);
		System.out.println("수학의 총점: " + mathSum);
		System.out.println("영어의 총점: " + engSum);

//		Student student = map.get(1001);
//
//		int sum = student.engScore + student.korScore + student.mathScore;
//		double avg = sum / 3;
//		System.out.println("둘리의 총점: " + sum);
//		System.out.println("둘리의 평균: " + avg);
//
//		// 국어의 총점
//		System.out.println();
//		int sumKor = stu1.korScore + stu2.korScore + stu3.korScore;
//		double avgKor = (stu1.korScore + stu2.korScore + stu3.korScore) / 3;
//		System.out.println("국어의 총점" + sumKor);
//		System.out.println("국어의 평균" + avgKor);
//		System.out.println();
//
//		// 영어의 총점
//		int sumEng = stu1.engScore + stu2.engScore + stu3.engScore;
//		double avgEng = (stu1.engScore + stu2.engScore + stu3.engScore) / 3;
//		System.out.println("영어의 총점" + sumEng);
//		System.out.println("영어의 평균" + avgEng);
//		System.out.println();
//
//		// 수학의 총점
//		int sumMath = stu1.mathScore + stu2.mathScore + stu3.mathScore;
//		double avgMath = (stu1.mathScore + stu2.mathScore + stu3.mathScore) / 3;
//		System.out.println("수학의 총점" + sumMath);
//		System.out.println("수학의 평균" + avgMath);

	}

}

class Student {
	int stuNum;
	String name;
	int korScore;
	int mathScore;
	int engScore;

	public Student(int stuNum, String name, int korScore, int mathScore, int engScore) {
		super();
		this.stuNum = stuNum;
		this.name = name;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", name=" + name + ", korScore=" + korScore + ", mathScore=" + mathScore
				+ ", engScore=" + engScore + "] \n";
	}

}