//package entity.ui;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//
//import Elevator;
//import MainPresenter;
//import Presenter;
//
//public class main {
//    public static void main(String[] args) {
//        Presenter mediator = new MainPresenter();
//        ElevatorView view = new ElevatorView(mediator);
//        mediator.registerView(view);
//        Elevator elevator = new Elevator(1, mediator);
//        elevator.getOrders().add(1);
//        elevator.getOrders().add(2);
//        elevator.getOrders().add(3);
//        elevator.getOrders().add(4);
//        elevator.getOrders().add(5);
//        elevator.getOrders().add(6);
//        Elevator elevator2 = new Elevator(1, mediator);
//        elevator2.getOrders().add(1);
//        elevator2.getOrders().add(2);
//        elevator2.getOrders().add(3);
//        elevator2.getOrders().add(4);
//        elevator2.getOrders().add(5);
//        elevator2.getOrders().add(6);
////        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//        ExecutorService service = Executors.newCachedThreadPool();
////        for(int i = 0; i < 10; i++) {
//            service.submit(() -> {
//                ScheduledExecutorService service1 = Executors.newSingleThreadScheduledExecutor();
//                service1.scheduleAtFixedRate(() -> view.move(elevator), 1, 2, TimeUnit.SECONDS);
////                view.move(elevator);
//            });
//
//        service.submit(() -> {
////            view.move(elevator2);
//            ScheduledExecutorService service1 = Executors.newSingleThreadScheduledExecutor();
//            service1.scheduleAtFixedRate(() -> view.move(elevator2), 2, 2, TimeUnit.SECONDS);
//        });
////        }
////        service.schedule(() -> {view.move(elevator);view.move(elevator2);}, 2, TimeUnit.SECONDS);
////        service.scheduleAtFixedRate(() -> view.move(elevator2), 0, 2, TimeUnit.SECONDS);
//    }
//
//
//}
//
////interface Command {
////    void execute();
////}
////
//////Abstract Presenter
////interface Presenter {
////    void book();
////    void view();
////    void search();
////    void registerView(BtnView v);
////    void registerSearch(BtnSearch s);
////    void registerBook(BtnBook b);
////    void registerDisplay(LblDisplay d);
////}
////
//////Concrete mediator
////class ParticipantMediator implements Presenter {
////
////    BtnView btnView;
////    BtnSearch btnSearch;
////    BtnBook btnBook;
////    LblDisplay show;
////
////    //....
////    public void registerView(BtnView v) {
////        btnView = v;
////    }
////
////    public void registerSearch(BtnSearch s) {
////        btnSearch = s;
////    }
////
////    public void registerBook(BtnBook b) {
////        btnBook = b;
////    }
////
////    public void registerDisplay(LblDisplay d) {
////        show = d;
////    }
////
////    public void book() {
////        btnBook.setEnabled(false);
////        btnView.setEnabled(true);
////        btnSearch.setEnabled(true);
////        show.setText("booking...");
////    }
////
////    public void view() {
////        btnView.setEnabled(false);
////        btnSearch.setEnabled(true);
////        btnBook.setEnabled(true);
////        show.setText("viewing...");
////    }
////
////    public void search() {
////        btnSearch.setEnabled(false);
////        btnView.setEnabled(true);
////        btnBook.setEnabled(true);
////        show.setText("searching...");
////    }
////
////}
////
//////A concrete colleague
////class BtnView extends JButton implements Command {
////
////    Presenter med;
////
////    BtnView(ActionListener al, Presenter m) {
////        super("View");
////        addActionListener(al);
////        med = m;
////        med.registerView(this);
////    }
////
////    public void execute() {
////        med.view();
////    }
////
////}
////
//////A concrete colleague
////class BtnSearch extends JButton implements Command {
////
////    Presenter med;
////
////    BtnSearch(ActionListener al, Presenter m) {
////        super("Search");
////        addActionListener(al);
////        med = m;
////        med.registerSearch(this);
////    }
////
////    public void execute() {
////        med.search();
////    }
////
////}
////
//////A concrete colleague
////class BtnBook extends JButton implements Command {
////
////    Presenter med;
////
////    BtnBook(ActionListener al, Presenter m) {
////        super("Book");
////        addActionListener(al);
////        med = m;
////        med.registerBook(this);
////    }
////
////    public void execute() {
////        med.book();
////    }
////
////}
////
////class LblDisplay extends JLabel {
////
////    Presenter med;
////
////    LblDisplay(Presenter m) {
////        super("Just start...");
////        med = m;
////        med.registerDisplay(this);
////        setFont(new Font("Arial", Font.BOLD, 24));
////    }
////
////}
////
////class MediatorDemo extends JFrame implements ActionListener {
////
////    Presenter med = new ParticipantMediator();
////
////    MediatorDemo() {
////        JPanel p = new JPanel();
////        p.add(new BtnView(this, med));
////        p.add(new BtnBook(this, med));
////        p.add(new BtnSearch(this, med));
////        getContentPane().add(new LblDisplay(med), "North");
////        getContentPane().add(p, "South");
////        setSize(400, 200);
////        setVisible(true);
////    }
////
////    public void actionPerformed(ActionEvent ae) {
////        Command comd = (Command) ae.getSource();
////        comd.execute();
////    }
////
////    public static void main(String[] args) {
////        new MediatorDemo();
////    }
////
////}
