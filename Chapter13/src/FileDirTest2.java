/*
 * a.txt 파일 정보 출력.
 */

import java.io.File;

public class FileDirTest2 {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\82105\\Desktop\\2024 1학기\\JAVA ProGraming\\JAVA\\Chapter13\\a.txt");
		
		try {
			System.out.println("파일 이름 : " + f1.getName());
			System.out.println("파일 경로 : " + f1.getPath());
			System.out.println(f1.exists() ? "파일 존재" : "파일 없음");
			System.out.println("파일 크기 : " + f1.length() + "Bytes");
		} catch(Exception e){
			System.out.println("해당 파일을 찾을 수 없습니다.");
			System.out.println("어떤 문제 일까요?");
			System.out.println(e);
		}
	}

}
