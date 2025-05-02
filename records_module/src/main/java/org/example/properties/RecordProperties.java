package org.example.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "records-module")
public class RecordProperties {
    String empEmail;

//    public String getEmpEmail() {
//        return empEmail;
//    }
//
//    public void setEmpEmail(String empEmail) {
//        this.empEmail = empEmail;
//    }
}
