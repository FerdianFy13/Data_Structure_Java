//package projecttugas;
//
//import javax.swing.*;
//import java.util.LinkedList;
//import java.util.Queue;
//
//
//public class Queque extends javax.swing.JFrame{
////    private JPanel cddPlane;
////    private JPanel Antrian;
////    private JPanel jumlahAntrian;
////    private JPanel TotalAntrian;
////    private JPanel nomorAntrian;
////    private JPanel prosesAntrian;
//    Queue<Object> antrian = new LinkedList<>();
//    int nomor = 0;
//    private JLabel JmlAntrian;
//    private JLabel lbTotalAntrian;
//    private JButton btnProsesAntrian;
//    private JButton btnAmbilAntrian;
//    private JLabel lbPanggilAntrian;
//    private JTextArea txtAntrian;
//    private JTextArea txtAtas;
//    private JTextArea txtBawah;
//    private JTextArea textAtas1;
//
//    public Queque() {
//        frameInit();
//        constraint();
//    }
//
//    public void constraint() {
//        JmlAntrian.setText("0");
//        lbTotalAntrian.setText("0");
//        lbPanggilAntrian.setText("~~~~~");
//
//        txtAtas.setText("Apotik Prima");
//        txtAtas.setText("Jl. Basuki Rahmat, Banyuwangi");
//        txtAtas.setText("Banyuwangi, Jawa Timur");
//        txtAtas.setText("~~~~~");
//    }
//
//    private void nomorAntrian() {
//        nomor++;
//        String number = "Antrian" + nomor;
//        antrian.add(number);
//        String fer = String.valueOf(antrian.size());
//        JmlAntrian.setText(fer);
//        lbPanggilAntrian.setText("" + antrian.peek());
//        lbTotalAntrian.setText(""+nomor);
//
//        txtBawah.setText("Senin 04 Februari 2003");
//        txtBawah.setText("Nomor Antrian");
//        txtBawah.setText(" " + nomor);
//        txtBawah.setText("Silakan menunggu " + fer + " Antrian Lagi ");
//        txtBawah.setText("Mohon untuk bersabar");
//
//    }
//    private void setBtnProsesAntrian() {
//        if (antrian.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Ambil nomor antrian terlebih dahulu");
//        }
//        txtAntrian.setText("");
//        antrian.poll();
//        antrian.forEach((Object element) -> {
//            txtAntrian.append("" +element+ "");
//        });
//        if (antrian.isEmpty()) {
//            lbPanggilAntrian.setText("~~~~~");
//        } else {
//            lbPanggilAntrian.setText(""+ antrian.peek());
//        }
//    }
//}
