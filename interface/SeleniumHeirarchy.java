// this is real worls heirarchey present in selenium 
// acheiveing multiple inheritence 

interface SearchContext{
	// service Specifier 
	// all project related structure 

}
interface WebDriver extends SearchContext{
	// service Specifier 
	// remaining structure are added here

}
abstract class RemoteWebDriver implements WebDriver{
	// service provider implements some services and remaining keep as it is
	// so thats why it is abstract class  


}
class ChromeDriver extends RemoteWebDriver{
	//it give implementation to all the remaining abstract method 
	// and become ready to execute 


}
class SeleniumHeirarchy{
	public static void main(String[] args) {

		WebDriver obj=new ChromeDriver();  // any Browser can extend the remotewebDriver and give imptn to abs method 
		
	}
}