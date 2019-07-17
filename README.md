# SprinBootModel
关于Springboot
学习

## swagger使用
### 1、新建一个gradle项目
    compile('io.springfox:springfox-swagger2:2.9.2')
    compile('io.springfox:springfox-swagger-ui:2.9.2')
### 2、swagger配置文件
    @Configuration
    @EnableSwagger2
    public class SwaggerConfig {
    
        /**
         * swagger通过注解表明该接口会生成文档，包括接口名、请求方法、参数、返回信息的等等。
         *
         * @return
         * @Api：修饰整个类，描述Controller的作用
         * @ApiOperation：描述一个类的一个方法，或者说一个接口
         * @ApiParam：单个参数描述
         * @ApiModel：用对象来接收参数
         * @ApiProperty：用对象接收参数时，描述对象的一个字段
         * @ApiResponse：HTTP响应其中1个描述
         * @ApiResponses：HTTP响应整体描述
         * @ApiIgnore：使用该注解忽略这个API
         * @ApiError：发生错误返回的信息
         * @ApiImplicitParam：一个请求参数
         * @ApiImplicitParams：多个请求参数
         */
        @Bean
        public Docket createRestApi() {
    
            /**添加head参数start*/
            ParameterBuilder tokenPar = new ParameterBuilder();
            List<Parameter> pars = new ArrayList<Parameter>();
            tokenPar.name("authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
            pars.add(tokenPar.build());
            //添加head参数end
            return new Docket(DocumentationType.SWAGGER_2)
                    .groupName("com.developlee.HangZhou.ZheJiang")
                    .select()
                    .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)) //有该注解的生成doc
                    .apis(RequestHandlerSelectors.basePackage("com.developlee.swagger"))   // 自行修改为自己的包路径
                    .paths(PathSelectors.any())
                    .build()
                    .globalOperationParameters(pars) //set Header
                    .apiInfo(apiInfo());
        }
    
        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("DevelopLee的Swagger在线文档")
                    .description("嗯哼嗯哼额~~~swagger文档很强！")
                    .termsOfServiceUrl("http://github.com/developlee")
                    .version("1.0")
                    .build();
        }
    }
    
### 3、在主函数上加@EnableSwagger2注解
    
### 4、在Controller上使用
    @RestController
    public class UserController {
    
        @GetMapping("/userInfo")
        @ApiOperation(notes = "获取用户信息", value = "get user info")
        public String getUserInfo(){
            return "getUserInfo";
        }
    
        @PostMapping("/addUser")
        @ApiOperation(notes = "添加用户信息", value = "add user info")
        @ApiImplicitParam(value = "添加用户", name = "add user", dataType = "java.lang.String", required = true)
        public String addUser(String str){
            return "addUser";
        }
    }
### 5、访问网站
    http://localhost:8080/swagger-ui.html
### 参考网站
    https://yq.aliyun.com/articles/622789

