package asTheKingWishes;


public class ClearConsoleScreen  {
	public  static void main (String [] args){
        System.out.println("Hello World");
    }

    public static void ClearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
              
            if(operatingSystem.contains("Windows")){
            	Process startProcess = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
                startProcess.waitFor();
            } else {
            	Process startProcess = new ProcessBuilder("clear").inheritIO().start();
                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
