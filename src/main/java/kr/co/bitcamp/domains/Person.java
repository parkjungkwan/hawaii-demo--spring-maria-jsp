package kr.co.bitcamp.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Lazy
@Data
@Component
public class Person {
	private String userid,password,name,birthday,gender,telephone;
}
