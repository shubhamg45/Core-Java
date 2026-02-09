import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Mail {

    private String sender;
    private String receiver;
    private String subject;
    private String body;

    public Mail(String sender, String receiver, String subject, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }

    // Display mail details
    public void getMailInfo() {
        System.out.println("Receiver : " + receiver);
        System.out.println("Sender   : " + sender);
        System.out.println("Subject  : " + subject);
        System.out.println("Body     : " + body);
    }

    // Getters & Setters
    public String getReceiverMail() {
        return receiver;
    }

    public void setReceiverMail(String newReceiverMail) {
        this.receiver = newReceiverMail;
    }

    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void setBody(String newBody) {
        this.body = newBody;
    }

    public String getSender() {
        return sender;
    }
}

class User {

    private String name;
    private long contact;
    private String mail;
    private String dob;
    private String password;

    // Mail folders
    private ArrayList<Mail> sendMail = new ArrayList<Mail>();
    private ArrayList<Mail> inboxMail = new ArrayList<Mail>();
    private ArrayList<Mail> starredMail = new ArrayList<Mail>();
    private ArrayList<Mail> draftMail = new ArrayList<Mail>();
    private ArrayList<Mail> binMail = new ArrayList<Mail>();

    // Constructor
    public User(String name, long contact, String mail, String dob, String password) {
        super();
        this.name = name;
        this.contact = contact;
        this.mail = mail;
        this.dob = dob;
        this.password = password;
    }

    // Getters
    public String getMail() {
        return this.mail;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    // Mail actions
    public void sendMail(Mail send) {
        sendMail.add(send);
    }

    public void inboxMail(Mail inbox) {
        inboxMail.add(inbox);
    }

    public void draftMail(Mail draft) {
        draftMail.add(draft);
    }

    public void starredMail(Mail star) {
        starredMail.add(star);
    }

    public void binMail(Mail bin) {
        binMail.add(bin);
    }

    // Folder getters
    public ArrayList<Mail> getSendMail() {
        return this.sendMail;
    }

    public ArrayList<Mail> getInboxMail() {
        return this.inboxMail;
    }

    public ArrayList<Mail> getDraftMail() {
        return this.draftMail;
    }

    public ArrayList<Mail> getStarredMail() {
        return this.starredMail;
    }

    public ArrayList<Mail> getBinMail() {
        return this.binMail;
    }
}

class Gmail {

    private ArrayList<User> userList = new ArrayList<User>();
    private Scanner sc = new Scanner(System.in);

    // ================== LAUNCH ==================
    public void launchApplication() {
        for(;;) {
            System.out.println("\n===== GMAIL APPLICATION =====");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Thank You");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    private void createAccount() {
        System.out.println("\n Account Creation Module ");
        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Contact: ");
        long contact = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter DOB: ");
        String dob = sc.nextLine();

        System.out.print("Create Mail ID: ");
        String mail = sc.nextLine();

        System.out.print("Create Password: ");
        String password = sc.nextLine();

        userList.add(new User(name, contact, mail, dob, password));
        System.out.println("Account Created Successfully");
    }
    private void login() {
        System.out.println("\n LOGIN   MODULE  ");
        System.out.print("Enter Mail ID: ");
        String mail = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        for (User user : userList) {
            if (user.getMail().equals(mail) && user.getPassword().equals(password)) {
                System.out.println("Login Successful");
                homePage(user);
                return;
            }
        }
        System.out.println("Invalid Credintial");
    }
    private void homePage(User user) {
        while (true) {
            System.out.println("\n===== HOME PAGE =====");
            System.out.println("1. Compose Mail");
            System.out.println("2. Inbox");
            System.out.println("3. Sent Mail");
            System.out.println("4. Draft");
            System.out.println("5. Starred Mail");
            System.out.println("6. Bin");
            System.out.println("7. Logout");
            System.out.print("Choose Option: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    composeMail(user);
                    break;
                case 2:
                    inboxModule(user);
                    break;
                case 3:
                    showMailList(user.getSendMail(), "SENT MAIL");
                    break;
                case 4:
                    draftModule(user);
                    break;
                case 5:
                    showMailList(user.getStarredMail(), "STARRED MAIL");
                    break;
                case 6:
                    showMailList(user.getBinMail(), "BIN MAIL");
                    break;
                case 7:
                    System.out.println("Logout Successful");
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    // ================== COMPOSE MAIL ==================
    private void composeMail(User sender) {
        System.out.print("To: ");
        String receiverMail = sc.nextLine();

        User receiver = null;
        for (User u : userList) {
            if (u.getMail().equals(receiverMail)) {
                receiver = u;
                break;
            }
        }

        if (receiver == null) {
            System.out.println("Receiver Not Found");
            return;
        }

        System.out.print("Subject: ");
        String subject = sc.nextLine();

        System.out.print("Body: ");
        String body = sc.nextLine();

        Mail mail = new Mail(sender.getMail(), receiverMail, subject, body);

        System.out.print("1.Send  2.Save Draft : ");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            sender.sendMail(mail);
            receiver.inboxMail(mail);
            System.out.println("Mail Sent Successfully");
        } else {
            sender.draftMail(mail);
            System.out.println("Mail Saved in Draft");
        }
    }

    // ================== INBOX MODULE ==================
    private void inboxModule(User user) {
        ArrayList<Mail> inbox = user.getInboxMail();

        if (inbox.isEmpty()) {
            System.out.println("Inbox is Empty");
            return;
        }

        showMailList(inbox, "INBOX");

        System.out.print("Select Mail No (0 to Back): ");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 0) return;

        Mail m = inbox.get(ch - 1);

        System.out.println("1. Star Mail");
        System.out.println("2. Delete Mail");
        System.out.print("Choice: ");
        int opt = sc.nextInt();
        sc.nextLine();

        if (opt == 1) {
            user.starredMail(m);
            System.out.println("Mail Starred");
        } else if (opt == 2) {
            user.binMail(m);
            inbox.remove(ch - 1);
            System.out.println("Mail Moved to Bin");
        }
    }

    // ================== DRAFT MODULE ==================
    private void draftModule(User user) {
        ArrayList<Mail> draft = user.getDraftMail();

        if (draft.isEmpty()) {
            System.out.println("Draft is Empty");
            return;
        }

        showMailList(draft, "DRAFT MAIL");

        System.out.print("Select Draft No (0 to Back): ");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 0) return;

        Mail m = draft.get(ch - 1);

        System.out.println("1. Edit Draft");
        System.out.println("2. Send Draft");
        System.out.println("3. Delete Draft");
        System.out.print("Choice: ");
        int opt = sc.nextInt();
        sc.nextLine();

        if (opt == 1) {
            editDraft(m);
        } else if (opt == 2) {
            sendDraft(user, m);
            draft.remove(ch - 1);
        } else if (opt == 3) {
            user.binMail(m);
            draft.remove(ch - 1);
            System.out.println("Draft Deleted");
        }
    }

    // ================== EDIT DRAFT ==================
    private void editDraft(Mail m) {
        System.out.print("New Receiver Mail: ");
        m.setReceiverMail(sc.nextLine());

        System.out.print("New Subject: ");
        m.setSubject(sc.nextLine());

        System.out.print("New Body: ");
        m.setBody(sc.nextLine());

        System.out.println("Draft Updated");
    }

    // ================== SEND DRAFT ==================
    private void sendDraft(User sender, Mail m) {
        User receiver = null;

        for (User u : userList) {
            if (u.getMail().equals(m.getReceiverMail())) {
                receiver = u;
                break;
            }
        }

        if (receiver != null) {
            sender.sendMail(m);
            receiver.inboxMail(m);
            System.out.println("Draft Sent Successfully");
        } else {
            System.out.println("Receiver Not Found");
        }
    }

    // ================== COMMON DISPLAY ==================
    private void showMailList(ArrayList<Mail> list, String title) {
        System.out.println("\n===== " + title + " =====");
        int i = 1;
        for (Mail m : list) {
            System.out.println("Mail No: " + i++);
            m.getMailInfo();
            System.out.println("------------------------");
        }
    }
}
public class GmailApp {

    public static void main(String[] args) {

        Gmail gmail = new Gmail();
        gmail.launchApplication();

    }
}


