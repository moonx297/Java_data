package Hakjum;

public class Result {

	public static void main(String[] args) {
		int []n = {1,2,3,4,5};
		String []myName = {"aaa","bbb","ccc","ddd","eee"};
		int kuk []= {92,82,67,58,84};
		int eng []= {89,85,78,60,95};
		int mat []= {96,92,80,44,70};
		int sum []= new int [5];
		int rank [] = new int [5];
		char myGrade = 0;
		
		for(int i =0; i<n.length; i++) {
			sum [i] = kuk[i] + eng[i] + mat[i];
		
		}
		for(int i =0; i<n.length; i++) {
			rank [i] = 1;
		for(int j=0;j<n.length;j++) {
		if(sum [i] < sum [j]) 
			rank [i] += 1;
		}
		}
		
		System.out.println("번호" + "\t" + "이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "학점" + "\t" + "등수");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
			for (int i=0; i < n.length; i++) {
				switch (sum[i]/30) {
				case 10:
				case 9:
					myGrade = 'A';
					break;
				case 8:
					myGrade = 'B';
					break;
				case 7:
					myGrade = 'C';
					break;
				case 6:
					myGrade = 'D';
					break;
				default:
					myGrade = 'F';
				}
				//System.out.println(----------------------------------------------);
				
				System.out.println(n[i] + "\t" + myName[i] + "\t" + kuk[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + sum[i] + "\t" + myGrade + "\t" + rank[i]);
				
		}
		}
	}
		
	
	


