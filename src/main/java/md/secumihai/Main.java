package md.secumihai;


import md.secumihai.database.Entities.Account;
import md.secumihai.database.GenericDao;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.*;

public class Main  {



    public static void main(String[] args) throws InvalidFormatException, IOException {
        GenericDao dao = new GenericDao();
        Account account = (Account) dao.get(Account.class,"admin");
        System.out.println("Account name: "+account.getName());
        System.out.println("Account user name: "+account.getUserName());
        System.out.println("Account secret Question: "+account.getSecretQuestion());






      /*  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Account account = new Account("admin","Secu Mihail","liahimuces","Care este numele primului Dvs. animal de companie","Rex",true);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
        session.close();

        //enter docx files
        InputStream inputStream = new FileInputStream("output.docx");
        byte[] byteArray = IOUtils.toByteArray(inputStream);
        Law law = new Law("172 perioada 2015",LocalDate.of(2017, 8, 13), LocalDate.of(2017, 01, 23),byteArray);
        Session session1 = sessionFactory.openSession();
        session1.beginTransaction();
        session1.save(law);
        session1.getTransaction().commit();
        session1.close();

        // read docx files
        session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery( "from Law" ).list();
        for ( Law event : (List<Law>) result ) {
            XWPFDocument doc = new XWPFDocument(new ByteArrayInputStream(event.getContent()));
            for (XWPFTable tbl : doc.getTables()) {
                for (XWPFTableRow row : tbl.getRows()) {
                    for (XWPFTableCell cell : row.getTableCells()) {
                        for (XWPFParagraph p : cell.getParagraphs()) {
                            for (XWPFRun r : p.getRuns()) {
                                String text = r.getText(0);
                                if (text != null && text.contains("3209")) {
                                    System.out.println(row.getCell(3).getText());
                                }
                            }
                        }
                    }
                }
            }
            try {
                doc.write(new FileOutputStream("output2.docx"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        session.getTransaction().commit();
        session.close(); */
        System.out.println("gata.....");

    /*  XWPFDocument doc = new XWPFDocument(OPCPackage.open("/home/mihai/Desktop/createparagraph.docx"));
        for (XWPFTable tbl : doc.getTables()) {
            for (XWPFTableRow row : tbl.getRows()) {
                for (XWPFTableCell cell : row.getTableCells()) {
                    for (XWPFParagraph p : cell.getParagraphs()) {
                        for (XWPFRun r : p.getRuns()) {
                            String text = r.getText(0);
                            if (text != null && text.contains("3209")) {
                                System.out.println(row.getCell(3).getText());
                            }
                        }
                    }
                }
            }
        }
        try {
            doc.write(new FileOutputStream("output2.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}