import java.util.Date;
import java.util.Scanner;

public class Library_mgmt  {
    public static void main(String[] args) {
        addIssueDetails();
        System.out.println("Library Management System");
        System.out.println("Press 1 to add Book");
        System.out.println("Press 2 to issue a book");
        System.out.println("Press 3 to return a book");
        System.out.println("Press 4 to print the book details");
        System.out.println("Press 5 to print complete issue detais");
        System.out.println("Press 6 to exit");
        Scanner c = new Scanner(System.in);
        int choice = c.nextInt();
        do {
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    issueBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    printBookDetails();
                    break;
                case 5:
                    printCompleteIssueDetails();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    break;
            }
            c = new Scanner(System.in);
            choice = c.nextInt();
        } while (choice > 0 && choice < 6);
    }

    private static void printCompleteIssueDetails() {

    }

    private static void printBookDetails() {

    }

    private static void returnBook() {

        }



    private static void addIssueDetails() {
    }

    private static void issueBook() {
    }

    private static void addBook() {

}




    public class BookIssueDetails {

        private int bookNumber;
        private String name;
        private int totalBookAllowed = 2;
        private int noOfBookIssued=0;
        private Date issueDate;
        private Date returnDate;

        public BookIssueDetails(int bookNumber,String name,int n,Date issueDate)
        {
            this.bookNumber=bookNumber;
            this.name=name;
            this.noOfBookIssued=n;
            this.issueDate=issueDate;
        }

        public BookIssueDetails() {
        }

        public int getBookNumber() {
            return bookNumber;
        }

        public void setBookNumer(int bookNumber) {
            this.bookNumber = bookNumber;
        }

        public int getNoOfBookIssued() {
            return noOfBookIssued;
        }

        public void setNoOfBookIssued(int noOfBookIssued) {
            this.noOfBookIssued = noOfBookIssued;
        }

        public Date getIssueDate() {
            return issueDate;
        }

        public void setIssueDate(Date issueDate) {
            this.issueDate = issueDate;
        }

        public Date getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(Date returnDate) {
            this.returnDate = returnDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTotalBookAllowed() {
            return totalBookAllowed;
        }

        public void setTotalBookAllowed(int totalBookAllowed) {
            this.totalBookAllowed = totalBookAllowed;
        }
    }

    public class BookDetails {
        private int bookNumber;
        private String bookName;
        private Double price;
        private int count;

        public BookDetails(int bookNumber,String name,Double price)
        {
            this.bookNumber=bookNumber;
            this.bookName=name;
            this.price=price;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
        public int getBookNumber() {
            return bookNumber;
        }

        public void setBookNumber(int bookNumber) {
            this.bookNumber = bookNumber;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

    public class StudentDetails {
        private int studentId;
        private String studentName;
        private String className;

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }
    }