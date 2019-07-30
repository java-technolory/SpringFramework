package com.example.SpringBeanLifeCycle.main;

import com.example.SpringBeanLifeCycle.bean.Employee;
import com.example.SpringBeanLifeCycle.service.EmployeeService;
import com.example.SpringBeanLifeCycle.service.MyEmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Một số điểm quan trọng của Spring Bean Life Cycle
 * 1. Spring Context đầu tiên sử dụng contructor không đối số (no-args) để khởi tạo Bean object và sau đó gọi method post-init().
 * 2. Thứ tự tạo Bean giống như thứ tự nó được định nghĩa trong tệp cấu hình spring bean (spring.xml).
 * 3. Context được trả về khi tất cả các spring bean được khởi tạo đúng cách với cách thực thi method post-init().
 * 4. Tên Employee được hiển thị với "Hai" bởi vì nó được khởi tạo trong method post-init().
 * 5. Khi Context đang bi đóng, các Bean bị hủy theo thứ tự ngược lại với thứ tự được khởi tạo (LIFO [ Last - in - First - out])
 *    (vào sau ra trước).
 *
 */

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        System.err.println("===> Spring Context initialized");

//        MyEmployeeService service = context.getBean("myEmployeeService", MyEmployeeService.class);

        EmployeeService service = context.getBean("employeeService", EmployeeService.class);

        System.err.println("Bean retrieved from spring context");
        System.err.println("Employee Name = " + service.getEmployee().getName());

        context.close();

        System.err.println("===> Spring Context Closed");
    }
}
