class Drive {
	private String name;
	private String type;
	private String fileSystem;
	private double totalCapacity;
	private double usedSpace;
	private double freeSpace;

	Drive(String name, String type,String fileSystem, double totalCapacity,double usedSpace){
		this.name = name;
        this.type = type;
        this.fileSystem = fileSystem;
        this.totalCapacity = totalCapacity;
        this.usedSpace = usedSpace;
        this.freeSpace = totalCapacity-usedSpace;   
	}
	public void getDriveinfo(){
		System.out.println("\n--- Drive Information ---");
        System.out.println("Drive Name : " + name);
        System.out.println("Type : " + type);
        System.out.println("File System : " + fileSystem);
        System.out.println("Total Capacity : " + totalCapacity + " GB");
        System.out.println("Used Space : " + usedSpace + " GB");
        System.out.println("Free Space : " + freeSpace + " GB"); 

	}

}
class Folder extends Drive{
	private String folderName;
	private String folderType;
	private double space;
	private int subFolders;
	private int files;
	private String folderCreatedDate;

	Folder(String name, String type,String fileSystem, double totalCapacity,double usedSpace,
           String folderName, String folderType, double space, int subFolders, int files, String folderCreatedDate){
		

		super(name, type, fileSystem, totalCapacity, usedSpace);
        this.folderName = folderName;
        this.folderType = folderType;
        this.space = space;
        this.subFolders = subFolders;
        this.files = files;
        this.folderCreatedDate = folderCreatedDate;

	}
	public void getFolderInfo(){

		System.out.println("\n--- Folder Information ---");
        System.out.println("Folder Name : " + folderName);
        System.out.println("Folder Type : " + folderType);
        System.out.println("Space Used : " + space + " MB");
        System.out.println("Sub Folders : " + subFolders);
        System.out.println("Files : " + files);
        System.out.println("Created Date : " + folderCreatedDate);

	}
}
class File extends Folder{
	private String fileName;
	private String fileType;
	private double fileSpace;
	private String owner;

	File(String name, String type,String fileSystem, double totalCapacity,double usedSpace,
           String folderName, String folderType, double space, int subFolders, int files, String folderCreatedDate,
         String fileName, String fileType, double fileSpace, String owner){

		super(name, type, fileSystem, totalCapacity, usedSpace,
              folderName, folderType, space, subFolders, files, folderCreatedDate);

		this.fileName = fileName;
        this.fileType = fileType;
        this.fileSpace = fileSpace;
        this.owner = owner;

		
	}
	public void getFileInfo(){
		System.out.println("\n--- File Information ---");
        System.out.println("File Name : " + fileName);
        System.out.println("File Type : " + fileType);
        System.out.println("Space Used : " + fileSpace + " MB");
        System.out.println("Owner : " + owner);

	}
}
class MultilevelInheritance2{
	public static void main(String[] args) {

		File obj=new File("D", "Local Drive", "NTFS", 238, 24.9,          
            "Notes", "Personal",23, 2, 32, "03-APR-2025", 
            "java.pdf", " WPS PDF File", 12.9, "DESKTOP-UAHS776|Dell" );
		obj.getDriveinfo();
		obj.getFolderInfo();
		obj.getFileInfo();
		
	}
}