<h1><strong>Azure-Spring-Starter</strong></h1>

<h3><strong>SSL certification generation</strong></h1>

<h5>keytool -genkeypair -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore file_name.p12 -validity 365</h5>

<h3><strong>Properties to include in spring boot app</strong></h1>

<h5>
server.port=8443 <br />
server.ssl.key-store=classpath:file_name.p12 <br />
server.ssl.key-store-password=123456 <br />
server.ssl.keyStoreType=PKCS12 <br />  
</h5>

<h3><strong>Note: To enable SSL or HTTPS for Spring Boot web application, puts the certificate file .p12 or .jks in the resources folder, and declares the server.ssl.* values in the application.properties</strong></h3>
