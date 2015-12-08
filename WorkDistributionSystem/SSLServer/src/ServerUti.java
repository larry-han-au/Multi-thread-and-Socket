
import java.io.File;
import java.io.IOException;

import java.net.Socket;



public class ServerUti {

	public static String createJobfolder(String folderName){

		File folder = new File(folderName);
		if (!folder.exists()) { 
			folder.mkdir(); 
		} 
		String folderPath=folder.getAbsolutePath();
		return folderPath;
	}

	public static String processJarFile(String jarFile, String inputFile,String outputFile){
		ProcessBuilder pb = new ProcessBuilder("java", "-jar", jarFile,inputFile,outputFile);  

		File file=new File(jarFile);
		File parentDir=file.getParentFile();
		pb.directory(parentDir);

		File logfolder = new File(parentDir,"logfolder");
		logfolder.mkdir();
		File logfile=new File(logfolder,"log");
		pb.redirectErrorStream(true);
		pb.redirectOutput(logfile);
//		int flag=0;
		Process p;
	
		try {
			p = pb.start();
			int flag=p.waitFor();
//			p.destroy();
			System.exit(0);
			return (flag==0? "No Exception":"Job Falty");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return "There is an process Error";
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return "Process is Interrupted";
		}
	}

	public static void deleteJobfolder(String folderpath){
		deleteFolderFiles(folderpath);
		File folder=new File(folderpath);
		folder.delete();
	}

	private static void deleteFolderFiles(String folderpath){
		File filefolder=new File(folderpath);
		File[] files=filefolder.listFiles();
		for(File f:files){
			f.delete();
		}
	}

	public static void returnOutput(Socket s){
		
	}

	public static float getCPULoad(){


		return 0;

	}

	public static void receiveFile(Socket s){
		
	}
}
