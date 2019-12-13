package package4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoDateTime {
    public static void main(String[] args) {
        // Biểu diễn ngày dưới dạng yyyy-MM-dd
        // .now() static method để lấy ngày hiện tại
        LocalDate ld = LocalDate.now();
        System.out.println("Local date: " + ld);

        // Biểu diễn giờ dưới dạng HH:mm:ss.zzz (giờ:phút:giây.mili giây)
        // .now() static method để lấy giờ hiện tại
        LocalTime lt = LocalTime.now();
        System.out.println("Local time: " + lt);

        // Biểu diễn thời giam dưới dạng yyyy-MM-ddTHH:mm:ss.zzz (giờ:phút:giây.mili giây)
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local date and time: " + ldt);

        // .ofPattern() static method để thay đổi fomart ngày giờ
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("E, dd/MM/yyyy hh:mm:ss");
        // .fomart() nhận tham số kiểu DateTimeFomartter và trả về kiểu String
        String new_ldt = ldt.format(myformat);
        System.out.println("Local date and time: " + new_ldt);

        myformat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        new_ldt = ldt.format(myformat);
        System.out.println("Local date and time: " + new_ldt);
        /** Định dạng ngày giờ
         * E    thứ
         * dd   ngày
         * MM   tháng (số)
         * MMM  tháng (chữ)
         * yyyy năm (4 số)
         * hh   giờ (12 tiếng)
         * HH   giờ (24 tiếng)
         * mm   phút
         * ss   giây
         * zzz  mili giây
         */
    }
}