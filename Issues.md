## common issues
### tomcat 10 and spring 5
tomcat 10 support jakarta 9. spring 5 not supporting this. 
Use tomcat 9 with spring 5 instead.

### Autowired
Since spring 4.3, autowired on constructor is no longer necessary if target
bean to be injected only defines one constructor to begin with.

Spring field injection causes using java reflection, a costy operation.

### Spring scopes and lifecycle
Spring doesn't call destroy method on *prototype* scoped beans. It only
initializes and configures it, then hands it to client.

