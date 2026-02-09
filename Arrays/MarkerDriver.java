class Marker{
	String brand;
	String color;
	double price;

	Marker(String brand,String color,double price){
		this.brand=brand;
		this.color =color;
		this.price=price;
	}
	public String toString(){
		return "Brand : "+brand+" ,Color : "+color+" ,Price : "+price;
	}
}
class MarkerDriver{
	public static void main(String[] args) 
	{
		Marker m1=new Marker("Camlin","Black",25.00);
		Marker m2=new Marker("Doms","Red",25.15);
		Marker m3=new Marker("Apsara","Green",25.45);
		Marker m4=new Marker("Natraj","Blue",25.75);


		Marker [] markers={m1,m2,m3,m4};

		for(Marker ele:markers){
			System.out.println(ele);
		}
		for (; ; ) {
			System.out.println("\n 1.Brand A");
			System.out.println("2.Brand D");
			System.out.println("3.Color A");
			System.out.println("4.Color D");
			System.out.println("5.Price A");
			System.out.println("6.Price D");
			System.out.print("Enter the Option : ");
			switch (new java.util.Scanner(System.in).nextInt()) {
				case 1->brandAse(markers,markers.length);
				case 2->brandDesc(markers,markers.length);
				case 3->colorAse(markers,markers.length);
				case 4->colorDesc(markers,markers.length);
				case 5->priceAse(markers,markers.length);
				case 6->priceDesc(markers,markers.length);
				default->System.out.println("invalid option \n");
			}
			    for(Marker ele:markers)
			    {
			      System.out.println(ele);
		        }
		}
	}
	public static void brandAse(Marker []arr,int n)
	{
		for (int i=0;i<n-1 ;i++) {
			for (int j=i+1;j<n;j++ ) {
				if((arr[i].brand.compareTo(arr[j].brand))>0){
					Marker temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void brandDesc(Marker []arr,int n)
	{
		for (int i=0;i<n-1 ;i++) {
			for (int j=i+1;j<n;j++ ) {
				if((arr[i].brand.compareTo(arr[j].brand))<0){
					Marker temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void colorAse(Marker []arr,int n)
	{
		for (int i=0;i<n-1 ;i++) {
			for (int j=i+1;j<n;j++ ) {
				if((arr[i].color.compareTo(arr[j].color))>0){
					Marker temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void colorDesc(Marker []arr,int n)
	{
		for (int i=0;i<n-1 ;i++) {
			for (int j=i+1;j<n;j++ ) {
				if((arr[i].color.compareTo(arr[j].color))<0){
					Marker temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void priceAse(Marker []arr,int n)
	{
		for (int i=0;i<n-1 ;i++) {
			for (int j=i+1;j<n;j++) {
				if(arr[i].price>arr[j].price){
					Marker temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void priceDesc(Marker [] arr,int n)
	{
		for (int i=0;i<n-1 ;i++) {
			for (int j=i+1;j<n;j++ ) {
				if(arr[i].price<arr[j].price){
					Marker temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}

}