package com.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // @Autowired
    // NamedParameterJdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }

    // @Data
    // static class Result {
    //     private final int left;
    //     private final int right;
    //     private final long answer;
    // }

    // SQL sample
    // @RequestMapping("calc")
    // Result calc(@RequestParam int left, @RequestParam int right) {
    //     MapSqlParameterSource source = new MapSqlParameterSource()
    //             .addValue("left", left)
    //             .addValue("right", right);
    //     return jdbcTemplate.queryForObject("SELECT :left + :right AS answer", source,
    //             (rs, rowNum) -> new Result(left, right, rs.getLong("answer")));
    // }
}
