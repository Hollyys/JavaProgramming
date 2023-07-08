// 2017110157 신성한

package Assignment06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SimpleGrep {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------");
		System.out.println(" Working directory: " + args[2]);
		System.out.print(" Search Result: option: " + args[0] + ", ");
		System.out.println("keyword: " + args[1]);
		System.out.println("----------------------------------------------------");
		
		if(args[0].equals("-c")) {
			// 파일이름 및 검색된 카운트만 출력
			File dirFile = new File(args[2]); // 특정 디렉토리에 있는 파일 목록 검색 용도
			File[] subFiles = dirFile.listFiles(); // 모든 파일 목록 가져오기

			for(int i=0; i < subFiles.length; i++) {
				int cnt = 0;
				String filename = subFiles[i].getName(); // getName(): 파일명 가져오기
				Scanner scanner = new Scanner(new FileReader(subFiles[i]));
				while(scanner.hasNext()) {
					String line = scanner.nextLine();
					if(line.indexOf(args[1]) != -1)
						cnt += (line.length() - line.replace(args[1], "").length())/args[1].length();
				}
				System.out.println(filename + ": " + cnt);
				scanner.close();

			}
		}
		else if(args[0].equals("-n")) {
			// 파일이름, 라인번호, 검색된 소스 코드 라인 출력
			File dirFile = new File(args[2]); // 특정 디렉토리에 있는 파일 목록 검색 용도
			File[] subFiles = dirFile.listFiles(); // 모든 파일 목록 가져오기

			for(int i=0; i < subFiles.length; i++) {
				String filename = subFiles[i].getName(); // getName(): 파일명 가져오기
				Scanner scanner = new Scanner(new FileReader(subFiles[i]));
				while(scanner.hasNext()) {
					String line = scanner.nextLine();
					if(line.indexOf(args[1]) != -1) {
						System.out.print(filename + ": " + line.indexOf(args[1]) + ": ");
						System.out.println("\t" + line);
					}
				}
				
				scanner.close();

			}
			
		}
		else if(args[0].equals("-i")) {
			// 대소문자 구분 없음
			File dirFile = new File(args[2]); // 특정 디렉토리에 있는 파일 목록 검색 용도
			File[] subFiles = dirFile.listFiles(); // 모든 파일 목록 가져오기

			for(int i=0; i < subFiles.length; i++) {
				String filename = subFiles[i].getName(); // getName(): 파일명 가져오기
				Scanner scanner = new Scanner(new FileReader(subFiles[i]));
				while(scanner.hasNext()) {
					String line = scanner.nextLine();
					String line_toLowercase = line.toLowerCase();
					String searchWord_toLowercase = args[1].toLowerCase();
					if(line_toLowercase.indexOf(searchWord_toLowercase) != -1) {
						System.out.print(filename + ": " + line.indexOf(searchWord_toLowercase) + ": ");
						System.out.println("\t" + line);
					}
				}
				
				scanner.close();

			}
			
		}
		else if(args[0].equals("-e")) {
			// 두 개의 키워드(콤마(,)로 연결)를 검색 (“검색어1,검색어2”)
			
		}
		else {
			System.out.println("Usage: SimpleGrep [option] [searchword] [dir]");
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("Exit Program");

	}
}