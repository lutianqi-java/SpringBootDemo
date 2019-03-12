### SpringBoot+MyBatis 多数据源以及jta+atomikos  进行事物管理
### 全局捕获异常
    @ExceptionHandler 表示拦截异常
    @ControllerAdvice 是 controller 的一个辅助类，最常用的就是作为全局异常处理的切面类
    @ControllerAdvice 可以指定扫描范围
    @ControllerAdvice 约定了几种可行的返回值，如果是直接返回 model 类的话，需要使用 @ResponseBody 进行 json 转换
    返回 String，表示跳到某个 view
    返回 modelAndView
    返回 model + @ResponseBody
    com.springboot.common.GlobalExceptionHandler
### 使用AOP统一处理Web请求日志
    com.springboot.common.WebLogAspect