package com.example.demo.security;


//@Configuration
//@EnableWebSecurity
//@Profile("security")
public class SecurityConfiguration /*extends WebSecurityConfigurerAdapter*/ {

//    @Autowired
//    private DataSource dataSource;
//
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.jdbcAuthentication()
////                .dataSource(dataSource)
////                .passwordEncoder(passwordEncoder());
////    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity)
//            throws Exception {
//        httpSecurity.authorizeRequests()
//                .antMatchers("/h2-console/**")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
//
//        httpSecurity.csrf()
//                .ignoringAntMatchers("/h2-console/**");
//        httpSecurity.headers()
//                .frameOptions()
//                .sameOrigin();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
}