package jp.kobe_u.cs.daikibo.tsubuyaki.dto;

import lombok.Data;

@Data
public class SearchForm {
    Long id;
    String keyword; //keyword（省略不可） 
}