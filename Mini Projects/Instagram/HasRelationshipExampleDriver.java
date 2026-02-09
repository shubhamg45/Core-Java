import java.util.*;
class Profile{
	private String profilePhoto;
	private String bio;
	private String nickName;

	Profile(String profilePhoto,String bio){
		this(profilePhoto,bio,"");
	}
	Profile(String profilePhoto,String bio,String nickName){
		this.profilePhoto=profilePhoto;
		this.bio=bio;
		this.nickName=nickName;
	}
	public void getProfileInfo(){
		System.out.println("\n Profile Info ");
		System.out.println("ProfilePhoto : "+profilePhoto);
		System.out.println("Bio : "+bio);
		System.out.println("NickName : "+nickName);
	}

}
class Comment{
	private String comment;
	private User user;

	Comment(String comment,User user){
		this.comment=comment;
		this.user=user;
	}
	public void getCommentInfo(){
		System.out.println(user.getUserName()+":"+comment);
	}
}
class Post{
	private String media;
	private String type;
	private String location;
	private String caption;
	ArrayList <Comment> commentList=new ArrayList<Comment>();

	Post(String media,String type){
		this(media,type,"Not Avail");
	}
	Post(String media,String type,String location){
		this(media,type,location,"Not Avail");
	}
	Post(String media,String type,String location,String caption){
		this.media=media;
		this.type=type;
		this.location=location;
		this.caption=caption;
	}
	public void getPostInfo(){
		System.out.println("\n Post Info");
		System.out.println("Media : "+media);
		System.out.println("Type : "+type);
		System.out.println("Location : "+location);
		System.out.println("Caption : "+caption);

		if (commentList.size()==0) {
			System.out.println("\n No Comment \n ");
			return;
		}
		for (Comment comment : commentList ) {
			comment.getCommentInfo();
		}
		System.out.println("____________END POST_____________");
	}
	public void addComment(Comment newComment){
		commentList.add(newComment);
	}
}
class User{
	private String name;
	private long contact;
	private String email;
	private Profile profile;
	private ArrayList<Post>postList=new ArrayList<Post>();

    User(String name,long contact,String email,Profile profile){
    	this.name=name;
    	this.contact=contact;
    	this.email=email;
    	this.profile=profile;
    }
    public void getUserInfo(){
    	System.out.println("\n User Info ");
    	System.out.println("Username : "+name);
    	System.out.println("Contact : "+contact);
    	System.out.println("Email : "+email);
    }
    public Profile getprofile(){
    	return profile;
    }
    public void addPost(Post newPost){
    	postList.add(newPost);
    }
    public ArrayList<Post> getPostList(){
    	return postList;
    }
    public String getUserName(){
    	return name;
    }
}
class Group{
	private String name;
	private ArrayList <User> userList=new ArrayList <User>();
	int indx=0;

	Group(String name,User user){
		this.name=name;
		this.userList.add(user);
	}
	public void getGroupInfo(){
		System.out.println("Name : "+name);
		System.out.println("Username : "+userList.get(indx++).getUserName());

	}
}
class SocialMedia{
	private String name;
	private ArrayList<User> userList=new ArrayList<User>();
	private ArrayList<Group> groupList=new ArrayList<Group>(); 

	SocialMedia(String name){
		this.name=name;
	}
	public void launchApplication(){
		System.out.println("Welcome "+this.name);
	} 
	public void addUser(User newUser){
		userList.add(newUser);
	}
	public ArrayList<User> getUserList(){
		return userList;
	}
	public void addGroup(ArrayList<User> userList,String groupName){
		for (User user : userList ) 
		{
			groupList.add(new Group(groupName,user));
		}
	}
	public ArrayList<Group> getGroupList(){
		return groupList;
	}
}
class HasRelationshipExampleDriver{
	public static void main(String[] args) {
		
		SocialMedia app=new SocialMedia("INSTAGRAM");
		app.launchApplication();

		Profile profile1=new Profile("ramesh.jpg","java Developer","maa ka ladla");
		User user1=new User("Ramesh Kumar ",9876543210l,"ramesh@gmail.com",profile1);
		app.addUser(user1);

		Profile profile2=new Profile("suresh123.jpg","self lover","main hun suresh");
		User user2=new User("Suresh Kumar ",7658943210l,"suresh@gmail.com",profile2);
		app.addUser(user2);

		Profile profile3=new Profile("Sakshi.jpg","living in my own world","attitude Queen ");
		User user3=new User("Sakshi Kumari ",7698543210l,"sakshi@gmail.com",profile3);
		app.addUser(user3);

		ArrayList<User> userList=app.getUserList();
		System.out.println("___________User List_______________");

        for (User element :userList ) 
        {
        	element.getUserInfo();
        	element.getprofile().getProfileInfo();
        	System.out.println("_______________________________________");
        }
        System.out.println("\n____________User Post_______________________\n");

        //ramesh post 

        Post post1 =new Post("abc.mp4","Reel","somewhere on earth","No Caption Nedeed");
        Post post2 =new Post("rameshLonavala.jpg","Post","Hill Station","In area of Nature");
        user1.addPost(post1);
        user1.addPost(post2);

        Post post3 =new Post("Sakshi123.jpg","Post","OUT of Range","Pari hun mein");
        user3.addPost(post3);

        ArrayList<User> userList1=app.getUserList();
        for (User user : userList1 ) {

        	user.getUserInfo();
        	user.getprofile().getProfileInfo();
        	ArrayList<Post> posts =user.getPostList();

        	for (Post post  : posts ) {
        		post.getPostInfo();
        	}
        	System.out.println("________________Next UserProfile____________________");

        	
        }
        System.out.println("__________________After Adding Comment");
        ArrayList<Post> postListSakshi=user3.getPostList();
        Post sakshiPost1=postListSakshi.get(0);
        sakshiPost1.addComment(new Comment("nice pic :)",user1));
        sakshiPost1.addComment(new Comment("Chand Dharti pe",user2));
        sakshiPost1.addComment(new Comment("@ramesh : thank u dada",user3));
        sakshiPost1.addComment(new Comment("hehehehehe",user2));

        sakshiPost1.getPostInfo();

        ArrayList<User> groupList=new ArrayList<User>();
        groupList.add(user1);
        groupList.add(user2);
        groupList.add(user3);

        app.addGroup(groupList,"three Idiots");

        System.out.println("\n Group List _____________");
        ArrayList<Group> groupList1=app.getGroupList();

        for (Group group : groupList1 ) {
        	group.getGroupInfo();
        }
	}
}